package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessage.Builder;
import com.google.protobuf.MessageOrBuilder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class RepeatedFieldBuilderV3<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> implements AbstractMessage.BuilderParent {
    private List<SingleFieldBuilderV3<MType, BType, IType>> builders;
    private BuilderExternalList<MType, BType, IType> externalBuilderList;
    private MessageExternalList<MType, BType, IType> externalMessageList;
    private MessageOrBuilderExternalList<MType, BType, IType> externalMessageOrBuilderList;
    private boolean isClean;
    private boolean isMessagesListMutable;
    private List<MType> messages;
    private AbstractMessage.BuilderParent parent;

    public static class BuilderExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<BType> implements List<BType>, RandomAccess {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        public BuilderExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        @Override // java.util.AbstractList, java.util.List
        public BType get(int i14) {
            return (BType) this.builder.getBuilder(i14);
        }

        public void incrementModCount() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }
    }

    public static class MessageExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<MType> implements List<MType>, RandomAccess {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        public MessageExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        @Override // java.util.AbstractList, java.util.List
        public MType get(int i14) {
            return (MType) this.builder.getMessage(i14);
        }

        public void incrementModCount() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }
    }

    public static class MessageOrBuilderExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<IType> implements List<IType>, RandomAccess {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        public MessageOrBuilderExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        @Override // java.util.AbstractList, java.util.List
        public IType get(int i14) {
            return (IType) this.builder.getMessageOrBuilder(i14);
        }

        public void incrementModCount() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }
    }

    public RepeatedFieldBuilderV3(List<MType> list, boolean z14, AbstractMessage.BuilderParent builderParent, boolean z15) {
        this.messages = list;
        this.isMessagesListMutable = z14;
        this.parent = builderParent;
        this.isClean = z15;
    }

    private void ensureBuilders() {
        if (this.builders == null) {
            this.builders = new ArrayList(this.messages.size());
            for (int i14 = 0; i14 < this.messages.size(); i14++) {
                this.builders.add(null);
            }
        }
    }

    private void ensureMutableMessageList() {
        if (this.isMessagesListMutable) {
            return;
        }
        this.messages = new ArrayList(this.messages);
        this.isMessagesListMutable = true;
    }

    private MType getMessage(int i14, boolean z14) {
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3;
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null && (singleFieldBuilderV3 = list.get(i14)) != null) {
            return z14 ? (MType) singleFieldBuilderV3.build() : (MType) singleFieldBuilderV3.getMessage();
        }
        return this.messages.get(i14);
    }

    private void incrementModCounts() {
        MessageExternalList<MType, BType, IType> messageExternalList = this.externalMessageList;
        if (messageExternalList != null) {
            messageExternalList.incrementModCount();
        }
        BuilderExternalList<MType, BType, IType> builderExternalList = this.externalBuilderList;
        if (builderExternalList != null) {
            builderExternalList.incrementModCount();
        }
        MessageOrBuilderExternalList<MType, BType, IType> messageOrBuilderExternalList = this.externalMessageOrBuilderList;
        if (messageOrBuilderExternalList != null) {
            messageOrBuilderExternalList.incrementModCount();
        }
    }

    private void onChanged() {
        AbstractMessage.BuilderParent builderParent;
        if (!this.isClean || (builderParent = this.parent) == null) {
            return;
        }
        builderParent.markDirty();
        this.isClean = false;
    }

    @CanIgnoreReturnValue
    public RepeatedFieldBuilderV3<MType, BType, IType> addAllMessages(Iterable<? extends MType> iterable) {
        int size;
        Iterator<? extends MType> it = iterable.iterator();
        while (it.hasNext()) {
            Internal.checkNotNull(it.next());
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            size = collection.size();
        } else {
            size = -1;
        }
        ensureMutableMessageList();
        if (size >= 0) {
            List<MType> list = this.messages;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator<? extends MType> it3 = iterable.iterator();
        while (it3.hasNext()) {
            addMessage(it3.next());
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public BType addBuilder(MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = new SingleFieldBuilderV3<>(mtype, this, this.isClean);
        this.messages.add(null);
        this.builders.add(singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return (BType) singleFieldBuilderV3.getBuilder();
    }

    @CanIgnoreReturnValue
    public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(MType mtype) {
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.add(mtype);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null) {
            list.add(null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public List<MType> build() {
        this.isClean = true;
        boolean z14 = this.isMessagesListMutable;
        if (!z14 && this.builders == null) {
            return this.messages;
        }
        if (!z14) {
            int i14 = 0;
            while (true) {
                int size = this.messages.size();
                List<MType> list = this.messages;
                if (i14 >= size) {
                    return list;
                }
                MType mtype = list.get(i14);
                SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = this.builders.get(i14);
                if (singleFieldBuilderV3 != null && singleFieldBuilderV3.build() != mtype) {
                    break;
                }
                i14++;
            }
        }
        ensureMutableMessageList();
        int i15 = 0;
        while (true) {
            int size2 = this.messages.size();
            List<MType> list2 = this.messages;
            if (i15 >= size2) {
                List<MType> listUnmodifiableList = Collections.unmodifiableList(list2);
                this.messages = listUnmodifiableList;
                this.isMessagesListMutable = false;
                return listUnmodifiableList;
            }
            list2.set(i15, (MType) getMessage(i15, true));
            i15++;
        }
    }

    public void clear() {
        this.messages = Collections.EMPTY_LIST;
        this.isMessagesListMutable = false;
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null) {
            for (SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 : list) {
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                }
            }
            this.builders = null;
        }
        onChanged();
        incrementModCounts();
    }

    public void dispose() {
        this.parent = null;
    }

    public BType getBuilder(int i14) {
        ensureBuilders();
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = this.builders.get(i14);
        if (singleFieldBuilderV3 == null) {
            SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV4 = new SingleFieldBuilderV3<>(this.messages.get(i14), this, this.isClean);
            this.builders.set(i14, singleFieldBuilderV4);
            singleFieldBuilderV3 = singleFieldBuilderV4;
        }
        return (BType) singleFieldBuilderV3.getBuilder();
    }

    public List<BType> getBuilderList() {
        if (this.externalBuilderList == null) {
            this.externalBuilderList = new BuilderExternalList<>(this);
        }
        return this.externalBuilderList;
    }

    public int getCount() {
        return this.messages.size();
    }

    public List<MType> getMessageList() {
        if (this.externalMessageList == null) {
            this.externalMessageList = new MessageExternalList<>(this);
        }
        return this.externalMessageList;
    }

    public IType getMessageOrBuilder(int i14) {
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3;
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null && (singleFieldBuilderV3 = list.get(i14)) != null) {
            return (IType) singleFieldBuilderV3.getMessageOrBuilder();
        }
        return this.messages.get(i14);
    }

    public List<IType> getMessageOrBuilderList() {
        if (this.externalMessageOrBuilderList == null) {
            this.externalMessageOrBuilderList = new MessageOrBuilderExternalList<>(this);
        }
        return this.externalMessageOrBuilderList;
    }

    public boolean isEmpty() {
        return this.messages.isEmpty();
    }

    @Override // com.google.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        onChanged();
    }

    public void remove(int i14) {
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3Remove;
        ensureMutableMessageList();
        this.messages.remove(i14);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null && (singleFieldBuilderV3Remove = list.remove(i14)) != null) {
            singleFieldBuilderV3Remove.dispose();
        }
        onChanged();
        incrementModCounts();
    }

    @CanIgnoreReturnValue
    public RepeatedFieldBuilderV3<MType, BType, IType> setMessage(int i14, MType mtype) {
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3;
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.set(i14, mtype);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null && (singleFieldBuilderV3 = list.set(i14, null)) != null) {
            singleFieldBuilderV3.dispose();
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    @CanIgnoreReturnValue
    public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(int i14, MType mtype) {
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.add(i14, mtype);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null) {
            list.add(i14, null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public BType addBuilder(int i14, MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = new SingleFieldBuilderV3<>(mtype, this, this.isClean);
        this.messages.add(i14, null);
        this.builders.add(i14, singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return (BType) singleFieldBuilderV3.getBuilder();
    }

    public MType getMessage(int i14) {
        return (MType) getMessage(i14, false);
    }
}
