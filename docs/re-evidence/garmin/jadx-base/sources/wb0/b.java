package wb0;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import d53.k;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwb0/b;", "Lwb0/a;", "<init>", "()V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements wb0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f183867c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f183868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f183869b = new ArrayList();

    @Override // wb0.a
    public final int a(int i14) {
        if (i14 == 1) {
            return R.string.smart_scale_user_settings_error_empty_short_name;
        }
        if (i14 == 2) {
            return R.string.smart_scale_user_settings_error_invalid_short_name_characters;
        }
        if (i14 != 3) {
            return -1;
        }
        return R.string.msg_duplicate_short_name;
    }

    @Override // wb0.a
    public final int b(int i14, String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if (str != null && str.length() < 1) {
            return 4;
        }
        if (str != null && str.length() > i14) {
            return 5;
        }
        f183867c.getClass();
        if (!(str != null ? new k("^[A-Z1-9]*$").d(str) : false)) {
            return 2;
        }
        String str2 = this.f183868a;
        return (TextUtils.isEmpty(str) || (str2 != null ? str2.equals(str) : false) || !this.f183869b.contains(str)) ? 0 : 3;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lwb0/b$a;", "", "<init>", "()V", "", "CONDITION_EMPTY", "I", "CONDITION_INVALID_CHARACTERS", "CONDITION_DUPLICATE", "CONDITION_LENGTH", "RESULT_OK", "RESULT_ERROR_EMPTY", "RESULT_ERROR_INVALID_CHARACTERS", "RESULT_ERROR_DUPLICATED", "RESULT_ERROR_TOO_SHORT", "RESULT_ERROR_TOO_LONG", "MIN_SHORT_NAME_LENGTH", "MAX_SHORT_NAME_LENGTH", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
