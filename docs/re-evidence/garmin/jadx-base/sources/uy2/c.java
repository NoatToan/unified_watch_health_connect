package uy2;

import com.garmin.uisynthesizer.synthesize.SynthesizerException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Luy2/c;", "", "<init>", "()V", "a", "b", "Luy2/c$a;", "Luy2/c$b;", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luy2/c$b;", "Luy2/c;", "Lkotlin/Function0;", "", "lazyException", "<init>", "(Le23/a;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.a<Throwable> f173456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.a<? extends Throwable> aVar) {
            super(null);
            aVar.getClass();
            this.f173456a = aVar;
        }

        @Override // uy2.c
        public final Object a() throws Throwable {
            e23.a<Throwable> aVar = this.f173456a;
            aVar.getClass();
            try {
                throw aVar.invoke();
            } catch (Throwable th3) {
                throw new SynthesizerException("Failed to get the value to return", th3);
            }
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract Object a();

    private c() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Luy2/c$a;", "Luy2/c;", "Lkotlin/Function0;", "", "lazyValue", "<init>", "(Le23/a;)V", "immediateValue", "(Ljava/lang/Object;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.a<Object> f173455a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            this((e23.a<? extends Object>) new c53.p(obj, 3));
            obj.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
        @Override // uy2.c
        public final Object a() {
            String strInvoke = "Failed to get the value to return";
            try {
                e23.a<Object> aVar = this.f173455a;
                aVar.getClass();
                try {
                    strInvoke = aVar.invoke();
                    return strInvoke;
                } catch (Throwable th3) {
                    throw new SynthesizerException("Failed to get the value to return", th3);
                }
            } catch (SynthesizerException e4) {
                throw e4;
            } catch (Throwable th4) {
                throw new SynthesizerException(strInvoke, th4);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<? extends Object> aVar) {
            super(null);
            aVar.getClass();
            this.f173455a = aVar;
        }
    }
}
