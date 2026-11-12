package defpackage;

import com.thanosfisherman.elvis.Objects;
import com.thanosfisherman.elvis.interfaces.Function;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class fc2 {
    public static Function a(final Function _this, final Function function) {
        Objects.requireNonNull(function);
        return new Function() { // from class: dc2
            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function andThen(Function function2) {
                return fc2.a(this, function2);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public final Object apply(Object obj) {
                return fc2.c(_this, function, obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function compose(Function function2) {
                return fc2.b(this, function2);
            }
        };
    }

    public static Function b(final Function _this, final Function function) {
        Objects.requireNonNull(function);
        return new Function() { // from class: cc2
            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function andThen(Function function2) {
                return fc2.a(this, function2);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public final Object apply(Object obj) {
                return fc2.d(_this, function, obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function compose(Function function2) {
                return fc2.b(this, function2);
            }
        };
    }

    public static /* synthetic */ Object c(Function _this, Function function, Object obj) {
        return function.apply(_this.apply(obj));
    }

    public static /* synthetic */ Object d(Function _this, Function function, Object obj) {
        return _this.apply(function.apply(obj));
    }

    public static <T> Function<T, T> h() {
        return new Function() { // from class: ec2
            public /* synthetic */ Function a(Function function) {
                return fc2.a(this, function);
            }

            public final Object b(Object obj) {
                return fc2.i(obj);
            }

            public /* synthetic */ Function c(Function function) {
                return fc2.b(this, function);
            }
        };
    }

    public static /* synthetic */ Object i(Object obj) {
        return obj;
    }
}
