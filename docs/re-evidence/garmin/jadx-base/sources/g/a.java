package g;

import android.content.Context;
import android.content.Intent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lg/a;", "I", "O", "", "<init>", "()V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a<I, O> {

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg/a$a;", "T", "", "value", "<init>", "(Ljava/lang/Object;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1502a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f74066a;

        public C1502a(T t7) {
            this.f74066a = t7;
        }
    }

    public abstract Intent a(Context context, I i14);

    public C1502a<O> b(Context context, I i14) {
        context.getClass();
        return null;
    }

    public abstract O c(int i14, Intent intent);
}
