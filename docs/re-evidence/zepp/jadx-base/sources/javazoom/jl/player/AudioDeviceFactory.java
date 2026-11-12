package javazoom.jl.player;

import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AudioDeviceFactory {
    public abstract AudioDevice createAudioDevice() throws JavaLayerException;

    public AudioDevice instantiate(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (AudioDevice) (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
    }
}
