package km1;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkm1/t;", "", "", "", UserMetadata.KEYDATA_FILENAME, "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum t {
    HIGHLY_INCREASED(p13.x.k("HIGHLY_INCREASED", "LHA_SLEEP_NEED_FEEDBACK_HIGHLY_INCREASED")),
    INCREASED(p13.x.k("INCREASED", "LHA_SLEEP_NEED_FEEDBACK_INCREASED")),
    NO_CHANGE_NO_ADJUSTMENTS(p13.x.k("NO_CHANGE_NO_ADJUSTMENTS", "LHA_SLEEP_NEED_FEEDBACK_NO_CHANGE_NO_ADJUSTMENTS")),
    NO_CHANGE_BALANCED(p13.x.k("NO_CHANGE_BALANCED", "LHA_SLEEP_NEED_FEEDBACK_NO_CHANGE_BALANCED")),
    DECREASED(p13.x.k("DECREASED", "LHA_SLEEP_NEED_FEEDBACK_DECREASED")),
    NONE(p13.x.k("NONE", "LHA_SLEEP_NEED_FEEDBACK_NONE"));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f105583a;

    t(List list) {
        this.f105583a = list;
    }
}
