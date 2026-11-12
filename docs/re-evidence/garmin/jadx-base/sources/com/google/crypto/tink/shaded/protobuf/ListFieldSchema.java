package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE;
    private static final ListFieldSchema LITE_INSTANCE;

    public static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j8) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j8) {
            getProtobufList(obj, j8).makeImmutable();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j8) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j8);
            Internal.ProtobufList protobufList2 = getProtobufList(obj2, j8);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            UnsafeUtil.putObject(obj, j8, protobufList2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j8) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j8);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            UnsafeUtil.putObject(obj, j8, protobufListMutableCopyWithCapacity);
            return protobufListMutableCopyWithCapacity;
        }
    }

    static {
        FULL_INSTANCE = new ListFieldSchemaFull();
        LITE_INSTANCE = new ListFieldSchemaLite();
    }

    public static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    public static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j8);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j8);

    public abstract <L> List<L> mutableListAt(Object obj, long j8);

    private ListFieldSchema() {
    }

    public static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        public static <E> List<E> getList(Object obj, long j8) {
            return (List) UnsafeUtil.getObject(obj, j8);
        }

        private static <L> List<L> mutableListAt(Object obj, long j8, int i14) {
            List<L> listMutableCopyWithCapacity;
            List<L> list = getList(obj, j8);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    listMutableCopyWithCapacity = new LazyStringArrayList(i14);
                } else {
                    listMutableCopyWithCapacity = ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity(i14) : new ArrayList<>(i14);
                }
                UnsafeUtil.putObject(obj, j8, listMutableCopyWithCapacity);
                return listMutableCopyWithCapacity;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i14);
                arrayList.addAll(list);
                UnsafeUtil.putObject(obj, j8, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i14);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(obj, j8, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list.size() + i14);
                    UnsafeUtil.putObject(obj, j8, protobufListMutableCopyWithCapacity);
                    return protobufListMutableCopyWithCapacity;
                }
            }
            return list;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j8) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.getObject(obj, j8);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(obj, j8, objUnmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j8) {
            List list = getList(obj2, j8);
            List listMutableListAt = mutableListAt(obj, j8, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            UnsafeUtil.putObject(obj, j8, list);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j8) {
            return mutableListAt(obj, j8, 10);
        }
    }
}
