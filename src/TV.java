import java.util.Scanner;

public class TV {
    private int channelsAmount;
    private int channel;
    private int maxVolume;
    private int volume;

    public TV(int channelsAmount, int channel, int maxVolume, int volume) {
        this.channelsAmount = channelsAmount;
        this.channel = 1;
        this.maxVolume = maxVolume;
        this.volume = 1;
    }

    private void changeExactChannelMechanism(int nextChannel) {
        if (nextChannel <= channelsAmount && nextChannel > 0) {
            channel = nextChannel;
            System.out.println("Включен " + channel + " канал");
        } else {
            System.out.println("Введенного канала не существет");
        }
    }

    public void setExactChannel(int nextChannel) {
        changeExactChannelMechanism(nextChannel);
    }

    private void changeVolumeMechanism(boolean increase) {
        if (increase && volume < maxVolume) {
            volume++;
            System.out.println("Уровень звука: " + volume);
        } else if (!increase && volume > 0){
            volume--;
            if(volume == 0){
                System.out.println("Звук выключен");
            } else {
                System.out.println("Уровень звука: " + volume);
            }
        } else if (increase && volume == maxVolume){
            System.out.println("Максимальный уровень громкости уже достигнут");
        } else if (!increase && volume == 0) {
            System.out.println("Звук уже выключен");
        }
    }

    public void changeVolume(boolean increase){
        changeVolumeMechanism(increase);
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

}
