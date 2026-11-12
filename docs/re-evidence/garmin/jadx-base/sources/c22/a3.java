package c22;

import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc22/a3;", "Lc22/z2;", "", "Landroid/content/SharedPreferences;", "sharedPrefs", Action.KEY_ATTRIBUTE, "defaultValue", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a3 extends z2<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(SharedPreferences sharedPreferences, String str, String str2) {
        super(sharedPreferences, str, str2);
        sharedPreferences.getClass();
        str.getClass();
        str2.getClass();
    }

    @Override // c22.z2
    public final Object n(Object obj, String str) {
        String str2 = (String) obj;
        str.getClass();
        str2.getClass();
        String string = this.f23763l.getString(str, str2);
        return string == null ? "" : string;
    }
}
