package com.airbnb.lottie.compose;

import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import e23.l;
import java.util.Arrays;
import p005kotlin.Metadata;
import p13.u;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0011\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0010\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006$\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00068\nX\u008a\u0084\u0002"}, d2 = {"", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "properties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperties", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Lp3/m;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "T", "property", "value", "", "keyPath", "rememberLottieDynamicProperty", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Lp3/m;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "callback", "(Ljava/lang/Object;[Ljava/lang/String;Le23/l;Lp3/m;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "toValueCallback", "(Le23/l;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "callbackState", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LottieDynamicPropertiesKt {
    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    public static final LottieDynamicProperties rememberLottieDynamicProperties(LottieDynamicProperty<?>[] lottieDynamicPropertyArr, m mVar, int i14) {
        lottieDynamicPropertyArr.getClass();
        mVar.L(-395574495);
        x1 x1Var = n.f135158a;
        int iHashCode = Arrays.hashCode(lottieDynamicPropertyArr);
        mVar.L(34468001);
        boolean zK = mVar.k(iHashCode);
        Object objQ = mVar.q();
        if (zK) {
            objQ = new LottieDynamicProperties(u.i0(lottieDynamicPropertyArr));
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new LottieDynamicProperties(u.i0(lottieDynamicPropertyArr));
                mVar.K(objQ);
            }
        }
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) objQ;
        mVar.R();
        mVar.R();
        return lottieDynamicProperties;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t7, T t14, String[] strArr, m mVar, int i14) {
        strArr.getClass();
        mVar.L(-1788530187);
        x1 x1Var = n.f135158a;
        mVar.L(1613443961);
        boolean zB = mVar.B(strArr);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (zB) {
            objQ = new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length));
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length));
                mVar.K(objQ);
            }
        }
        KeyPath keyPath = (KeyPath) objQ;
        mVar.R();
        mVar.L(1613444012);
        boolean zB2 = mVar.B(keyPath) | ((((i14 & 14) ^ 6) > 4 && mVar.B(t7)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && mVar.B(t14)) || (i14 & 48) == 32);
        Object objQ2 = mVar.q();
        if (zB2) {
            objQ2 = new LottieDynamicProperty(t7, keyPath, t14);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new LottieDynamicProperty(t7, keyPath, t14);
                mVar.K(objQ2);
            }
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) objQ2;
        mVar.R();
        mVar.R();
        return lottieDynamicProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> l<LottieFrameInfo<T>, T> rememberLottieDynamicProperty$lambda$4(x3<? extends l<? super LottieFrameInfo<T>, ? extends T>> x3Var) {
        return x3Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1] */
    public static final AnonymousClass1 toValueCallback(final l lVar) {
        return new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt.toValueCallback.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public Object getValue(LottieFrameInfo<Object> frameInfo) {
                frameInfo.getClass();
                return lVar.invoke(frameInfo);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:6:0x002b  */
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t7, String[] strArr, l<? super LottieFrameInfo<T>, ? extends T> lVar, m mVar, int i14) {
        strArr.getClass();
        lVar.getClass();
        mVar.L(1331897370);
        x1 x1Var = n.f135158a;
        int iHashCode = Arrays.hashCode(strArr);
        mVar.L(1613445061);
        boolean zK = mVar.k(iHashCode);
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (!zK) {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length));
                mVar.K(objQ);
            }
        } else {
            objQ = new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length));
            mVar.K(objQ);
        }
        KeyPath keyPath = (KeyPath) objQ;
        mVar.R();
        p1 p1VarQ = p0.q(lVar, mVar);
        mVar.L(1613445186);
        boolean zB = mVar.B(keyPath) | ((((i14 & 14) ^ 6) > 4 && mVar.B(t7)) || (i14 & 6) == 4);
        Object objQ2 = mVar.q();
        if (!zB) {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new LottieDynamicProperty((Object) t7, keyPath, (l) new LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1(p1VarQ));
                mVar.K(objQ2);
            }
        } else {
            objQ2 = new LottieDynamicProperty((Object) t7, keyPath, (l) new LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1(p1VarQ));
            mVar.K(objQ2);
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) objQ2;
        mVar.R();
        mVar.R();
        return lottieDynamicProperty;
    }
}
