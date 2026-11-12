package p3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u0005¨\u0006!"}, d2 = {"Lp3/a;", "T", "Lp3/c;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "down", "up", "()V", "clear", "onClear", "", "", FirebaseAnalytics.Param.INDEX, "count", "remove", "(Ljava/util/List;II)V", Constants.MessagePayloadKeys.FROM, "to", "move", "(Ljava/util/List;III)V", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "", "stack", "Ljava/util/ArrayList;", "value", "current", "getCurrent", "setCurrent", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> implements c<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final ArrayList<T> stack = new ArrayList<>();

    public a(T t7) {
        this.root = t7;
        this.current = t7;
    }

    @Override // p3.c
    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }

    @Override // p3.c
    public void down(T node) {
        this.stack.add(getCurrent());
        setCurrent(node);
    }

    @Override // p3.c
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(List<T> list, int i14, int i15, int i16) {
        int i17 = i14 > i15 ? i15 : i15 - i16;
        if (i16 != 1) {
            List<T> listSubList = list.subList(i14, i16 + i14);
            ArrayList arrayListD1 = p13.h0.d1(listSubList);
            listSubList.clear();
            list.addAll(i17, arrayListD1);
            return;
        }
        if (i14 == i15 + 1 || i14 == i15 - 1) {
            list.set(i14, list.set(i15, list.get(i14)));
        } else {
            list.add(i17, list.remove(i14));
        }
    }

    public abstract void onClear();

    public final void remove(List<T> list, int i14, int i15) {
        if (i15 == 1) {
            list.remove(i14);
        } else {
            list.subList(i14, i15 + i14).clear();
        }
    }

    public void setCurrent(T t7) {
        this.current = t7;
    }

    @Override // p3.c
    public void up() {
        ArrayList<T> arrayList = this.stack;
        setCurrent(arrayList.remove(arrayList.size() - 1));
    }
}
