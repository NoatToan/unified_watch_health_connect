package qe1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b \u0010$R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b\u0012\u0010&¨\u0006'"}, d2 = {"Lqe1/e;", "", "Lqe1/f;", "recreational", "Lqe1/d;", "intermediate", "Lqe1/m;", "trained", "Lqe1/n;", "wellTrained", "Lqe1/b;", "expert", "Lqe1/l;", "superior", "Lqe1/a;", "elite", "<init>", "(Lqe1/f;Lqe1/d;Lqe1/m;Lqe1/n;Lqe1/b;Lqe1/l;Lqe1/a;)V", "a", "Lqe1/f;", "d", "()Lqe1/f;", "b", "Lqe1/d;", "c", "()Lqe1/d;", "Lqe1/m;", "f", "()Lqe1/m;", "Lqe1/n;", "g", "()Lqe1/n;", JWKParameterNames.RSA_EXPONENT, "Lqe1/b;", "()Lqe1/b;", "Lqe1/l;", "()Lqe1/l;", "Lqe1/a;", "()Lqe1/a;", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("RECREATIONAL")
    private final f recreational;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("INTERMEDIATE")
    private final d intermediate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TRAINED")
    private final m trained;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("WELL_TRAINED")
    private final n wellTrained;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EXPERT")
    private final b expert;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SUPERIOR")
    private final l superior;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ELITE")
    private final a elite;

    public e(f fVar, d dVar, m mVar, n nVar, b bVar, l lVar, a aVar) {
        fVar.getClass();
        dVar.getClass();
        mVar.getClass();
        nVar.getClass();
        bVar.getClass();
        lVar.getClass();
        aVar.getClass();
        this.recreational = fVar;
        this.intermediate = dVar;
        this.trained = mVar;
        this.wellTrained = nVar;
        this.expert = bVar;
        this.superior = lVar;
        this.elite = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getElite() {
        return this.elite;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getExpert() {
        return this.expert;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getIntermediate() {
        return this.intermediate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getRecreational() {
        return this.recreational;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getSuperior() {
        return this.superior;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.recreational, eVar.recreational) && s.g(this.intermediate, eVar.intermediate) && s.g(this.trained, eVar.trained) && s.g(this.wellTrained, eVar.wellTrained) && s.g(this.expert, eVar.expert) && s.g(this.superior, eVar.superior) && s.g(this.elite, eVar.elite);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m getTrained() {
        return this.trained;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getWellTrained() {
        return this.wellTrained;
    }

    public final int hashCode() {
        return this.elite.hashCode() + ((this.superior.hashCode() + ((this.expert.hashCode() + ((this.wellTrained.hashCode() + ((this.trained.hashCode() + ((this.intermediate.hashCode() + (this.recreational.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Male(recreational=" + this.recreational + ", intermediate=" + this.intermediate + ", trained=" + this.trained + ", wellTrained=" + this.wellTrained + ", expert=" + this.expert + ", superior=" + this.superior + ", elite=" + this.elite + ")";
    }
}
