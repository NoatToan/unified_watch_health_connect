package com.huawei.ui.main.stories.nps.views;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.activity.QuestionMainActivity;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSureyResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyChooseResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.Records;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class NpsAdapter extends BaseAdapter {
    private static final int MAX_TEXT = 500;
    private static final String TAG = "NpsAdapter";
    private QuestionMainActivity mActivity;
    private Context mContext;
    private String[] mDataInfos;
    private Handler mHandler;
    private String mInputDatas;
    private boolean mIsMultiple;
    private int mQuestionId;
    private HashMap<String, Boolean> mStateMap;
    private List<QuestionSurveyChooseResponse> mSurveyResponses;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public NpsAdapter(Context context, String[] strArr, HashMap<String, Boolean> map, Handler handler, QuestionMainActivity questionMainActivity, boolean z) {
        this.mStateMap = new HashMap<>(16);
        if (strArr != null && strArr.length > 0) {
            String[] strArr2 = new String[strArr.length];
            this.mDataInfos = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        this.mContext = context;
        this.mStateMap = map;
        this.mHandler = handler;
        this.mActivity = questionMainActivity;
        this.mIsMultiple = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        String[] strArr = this.mDataInfos;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        String[] strArr = this.mDataInfos;
        if (strArr == null || i < 0 || i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        NpsViewHolder npsViewHolder;
        Context context = this.mContext;
        if (context == null) {
            return view;
        }
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.nps_single, viewGroup, false);
            npsViewHolder = new NpsViewHolder();
            npsViewHolder.textViewName = (HealthTextView) view.findViewById(R.id.tv_device_name);
            npsViewHolder.editParent = (RelativeLayout) view.findViewById(R.id.rl_edit_parent);
            npsViewHolder.editText = (HealthEditText) view.findViewById(R.id.single_content_et);
            npsViewHolder.textTip = (HealthTextView) view.findViewById(R.id.single_text_num_tip);
            npsViewHolder.checkBoxState = (HealthCheckBox) view.findViewById(R.id.rb_light);
            npsViewHolder.textWatcher = new SingleTextWatcher(npsViewHolder.textTip, getNextId(i));
            npsViewHolder.editText.addTextChangedListener(npsViewHolder.textWatcher);
            view.setTag(npsViewHolder);
        } else {
            npsViewHolder = (NpsViewHolder) view.getTag();
        }
        String[] strArr = this.mDataInfos;
        if (strArr != null && i >= 0 && i < strArr.length) {
            npsViewHolder.textViewName.setText(this.mDataInfos[i]);
            setTextTip(i, npsViewHolder.textTip, npsViewHolder.editParent, npsViewHolder.editText, npsViewHolder.textWatcher);
        }
        handleCheckBoxState(npsViewHolder.checkBoxState, i);
        return view;
    }

    private void handleCheckBoxState(HealthCheckBox healthCheckBox, final int i) {
        boolean z;
        healthCheckBox.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.views.NpsAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NpsAdapter.this.changeState(i);
                if (NpsAdapter.this.mActivity != null) {
                    NpsAdapter.this.mActivity.setIsSelect(true);
                    NpsAdapter.this.mActivity.setButtonClickable(NpsAdapter.this.mStateMap.containsValue(true));
                    Integer nextId = ((QuestionSurveyChooseResponse) NpsAdapter.this.mSurveyResponses.get(i)).getNextId();
                    NpsAdapter.this.mActivity.setIsCommit(nextId != null && nextId.intValue() == -1);
                }
                if (NpsAdapter.this.mHandler != null) {
                    NpsAdapter.this.mHandler.sendMessage(NpsAdapter.this.mHandler.obtainMessage(i, NpsAdapter.this.mStateMap.get(String.valueOf(i))));
                }
                NpsAdapter.this.notifyDataSetChanged();
            }
        });
        if (this.mStateMap.get(String.valueOf(i)) == null || !this.mStateMap.get(String.valueOf(i)).booleanValue()) {
            this.mStateMap.put(String.valueOf(i), false);
            z = false;
        } else {
            z = true;
        }
        healthCheckBox.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeState(int i) {
        if (this.mIsMultiple) {
            this.mStateMap.put(String.valueOf(i), Boolean.valueOf(Boolean.FALSE.equals(this.mStateMap.get(String.valueOf(i)))));
            return;
        }
        Iterator<String> it = this.mStateMap.keySet().iterator();
        while (it.hasNext()) {
            this.mStateMap.put(it.next(), false);
        }
        this.mStateMap.put(String.valueOf(i), true);
    }

    private void setTextTip(int i, HealthTextView healthTextView, RelativeLayout relativeLayout, HealthEditText healthEditText, SingleTextWatcher singleTextWatcher) {
        List<QuestionSurveyChooseResponse> list = this.mSurveyResponses;
        if (list == null) {
            LogUtil.j(TAG, "setTextTip mSurveyResponses is null");
            return;
        }
        QuestionSurveyChooseResponse questionSurveyChooseResponse = list.get(i);
        if (questionSurveyChooseResponse == null) {
            LogUtil.j(TAG, "setTextTip questionSurvey is null");
            return;
        }
        if (questionSurveyChooseResponse.isFeedbackFlag()) {
            LogUtil.a(TAG, "setTextTip position: ", Integer.valueOf(i), " name:", questionSurveyChooseResponse.getName());
            CharSequence text = healthTextView.getText();
            if (text == null || text.length() < 1) {
                healthTextView.setText(String.format(Locale.ROOT, this.mContext.getString(R.string.IDS_nps_edit_text_limit), UnitUtil.e(0.0d, 1, 0), UnitUtil.e(500.0d, 1, 0)));
            }
            relativeLayout.setVisibility(this.mStateMap.get(String.valueOf(i)).booleanValue() ? 0 : 8);
            singleTextWatcher.updateTextTip(healthTextView);
            singleTextWatcher.updateNextId(getNextId(i));
            if (TextUtils.isEmpty(this.mInputDatas)) {
                return;
            }
            healthEditText.setText(this.mInputDatas);
            healthEditText.setSelection(this.mInputDatas.length());
            return;
        }
        relativeLayout.setVisibility(8);
    }

    public void setSurveyChoose(QuestionSureyResponse questionSureyResponse) {
        if (questionSureyResponse == null) {
            return;
        }
        this.mSurveyResponses = questionSureyResponse.getChoose();
        this.mQuestionId = questionSureyResponse.getId().intValue();
    }

    private Integer getNextId(int i) {
        List<QuestionSurveyChooseResponse> list = this.mSurveyResponses;
        if (list != null && list.size() > i) {
            return this.mSurveyResponses.get(i).getNextId();
        }
        return null;
    }

    class SingleTextWatcher implements TextWatcher {
        private Integer mNextId;
        private HealthTextView mTextTip;

        SingleTextWatcher(HealthTextView healthTextView, Integer num) {
            this.mTextTip = healthTextView;
            this.mNextId = num;
        }

        void updateTextTip(HealthTextView healthTextView) {
            this.mTextTip = healthTextView;
        }

        void updateNextId(Integer num) {
            this.mNextId = num;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (TextUtils.isEmpty(charSequence)) {
                NpsAdapter.this.mInputDatas = "";
            } else {
                NpsAdapter.this.mInputDatas = charSequence.toString();
            }
            int length = TextUtils.isEmpty(NpsAdapter.this.mInputDatas) ? 0 : NpsAdapter.this.mInputDatas.length();
            this.mTextTip.setText(String.format(Locale.ROOT, NpsAdapter.this.mContext.getString(R.string.IDS_nps_edit_text_limit), UnitUtil.e(length, 1, 0), UnitUtil.e(500.0d, 1, 0)));
            if (length >= 500) {
                this.mTextTip.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.colorError));
            } else {
                this.mTextTip.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.colorPrimary));
            }
            Records.getOptionResult().put(Integer.valueOf(NpsAdapter.this.mQuestionId), NpsAdapter.this.mInputDatas);
            Records.getOptionNextId().put(Integer.valueOf(NpsAdapter.this.mQuestionId), this.mNextId);
            LogUtil.a(NpsAdapter.TAG, "onTextChanged mInputDatas: ", NpsAdapter.this.mInputDatas);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LogUtil.d(NpsAdapter.TAG, "beforeTextChanged");
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LogUtil.d(NpsAdapter.TAG, "afterTextChanged");
        }
    }

    static class NpsViewHolder {
        HealthCheckBox checkBoxState;
        RelativeLayout editParent;
        HealthEditText editText;
        HealthTextView textTip;
        HealthTextView textViewName;
        SingleTextWatcher textWatcher;

        NpsViewHolder() {
        }
    }
}
