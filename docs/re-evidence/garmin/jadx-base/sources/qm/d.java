package qm;

import com.github.mikephil.chartingv2.renderer.LineScatterCandleRadarRenderer;

/* JADX INFO: loaded from: classes7.dex */
public class d extends mz.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz.d f145345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f145346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f145347d;

    public d(c cVar, int i14, mz.d dVar, boolean z14) {
        this.f145347d = cVar;
        this.f145344a = i14;
        this.f145345b = dVar;
        this.f145346c = z14;
    }

    @Override // mz.b.a
    public final LineScatterCandleRadarRenderer a() {
        mz.d dVar = this.f145345b;
        c cVar = this.f145347d;
        int i14 = this.f145344a;
        if (i14 != 34 && i14 != 47 && i14 != 71) {
            if (i14 != 96) {
                if (i14 != 39 && i14 != 40) {
                    if (i14 != 43) {
                        if (i14 != 44) {
                            if (i14 != 50 && i14 != 51) {
                                if (i14 != 86) {
                                    if (i14 != 87) {
                                        switch (i14) {
                                            case 0:
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 10:
                                                break;
                                            case 9:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                            case 16:
                                                break;
                                            default:
                                                switch (i14) {
                                                    case 19:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                        break;
                                                    case 20:
                                                        break;
                                                    default:
                                                        switch (i14) {
                                                            default:
                                                                switch (i14) {
                                                                    case 65:
                                                                    case 67:
                                                                    case 68:
                                                                    case 69:
                                                                        break;
                                                                    case 66:
                                                                        break;
                                                                    default:
                                                                        switch (i14) {
                                                                            case 81:
                                                                            case 82:
                                                                                break;
                                                                            case 83:
                                                                            case 84:
                                                                                break;
                                                                            default:
                                                                                return null;
                                                                        }
                                                                        break;
                                                                }
                                                            case 57:
                                                            case 58:
                                                            case 59:
                                                            case 60:
                                                            case 61:
                                                            case 62:
                                                            case 63:
                                                                mz.a aVar = new mz.a(cVar.f145281q, dVar);
                                                                aVar.f121604a = this.f145346c;
                                                                return aVar;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return new mz.a(cVar.f145281q, dVar);
                }
            }
            return new om.a(cVar.f145281q, dVar);
        }
        mz.a aVar2 = new mz.a(cVar.f145281q, dVar);
        aVar2.f121604a = this.f145346c;
        return aVar2;
    }

    @Override // mz.b.a
    public final int b() {
        return im.a.b(this.f145344a);
    }
}
