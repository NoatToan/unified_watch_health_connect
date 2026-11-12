package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lch1/z2;", "T", "Lfb2/w;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "inputMaxLength", "", "infoMessage", "<init>", "(Landroid/content/Context;ILjava/lang/String;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class z2<T> extends fb2.w<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f27510h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27511i = R.id.deviceNameInputField;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f27512j = R.id.deviceNameInfoMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(Context context, int i14, String str) {
        super(context, i14, null, str);
        context.getClass();
        str.getClass();
    }

    @Override // fb2.i
    public int r() {
        return f27512j;
    }

    @Override // fb2.i
    public int s() {
        return f27511i;
    }

    @Override // fb2.w, fb2.i
    public boolean u() {
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/z2$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
