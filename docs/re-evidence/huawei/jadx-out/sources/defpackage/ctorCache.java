package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CopyableThrowable;
import kotlinx.coroutines.internal.CtorCache;

/* JADX INFO: renamed from: zll, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a!\u0010\r\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0015"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", ExifInterface.LONGITUDE_EAST, "clz", "Ljava/lang/Class;", "safeCtor", "block", "tryCopyException", TrackConstants$Events.EXCEPTION, "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ctorCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CtorCache f54266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f54267b = b(Throwable.class, -1);

    static {
        zmp zmpVar;
        try {
            zmpVar = ANDROID_DETECTED.a() ? zmp.f54309b : zlc.d;
        } catch (Throwable unused) {
            zmpVar = zmp.f54309b;
        }
        f54266a = zmpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E b(E e2) {
        Object objE;
        if (e2 instanceof CopyableThrowable) {
            try {
                yyt.c cVar = yyt.f53903b;
                objE = yyt.e(((CopyableThrowable) e2).createCopy());
            } catch (Throwable th) {
                yyt.c cVar2 = yyt.f53903b;
                objE = yyt.e(createFailure.a(th));
            }
            if (yyt.b(objE)) {
                objE = null;
            }
            return (E) objE;
        }
        return (E) f54266a.get(e2.getClass()).invoke(e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> Function1<Throwable, Throwable> c(Class<E> cls) {
        Object next;
        Function1<Throwable, Throwable> function1;
        yyu yyuVarC;
        d dVar = d.f54270b;
        if (f54267b == b(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    yyuVarC = yyz.c(b(new e(constructor)), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (zcp.b(cls2, String.class)) {
                        yyuVarC = yyz.c(b(new a(constructor)), 2);
                    } else if (zcp.b(cls2, Throwable.class)) {
                        yyuVarC = yyz.c(b(new b(constructor)), 1);
                    } else {
                        yyuVarC = yyz.c(null, -1);
                    }
                } else if (length2 == 2) {
                    if (zcp.b(parameterTypes[0], String.class) && zcp.b(parameterTypes[1], Throwable.class)) {
                        yyuVarC = yyz.c(b(new c(constructor)), 3);
                    } else {
                        yyuVarC = yyz.c(null, -1);
                    }
                } else {
                    yyuVarC = yyz.c(null, -1);
                }
                arrayList.add(yyuVarC);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((yyu) next).d()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((yyu) next2).d()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            yyu yyuVar = (yyu) next;
            if (yyuVar != null && (function1 = (Function1) yyuVar.c()) != null) {
                return function1;
            }
        }
        return dVar;
    }

    /* JADX INFO: renamed from: zll$c */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, FitRunPlayAudio.OPPORTUNITY_E, TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends Lambda implements Function1<Throwable, Throwable> {
        final /* synthetic */ Constructor<?> e;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Object objNewInstance = this.e.newInstance(th.getMessage(), th);
            zcp.e(objNewInstance, "");
            return (Throwable) objNewInstance;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Constructor<?> constructor) {
            super(1);
            this.e = constructor;
        }
    }

    /* JADX INFO: renamed from: zll$a */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, FitRunPlayAudio.OPPORTUNITY_E, TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function1<Throwable, Throwable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Constructor<?> f54268c;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Object objNewInstance = this.f54268c.newInstance(th.getMessage());
            zcp.e(objNewInstance, "");
            Throwable th2 = (Throwable) objNewInstance;
            th2.initCause(th);
            return th2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Constructor<?> constructor) {
            super(1);
            this.f54268c = constructor;
        }
    }

    /* JADX INFO: renamed from: zll$b */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, FitRunPlayAudio.OPPORTUNITY_E, TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends Lambda implements Function1<Throwable, Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor<?> f54269a;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Object objNewInstance = this.f54269a.newInstance(th);
            zcp.e(objNewInstance, "");
            return (Throwable) objNewInstance;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Constructor<?> constructor) {
            super(1);
            this.f54269a = constructor;
        }
    }

    /* JADX INFO: renamed from: zll$e */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, FitRunPlayAudio.OPPORTUNITY_E, TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends Lambda implements Function1<Throwable, Throwable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Constructor<?> f54271c;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Object objNewInstance = this.f54271c.newInstance(new Object[0]);
            zcp.e(objNewInstance, "");
            Throwable th2 = (Throwable) objNewInstance;
            th2.initCause(th);
            return th2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Constructor<?> constructor) {
            super(1);
            this.f54271c = constructor;
        }
    }

    /* JADX INFO: renamed from: zll$j */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", FitRunPlayAudio.OPPORTUNITY_E, TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends Lambda implements Function1<Throwable, Throwable> {
        final /* synthetic */ Function1<Throwable, Throwable> d;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objE;
            Function1<Throwable, Throwable> function1 = this.d;
            try {
                yyt.c cVar = yyt.f53903b;
                Throwable thInvoke = function1.invoke(th);
                if (!zcp.b((Object) th.getMessage(), (Object) thInvoke.getMessage()) && !zcp.b((Object) thInvoke.getMessage(), (Object) th.toString())) {
                    thInvoke = null;
                }
                objE = yyt.e(thInvoke);
            } catch (Throwable th2) {
                yyt.c cVar2 = yyt.f53903b;
                objE = yyt.e(createFailure.a(th2));
            }
            return (Throwable) (yyt.b(objE) ? null : objE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Function1<? super Throwable, ? extends Throwable> function1) {
            super(1);
            this.d = function1;
        }
    }

    private static final Function1<Throwable, Throwable> b(Function1<? super Throwable, ? extends Throwable> function1) {
        return new j(function1);
    }

    private static final int b(Class<?> cls, int i) {
        Object objE;
        java.b(cls);
        try {
            yyt.c cVar = yyt.f53903b;
            objE = yyt.e(Integer.valueOf(a(cls, 0, 1, null)));
        } catch (Throwable th) {
            yyt.c cVar2 = yyt.f53903b;
            objE = yyt.e(createFailure.a(th));
        }
        if (yyt.b(objE)) {
            objE = Integer.valueOf(i);
        }
        return ((Number) objE).intValue();
    }

    static /* synthetic */ int a(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c(cls, i);
    }

    private static final int c(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    /* JADX INFO: renamed from: zll$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "", "it", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f54270b = new d();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }

        d() {
            super(1);
        }
    }
}
