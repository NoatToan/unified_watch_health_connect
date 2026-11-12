package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0019\u0010\u001bJ#\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u001c\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b \u0010!J!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b \u0010\"¨\u0006#"}, d2 = {"Landroidx/room/h;", "T", "Landroidx/room/q0;", "Landroidx/room/b0;", "database", "<init>", "(Landroidx/room/b0;)V", "Lvd/g;", "statement", "entity", "", "bind", "(Lvd/g;Ljava/lang/Object;)V", "insert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "", "insertAndReturnId", "(Ljava/lang/Object;)J", "", "", "insertAndReturnIdsArray", "(Ljava/util/Collection;)[J", "([Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Ljava/util/Collection;)[Ljava/lang/Long;", "([Ljava/lang/Object;)[Ljava/lang/Long;", "", "insertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h<T> extends q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b0 b0Var) {
        super(b0Var);
        b0Var.getClass();
    }

    public abstract void bind(vd.g statement, T entity);

    public final void insert(Iterable<? extends T> entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(gVarAcquire, it.next());
                gVarAcquire.y1();
            }
            release(gVarAcquire);
        } catch (Throwable th3) {
            release(gVarAcquire);
            throw th3;
        }
    }

    public final long insertAndReturnId(T entity) {
        vd.g gVarAcquire = acquire();
        try {
            bind(gVarAcquire, entity);
            return gVarAcquire.y1();
        } finally {
            release(gVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i14 = 0;
            for (T t7 : entities) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                bind(gVarAcquire, t7);
                jArr[i14] = gVarAcquire.y1();
                i14 = i15;
            }
            release(gVarAcquire);
            return jArr;
        } catch (Throwable th3) {
            release(gVarAcquire);
            throw th3;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i14 = 0; i14 < size; i14++) {
                bind(gVarAcquire, it.next());
                lArr[i14] = Long.valueOf(gVarAcquire.y1());
            }
            release(gVarAcquire);
            return lArr;
        } catch (Throwable th3) {
            release(gVarAcquire);
            throw th3;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        try {
            q13.b bVarB = p13.w.b();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(gVarAcquire, it.next());
                bVarB.add(Long.valueOf(gVarAcquire.y1()));
            }
            return p13.w.a(bVarB);
        } finally {
            release(gVarAcquire);
        }
    }

    public final void insert(T[] entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        try {
            for (T t7 : entities) {
                bind(gVarAcquire, t7);
                gVarAcquire.y1();
            }
            release(gVarAcquire);
        } catch (Throwable th3) {
            release(gVarAcquire);
            throw th3;
        }
    }

    public final void insert(T entity) {
        vd.g gVarAcquire = acquire();
        try {
            bind(gVarAcquire, entity);
            gVarAcquire.y1();
        } finally {
            release(gVarAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        p005kotlin.jvm.internal.b bVar = new p005kotlin.jvm.internal.b(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i14 = 0; i14 < length; i14++) {
                bind(gVarAcquire, bVar.next());
                lArr[i14] = Long.valueOf(gVarAcquire.y1());
            }
            release(gVarAcquire);
            return lArr;
        } catch (Throwable th3) {
            release(gVarAcquire);
            throw th3;
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        try {
            q13.b bVarB = p13.w.b();
            for (T t7 : entities) {
                bind(gVarAcquire, t7);
                bVarB.add(Long.valueOf(gVarAcquire.y1()));
            }
            return p13.w.a(bVarB);
        } finally {
            release(gVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        entities.getClass();
        vd.g gVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                int i16 = i15 + 1;
                bind(gVarAcquire, entities[i14]);
                jArr[i15] = gVarAcquire.y1();
                i14++;
                i15 = i16;
            }
            release(gVarAcquire);
            return jArr;
        } catch (Throwable th3) {
            release(gVarAcquire);
            throw th3;
        }
    }
}
