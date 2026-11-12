package com.huawei.ui.main.stories.nps.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSureyResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyChooseResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.Records;
import com.huawei.ui.main.stories.nps.views.EcologyNpsAdapter;
import com.huawei.ui.main.stories.nps.views.NpsAdapterParams;
import com.huawei.ui.main.stories.nps.views.OnCheckedChangeListener;
import defpackage.qsp;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EcologySingleFragment extends BaseFragment {
    private static final String TAG = "EcologySingleFragment";
    private OnCheckedChangeListener checkedChangeListener;
    private EcologyNpsAdapter mAdapter;
    private ListView mListView;
    private int mNumber;
    private String[] mQuestionAnswers;
    private List<QuestionSurveyChooseResponse> mQuestionChooseResponses;
    private QuestionSureyResponse mQuestionSureyResponse;
    private HealthSubHeader mQuestionTextView;
    private final HashMap<String, Boolean> mStates = new HashMap<>();
    private final Handler mHandler = new Handler() { // from class: com.huawei.ui.main.stories.nps.activity.EcologySingleFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            EcologySingleFragment.this.mListView.setItemChecked(message.what, true);
            EcologySingleFragment.this.saveData();
            super.handleMessage(message);
        }
    };

    public EcologySingleFragment() {
    }

    public EcologySingleFragment(QuestionSureyResponse questionSureyResponse, int i, OnCheckedChangeListener onCheckedChangeListener) {
        this.mQuestionSureyResponse = questionSureyResponse;
        this.checkedChangeListener = onCheckedChangeListener;
        this.mNumber = i;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ecology_nps_single, viewGroup, false);
        QuestionSureyResponse questionSureyResponse = this.mQuestionSureyResponse;
        if (questionSureyResponse == null) {
            return viewInflate;
        }
        this.mQuestionChooseResponses = questionSureyResponse.getChoose();
        this.mListView = (ListView) qsp.a(viewInflate, R.id.single_listview);
        this.mQuestionTextView = (HealthSubHeader) qsp.a(viewInflate, R.id.ecology_question_title);
        String str = this.mNumber + "." + this.mQuestionSureyResponse.getQuestion();
        this.mQuestionTextView.setSubHeaderBackgroundColor(getActivity().getResources().getColor(R.color.colorSubBackground));
        this.mQuestionTextView.setHeadTitleText(str);
        this.mStates.clear();
        List<QuestionSurveyChooseResponse> list = this.mQuestionChooseResponses;
        if (list != null) {
            this.mQuestionAnswers = new String[list.size()];
            for (int i = 0; i < this.mQuestionChooseResponses.size(); i++) {
                if (this.mQuestionChooseResponses.get(i).getRemark() != null) {
                    this.mQuestionAnswers[i] = this.mQuestionChooseResponses.get(i).getName() + Constants.LEFT_BRACKET_ONLY + this.mQuestionChooseResponses.get(i).getRemark() + Constants.RIGHT_BRACKET_ONLY;
                } else {
                    this.mQuestionAnswers[i] = this.mQuestionChooseResponses.get(i).getName();
                }
                this.mStates.put(i + "", false);
            }
        }
        EcologyNpsAdapter ecologyNpsAdapter = new EcologyNpsAdapter(getContext(), this.mHandler, getNosAdapterParams());
        this.mAdapter = ecologyNpsAdapter;
        this.mListView.setAdapter((ListAdapter) ecologyNpsAdapter);
        this.mListView.setChoiceMode(1);
        this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.main.stories.nps.activity.EcologySingleFragment.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                EcologySingleFragment.this.checkedChangeListener.onClick(true);
                int i3 = 0;
                while (i3 < EcologySingleFragment.this.mQuestionChooseResponses.size()) {
                    EcologySingleFragment.this.mStates.put(i3 + "", Boolean.valueOf(i2 == i3));
                    i3++;
                }
                EcologySingleFragment.this.checkedChangeListener.onClick(true);
                EcologySingleFragment.this.mAdapter.notifyDataSetChanged();
                EcologySingleFragment.this.saveData();
            }
        });
        return viewInflate;
    }

    private NpsAdapterParams getNosAdapterParams() {
        NpsAdapterParams npsAdapterParams = new NpsAdapterParams();
        npsAdapterParams.setDataInfos(this.mQuestionAnswers);
        npsAdapterParams.setIsMultiple(false);
        npsAdapterParams.setStateMap(this.mStates);
        npsAdapterParams.setCheckedChangeListener(this.checkedChangeListener);
        return npsAdapterParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveData() {
        LogUtil.a(TAG, "Enter saveData");
        int checkedItemPosition = this.mListView.getCheckedItemPosition();
        List<QuestionSurveyChooseResponse> list = this.mQuestionChooseResponses;
        if (list == null || list.size() < checkedItemPosition + 1) {
            LogUtil.j(TAG, "saveData error1!");
        } else if (this.mQuestionSureyResponse == null) {
            LogUtil.j(TAG, "saveData error2!");
        } else {
            Records.getOptionResult().put(this.mQuestionSureyResponse.getId(), this.mQuestionChooseResponses.get(checkedItemPosition).getName());
            LogUtil.a(TAG, "finish single successful getOptionResult:", Records.getOptionResult());
        }
    }
}
