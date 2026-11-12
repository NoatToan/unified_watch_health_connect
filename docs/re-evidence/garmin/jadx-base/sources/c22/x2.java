package c22;

import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc22/x2;", "Lc22/z2;", "", "Landroid/content/SharedPreferences;", "sharedPrefs", "", Action.KEY_ATTRIBUTE, "defaultValue", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;I)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x2 extends z2<Integer> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(SharedPreferences sharedPreferences, String str, int i14) {
        super(sharedPreferences, str, Integer.valueOf(i14));
        sharedPreferences.getClass();
        str.getClass();
    }

    @Override // c22.z2
    public final Object n(Object obj, String str) {
        int iIntValue = ((Number) obj).intValue();
        str.getClass();
        return Integer.valueOf(this.f23763l.getInt(str, iIntValue));
    }
}
