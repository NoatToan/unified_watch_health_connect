package com.huami.sleepassistant.lib.utils;

import com.huami.watch.companion.mediac.Command;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B:\u00121\b\u0002\u0010\u0014\u001a+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0006R?\u0010\u0014\u001a+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R2\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0015j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004`\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/CountListItemVisitHelper;", "VO", "", "v", "", "position", "", DataItem.HTTP_METHOD_PUT, "(Ljava/lang/Object;I)V", "count", "(ILjava/lang/Object;)V", "clear", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "new", "", "a", "Lkotlin/jvm/functions/Function2;", "searchInSet", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "b", "Ljava/util/LinkedHashMap;", Command.DISABLE, "<init>", "(Lkotlin/jvm/functions/Function2;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class CountListItemVisitHelper<VO> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function2<Set<? extends VO>, VO, Boolean> searchInSet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LinkedHashMap<VO, Integer> da;

    /* JADX WARN: Multi-variable type inference failed */
    public CountListItemVisitHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountListItemVisitHelper(@Nullable Function2<? super Set<? extends VO>, ? super VO, Boolean> function2) {
        this.searchInSet = function2;
        this.da = new LinkedHashMap<>();
    }

    public final void clear() {
        this.da.clear();
    }

    public abstract void count(int position, VO v);

    public final void put(VO v, int position) {
        Function2<Set<? extends VO>, VO, Boolean> function2 = this.searchInSet;
        if (function2 == null) {
            if (this.da.containsKey(v)) {
                return;
            }
            this.da.put(v, Integer.valueOf(position));
            count(position, v);
            return;
        }
        if (function2.invoke(this.da.keySet(), v).booleanValue()) {
            return;
        }
        this.da.put(v, Integer.valueOf(position));
        count(position, v);
    }

    public /* synthetic */ CountListItemVisitHelper(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2);
    }
}
