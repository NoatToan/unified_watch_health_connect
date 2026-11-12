package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.g0;
import c32.f;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;
import k7.d;

/* JADX INFO: loaded from: classes14.dex */
public interface DateSelector<S> extends Parcelable {
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view2, boolean z14) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view2, false);
    }

    static void showKeyboardWithAutoHideBehavior(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        f fVar = new f(editTextArr, 2);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(fVar);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new g0(editText2, 2), 100L);
    }

    int getDefaultThemeResId(Context context);

    int getDefaultTitleResId();

    String getError();

    Collection<Long> getSelectedDays();

    Collection<d<Long, Long>> getSelectedRanges();

    S getSelection();

    String getSelectionContentDescription(Context context);

    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j8);

    void setSelection(S s8);

    void setTextInputFormat(SimpleDateFormat simpleDateFormat);
}
