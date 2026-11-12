package com.huami.widget.share;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareSportFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class ShareSportFragment extends Fragment {
    public static final String ARG_TYPE = "share_type";
    private static final String k = "HMShareManager-ShareRunSportLayout";
    private HMShareManager a;
    private List<ShareTarget> b;
    private b c;
    private ShareTarget d;
    private boolean e = false;
    private boolean f = false;
    private View.OnClickListener g;
    private Context h;
    private PreShareListener i;
    private HMShareManager.ShareResultListener j;

    public class a implements AdapterView.OnItemClickListener {
        private a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (ShareSportFragment.this.e) {
                return;
            }
            if (ShareSportFragment.this.g != null) {
                ShareSportFragment.this.g.onClick(view);
            }
            ShareSportFragment.this.e = true;
            ShareSportFragment shareSportFragment = ShareSportFragment.this;
            shareSportFragment.d = (ShareTarget) shareSportFragment.b.get(i);
            ShareSportFragment.this.a.shareFlavorAnalytics(ShareSportFragment.this.d.type, 20);
            if (ShareSportFragment.this.d.icon != R.drawable.ic_download_44 && ShareSportFragment.this.d.icon != R.drawable.share_mifit_circle) {
                if (((ShareTarget) ShareSportFragment.this.b.get(i)).enable) {
                    ShareSportFragment.this.a.showToast(R.string.share_prepare_tips);
                } else {
                    ShareSportFragment.this.a.showToast(R.string.share_uninstall_client);
                }
            }
            if (ShareSportFragment.this.i != null) {
                ShareSportFragment.this.i.onPreShare(ShareSportFragment.this.d.type);
            }
        }
    }

    public final class b extends BaseAdapter {
        private final List<ShareTarget> a;

        public b(List<ShareTarget> list) {
            this.a = list;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareTarget getItem(int i) {
            return this.a.get(i);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        @SuppressLint({"NewApi"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(ShareSportFragment.this.getActivity()).inflate(R.layout.view_share_dialog_item, viewGroup, false);
            }
            TextView textView = (TextView) view.findViewById(R.id.label);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            ShareTarget item = getItem(i);
            textView.setText(item.label);
            imageView.setBackgroundResource(item.icon);
            imageView.setAlpha(item.enable ? 1.0f : 0.4f);
            imageView.setEnabled(item.enable);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(ShareContent shareContent) {
        return " 分享的是链接, url = " + shareContent.url;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getBoolean("share_type", false);
        }
        HMShareManager hMShareManager = new HMShareManager(getActivity());
        this.a = hMShareManager;
        List<ShareTarget> listB = hMShareManager.B(1);
        this.b = listB;
        for (ShareTarget shareTarget : listB) {
            if (shareTarget.type == 14) {
                this.b.remove(shareTarget);
                break;
            }
        }
        this.c = new b(this.b);
        this.a.n0(this.j);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.share_run_sport_layout, viewGroup, false);
        this.h = viewInflate.getContext();
        viewInflate.findViewById(R.id.container_layout);
        GridView gridView = (GridView) viewInflate.findViewById(R.id.share_list);
        gridView.setAdapter((ListAdapter) this.c);
        gridView.setOnItemClickListener(new a());
        return viewInflate;
    }

    public void onSharePrepared(final ShareContent shareContent) {
        ShareTarget shareTarget;
        if (shareContent == null || (shareTarget = this.d) == null) {
            return;
        }
        if (shareTarget.icon != R.drawable.ic_download_44) {
            this.a.p0(shareTarget, shareContent, this.f);
        } else {
            try {
                String str = shareContent.bitmapUrl;
                if (str == null || "".equals(str)) {
                    HMLog.info(k, new Function0() { // from class: ss6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShareSportFragment.j(shareContent);
                        }
                    });
                } else {
                    this.a.q0(shareContent.bitmapUrl, this.h);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.e = false;
        this.d = null;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public void setShareListener(PreShareListener preShareListener) {
        this.i = preShareListener;
    }

    public void setShareResultListener(HMShareManager.ShareResultListener shareResultListener) {
        this.j = shareResultListener;
    }
}
