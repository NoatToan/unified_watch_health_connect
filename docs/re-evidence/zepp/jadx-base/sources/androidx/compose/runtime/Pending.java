package androidx.compose.runtime;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR2\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'0&j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'`(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*RY\u00101\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050+j\b\u0012\u0004\u0012\u00020\u0005`,0&j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050+j\b\u0012\u0004\u0012\u00020\u0005`,`(8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u00104\u001a\b\u0012\u0004\u0012\u00020\u0005028F@\u0006¢\u0006\u0006\u001a\u0004\b3\u0010\u001c¨\u00067"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "", "key", "dataKey", "Landroidx/compose/runtime/KeyInfo;", "getNext", "keyInfo", "", "recordUsed", "from", "to", "", "registerMoveSlot", "count", "registerMoveNode", "insertIndex", "registerInsert", "group", "newCount", "updateNodeCount", "slotPositionOf", "nodePositionOf", "updatedNodeCountOf", "", "keyInfos", "Ljava/util/List;", "getKeyInfos", "()Ljava/util/List;", "startIndex", LogUtil.I, "getStartIndex", "()I", "groupIndex", "getGroupIndex", "setGroupIndex", "(I)V", "usedKeys", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupInfo;", "Lkotlin/collections/HashMap;", "groupInfos", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "keyMap$delegate", "Lkotlin/Lazy;", "getKeyMap", "()Ljava/util/HashMap;", "keyMap", "", "getUsed", "used", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
final class Pending {
    private int groupIndex;

    @NotNull
    private final HashMap<Integer, GroupInfo> groupInfos;

    @NotNull
    private final List<KeyInfo> keyInfos;

    /* JADX INFO: renamed from: keyMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy keyMap;
    private final int startIndex;

    @NotNull
    private final List<KeyInfo> usedKeys;

    public Pending(@NotNull List<KeyInfo> list, int i) {
        this.keyInfos = list;
        this.startIndex = i;
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.usedKeys = new ArrayList();
        HashMap<Integer, GroupInfo> map = new HashMap<>();
        int size = getKeyInfos().size();
        if (size > 0) {
            int nodes = 0;
            while (true) {
                int i3 = i2 + 1;
                KeyInfo keyInfo = getKeyInfos().get(i2);
                map.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(i2, nodes, keyInfo.getNodes()));
                nodes += keyInfo.getNodes();
                if (i3 >= size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        this.groupInfos = map;
        this.keyMap = LazyKt__LazyJVMKt.lazy(new Function0<HashMap<Object, LinkedHashSet<KeyInfo>>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HashMap<Object, LinkedHashSet<KeyInfo>> invoke() {
                HashMap<Object, LinkedHashSet<KeyInfo>> mapMultiMap = ComposerKt.multiMap();
                Pending pending = this.this$0;
                int size2 = pending.getKeyInfos().size();
                if (size2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        KeyInfo keyInfo2 = pending.getKeyInfos().get(i4);
                        ComposerKt.put(mapMultiMap, ComposerKt.getJoinedKey(keyInfo2), keyInfo2);
                        if (i5 >= size2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                return mapMultiMap;
            }
        });
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    @NotNull
    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    @NotNull
    public final HashMap<Object, LinkedHashSet<KeyInfo>> getKeyMap() {
        return (HashMap) this.keyMap.getValue();
    }

    @Nullable
    public final KeyInfo getNext(int key, @Nullable Object dataKey) {
        return (KeyInfo) ComposerKt.pop(getKeyMap(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    @NotNull
    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(@NotNull KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo == null) {
            return -1;
        }
        return groupInfo.getNodeIndex();
    }

    public final boolean recordUsed(@NotNull KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(@NotNull KeyInfo keyInfo, int insertIndex) {
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(-1, insertIndex, 0));
    }

    public final void registerMoveNode(int from, int to, int count) {
        if (from > to) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (from <= nodeIndex && nodeIndex < from + count) {
                    groupInfo.setNodeIndex((nodeIndex - from) + to);
                } else if (to <= nodeIndex && nodeIndex < from) {
                    groupInfo.setNodeIndex(nodeIndex + count);
                }
            }
            return;
        }
        if (to > from) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                    groupInfo2.setNodeIndex((nodeIndex2 - from) + to);
                } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                    groupInfo2.setNodeIndex(nodeIndex2 - count);
                }
            }
        }
    }

    public final void registerMoveSlot(int from, int to) {
        if (from > to) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == from) {
                    groupInfo.setSlotIndex(to);
                } else if (to <= slotIndex && slotIndex < from) {
                    groupInfo.setSlotIndex(slotIndex + 1);
                }
            }
            return;
        }
        if (to > from) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == from) {
                    groupInfo2.setSlotIndex(to);
                } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                    groupInfo2.setSlotIndex(slotIndex2 - 1);
                }
            }
        }
    }

    public final void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public final int slotPositionOf(@NotNull KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo == null) {
            return -1;
        }
        return groupInfo.getSlotIndex();
    }

    public final boolean updateNodeCount(int group, int newCount) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(group));
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex = groupInfo.getNodeIndex();
        int nodeCount = newCount - groupInfo.getNodeCount();
        groupInfo.setNodeCount(newCount);
        if (nodeCount == 0) {
            return true;
        }
        for (GroupInfo groupInfo2 : this.groupInfos.values()) {
            if (groupInfo2.getNodeIndex() >= nodeIndex && !Intrinsics.areEqual(groupInfo2, groupInfo)) {
                groupInfo2.setNodeIndex(groupInfo2.getNodeIndex() + nodeCount);
            }
        }
        return true;
    }

    public final int updatedNodeCountOf(@NotNull KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        return groupInfo == null ? keyInfo.getNodes() : groupInfo.getNodeCount();
    }
}
