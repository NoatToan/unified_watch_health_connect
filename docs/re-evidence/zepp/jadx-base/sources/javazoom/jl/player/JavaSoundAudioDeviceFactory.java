package javazoom.jl.player;

import javazoom.jl.decoder.JavaLayerException;

/* JADX INFO: loaded from: classes23.dex */
public class JavaSoundAudioDeviceFactory extends AudioDeviceFactory {
    private static final String b = "javazoom.jl.player.JavaSoundAudioDevice";
    private boolean a = false;

    @Override // javazoom.jl.player.AudioDeviceFactory
    public synchronized AudioDevice createAudioDevice() throws JavaLayerException {
        if (!this.a) {
            testAudioDevice();
            this.a = true;
        }
        try {
            try {
            } catch (LinkageError e) {
                throw new JavaLayerException("unable to create JavaSound device: " + e);
            }
        } catch (Exception e2) {
            throw new JavaLayerException("unable to create JavaSound device: " + e2);
        }
        return createAudioDeviceImpl();
    }

    public JavaSoundAudioDevice createAudioDeviceImpl() throws JavaLayerException {
        try {
            return (JavaSoundAudioDevice) instantiate(getClass().getClassLoader(), b);
        } catch (Exception e) {
            throw new JavaLayerException("Cannot create JavaSound device", e);
        } catch (LinkageError e2) {
            throw new JavaLayerException("Cannot create JavaSound device", e2);
        }
    }

    public void testAudioDevice() throws JavaLayerException {
        createAudioDeviceImpl().test();
    }
}
