package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class CollectionMapper {

    public interface Collection<T> {
        Object get(T t);

        Iterator<T> keyIterator();

        void set(T t, Object obj, OnErrorListener onErrorListener);
    }

    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    public interface OnMapValueCompleteListener extends OnErrorListener {
        void onComplete(Object obj);
    }

    public interface OnMapperCompleteListener extends OnErrorListener {
        void onComplete();
    }

    public interface ValueMapper {
        void mapValue(Object obj, OnMapValueCompleteListener onMapValueCompleteListener);
    }

    public static class a implements OnMapperCompleteListener {
        public final /* synthetic */ Mutable a;
        public final /* synthetic */ Mutable b;
        public final /* synthetic */ OnMapperCompleteListener c;

        public a(Mutable mutable, Mutable mutable2, OnMapperCompleteListener onMapperCompleteListener) {
            this.a = mutable;
            this.b = mutable2;
            this.c = onMapperCompleteListener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
        @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
        public void onComplete() {
            if (((Boolean) this.a.value).booleanValue()) {
                return;
            }
            Mutable mutable = this.b;
            ?? ValueOf = Integer.valueOf(((Integer) mutable.value).intValue() - 1);
            mutable.value = ValueOf;
            if (ValueOf.intValue() == 0) {
                this.c.onComplete();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
        @Override // com.facebook.internal.CollectionMapper.OnErrorListener
        public void onError(FacebookException facebookException) {
            if (((Boolean) this.a.value).booleanValue()) {
                return;
            }
            this.a.value = Boolean.TRUE;
            this.c.onError(facebookException);
        }
    }

    public static class b implements OnMapValueCompleteListener {
        public final /* synthetic */ Collection a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ OnMapperCompleteListener c;

        public b(Collection collection, Object obj, OnMapperCompleteListener onMapperCompleteListener) {
            this.a = collection;
            this.b = obj;
            this.c = onMapperCompleteListener;
        }

        @Override // com.facebook.internal.CollectionMapper.OnMapValueCompleteListener
        public void onComplete(Object obj) {
            this.a.set(this.b, obj, this.c);
            this.c.onComplete();
        }

        @Override // com.facebook.internal.CollectionMapper.OnErrorListener
        public void onError(FacebookException facebookException) {
            this.c.onError(facebookException);
        }
    }

    private CollectionMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void iterate(Collection<T> collection, ValueMapper valueMapper, OnMapperCompleteListener onMapperCompleteListener) {
        Mutable mutable = new Mutable(Boolean.FALSE);
        Mutable mutable2 = new Mutable(1);
        a aVar = new a(mutable, mutable2, onMapperCompleteListener);
        Iterator itKeyIterator = collection.keyIterator();
        LinkedList linkedList = new LinkedList();
        while (itKeyIterator.hasNext()) {
            linkedList.add(itKeyIterator.next());
        }
        for (Object obj : linkedList) {
            Object obj2 = collection.get(obj);
            b bVar = new b(collection, obj, aVar);
            T t = mutable2.value;
            mutable2.value = (T) Integer.valueOf(((Integer) t).intValue() + 1);
            valueMapper.mapValue(obj2, bVar);
        }
        aVar.onComplete();
    }
}
