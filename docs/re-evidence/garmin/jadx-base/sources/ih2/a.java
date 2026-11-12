package ih2;

import android.app.KeyguardManager;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/app/KeyguardManager;", "invoke", "(Landroid/app/KeyguardManager;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class a extends w implements l<KeyguardManager, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93515a = new a();

    public a() {
        super(1);
    }

    @Override // e23.l
    public final Boolean invoke(KeyguardManager keyguardManager) {
        KeyguardManager keyguardManager2 = keyguardManager;
        keyguardManager2.getClass();
        return Boolean.valueOf(keyguardManager2.isKeyguardLocked());
    }
}
