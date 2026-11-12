package d91;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ld91/w;", "", "", "preferredAiLanguage", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preferredAILanguage")
    private final String preferredAiLanguage;

    public /* synthetic */ w(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPreferredAiLanguage() {
        return this.preferredAiLanguage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && p005kotlin.jvm.internal.s.g(this.preferredAiLanguage, ((w) obj).preferredAiLanguage);
    }

    public final int hashCode() {
        String str = this.preferredAiLanguage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return am.j.m("PreferredLanguageDTO(preferredAiLanguage=", this.preferredAiLanguage, ")");
    }

    public w(String str) {
        this.preferredAiLanguage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
