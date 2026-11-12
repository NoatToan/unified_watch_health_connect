package defpackage;

import com.huawei.health.suggestion.ui.voice.IVoiceContentConstructor;

/* JADX INFO: loaded from: classes31.dex */
public class idn implements IVoiceContentConstructor {
    private static volatile idn d;

    @Override // com.huawei.health.suggestion.ui.voice.IVoiceContentConstructor
    public Object constructContent(int i, Object obj) {
        return null;
    }

    private idn() {
    }

    public static idn b() {
        if (d == null) {
            synchronized (idn.class) {
                if (d == null) {
                    d = new idn();
                }
            }
        }
        return d;
    }
}
