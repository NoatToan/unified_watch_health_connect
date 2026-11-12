package defpackage;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class xam<T> {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a extends xam<Void> {
        @Override // defpackage.xam
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void a(List<wam> list) {
            return null;
        }

        @Override // defpackage.xam
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void c(List<String> list) {
            return null;
        }
    }

    public abstract T a(List<wam> list);

    public List<wam> b() throws Exception {
        return new ArrayList();
    }

    public abstract T c(List<String> list);
}
