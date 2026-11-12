package com.huawei.ui.main.stories.nps.component;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import defpackage.njy;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class MultiLayoutAdapter extends BaseAdapter {
    private static final int DEFAULT_ITEM_TYPE = -1;
    private static final int DEFAULT_LIST_SIZE = 10;
    private static final int NPS_TYPE_DEFAULT = 0;
    private static final int NPS_TYPE_EDIT = 1;
    private static final String TAG = "NPS_MultiLayoutAdapter";
    private static final int VIEW_TYPE_SIZE = 2;
    private String mCommentString = "";
    private Context mContext;
    private Dialog mDialogScore;
    private LayoutInflater mInflater;
    private List<NpsQuestion> mList;
    private NpsBarProgressListener mListener;

    interface NpsBarProgressListener {
        void getProgress(int i, int i2);
    }

    public static class ViewHolderChoose {
        HealthTextView mScore;
        RelativeLayout mScoreLayout;
        HealthTextView mTitle;
    }

    public static class ViewHolderEdit {
        EditText mEditText;
        HealthTextView mTitle;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public MultiLayoutAdapter(Context context, List<NpsQuestion> list, NpsBarProgressListener npsBarProgressListener) {
        this.mList = list;
        this.mContext = context;
        this.mListener = npsBarProgressListener;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.mList, i)) {
            return null;
        }
        return this.mList.get(i);
    }

    public String getTheScoreComment() {
        return this.mCommentString;
    }

    public List<NpsQuestion> getNpsQuestionList() {
        return this.mList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderChoose viewHolderChoose;
        ViewHolderEdit viewHolderEdit;
        this.mInflater = LayoutInflater.from(this.mContext);
        int itemViewType = getItemViewType(i);
        ViewHolderChoose viewHolderChoose2 = null;
        if (view == null) {
            if (itemViewType == 0) {
                view = this.mInflater.inflate(R.layout.adapter_item_choose, viewGroup, false);
                viewHolderChoose = new ViewHolderChoose();
                viewHolderChoose.mScoreLayout = (RelativeLayout) view.findViewById(R.id.scoreLayout);
                viewHolderChoose.mScore = (HealthTextView) view.findViewById(R.id.score);
                viewHolderChoose.mTitle = (HealthTextView) view.findViewById(R.id.nps_item_choose_tv);
                view.setTag(viewHolderChoose);
                viewHolderChoose2 = viewHolderChoose;
                viewHolderEdit = null;
            } else if (itemViewType != 1) {
                viewHolderEdit = null;
            } else {
                view = this.mInflater.inflate(R.layout.adapter_item_text, viewGroup, false);
                viewHolderEdit = new ViewHolderEdit();
                viewHolderEdit.mTitle = (HealthTextView) view.findViewById(R.id.nps_item_text_tv);
                viewHolderEdit.mEditText = (EditText) view.findViewById(R.id.nps_item_text_et);
                setEditText(viewHolderEdit);
                view.setTag(viewHolderEdit);
            }
        } else if (itemViewType == 0) {
            viewHolderChoose = (ViewHolderChoose) view.getTag();
            viewHolderChoose2 = viewHolderChoose;
            viewHolderEdit = null;
        } else if (itemViewType != 1) {
            viewHolderEdit = null;
        } else {
            viewHolderEdit = (ViewHolderEdit) view.getTag();
            viewHolderEdit.mEditText.setTag(Integer.valueOf(i));
        }
        showView(viewHolderChoose2, viewHolderEdit, itemViewType, i);
        return view;
    }

    private void setEditText(ViewHolderEdit viewHolderEdit) {
        viewHolderEdit.mEditText.addTextChangedListener(new EditTextWatcher(viewHolderEdit) { // from class: com.huawei.ui.main.stories.nps.component.MultiLayoutAdapter.1
            @Override // com.huawei.ui.main.stories.nps.component.MultiLayoutAdapter.EditTextWatcher
            public void afterTextChanged(Editable editable, ViewHolderEdit viewHolderEdit2) {
                Object tag = viewHolderEdit2.mEditText.getTag();
                int iIntValue = tag instanceof Integer ? ((Integer) tag).intValue() : 0;
                String string = editable.toString();
                if (!TextUtils.isEmpty(string)) {
                    MultiLayoutAdapter.this.mCommentString = MultiLayoutAdapter.this.mContext.getString(R.string.nps_user_survey_sport_health) + string;
                }
                if (njy.c(MultiLayoutAdapter.this.mList, iIntValue)) {
                    ((NpsQuestion) MultiLayoutAdapter.this.mList.get(iIntValue)).setAnswer(MultiLayoutAdapter.this.mCommentString);
                }
                LogUtil.a(MultiLayoutAdapter.TAG, "position: ", Integer.valueOf(iIntValue), "mCommentString: ", MultiLayoutAdapter.this.mCommentString);
            }
        });
    }

    abstract class EditTextWatcher implements TextWatcher {
        private ViewHolderEdit mHolder;

        public abstract void afterTextChanged(Editable editable, ViewHolderEdit viewHolderEdit);

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public EditTextWatcher(ViewHolderEdit viewHolderEdit) {
            this.mHolder = viewHolderEdit;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            afterTextChanged(editable, this.mHolder);
        }
    }

    private void showView(final ViewHolderChoose viewHolderChoose, ViewHolderEdit viewHolderEdit, int i, final int i2) {
        if (!njy.e(this.mList) && i2 <= this.mList.size() - 1) {
            if (i == 0) {
                viewHolderChoose.mTitle.setText((i2 + 1) + "、" + this.mList.get(i2).getTitle());
                viewHolderChoose.mScoreLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.component.MultiLayoutAdapter.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        MultiLayoutAdapter.this.showScorePickerDialog(viewHolderChoose, i2);
                    }
                });
                return;
            }
            if (i != 1) {
                return;
            }
            viewHolderEdit.mTitle.setText((i2 + 1) + "、" + this.mList.get(i2).getTitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScorePickerDialog(ViewHolderChoose viewHolderChoose, int i) {
        LayoutInflater layoutInflater;
        LogUtil.a(TAG, "showScorePickerDialog()");
        Context context = this.mContext;
        if (context == null || (layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater")) == null) {
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hw_show_settings_score_view, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mContext);
        builder.a(this.mContext.getString(R.string.nps_user_survey_input_score)).b(viewInflate, 0, 0).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.component.MultiLayoutAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.mDialogScore = builder.d();
        if (!initializeScoreDialogLayout(viewInflate, viewHolderChoose, i)) {
            LogUtil.d(TAG, "showScorePickerDialog() dialog layout fail");
            this.mDialogScore = null;
        } else {
            this.mDialogScore.show();
        }
    }

    private boolean initializeScoreDialogLayout(View view, final ViewHolderChoose viewHolderChoose, final int i) {
        int iA;
        LogUtil.a(TAG, "initializeScoreDialogLayout()");
        if (view == null) {
            return false;
        }
        final ListView listView = (ListView) view.findViewById(R.id.nps_score_lv);
        final String string = viewHolderChoose.mScore.getText().toString();
        if (TextUtils.isEmpty(string)) {
            iA = -1;
        } else {
            iA = qrs.a(string);
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.nps.component.MultiLayoutAdapter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    listView.setSelection(10 - qrs.a(string));
                }
            });
        }
        listView.setAdapter((ListAdapter) new ScoreLayoutAdapter(this.mContext, iA));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.main.stories.nps.component.MultiLayoutAdapter.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j) {
                if (MultiLayoutAdapter.this.mDialogScore != null) {
                    MultiLayoutAdapter.this.mDialogScore.dismiss();
                }
                HealthTextView healthTextView = viewHolderChoose.mScore;
                StringBuilder sb = new StringBuilder();
                int i3 = 10 - i2;
                sb.append(i3);
                sb.append("");
                healthTextView.setText(sb.toString());
                MultiLayoutAdapter.this.mListener.getProgress(i3, i);
                if (njy.c(MultiLayoutAdapter.this.mList, i)) {
                    ((NpsQuestion) MultiLayoutAdapter.this.mList.get(i)).setAnswer(String.valueOf(i3));
                }
            }
        });
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (!njy.e(this.mList, i)) {
            return TypeParams.QUESTION_CHOOSE_SINGEL.equals(this.mList.get(i).getType()) ? 0 : 1;
        }
        LogUtil.e(TAG, "getItemViewType isOutOfBounds");
        return -1;
    }
}
