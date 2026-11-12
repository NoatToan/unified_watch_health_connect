package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watch.notification.TransportUri;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b \b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bZ\u0010[J \u0010\t\u001a\u00020\u0006*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J<\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0017\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b$\u0010%JW\u0010&\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020\u00062\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u001e0.j\b\u0012\u0004\u0012\u00020\u001e`/H\u0000¢\u0006\u0004\b$\u00101JO\u00104\u001a\u00020#2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020\u00062\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u001e0.j\b\u0012\u0004\u0012\u00020\u001e`/H\u0000¢\u0006\u0004\b2\u00103J\u0006\u00105\u001a\u00020#J\u0006\u00107\u001a\u000206J\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\n2\u0006\u00108\u001a\u00020\u0006H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030<H\u0096\u0002R$\u0010(\u001a\u00020'2\u0006\u0010>\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010?\u001a\u0004\b@\u0010AR$\u0010)\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bC\u0010DR4\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010E\u001a\u0004\bF\u0010GR$\u0010-\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010B\u001a\u0004\bH\u0010DR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010BR$\u0010\u001a\u001a\u00020!2\u0006\u0010>\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010B\u001a\u0004\bN\u0010D\"\u0004\bO\u0010PR2\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u001e0.j\b\u0012\u0004\u0012\u00020\u001e`/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010LR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\\"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "index", FirebaseAnalytics.Param.LEVEL, "emitGroup", "", "keys", "nodes", "parentIndexes", "dataIndexes", "groupSizes", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", "name", "reader", TransportUri.ACTION_BLOCK, "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "writer", "write", "openReader", "openWriter", "Landroidx/compose/runtime/Anchor;", XmPlayerService.TYPE_RANK_ANCHOR, "anchorIndex", "", "ownsAnchor", "", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "close", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "setTo", "verifyWellFormed", "", "asString", "group", "slotsOf$runtime_release", "(I)Ljava/util/List;", "slotsOf", "", "iterator", "<set-?>", "[I", "getGroups", "()[I", LogUtil.I, "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "readers", "Z", "getWriter$runtime_release", "()Z", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private int version;
    private boolean writer;

    @NotNull
    private int[] groups = new int[0];

    @NotNull
    private Object[] slots = new Object[0];

    @NotNull
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(StringUtil.SPACE);
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(") key=");
        sb.append(SlotTableKt.key(this.groups, i));
        int iGroupSize = SlotTableKt.groupSize(this.groups, i);
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, i));
        sb.append(", size=");
        sb.append(iGroupSize);
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int iEmitGroup = i + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex >= 0 && iEmitGroup$dataIndex <= iEmitGroup$dataIndex2) {
            z = true;
        }
        if (!z || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            if (SlotTableKt.hasObjectKey(this.groups, i)) {
                sb.append(Intrinsics.stringPlus(" objectKey=", this.slots[SlotTableKt.objectKeyIndex(this.groups, i)]));
            }
            if (SlotTableKt.isNode(this.groups, i)) {
                sb.append(Intrinsics.stringPlus(" node=", this.slots[SlotTableKt.nodeIndex(this.groups, i)]));
            }
            if (SlotTableKt.hasAux(this.groups, i)) {
                sb.append(Intrinsics.stringPlus(" aux=", this.slots[SlotTableKt.auxIndex(this.groups, i)]));
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                if (iSlotAnchor < iEmitGroup$dataIndex2) {
                    int i4 = iSlotAnchor;
                    while (true) {
                        int i5 = i4 + 1;
                        if (i4 != iSlotAnchor) {
                            sb.append(", ");
                        }
                        sb.append(String.valueOf(this.slots[i4]));
                        if (i5 >= iEmitGroup$dataIndex2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i6 = i + iGroupSize;
        while (iEmitGroup < i6) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i2 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        return i >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i);
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i, int i2) {
        int i3 = intRef.element;
        int i4 = i3 + 1;
        intRef.element = i4;
        int iParentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i3);
        if (!(iParentAnchor == i)) {
            throw new IllegalStateException(("Invalid parent index detected at " + i3 + ", expected parent index to be " + i + " found " + iParentAnchor).toString());
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i3) + i3;
        if (!(iGroupSize <= slotTable.groupsSize)) {
            throw new IllegalStateException(Intrinsics.stringPlus("A group extends past the end of the table at ", Integer.valueOf(i3)).toString());
        }
        if (!(iGroupSize <= i2)) {
            throw new IllegalStateException(Intrinsics.stringPlus("A group extends past its parent group at ", Integer.valueOf(i3)).toString());
        }
        int iDataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i3);
        int iDataAnchor2 = i3 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i4);
        if (!(iDataAnchor2 <= slotTable.slots.length)) {
            throw new IllegalStateException(("Slots for " + i3 + " extend past the end of the slot table").toString());
        }
        if (!(iDataAnchor <= iDataAnchor2)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Invalid data anchor at ", Integer.valueOf(i3)).toString());
        }
        if (!(SlotTableKt.slotAnchor(slotTable.groups, i3) <= iDataAnchor2)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Slots start out of range at ", Integer.valueOf(i3)).toString());
        }
        if (!(iDataAnchor2 - iDataAnchor >= ((SlotTableKt.isNode(slotTable.groups, i3) ? 1 : 0) + (SlotTableKt.hasObjectKey(slotTable.groups, i3) ? 1 : 0)) + (SlotTableKt.hasAux(slotTable.groups, i3) ? 1 : 0))) {
            throw new IllegalStateException(Intrinsics.stringPlus("Not enough slots added for group ", Integer.valueOf(i3)).toString());
        }
        boolean zIsNode = SlotTableKt.isNode(slotTable.groups, i3);
        if (!((zIsNode && slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i3)] == null) ? false : true)) {
            throw new IllegalStateException(Intrinsics.stringPlus("No node recorded for a node group at ", Integer.valueOf(i3)).toString());
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (intRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(intRef, slotTable, i3, iGroupSize);
        }
        int iNodeCount = SlotTableKt.nodeCount(slotTable.groups, i3);
        int iGroupSize2 = SlotTableKt.groupSize(slotTable.groups, i3);
        if (!(iNodeCount == iVerifyWellFormed$validateGroup)) {
            throw new IllegalStateException(("Incorrect node count detected at " + i3 + ", expected " + iNodeCount + ", received " + iVerifyWellFormed$validateGroup).toString());
        }
        int i5 = intRef.element - i3;
        if (iGroupSize2 == i5) {
            if (zIsNode) {
                return 1;
            }
            return iVerifyWellFormed$validateGroup;
        }
        throw new IllegalStateException(("Incorrect slot count detected at " + i3 + ", expected " + iGroupSize2 + ", received " + i5).toString());
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        }
        if (anchor.getValid()) {
            return anchor.getLocation();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    @NotNull
    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int groupsSize = getGroupsSize();
        if (groupsSize > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < groupsSize) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        return sb.toString();
    }

    public final void close$runtime_release(@NotNull SlotReader reader) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            throw new IllegalArgumentException("Unexpected reader close()".toString());
        }
        this.readers--;
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* JADX INFO: renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @NotNull
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
            throw new KotlinNothingValueException();
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        if (anchor.getValid()) {
            int iSearch = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize);
            if (iSearch >= 0 && Intrinsics.areEqual(getAnchors$runtime_release().get(iSearch), anchor)) {
                return true;
            }
        }
        return false;
    }

    public final <T> T read(@NotNull Function1<? super SlotReader, ? extends T> block) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return block.invoke(slotReaderOpenReader);
        } finally {
            InlineMarker.finallyStart(1);
            slotReaderOpenReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int group) {
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, group);
        int i = group + 1;
        return ArraysKt___ArraysKt.toList(this.slots).subList(iDataAnchor, i < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i) : this.slots.length);
    }

    public final void verifyWellFormed() {
        int i;
        int i2;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i = intRef.element;
                i2 = this.groupsSize;
                if (i >= i2) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(intRef, this, -1, i + SlotTableKt.groupSize(this.groups, i));
                }
            }
            if (!(i == i2)) {
                throw new IllegalStateException(("Incomplete group at root " + intRef.element + " expected to be " + getGroupsSize()).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            int indexFor = arrayList.get(i4).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= getGroupsSize())) {
                throw new IllegalArgumentException("Location out of bound".toString());
            }
            if (!(i3 < indexFor)) {
                throw new IllegalArgumentException("Anchor is out of order".toString());
            }
            if (i5 > size) {
                return;
            }
            i3 = indexFor;
            i4 = i5;
        }
    }

    public final <T> T write(@NotNull Function1<? super SlotWriter, ? extends T> block) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            return block.invoke(slotWriterOpenWriter);
        } finally {
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors) {
        if (writer.getTable() == this && this.writer) {
            this.writer = false;
            setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }
}
