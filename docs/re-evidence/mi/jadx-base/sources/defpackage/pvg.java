package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pvg {
    private List<pvg> mChildren;
    private final Map<String, Long> mLastLoopID;
    private final Map<String, Object> mMemoizedValue;
    protected final int mNodeID;
    protected final svg mNodesManager;
    protected final tbq mUpdateContext;
    public static final Double ZERO = Double.valueOf(0.0d);
    public static final Double ONE = Double.valueOf(1.0d);

    public pvg(int i, ReadableMap readableMap, svg svgVar) {
        HashMap map = new HashMap();
        this.mLastLoopID = map;
        this.mMemoizedValue = new HashMap();
        map.put("", -1L);
        this.mNodeID = i;
        this.mNodesManager = svgVar;
        this.mUpdateContext = svgVar.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void findAndUpdateNodes(pvg pvgVar, Set<pvg> set, Stack<dn9> stack) {
        if (set.contains(pvgVar)) {
            return;
        }
        set.add(pvgVar);
        List<pvg> list = pvgVar.mChildren;
        if (list != null) {
            Iterator<pvg> it = list.iterator();
            while (it.hasNext()) {
                findAndUpdateNodes(it.next(), set, stack);
            }
        }
        if (pvgVar instanceof dn9) {
            stack.push((dn9) pvgVar);
        }
    }

    public static void runUpdates(tbq tbqVar) {
        UiThreadUtil.assertOnUiThread();
        ArrayList<pvg> arrayList = tbqVar.c;
        HashSet hashSet = new HashSet();
        Stack stack = new Stack();
        for (int i = 0; i < arrayList.size(); i++) {
            findAndUpdateNodes(arrayList.get(i), hashSet, stack);
            if (i == arrayList.size() - 1) {
                while (!stack.isEmpty()) {
                    ((dn9) stack.pop()).update();
                }
            }
        }
        arrayList.clear();
        tbqVar.f34550a++;
    }

    public void addChild(pvg pvgVar) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList();
        }
        this.mChildren.add(pvgVar);
        pvgVar.dangerouslyRescheduleEvaluate();
    }

    public final void dangerouslyRescheduleEvaluate() {
        this.mLastLoopID.put(this.mUpdateContext.f34551b, -1L);
        markUpdated();
    }

    public final Double doubleValue() {
        Object objValue = value();
        if (objValue == null) {
            return ZERO;
        }
        if (objValue instanceof Double) {
            return (Double) objValue;
        }
        if (objValue instanceof Number) {
            return Double.valueOf(((Number) objValue).doubleValue());
        }
        if (objValue instanceof Boolean) {
            return ((Boolean) objValue).booleanValue() ? ONE : ZERO;
        }
        throw new IllegalStateException("Value of node " + this + " cannot be cast to a number");
    }

    public abstract Object evaluate();

    public final void forceUpdateMemoizedValue(Object obj) {
        this.mMemoizedValue.put(this.mUpdateContext.f34551b, obj);
        markUpdated();
    }

    public void markUpdated() {
        UiThreadUtil.assertOnUiThread();
        this.mUpdateContext.c.add(this);
        this.mNodesManager.w();
    }

    public void removeChild(pvg pvgVar) {
        List<pvg> list = this.mChildren;
        if (list != null) {
            list.remove(pvgVar);
        }
    }

    public final Object value() {
        if (this.mLastLoopID.containsKey(this.mUpdateContext.f34551b)) {
            long jLongValue = this.mLastLoopID.get(this.mUpdateContext.f34551b).longValue();
            tbq tbqVar = this.mUpdateContext;
            if (jLongValue >= tbqVar.f34550a) {
                return this.mMemoizedValue.get(tbqVar.f34551b);
            }
        }
        Map<String, Long> map = this.mLastLoopID;
        tbq tbqVar2 = this.mUpdateContext;
        map.put(tbqVar2.f34551b, Long.valueOf(tbqVar2.f34550a));
        Object objEvaluate = evaluate();
        this.mMemoizedValue.put(this.mUpdateContext.f34551b, objEvaluate);
        return objEvaluate;
    }
}
