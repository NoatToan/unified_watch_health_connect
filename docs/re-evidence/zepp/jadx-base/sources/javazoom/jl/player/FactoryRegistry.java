package javazoom.jl.player;

import java.util.Enumeration;
import java.util.Hashtable;
import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public class FactoryRegistry extends AudioDeviceFactory {
    private static FactoryRegistry a;
    public Hashtable factories = new Hashtable();

    public static synchronized FactoryRegistry systemRegistry() {
        if (a == null) {
            FactoryRegistry factoryRegistry = new FactoryRegistry();
            a = factoryRegistry;
            factoryRegistry.registerDefaultFactories();
        }
        return a;
    }

    public void addFactory(AudioDeviceFactory audioDeviceFactory) {
        this.factories.put(audioDeviceFactory.getClass(), audioDeviceFactory);
    }

    @Override // javazoom.jl.player.AudioDeviceFactory
    public AudioDevice createAudioDevice() throws JavaLayerException {
        AudioDeviceFactory[] factoriesPriority = getFactoriesPriority();
        if (factoriesPriority == null) {
            throw new JavaLayerException(this + ": no factories registered");
        }
        AudioDevice audioDeviceCreateAudioDevice = null;
        JavaLayerException e = null;
        for (int i = 0; audioDeviceCreateAudioDevice == null && i < factoriesPriority.length; i++) {
            try {
                audioDeviceCreateAudioDevice = factoriesPriority[i].createAudioDevice();
            } catch (JavaLayerException e2) {
                e = e2;
            }
        }
        if (audioDeviceCreateAudioDevice != null || e == null) {
            return audioDeviceCreateAudioDevice;
        }
        throw new JavaLayerException("Cannot create AudioDevice", e);
    }

    public AudioDeviceFactory[] getFactoriesPriority() {
        AudioDeviceFactory[] audioDeviceFactoryArr;
        synchronized (this.factories) {
            int size = this.factories.size();
            if (size != 0) {
                audioDeviceFactoryArr = new AudioDeviceFactory[size];
                int i = 0;
                Enumeration enumerationElements = this.factories.elements();
                while (enumerationElements.hasMoreElements()) {
                    audioDeviceFactoryArr[i] = (AudioDeviceFactory) enumerationElements.nextElement();
                    i++;
                }
            } else {
                audioDeviceFactoryArr = null;
            }
        }
        return audioDeviceFactoryArr;
    }

    public void registerDefaultFactories() {
        addFactory(new JavaSoundAudioDeviceFactory());
    }

    public void removeFactory(AudioDeviceFactory audioDeviceFactory) {
        this.factories.remove(audioDeviceFactory.getClass());
    }

    public void removeFactoryType(Class cls) {
        this.factories.remove(cls);
    }
}
