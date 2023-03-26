package Sniffer;

import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;

public class NetworkCard {
    String[] devices;
    public static NetworkInterface[] getDevices() {
        NetworkInterface[] devices = JpcapCaptor.getDeviceList();
        return devices;
    }
}

