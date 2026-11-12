package tn2;

import java.util.List;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.f f165660b;

    public /* synthetic */ s(w.f fVar, int i14) {
        this.f165659a = i14;
        this.f165660b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165659a;
        w.f fVar = this.f165660b;
        switch (i14) {
            case 0:
                byte[] bArr = (byte[]) obj;
                Logger logger = w.f165679d;
                bArr.getClass();
                fVar.f165719a = bArr;
                break;
            case 1:
                byte[] bArr2 = (byte[]) obj;
                Logger logger2 = w.f165679d;
                bArr2.getClass();
                fVar.f165723e = bArr2;
                break;
            case 2:
                Byte b14 = (Byte) obj;
                Logger logger3 = w.f165679d;
                b14.getClass();
                fVar.f165725g = b14;
                break;
            case 3:
                o13.p pVar = (o13.p) obj;
                Logger logger4 = w.f165679d;
                pVar.getClass();
                Integer num = (Integer) pVar.f128594a;
                Boolean bool = (Boolean) pVar.f128595b;
                fVar.f165726h = num;
                fVar.f165727i = bool;
                break;
            case 4:
                byte[] bArr3 = (byte[]) obj;
                Logger logger5 = w.f165679d;
                bArr3.getClass();
                fVar.f165720b = bArr3;
                break;
            case 5:
                w.a aVar = (w.a) obj;
                Logger logger6 = w.f165679d;
                aVar.getClass();
                fVar.f165721c = aVar;
                break;
            case 6:
                List<w.e> list = (List) obj;
                Logger logger7 = w.f165679d;
                list.getClass();
                fVar.f165724f = list;
                break;
            default:
                List<w.a> list2 = (List) obj;
                Logger logger8 = w.f165679d;
                list2.getClass();
                fVar.f165722d = list2;
                break;
        }
        return fVar;
    }
}
