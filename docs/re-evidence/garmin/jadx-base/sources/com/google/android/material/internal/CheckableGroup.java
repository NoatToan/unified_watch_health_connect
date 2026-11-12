package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(MaterialCheckable<T> materialCheckable) {
        int id3 = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id3))) {
            return false;
        }
        T t7 = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t7 != null) {
            uncheckInternal(t7, false);
        }
        boolean zAdd = this.checkedIds.add(Integer.valueOf(id3));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(MaterialCheckable<T> materialCheckable, boolean z14) {
        int id3 = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id3))) {
            return false;
        }
        if (z14 && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id3))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.checkedIds.remove(Integer.valueOf(id3));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t7) {
        this.checkables.put(Integer.valueOf(t7.getId()), t7);
        if (t7.isChecked()) {
            checkInternal(t7);
        }
        t7.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t14, boolean z14) {
                CheckableGroup checkableGroup = CheckableGroup.this;
                if (z14) {
                    if (!checkableGroup.checkInternal(t14)) {
                        return;
                    }
                } else if (!checkableGroup.uncheckInternal(t14, checkableGroup.selectionRequired)) {
                    return;
                }
                CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void check(int i14) {
        T t7 = this.checkables.get(Integer.valueOf(i14));
        if (t7 != null && checkInternal(t7)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        onCheckedStateChanged();
    }

    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    public List<Integer> getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
            View childAt = viewGroup.getChildAt(i14);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T t7) {
        t7.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t7.getId()));
        this.checkedIds.remove(Integer.valueOf(t7.getId()));
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z14) {
        this.selectionRequired = z14;
    }

    public void setSingleSelection(boolean z14) {
        if (this.singleSelection != z14) {
            this.singleSelection = z14;
            clearCheck();
        }
    }

    public void uncheck(int i14) {
        T t7 = this.checkables.get(Integer.valueOf(i14));
        if (t7 != null && uncheckInternal(t7, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }
}
