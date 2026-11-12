package com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dfe;
import defpackage.hdr;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CourseCourseHeadViewHolder extends CustomCourseDragViewHolder<hdr> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthEditText f8923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthEditText f8924b;
    private hdr e;

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    public void setDragState(boolean z) {
    }

    public CourseCourseHeadViewHolder(View view) {
        super(view);
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.sug_text_action);
        healthSubHeader.setSubHeaderBackgroundColor(healthSubHeader.getContext().getResources().getColor(R.color.common_transparent));
        HealthEditText healthEditText = (HealthEditText) view.findViewById(R.id.edit_custom_name);
        this.f8923a = healthEditText;
        HealthEditText healthEditText2 = (HealthEditText) view.findViewById(R.id.sug_custom_course_description);
        this.f8924b = healthEditText2;
        healthEditText.setFilters(new InputFilter[]{new d(79)});
        healthEditText2.setFilters(new InputFilter[]{new d(200)});
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void init(hdr hdrVar, int i) {
        if (hdrVar == null) {
            LogUtil.j("Suggestion_CourseCourseHeadViewHolder", "init, actionItemConfig == null");
            return;
        }
        this.e = hdrVar;
        b(this.f8923a);
        b(this.f8924b);
        this.f8923a.setText(this.e.j());
        this.f8924b.setText(this.e.n());
    }

    private void b(final HealthEditText healthEditText) {
        healthEditText.addTextChangedListener(new TextWatcher() { // from class: com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CourseCourseHeadViewHolder.4
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                HealthEditText healthEditText2 = healthEditText;
                if (healthEditText2 == null) {
                    return;
                }
                if (healthEditText2.equals(CourseCourseHeadViewHolder.this.f8923a)) {
                    CourseCourseHeadViewHolder.this.e.c(editable.toString());
                } else {
                    CourseCourseHeadViewHolder.this.e.d(editable.toString());
                }
            }
        });
    }

    static class d implements InputFilter {
        private final int e;

        public d(int i) {
            this.e = i;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int iE;
            return (!TextUtils.isEmpty(charSequence) && (iE = e(spanned.toString())) < this.e && iE + e(charSequence.toString()) <= this.e) ? charSequence : "";
        }

        private int e(String str) {
            List<Integer> listB = dfe.b(str);
            if (njy.e(listB)) {
                return 0;
            }
            return listB.size();
        }
    }
}
