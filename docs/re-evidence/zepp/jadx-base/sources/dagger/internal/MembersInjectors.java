package dagger.internal;

import dagger.MembersInjector;

/* JADX INFO: loaded from: classes22.dex */
public final class MembersInjectors {

    public enum a implements MembersInjector<Object> {
        INSTANCE;

        @Override // dagger.MembersInjector
        public void injectMembers(Object obj) {
            Preconditions.checkNotNull(obj, "Cannot inject members into a null reference");
        }
    }

    private MembersInjectors() {
    }

    public static <T> MembersInjector<T> noOp() {
        return a.INSTANCE;
    }
}
