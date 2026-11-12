package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class mit implements dit {
    @Override // defpackage.dit
    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) uit.f(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
