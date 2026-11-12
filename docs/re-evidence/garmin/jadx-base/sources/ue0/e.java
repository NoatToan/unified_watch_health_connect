package ue0;

import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lue0/e;", "", "", "responseType", "subjectUserId", "clientId", "codeChallenge", "codeChallengeMethod", Action.SCOPE_ATTRIBUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "f", "c", JWKParameterNames.RSA_EXPONENT, "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("responseType")
    private final String responseType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subjectUserId")
    private final String subjectUserId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientId")
    private final String clientId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("codeChallenge")
    private final String codeChallenge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("codeChallengeMethod")
    private final String codeChallengeMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.SCOPE_ATTRIBUTE)
    private final String scope;

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "code" : str, str2, (i14 & 4) != 0 ? "CONNECT_WEB" : str3, str4, str5, (i14 & 32) != 0 ? "" : str6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResponseType() {
        return this.responseType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.responseType, eVar.responseType) && s.g(this.subjectUserId, eVar.subjectUserId) && s.g(this.clientId, eVar.clientId) && s.g(this.codeChallenge, eVar.codeChallenge) && s.g(this.codeChallengeMethod, eVar.codeChallengeMethod) && s.g(this.scope, eVar.scope);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubjectUserId() {
        return this.subjectUserId;
    }

    public final int hashCode() {
        return this.scope.hashCode() + wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.responseType.hashCode() * 31, 31, this.subjectUserId), 31, this.clientId), 31, this.codeChallenge), 31, this.codeChallengeMethod);
    }

    public final String toString() {
        String str = this.responseType;
        String str2 = this.subjectUserId;
        String str3 = this.clientId;
        String str4 = this.codeChallenge;
        String str5 = this.codeChallengeMethod;
        String str6 = this.scope;
        StringBuilder sbI = p6.b.i("AuthorizeViewerParameters(responseType=", str, ", subjectUserId=", str2, ", clientId=");
        sn.a.t(sbI, str3, ", codeChallenge=", str4, ", codeChallengeMethod=");
        return e5.h(sbI, str5, ", scope=", str6, ")");
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.responseType = str;
        this.subjectUserId = str2;
        this.clientId = str3;
        this.codeChallenge = str4;
        this.codeChallengeMethod = str5;
        this.scope = str6;
    }
}
