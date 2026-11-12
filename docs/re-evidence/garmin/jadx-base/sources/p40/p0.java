package p40;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f135718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q40.b f135719c;

    public /* synthetic */ p0(e23.l lVar, q40.b bVar, int i14) {
        this.f135717a = i14;
        this.f135718b = lVar;
        this.f135719c = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f135717a) {
            case 0:
                ((q40.b) obj).getClass();
                this.f135718b.invoke(this.f135719c);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                q40.b bVar = this.f135719c;
                Long l14 = bVar.f142574a;
                String str2 = bVar.f142576c;
                String str3 = bVar.f142577d;
                String str4 = bVar.f142578e;
                String str5 = bVar.f142579f;
                com.garmin.android.apps.connectmobile.courses.model.f fVar = bVar.f142580g;
                String str6 = bVar.f142581h;
                Integer num = bVar.f142582i;
                Integer num2 = bVar.f142583j;
                boolean z14 = bVar.f142584k;
                boolean z15 = bVar.f142585l;
                boolean z16 = bVar.f142586m;
                double d14 = bVar.f142587n;
                double d15 = bVar.f142588o;
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                fVar.getClass();
                this.f135718b.invoke(new q40.b(l14, str, str2, str3, str4, str5, fVar, str6, num, num2, z14, z15, z16, d14, d15));
                break;
        }
        return Unit.INSTANCE;
    }
}
