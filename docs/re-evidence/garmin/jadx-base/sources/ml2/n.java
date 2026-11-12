package ml2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.j0;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lml2/n;", "", "", "connectionId", "", "", "Lcom/garmin/device/multilink/MultiLinkServiceId;", "supportedServiceIds", "", "advertisingServiceData", "Lml2/a0;", "multiLinkVersion", "Lml2/c0;", "productInfo", "identityAddress", "", "serviceRevisions", "<init>", "(Ljava/lang/String;Ljava/util/List;[BLml2/a0;Lml2/c0;[BLjava/util/Map;)V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Integer> f119398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f119399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f119400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f119401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f119402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Integer, Integer> f119403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f119404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f119405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f119406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f119407k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lml2/q;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<List<? extends q>> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final List<? extends q> invoke() {
            n nVar = n.this;
            if (nVar.f119398b == null) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            for (q qVar : q.values()) {
                if (nVar.f119398b.contains(Integer.valueOf(qVar.f119440a))) {
                    arrayList.add(qVar);
                }
            }
            return arrayList;
        }
    }

    public n(String str, List<Integer> list, byte[] bArr, a0 a0Var, c0 c0Var, byte[] bArr2, Map<Integer, Integer> map) {
        str.getClass();
        this.f119397a = str;
        this.f119398b = list;
        this.f119399c = bArr;
        this.f119400d = a0Var;
        this.f119401e = c0Var;
        this.f119402f = bArr2;
        this.f119403g = map;
        this.f119404h = c0Var != null ? Integer.valueOf(c0Var.f119309a) : null;
        this.f119405i = c0Var != null ? c0Var.f119310b : null;
        this.f119406j = c0Var != null ? c0Var.f119311c : null;
        this.f119407k = o13.m.b(new a());
    }

    public static n a(n nVar, ArrayList arrayList, byte[] bArr, a0 a0Var, c0 c0Var, byte[] bArr2, int i14) {
        ArrayList arrayList2 = arrayList;
        if ((i14 & 1) != 0) {
            arrayList2 = null;
        }
        if ((i14 & 2) != 0) {
            bArr = null;
        }
        if ((i14 & 4) != 0) {
            a0Var = null;
        }
        if ((i14 & 8) != 0) {
            c0Var = null;
        }
        if ((i14 & 16) != 0) {
            bArr2 = null;
        }
        String str = nVar.f119397a;
        List<Integer> list = arrayList2;
        if (arrayList2 == null) {
            list = nVar.f119398b;
        }
        List<Integer> list2 = list;
        if (bArr == null) {
            bArr = nVar.f119399c;
        }
        byte[] bArr3 = bArr;
        if (a0Var == null) {
            a0Var = nVar.f119400d;
        }
        a0 a0Var2 = a0Var;
        if (c0Var == null) {
            c0Var = nVar.f119401e;
        }
        c0 c0Var2 = c0Var;
        if (bArr2 == null) {
            bArr2 = nVar.f119402f;
        }
        return new n(str, list2, bArr3, a0Var2, c0Var2, bArr2, nVar.f119403g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        n nVar = (n) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f119397a, nVar.f119397a) || !p005kotlin.jvm.internal.s.g(this.f119398b, nVar.f119398b)) {
            return false;
        }
        byte[] bArr = nVar.f119399c;
        byte[] bArr2 = this.f119399c;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        if (!p005kotlin.jvm.internal.s.g(this.f119400d, nVar.f119400d) || !p005kotlin.jvm.internal.s.g(this.f119404h, nVar.f119404h) || !p005kotlin.jvm.internal.s.g(this.f119405i, nVar.f119405i) || !p005kotlin.jvm.internal.s.g(this.f119406j, nVar.f119406j)) {
            return false;
        }
        byte[] bArr3 = nVar.f119402f;
        byte[] bArr4 = this.f119402f;
        if (bArr4 != null) {
            if (bArr3 == null || !Arrays.equals(bArr4, bArr3)) {
                return false;
            }
        } else if (bArr3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f119397a.hashCode() * 31;
        List<Integer> list = this.f119398b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        byte[] bArr = this.f119399c;
        int iHashCode3 = (iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        a0 a0Var = this.f119400d;
        int iHashCode4 = (iHashCode3 + (a0Var != null ? a0Var.hashCode() : 0)) * 31;
        Integer num = this.f119404h;
        int iIntValue = (iHashCode4 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.f119405i;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Long l14 = this.f119406j;
        int iHashCode5 = (iIntValue2 + (l14 != null ? l14.hashCode() : 0)) * 31;
        byte[] bArr2 = this.f119402f;
        return iHashCode5 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.f119399c);
        String string2 = Arrays.toString(this.f119402f);
        StringBuilder sbG = l2.g("MultiLinkInfo(connectionId=", this.f119397a, ", supportedServiceIds=", this.f119398b, ", advertisingServiceData=");
        sbG.append(string);
        sbG.append(", multiLinkVersion=");
        sbG.append(this.f119400d);
        sbG.append(", productInfo=");
        sbG.append(this.f119401e);
        sbG.append(", identityAddress=");
        sbG.append(string2);
        sbG.append(", serviceRevisions=");
        return am.j.s(sbG, this.f119403g, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, List<Integer> list) {
        this(str, list, null, null, null, null, null, 124, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, List<Integer> list, byte[] bArr) {
        this(str, list, bArr, null, null, null, null, 120, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, List<Integer> list, byte[] bArr, a0 a0Var) {
        this(str, list, bArr, a0Var, null, null, null, 112, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, List<Integer> list, byte[] bArr, a0 a0Var, c0 c0Var) {
        this(str, list, bArr, a0Var, c0Var, null, null, 96, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, List<Integer> list, byte[] bArr, a0 a0Var, c0 c0Var, byte[] bArr2) {
        this(str, list, bArr, a0Var, c0Var, bArr2, null, 64, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str) {
        this(str, null, null, null, null, null, null, 126, null);
        str.getClass();
    }

    public /* synthetic */ n(String str, List list, byte[] bArr, a0 a0Var, c0 c0Var, byte[] bArr2, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : bArr, (i14 & 8) != 0 ? null : a0Var, (i14 & 16) != 0 ? null : c0Var, (i14 & 32) != 0 ? null : bArr2, (i14 & 64) != 0 ? null : map);
    }
}
