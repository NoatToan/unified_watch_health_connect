package com.huawei.health.suggestion.ui.fitness.activity.fragment;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessCourseHorizontalHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.openservice.OpenServiceUtil;
import defpackage.btt;
import defpackage.njy;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TopicFitnessView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f9240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9242c;
    private int d;
    private c e;
    private b f;
    private HealthRecycleView g;
    private LinearLayout h;
    private List<Topic> i;
    private int j;
    private ArrayList<String> o;

    public TopicFitnessView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new ArrayList<>(10);
        this.i = new ArrayList(10);
        this.f9242c = false;
        this.d = -1;
        this.j = 0;
        this.f9240a = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.TopicFitnessView.4
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.e("Suggestion_TopicFitnessView", " msg is empty");
                    return;
                }
                super.handleMessage(message);
                if (njy.b(message.obj, Topic.class)) {
                    TopicFitnessView.this.b((List<Topic>) message.obj);
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.sug_fragment_topic_list, this);
        b();
    }

    public void setLayoutBackground(int i) {
        this.d = i;
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(i);
        }
        b bVar = this.f;
        if (bVar != null) {
            bVar.c(i);
        }
    }

    public void b(ArrayList<String> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("Suggestion_TopicFitnessView", "newInstance() topicNum.size = null");
            return;
        }
        this.o = arrayList;
        if (arrayList != null && arrayList.size() > 1) {
            this.f9242c = true;
        } else {
            this.f9242c = false;
        }
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.TopicFitnessView.1
            @Override // java.lang.Runnable
            public void run() {
                TopicFitnessView topicFitnessView = TopicFitnessView.this;
                topicFitnessView.b(topicFitnessView.j, TopicFitnessView.this.e);
            }
        });
    }

    private void b() {
        this.f9241b = getContext();
        this.h = (LinearLayout) findViewById(R.id.my_recommend_fitness_container);
        this.g = (HealthRecycleView) findViewById(R.id.my_recommend_fitness_view);
        b bVar = new b(this.g, OpenServiceUtil.Location.WEIGHT);
        this.f = bVar;
        this.g.setAdapter(bVar);
        c();
        c cVar = new c(this);
        this.e = cVar;
        LogUtil.d("Suggestion_TopicFitnessView", "onCreateView() mMyUICallbackTopicList hashcode:", Integer.valueOf(cVar.hashCode()));
    }

    private void c() {
        if (this.f9242c) {
            this.g.setLayoutManager(new HealthLinearLayoutManager(this.f9241b));
        } else {
            this.g.setLayoutManager(new HealthLinearLayoutManager(this.f9241b) { // from class: com.huawei.health.suggestion.ui.fitness.activity.fragment.TopicFitnessView.3
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, c cVar) {
        if (cVar == null) {
            LogUtil.e("Suggestion_TopicFitnessView", "getDataAndRefreshTopicView", "uiCallback is null");
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_TopicFitnessView", "getDataAndRefreshTopicView : courseApi is null.");
        } else {
            courseApi.getCourseTopicList(i, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Topic> list) {
        if (njy.e(list)) {
            LogUtil.e("Suggestion_TopicFitnessView", "sendRefreshTopicViewMessage(), topic is empty");
            return;
        }
        LogUtil.a("sendRefreshTopicViewMessage() topic.size = ", Integer.valueOf(list.size()));
        Message messageObtainMessage = this.f9240a.obtainMessage();
        messageObtainMessage.obj = list;
        this.f9240a.sendMessage(messageObtainMessage);
    }

    static class c extends UiCallback<List<Topic>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TopicFitnessView f9248a;
        WeakReference<TopicFitnessView> d;
        private boolean e = true;

        c(TopicFitnessView topicFitnessView) {
            WeakReference<TopicFitnessView> weakReference = new WeakReference<>(topicFitnessView);
            this.d = weakReference;
            this.f9248a = weakReference.get();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            if (this.e) {
                return;
            }
            LogUtil.j("Suggestion_TopicFitnessView", "MyUiCallbackTopicList() onFailure mEnable=false ");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Topic> list) {
            LogUtil.a("Suggestion_TopicFitnessView", "MyUiCallbackTopicList(", Integer.valueOf(hashCode()), ") onSuccess()");
            TopicFitnessView topicFitnessView = this.f9248a;
            if (topicFitnessView != null) {
                topicFitnessView.a(list);
            } else {
                LogUtil.a("Suggestion_TopicFitnessView", "MyUiCallbackTopicList mTopicFitnessView == null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Topic> list) {
        if (njy.e(list)) {
            LogUtil.e("Suggestion_TopicFitnessView", "refreshMyTopicView(), showRecommendTopicList is empty");
            return;
        }
        this.i.clear();
        boolean z = false;
        for (Topic topic : list) {
            if (topic != null && this.o != null && topic.acquireSerialNum() != null) {
                Iterator<String> it = this.o.iterator();
                while (it.hasNext()) {
                    if (topic.acquireSerialNum().equals(it.next())) {
                        this.i.add(topic);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f.c(this.i);
            LogUtil.a("Suggestion_TopicFitnessView", "showRecommendTopicList() mShowTopicList.size = ", Integer.valueOf(this.i.size()));
            int i = this.d;
            if (i != -1) {
                LogUtil.a("Suggestion_TopicFitnessView", "setHolderBackground color = ", Integer.valueOf(i));
                this.f.c(this.d);
                return;
            }
            return;
        }
        int i2 = this.j;
        if (i2 <= 2) {
            int i3 = i2 + 1;
            this.j = i3;
            LogUtil.a("Suggestion_TopicFitnessView", "request again pageNum = ", Integer.valueOf(i3));
            b(this.j, this.e);
            return;
        }
        LogUtil.j("Suggestion_TopicFitnessView", "can not show this page, mPageNum = ", Integer.valueOf(i2));
    }

    /* JADX INFO: loaded from: classes31.dex */
    static class b extends RecyclerView.Adapter<FitnessCourseHorizontalHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f9246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LayoutInflater f9247c;
        private FitnessCourseHorizontalHolder d;
        private HealthRecycleView i;
        private List<Topic> j = new ArrayList(10);
        private int e = -1;

        b(HealthRecycleView healthRecycleView, String str) {
            this.i = healthRecycleView;
            this.f9245a = str;
            Context context = healthRecycleView.getContext();
            this.f9246b = context;
            this.f9247c = LayoutInflater.from(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FitnessCourseHorizontalHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FitnessCourseHorizontalHolder fitnessCourseHorizontalHolder = new FitnessCourseHorizontalHolder(this.f9247c.inflate(R.layout.sug_item_fitness_nomal, viewGroup, false), this.f9246b);
            this.d = fitnessCourseHorizontalHolder;
            LogUtil.a("Suggestion_TopicFitnessView", "onCreateViewHolder() topicHolder = ", Integer.valueOf(fitnessCourseHorizontalHolder.hashCode()), ",mColor = ", Integer.valueOf(this.e));
            int i2 = this.e;
            if (i2 != -1) {
                this.d.b(i2);
            }
            return this.d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(FitnessCourseHorizontalHolder fitnessCourseHorizontalHolder, int i) {
            if (fitnessCourseHorizontalHolder == null) {
                LogUtil.j("Suggestion_TopicFitnessView", "onBindViewHolder() holder = null");
            } else if (njy.c(this.j, i)) {
                fitnessCourseHorizontalHolder.d(this.j.get(i), this.f9245a);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.j.size();
        }

        public void c(List<Topic> list) {
            if (list == null) {
                LogUtil.j("Suggestion_TopicFitnessView", "notifyAddAll() topicList = null");
                return;
            }
            LogUtil.a("Suggestion_TopicFitnessView", "notifyAddAll() topics.SIZE = ", Integer.valueOf(list.size()));
            this.j.clear();
            this.j.addAll(list);
            notifyDataSetChanged();
        }

        public void c(int i) {
            this.e = i;
            FitnessCourseHorizontalHolder fitnessCourseHorizontalHolder = this.d;
            if (fitnessCourseHorizontalHolder != null) {
                fitnessCourseHorizontalHolder.b(i);
            }
        }
    }
}
