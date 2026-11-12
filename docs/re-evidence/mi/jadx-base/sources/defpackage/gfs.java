package defpackage;

import android.content.Context;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.ReflectUtil;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.TerminalType;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class gfs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile gfs f18939b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f18940a;

    public gfs(Context context) {
        this.f18940a = new WeakReference<>(context);
    }

    public static gfs a() {
        if (f18939b == null) {
            synchronized (gfs.class) {
                try {
                    if (f18939b == null) {
                        f18939b = new gfs(EnvironmentConfig.getContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18939b;
    }

    public IScTerminal b(String str, TerminalType terminalType) {
        Object objNewInstance;
        Context context = this.f18940a.get();
        if (terminalType == TerminalType.PERIPHERAL) {
            return new c4s(context, str);
        }
        if (terminalType == TerminalType.I2C) {
            objNewInstance = ReflectUtil.newInstance("com.tsmclient.smartcard.terminal.I2CSmartMxTerminal", (Class<?>[]) new Class[]{Context.class}, context);
        } else {
            objNewInstance = terminalType == TerminalType.DECP ? ReflectUtil.newInstance("com.miui.tsmclient.terminal.DCEPTerminal", (Class<?>[]) new Class[]{Context.class}, context) : ReflectUtil.newInstance("com.tsmclient.smartcard.terminal.SPISmartMxTerminal", (Class<?>[]) new Class[]{Context.class}, context);
        }
        return (IScTerminal) objNewInstance;
    }
}
