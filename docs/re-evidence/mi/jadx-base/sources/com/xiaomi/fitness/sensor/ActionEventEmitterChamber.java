package com.xiaomi.fitness.sensor;

import com.mibi.sdk.component.Constants;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010)\n\u0000\n\u0002\u0010(\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u00020\r\"\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0011\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0017H\u0086\u0002J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0019R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sensor/ActionEventEmitterChamber;", "", "<init>", "()V", "mChamber", "Ljava/util/Deque;", "Lcom/xiaomi/fitness/sensor/EventBullet;", "pushBullet", "", "event", "", "acc", Constants.KEY_RECHARGE_VALUES, "", "", "popBullet", "isReady", "", "()Z", "count", "peekLast", "peekFirst", "iterator", "", "descendingIterator", "", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActionEventEmitterChamber {

    @NotNull
    private final Deque<EventBullet> mChamber = new LinkedList();

    public final int count() {
        return this.mChamber.size();
    }

    @NotNull
    public final Iterator<EventBullet> descendingIterator() {
        Iterator<EventBullet> itDescendingIterator = this.mChamber.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        return itDescendingIterator;
    }

    public final boolean isReady() {
        EventBullet next = this.mChamber.descendingIterator().next();
        Intrinsics.checkNotNull(next);
        return next.getAccuracy() != -1;
    }

    @NotNull
    public final Iterator<EventBullet> iterator() {
        Iterator<EventBullet> it = this.mChamber.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        return it;
    }

    @Nullable
    public final EventBullet peekFirst() {
        return this.mChamber.peekFirst();
    }

    @Nullable
    public final EventBullet peekLast() {
        return this.mChamber.peekLast();
    }

    @Nullable
    public final EventBullet popBullet(int event) {
        Iterator<EventBullet> it = iterator();
        while (it.hasNext()) {
            EventBullet next = it.next();
            Intrinsics.checkNotNull(next);
            if (next.getEvent() == event) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public final void pushBullet(int event, int acc, @NotNull float... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        EventBullet eventBulletPopBullet = popBullet(event);
        if (eventBulletPopBullet == null) {
            eventBulletPopBullet = EventBullet.INSTANCE.create(event, acc, values);
        } else {
            eventBulletPopBullet.reset(acc, Arrays.copyOf(values, values.length));
        }
        this.mChamber.push(eventBulletPopBullet);
    }
}
