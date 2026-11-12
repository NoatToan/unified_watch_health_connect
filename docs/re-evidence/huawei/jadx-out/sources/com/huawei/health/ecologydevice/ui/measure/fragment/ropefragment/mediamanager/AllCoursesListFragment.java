package com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.health.ecologydevice.ui.measure.adapter.voicecourse.VoiceCourseRecyclerViewAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.etg;
import defpackage.njy;
import defpackage.phw;
import defpackage.qrs;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AllCoursesListFragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "AllRopeMediaFragment";
    private Activity mContext;
    private ImageView mImgSelectAll;
    private LinearLayout mLlRootSelectAll;
    private List<CourseModel.Course> mMediaList = new ArrayList();
    private MediaManager mMediaManager;
    private int mMediaType;
    private OnMediaItemClick mOnMediaItemClick;
    private LinearLayout mRbDownloadCourse;
    private LinearLayout mRbSelectAll;
    private VoiceCourseRecyclerViewAdapter mRecycleViewAdapter;
    private RecyclerView mRecycleViewCourseList;
    private ArrayList<CourseModel.Course> mRopeMediaList;
    private long mRopeRemainingMemory;
    private HealthTextView mTvSelectAll;

    public interface OnMediaItemClick {
        void onDownloadClick(List<CourseModel.Course> list, String str);

        void onGotoDownloadedClick();

        void onItemClick(CourseModel.Course course);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mMediaType = arguments.getInt(MediaManager.KEY_MEDIA_TYPE);
            this.mRopeRemainingMemory = arguments.getLong(MediaManager.KEY_REMAINING_MEMORY);
            this.mRopeMediaList = arguments.getParcelableArrayList(MediaManager.KEY_MEDIA_LIST);
        }
        this.mContext = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        LogUtil.a(TAG, "onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.all_courses_list_fragment, viewGroup, false);
        initView(viewInflate);
        initData();
        return viewInflate;
    }

    private void initView(View view) {
        this.mMediaManager = new MediaManager();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_courses_list);
        this.mRecycleViewCourseList = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mLlRootSelectAll = (LinearLayout) view.findViewById(R.id.ll_root_select_all);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.rb_download);
        this.mRbDownloadCourse = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.rb_select_all);
        this.mRbSelectAll = linearLayout2;
        linearLayout2.setOnClickListener(this);
        this.mImgSelectAll = (ImageView) view.findViewById(R.id.img_select_all);
        this.mTvSelectAll = (HealthTextView) view.findViewById(R.id.tv_select_all);
    }

    private void initData() {
        VoiceCourseRecyclerViewAdapter voiceCourseRecyclerViewAdapter = new VoiceCourseRecyclerViewAdapter(this.mContext, this.mMediaList, 0, this.mMediaType);
        this.mRecycleViewAdapter = voiceCourseRecyclerViewAdapter;
        this.mRecycleViewCourseList.setAdapter(voiceCourseRecyclerViewAdapter);
        this.mRecycleViewAdapter.e(new VoiceCourseRecyclerViewAdapter.OnCheckedChange() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.AllCoursesListFragment.1
            @Override // com.huawei.health.ecologydevice.ui.measure.adapter.voicecourse.VoiceCourseRecyclerViewAdapter.OnCheckedChange
            public void onSortTouch(int i) {
            }

            @Override // com.huawei.health.ecologydevice.ui.measure.adapter.voicecourse.VoiceCourseRecyclerViewAdapter.OnCheckedChange
            public void onSwitchClick(int i) {
            }

            @Override // com.huawei.health.ecologydevice.ui.measure.adapter.voicecourse.VoiceCourseRecyclerViewAdapter.OnCheckedChange
            public void onItemClick(int i) {
                if (!qrs.r()) {
                    if (AllCoursesListFragment.this.mOnMediaItemClick == null || !njy.c(AllCoursesListFragment.this.mMediaList, i)) {
                        return;
                    }
                    AllCoursesListFragment.this.mOnMediaItemClick.onItemClick((CourseModel.Course) AllCoursesListFragment.this.mMediaList.get(i));
                    return;
                }
                LogUtil.j(AllCoursesListFragment.TAG, "onItemClick click too fast");
            }

            @Override // com.huawei.health.ecologydevice.ui.measure.adapter.voicecourse.VoiceCourseRecyclerViewAdapter.OnCheckedChange
            public void onDownloadClick(int i) {
                if (!qrs.r()) {
                    if (!njy.e(AllCoursesListFragment.this.mMediaList, i)) {
                        AllCoursesListFragment.this.goDownLoadedPageOrDownload(i);
                        return;
                    } else {
                        LogUtil.j(AllCoursesListFragment.TAG, "onDownloadClick isOutOfBounds");
                        return;
                    }
                }
                LogUtil.j(AllCoursesListFragment.TAG, "onDownloadClick click too fast");
            }

            @Override // com.huawei.health.ecologydevice.ui.measure.adapter.voicecourse.VoiceCourseRecyclerViewAdapter.OnCheckedChange
            public void onCheckBoxClick() {
                AllCoursesListFragment.this.refreshSelectAllView();
            }
        });
        readFileToData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshSelectAllView() {
        boolean zIsAllSelected = this.mMediaManager.isAllSelected(true, this.mMediaList);
        this.mImgSelectAll.setImageResource(zIsAllSelected ? R.drawable.ic_rope_select_all : R.drawable.ic_rope_select_default);
        this.mImgSelectAll.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(this.mContext, zIsAllSelected ? R.color.textColorPrimaryActivated : R.color.rope_icon_tint)));
        this.mTvSelectAll.setTextColor(getResources().getColor(zIsAllSelected ? R.color.textColorPrimaryActivated : R.color.textColorPrimary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goDownLoadedPageOrDownload(int i) {
        final CourseModel.Course course = this.mMediaList.get(i);
        if (course.getStatus() == 3) {
            this.mMediaManager.showNoTitleCustomAlertDialog(this.mContext, R.string.IDS_rope_course_disable_tip, R.string.IDS_compatibility_note_open, new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.AllCoursesListFragment$$ExternalSyntheticLambda1
                @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
                public final void onResponse(int i2, Object obj) {
                    this.f$0.m1080x4ea7b08d(i2, (String) obj);
                }
            });
            return;
        }
        MediaManager mediaManager = this.mMediaManager;
        Activity activity = this.mContext;
        mediaManager.showRadioButtonSelectDialog(activity, mediaManager.getSelectHashMap(activity), new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.AllCoursesListFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
            public final void onResponse(int i2, Object obj) {
                this.f$0.m1081x1705d52c(course, i2, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$goDownLoadedPageOrDownload$0$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-AllCoursesListFragment, reason: not valid java name */
    /* synthetic */ void m1080x4ea7b08d(int i, String str) {
        OnMediaItemClick onMediaItemClick = this.mOnMediaItemClick;
        if (onMediaItemClick != null) {
            onMediaItemClick.onGotoDownloadedClick();
        }
    }

    /* JADX INFO: renamed from: lambda$goDownLoadedPageOrDownload$1$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-AllCoursesListFragment, reason: not valid java name */
    /* synthetic */ void m1081x1705d52c(CourseModel.Course course, int i, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(course);
        downloadMedia(arrayList, MediaManager.ROPE_MEDIA_STANDARD.equals(str) ? course.getFileSize() : course.getHighQualitySize(), str);
    }

    private void readFileToData() {
        String strE = phw.e(new File(MediaManager.ROPE_JSON_FILE, this.mMediaType == 0 ? MediaManager.ROPE_MEDIA_COURSE_JSON : MediaManager.ROPE_MEDIA_MUSIC_JSON));
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        try {
            List<CourseModel.Course> courses = ((CourseModel) new Gson().fromJson(strE, new TypeToken<CourseModel>() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.AllCoursesListFragment.2
            }.getType())).getCourses();
            if (njy.e(courses)) {
                return;
            }
            this.mMediaList.clear();
            this.mMediaList.addAll(setDataStatus(courses));
            if (this.mMediaList.size() == 1) {
                this.mMediaList.get(0).setBackgroundResourceId(R.drawable.list_item_background_single_normal);
            } else {
                this.mMediaList.get(0).setBackgroundResourceId(R.drawable.list_item_background_top_normal);
                List<CourseModel.Course> list = this.mMediaList;
                list.get(list.size() - 1).setBackgroundResourceId(R.drawable.list_item_background_bottom_normal);
            }
            this.mRecycleViewAdapter.notifyDataSetChanged();
        } catch (JsonSyntaxException e) {
            LogUtil.j(TAG, "JsonSyntaxException exception is ", e.getMessage());
        }
    }

    private List<CourseModel.Course> setDataStatus(List<CourseModel.Course> list) {
        if (!njy.e(this.mRopeMediaList)) {
            Iterator<CourseModel.Course> it = this.mRopeMediaList.iterator();
            while (it.hasNext()) {
                setDataStatus(list, it.next());
            }
        }
        return list;
    }

    private void setDataStatus(List<CourseModel.Course> list, CourseModel.Course course) {
        for (int i = 0; i < list.size(); i++) {
            if ((course.getStatus() == 2 || course.getStatus() == 3) && course.getId() == list.get(i).getId()) {
                list.get(i).setStatus(course.getStatus());
                return;
            }
        }
    }

    public void setIsMultipleSelectStatus(boolean z) {
        if (!z) {
            Iterator<CourseModel.Course> it = this.mMediaList.iterator();
            while (it.hasNext()) {
                it.next().setIsCheckboxCheck(false);
            }
        }
        this.mRecycleViewAdapter.a(z);
        this.mRecycleViewAdapter.notifyDataSetChanged();
        this.mLlRootSelectAll.setVisibility(z ? 0 : 8);
        refreshSelectAllView();
    }

    public boolean isMultipleSelectStatus() {
        VoiceCourseRecyclerViewAdapter voiceCourseRecyclerViewAdapter = this.mRecycleViewAdapter;
        if (voiceCourseRecyclerViewAdapter == null) {
            return false;
        }
        return voiceCourseRecyclerViewAdapter.e();
    }

    protected void setRopeMemory(long j) {
        this.mRopeRemainingMemory = j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.j(TAG, "click too fast");
            return;
        }
        if (view.getId() == R.id.rb_select_all) {
            selectAll();
            return;
        }
        if (view.getId() == R.id.rb_download) {
            if (this.mMediaManager.isHasMediaSelected(this.mMediaList)) {
                MediaManager mediaManager = this.mMediaManager;
                Activity activity = this.mContext;
                mediaManager.showRadioButtonSelectDialog(activity, mediaManager.getSelectHashMap(activity), new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.AllCoursesListFragment$$ExternalSyntheticLambda3
                    @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
                    public final void onResponse(int i, Object obj) {
                        this.f$0.m1082xdd097aa5(i, (String) obj);
                    }
                });
                return;
            }
            return;
        }
        LogUtil.j(TAG, "onClick else");
    }

    /* JADX INFO: renamed from: lambda$onClick$2$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-AllCoursesListFragment, reason: not valid java name */
    /* synthetic */ void m1082xdd097aa5(int i, String str) {
        downloadMedia(str);
    }

    private void selectAll() {
        boolean zIsAllSelected = this.mMediaManager.isAllSelected(true, this.mMediaList);
        for (CourseModel.Course course : this.mMediaList) {
            if (course.getStatus() < 2) {
                course.setIsCheckboxCheck(!zIsAllSelected);
            }
        }
        this.mRecycleViewAdapter.notifyDataSetChanged();
        this.mImgSelectAll.setImageResource(zIsAllSelected ? R.drawable.ic_rope_select_default : R.drawable.ic_rope_select_all);
        this.mImgSelectAll.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(this.mContext, zIsAllSelected ? R.color.rope_icon_tint : R.color.textColorPrimaryActivated)));
        this.mTvSelectAll.setTextColor(getResources().getColor(zIsAllSelected ? R.color.textColorPrimary : R.color.textColorPrimaryActivated));
    }

    private void downloadMedia(String str) {
        ArrayList arrayList = new ArrayList();
        long fileSize = 0;
        for (CourseModel.Course course : this.mMediaList) {
            if (course.isCheckboxCheck()) {
                fileSize += MediaManager.ROPE_MEDIA_STANDARD.equals(str) ? course.getFileSize() : course.getHighQualitySize();
                arrayList.add(course);
            }
        }
        downloadMedia(arrayList, fileSize, str);
    }

    private void downloadMedia(final List<CourseModel.Course> list, long j, final String str) {
        this.mMediaManager.showDownloadDialog(this.mContext, this.mMediaType, this.mRopeRemainingMemory, j, new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.AllCoursesListFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
            public final void onResponse(int i, Object obj) {
                this.f$0.m1079xac8fecd1(list, str, i, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$downloadMedia$3$com-huawei-health-ecologydevice-ui-measure-fragment-ropefragment-mediamanager-AllCoursesListFragment, reason: not valid java name */
    /* synthetic */ void m1079xac8fecd1(List list, String str, int i, String str2) {
        if (this.mOnMediaItemClick == null) {
            return;
        }
        addCourseBiEvent(list);
        this.mOnMediaItemClick.onDownloadClick(list, str);
    }

    private void addCourseBiEvent(List<CourseModel.Course> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<CourseModel.Course> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getId()));
        }
        etg.e(arrayList.toString(), "add");
    }

    protected void refreshDataAdapter(ArrayList<CourseModel.Course> arrayList) {
        if (this.mRecycleViewAdapter == null) {
            return;
        }
        this.mRopeMediaList = arrayList;
        readFileToData();
    }

    public void setOnMediaItemClick(OnMediaItemClick onMediaItemClick) {
        this.mOnMediaItemClick = onMediaItemClick;
    }
}
