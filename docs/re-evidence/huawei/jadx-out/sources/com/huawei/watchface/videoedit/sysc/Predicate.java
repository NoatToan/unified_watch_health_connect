package com.huawei.watchface.videoedit.sysc;

import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
@FunctionalInterface
public interface Predicate<T> {
    static <T> Predicate<T> isEqual(final Object obj) {
        return obj == null ? new Predicate() { // from class: com.huawei.watchface.videoedit.sysc.Predicate$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.videoedit.sysc.Predicate
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new Predicate() { // from class: com.huawei.watchface.videoedit.sysc.Predicate$$ExternalSyntheticLambda1
            @Override // com.huawei.watchface.videoedit.sysc.Predicate
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        return test(obj) && predicate.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        return test(obj) || predicate.test(obj);
    }

    default Predicate<T> and(final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: com.huawei.watchface.videoedit.sysc.Predicate$$ExternalSyntheticLambda3
            @Override // com.huawei.watchface.videoedit.sysc.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$and$0(predicate, obj);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate() { // from class: com.huawei.watchface.videoedit.sysc.Predicate$$ExternalSyntheticLambda4
            @Override // com.huawei.watchface.videoedit.sysc.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$negate$1(obj);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: com.huawei.watchface.videoedit.sysc.Predicate$$ExternalSyntheticLambda2
            @Override // com.huawei.watchface.videoedit.sysc.Predicate
            public final boolean test(Object obj) {
                return this.f$0.lambda$or$2(predicate, obj);
            }
        };
    }

    boolean test(T t);
}
