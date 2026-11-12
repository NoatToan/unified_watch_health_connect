package c22;

import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc22/u2;", "Lc22/z2;", "", "Landroid/content/SharedPreferences;", "sharedPrefs", "", Action.KEY_ATTRIBUTE, "defaultValue", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u2 extends z2<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(SharedPreferences sharedPreferences, String str, boolean z14) {
        super(sharedPreferences, str, Boolean.valueOf(z14));
        sharedPreferences.getClass();
        str.getClass();
    }

    @Override // c22.z2
    public final Object n(Object obj, String str) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        str.getClass();
        return Boolean.valueOf(this.f23763l.getBoolean(str, zBooleanValue));
    }
}
