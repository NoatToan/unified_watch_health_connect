package com.huawei.phoneservice.feedback.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.faq.base.util.m;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedbackcommon.db.FeedbackMediaData;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import com.huawei.phoneservice.feedbackcommon.entity.FeedMedia;
import com.huawei.phoneservice.feedbackcommon.entity.MediaEntity;
import com.huawei.phoneservice.feedbackcommon.photolibrary.MimeType;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FeedDetailAdapter extends com.huawei.phoneservice.feedback.widget.a<FeedBackResponse.ProblemEnity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f21606c;
    private Context d;

    public interface f {
        void a(com.huawei.phoneservice.feedback.entity.c cVar);

        void a(String str, String str2, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView2, long j);

        void a(List<MediaItem> list, int i);

        void b(com.huawei.phoneservice.feedback.entity.c cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(com.huawei.phoneservice.feedback.widget.c cVar, int i) {
        d((com.huawei.phoneservice.feedback.adapter.d) cVar, a(i), i);
    }

    public void b(f fVar) {
        this.f21606c = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.huawei.phoneservice.feedback.widget.c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new com.huawei.phoneservice.feedback.adapter.d(LayoutInflater.from(this.d).inflate(R.layout.feedback_sdk_item_imgfrom_questionlist, viewGroup, false));
    }

    private void e(com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity, int i) {
        if (TextUtils.isEmpty(problemEnity.getAnswer()) || !TextUtils.isEmpty(problemEnity.getScore()) || !ModuleConfigUtils.feedbackAssessmentEnabled(this.f21605b)) {
            dVar.i.setVisibility(4);
            return;
        }
        dVar.d.getViewTreeObserver().addOnPreDrawListener(new e(dVar));
        dVar.i.setImageResource(R.drawable.feedback_sdk_ic_comment_useful);
        dVar.h.setImageResource(R.drawable.feedback_sdk_ic_comment_useless);
        dVar.h.setVisibility(0);
        dVar.i.setVisibility(0);
        dVar.i.setOnClickListener(new d(dVar, problemEnity, i));
        dVar.h.setOnClickListener(new a(dVar, problemEnity, i));
    }

    private void d(com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity, int i) {
        a(dVar, problemEnity, i);
        a(dVar, problemEnity);
        d(dVar, problemEnity);
        if (TextUtils.isEmpty(problemEnity.getAnswer())) {
            dVar.f21626a.setVisibility(8);
            dVar.g.setVisibility(8);
            dVar.l.setVisibility(8);
        } else {
            if (com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.c(problemEnity.getAnswerTime(), this.d)) {
                dVar.f21626a.setText(com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.d(problemEnity.getAnswerTime(), "HH:mm", this.d));
            } else {
                dVar.f21626a.setText(m.b(com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.d(problemEnity.getAnswerTime(), "yyyy-MM-dd HH:mm", this.d), this.d).replace(Constants.LINK, "/"));
            }
            dVar.d.setText(problemEnity.getAnswer());
        }
        e(dVar, problemEnity, i);
        if (TextUtils.isEmpty(problemEnity.getAnswer()) || TextUtils.isEmpty(problemEnity.getScore()) || !ModuleConfigUtils.feedbackAssessmentEnabled(this.f21605b)) {
            return;
        }
        dVar.g.setVisibility(0);
        if ("1".equals(problemEnity.getScore())) {
            dVar.i.setImageResource(R.drawable.feedback_sdk_ic_comment_useful_gray);
            dVar.i.setVisibility(0);
            dVar.i.setEnabled(false);
            dVar.h.setVisibility(8);
            dVar.f21627b.setText(this.d.getResources().getString(R.string.feedback_sdk_question_details_evalua_yes));
        }
        if ("0".equals(problemEnity.getScore())) {
            dVar.h.setImageResource(R.drawable.feedback_sdk_ic_comment_useless_gray);
            dVar.h.setVisibility(0);
            dVar.h.setEnabled(false);
            dVar.i.setVisibility(8);
            dVar.f21627b.setText(this.d.getResources().getString(R.string.feedback_sdk_question_details_evalua_no));
        }
    }

    private void a(com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity) {
        if (com.huawei.phoneservice.faq.base.util.d.c(problemEnity.getMediaItemList())) {
            dVar.j.setVisibility(8);
            return;
        }
        dVar.j.setVisibility(0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d);
        com.huawei.phoneservice.feedback.adapter.b bVar = new com.huawei.phoneservice.feedback.adapter.b(this.d, new b(new ArrayList(problemEnity.getMediaItemList())));
        dVar.j.setLayoutManager(linearLayoutManager);
        dVar.j.setAdapter(bVar);
        bVar.a(problemEnity.getMediaItemList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MediaItem> d(List<FeedMedia> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            FeedMedia feedMedia = list.get(i);
            MediaEntity mediaEntityB = FeedbackMediaData.a(this.d).b(feedMedia.getAttachId());
            if (mediaEntityB != null) {
                String str = new File(mediaEntityB.path).exists() ? mediaEntityB.path : new File(mediaEntityB.cache).exists() ? mediaEntityB.cache : null;
                if (!TextUtils.isEmpty(str)) {
                    String suffixFromUrl = MimeType.getSuffixFromUrl(mediaEntityB.url);
                    long j = Long.parseLong(feedMedia.getSize());
                    Long l = mediaEntityB.duration;
                    arrayList.add(new MediaItem(suffixFromUrl, str, j, l == null ? 0L : l.longValue(), feedMedia.getAttachId(), mediaEntityB.strUri));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.huawei.phoneservice.feedback.entity.c cVar, com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity, int i, String str) {
        cVar.a(dVar.i);
        cVar.c(dVar.h);
        cVar.a(dVar.f21627b);
        cVar.c(dVar.g);
        cVar.a(problemEnity.getProblemId());
        cVar.b(i);
        cVar.d(str);
    }

    private void a(com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity, int i) {
        TextView textView;
        String strReplace;
        if (i != 0 || this.d == null) {
            dVar.f21628c.setText(problemEnity.getProblemDesc());
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.d.getResources().getString(R.string.feedback_sdk_desc, problemEnity.getProblemDesc())).append("\n").append(this.d.getResources().getString(R.string.feedback_sdk_desc_numb)).append("\n").append(problemEnity.getProblemId());
            dVar.f21628c.setText(stringBuffer);
        }
        if (com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.c(problemEnity.getCreateTime(), this.d)) {
            textView = dVar.e;
            strReplace = com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.d(problemEnity.getCreateTime(), "HH:mm", this.d);
        } else {
            String strD = com.huawei.phoneservice.feedback.photolibrary.internal.utils.c.d(problemEnity.getCreateTime(), "yyyy-MM-dd HH:mm", this.d);
            textView = dVar.e;
            strReplace = m.b(strD, this.d).replace(Constants.LINK, "/");
        }
        textView.setText(strReplace);
    }

    private void d(com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity) {
        if (problemEnity.getPicURL() == null) {
            dVar.f.setVisibility(8);
            return;
        }
        dVar.f.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(problemEnity.getPicURL());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(problemEnity.getPicURL());
        dVar.f.setLayoutManager(new LinearLayoutManager(this.d));
        com.huawei.phoneservice.feedback.adapter.c cVar = new com.huawei.phoneservice.feedback.adapter.c(this.d, new c(arrayList2));
        dVar.f.setAdapter(cVar);
        cVar.a(arrayList);
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class UriDeserializer implements JsonDeserializer<Uri> {
        @Override // com.google.gson.JsonDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return Uri.parse(jsonElement.getAsString());
        }

        UriDeserializer() {
        }
    }

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedBackResponse.ProblemEnity f21608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.phoneservice.feedback.adapter.d f21609c;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view) || FeedDetailAdapter.this.f21606c == null) {
                return;
            }
            com.huawei.phoneservice.feedback.entity.c cVar = new com.huawei.phoneservice.feedback.entity.c();
            FeedDetailAdapter.this.d(cVar, this.f21609c, this.f21608b, this.f21607a, "0");
            FeedDetailAdapter.this.f21606c.a(cVar);
        }

        a(com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity, int i) {
            this.f21609c = dVar;
            this.f21608b = problemEnity;
            this.f21607a = i;
        }
    }

    class b implements com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a {
        final /* synthetic */ List e;

        @Override // com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a
        public void a(int i, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView2, String str, String str2, long j, boolean z) {
            if (FeedDetailAdapter.this.f21606c != null) {
                FeedDetailAdapter feedDetailAdapter = FeedDetailAdapter.this;
                if (!z) {
                    List<MediaItem> listD = feedDetailAdapter.d(this.e);
                    int iE = FeedDetailAdapter.this.e(listD, str2);
                    if (iE != -1) {
                        FeedDetailAdapter.this.f21606c.a(listD, iE);
                        return;
                    }
                    return;
                }
                feedDetailAdapter.f21606c.a(str, str2, imageView, relativeLayout, relativeLayout2, imageView2, j);
            }
        }

        b(List list) {
            this.e = list;
        }
    }

    class c implements com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f21612c;

        @Override // com.huawei.phoneservice.feedback.widget.a.InterfaceC0259a
        public void a(int i, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView2, String str, String str2, long j, boolean z) {
            if (FeedDetailAdapter.this.f21606c != null) {
                FeedDetailAdapter feedDetailAdapter = FeedDetailAdapter.this;
                if (!z) {
                    List<MediaItem> listD = feedDetailAdapter.d(this.f21612c);
                    int iE = FeedDetailAdapter.this.e(listD, str2);
                    if (iE != -1) {
                        FeedDetailAdapter.this.f21606c.a(listD, iE);
                        return;
                    }
                    return;
                }
                feedDetailAdapter.f21606c.a(str, str2, imageView, relativeLayout, relativeLayout2, imageView2, j);
            }
        }

        c(List list) {
            this.f21612c = list;
        }
    }

    class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.phoneservice.feedback.adapter.d f21613b;
        final /* synthetic */ FeedBackResponse.ProblemEnity d;
        final /* synthetic */ int e;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.b(view) || FeedDetailAdapter.this.f21606c == null) {
                return;
            }
            com.huawei.phoneservice.feedback.entity.c cVar = new com.huawei.phoneservice.feedback.entity.c();
            FeedDetailAdapter.this.d(cVar, this.f21613b, this.d, this.e, "1");
            FeedDetailAdapter.this.f21606c.b(cVar);
        }

        d(com.huawei.phoneservice.feedback.adapter.d dVar, FeedBackResponse.ProblemEnity problemEnity, int i) {
            this.f21613b = dVar;
            this.d = problemEnity;
            this.e = i;
        }
    }

    static class e implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.huawei.phoneservice.feedback.adapter.d f21615c;

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f21615c.d.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f21615c.d.getLineCount() >= 3) {
                this.f21615c.m.setOrientation(1);
            } else {
                this.f21615c.m.setOrientation(0);
            }
            return false;
        }

        e(com.huawei.phoneservice.feedback.adapter.d dVar) {
            this.f21615c = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(List<MediaItem> list, String str) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getAttachId())) {
                return i;
            }
        }
        return -1;
    }

    public FeedDetailAdapter(Context context, boolean z) {
        this.d = context;
        this.f21605b = z;
    }
}
