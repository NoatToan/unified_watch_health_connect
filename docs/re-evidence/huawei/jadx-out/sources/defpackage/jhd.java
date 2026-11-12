package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.apprichtap.haptic.player.d;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.AlbumEditText;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.GridViewBaseAdapter;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.OnGridViewListener;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.SlideBar;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.VideoViewAdapter;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.emotion.GridViewEmotionAdapter;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.healthcloud.plugintrack.ui.activity.PhotoAndVideoSelectActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.PhotoSelectActivity;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.gridview.HealthGridView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jhd {
    private boolean aa;
    private boolean ad;
    private RelativeLayout ah;
    private InterfaceReTrack ai;
    private ReTrackSimplify aj;
    private int ak;
    private HealthTextView al;
    private HealthTextView am;
    private ArrayList<PhotoModel> an;
    private SlideBar aq;
    private HealthTextView ar;
    private HealthTextView as;
    private ImageView at;
    private String au;
    private HealthTextView av;
    private HealthSwitchButton aw;
    private LinearLayout ax;
    private ArrayList<VideoModel> az;
    private VideoViewAdapter ba;
    private LinearLayout bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f38614c;
    private Context f;
    private HealthTextView g;
    private CustomTextAlertDialog h;
    private HealthTextView i;
    private HealthCardView j;
    private ImageButton l;
    private AlbumEditText o;
    private HealthGridView p;
    private GridViewBaseAdapter q;
    private HealthGridView s;
    private LinearLayout t;
    private InterfaceUpdateReTrack u;
    private boolean v;
    private int k = 0;
    private int n = 0;
    private int ap = 0;
    private int ao = 0;
    private int m = 0;
    private Map<Integer, String> x = new LinkedHashMap();
    private Map<Integer, ArrayList<PhotoModel>> e = new LinkedHashMap();
    private Map<Integer, ArrayList<PhotoModel>> w = new LinkedHashMap();
    private Map<Integer, ArrayList<VideoModel>> y = new LinkedHashMap();
    private Map<Integer, List<Bitmap>> r = new HashMap();
    private String z = "";
    private List<jhg> af = jhe.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38612a = -1;
    private Map<PhotoModel, Bitmap> ac = new HashMap();
    private Handler ae = null;
    private boolean ab = false;
    private int ag = 9;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnGridViewListener f38613b = new OnGridViewListener() { // from class: jhd.5
        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.OnGridViewListener
        public void onPhotoOrVideoDelete(int i) {
            jhd.this.ap--;
            jhd.this.k--;
            ViewGroup.LayoutParams layoutParams = jhd.this.g.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (jhd.this.k != 3) {
                    layoutParams2.setMarginStart(jhl.c(jhd.this.f, ((jhd.this.k + 1) * 73) + 6));
                } else {
                    layoutParams2.setMarginStart(jhl.c(jhd.this.f, (jhd.this.k * 73) + 6));
                }
                jhd.this.g.setLayoutParams(layoutParams2);
                jhd.this.g.setText(jhd.this.f.getResources().getString(R.string.IDS_album_select_dialog_prompt, Integer.valueOf(jhd.this.k), 3));
            }
            ArrayList arrayList = (ArrayList) jhd.this.w.get(Integer.valueOf(jhd.this.m));
            List list = (List) jhd.this.r.get(Integer.valueOf(jhd.this.m));
            if (njy.e(arrayList, i) || njy.e(list, i)) {
                LogUtil.d("AlbumDialog", "onPhotoDelete out of bounds");
                return;
            }
            arrayList.remove(i);
            list.remove(i);
            if (jhd.this.k == 0) {
                jhd.this.w.remove(Integer.valueOf(jhd.this.m));
                jhd.this.r.remove(Integer.valueOf(jhd.this.m));
                jhd.this.u.clearMarker(jhd.this.m);
                jhd.this.u.clearCurMarker(jhd.this.f38612a);
                if (jhd.this.x.containsKey(Integer.valueOf(jhd.this.m))) {
                    jhd.this.u.addMarker(jhd.this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
                    jhd jhdVar = jhd.this;
                    jhdVar.f38612a = jhdVar.u.addCurMarker(jhd.this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
                }
            }
            jhd.this.aq.setIndexOfPhoto(jhd.this.w, jhd.this.m);
            jhd.this.u.addPhotosList(jhd.this.r);
            jhd.this.u.setPhotosNumber(jhd.this.ap);
            jhd.this.am();
        }
    };
    private OnGridViewListener d = new OnGridViewListener() { // from class: jhd.7
        @Override // com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.OnGridViewListener
        public void onPhotoOrVideoDelete(int i) {
            jhd.this.ao--;
            jhd.this.n--;
            ViewGroup.LayoutParams layoutParams = jhd.this.g.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (jhd.this.n != 1) {
                    layoutParams2.setMarginStart(jhl.c(jhd.this.f, ((jhd.this.n + 1) * 73) + 6));
                } else {
                    layoutParams2.setMarginStart(jhl.c(jhd.this.f, (jhd.this.n * 73) + 6));
                }
                jhd.this.g.setLayoutParams(layoutParams2);
                jhd.this.g.setText(jhd.this.f.getResources().getString(R.string.IDS_album_select_dialog_prompt, Integer.valueOf(jhd.this.k), 1));
            }
            ArrayList arrayList = (ArrayList) jhd.this.y.get(Integer.valueOf(jhd.this.m));
            if (njy.e(arrayList, i)) {
                LogUtil.d("AlbumDialog", "onVideoDelete out of bounds");
                return;
            }
            arrayList.remove(i);
            if (jhd.this.n <= 0) {
                jhd.this.y.remove(Integer.valueOf(jhd.this.m));
                jhd.this.u.clearMarker(jhd.this.m);
                jhd.this.u.clearCurMarker(jhd.this.f38612a);
                if (jhd.this.x.containsKey(Integer.valueOf(jhd.this.m))) {
                    jhd.this.u.addMarker(jhd.this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
                    jhd jhdVar = jhd.this;
                    jhdVar.f38612a = jhdVar.u.addCurMarker(jhd.this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
                }
            }
            jhd.this.aq.setIndexOfVideo(jhd.this.y, jhd.this.m);
            LogUtil.a("AlbumDialog", " onPhotoOrVideoDelete  setIndexOfVideo");
            jhd.this.u.addVideoPath(jhd.this.y);
            jhd.this.u.setVideoNumber(jhd.this.ap);
            jhd.this.am();
        }
    };

    public jhd(Context context, InterfaceReTrack interfaceReTrack) {
        this.ai = null;
        this.u = null;
        this.aj = null;
        this.f = context;
        this.ai = interfaceReTrack;
        InterfaceUpdateReTrack interfaceUpdateReTrackObtainInterfaceUpdateReTrack = interfaceReTrack.obtainInterfaceUpdateReTrack();
        this.u = interfaceUpdateReTrackObtainInterfaceUpdateReTrack;
        this.aj = interfaceUpdateReTrackObtainInterfaceUpdateReTrack.obtainSimlify();
        this.ak = this.u.getTrackNumber();
        this.au = jpq.b(this.aj.getValidTotalDistance());
    }

    public void b(View view) {
        this.f38614c = view;
        this.ax = (LinearLayout) view.findViewById(R.id.track_album_mark_layout);
        this.bc = (LinearLayout) this.f38614c.findViewById(R.id.track_album_triangle);
        this.ah = (RelativeLayout) this.f38614c.findViewById(R.id.retrack_album_londing_rl);
        this.at = (ImageView) this.f38614c.findViewById(R.id.trackalbum_white_triangle_image);
        this.aw = (HealthSwitchButton) this.f38614c.findViewById(R.id.switch_btn);
        m();
    }

    private void ah() {
        this.u.resetDismiss();
        this.u.deleteMoveMarker();
    }

    public void a(boolean z) {
        this.ab = z;
        r();
    }

    public void h() {
        this.u.resetShow();
        this.u.clearCurMarker(this.f38612a);
        this.f38612a = -1;
        if (this.w.containsKey(Integer.valueOf(this.m))) {
            this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Image_type);
        } else if (this.y.containsKey(Integer.valueOf(this.m))) {
            this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Video_type);
        } else if (this.x.containsKey(Integer.valueOf(this.m))) {
            this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
        } else {
            LogUtil.a("AlbumDialog", "No new edits");
        }
        if (this.w.containsKey(Integer.valueOf(this.m))) {
            this.k = this.w.get(Integer.valueOf(this.m)).size();
        } else {
            this.k = 0;
        }
        if (this.y.containsKey(Integer.valueOf(this.m))) {
            this.n = this.y.get(Integer.valueOf(this.m)).size();
        } else {
            this.n = 0;
        }
        ae();
        ag();
        am();
        this.u.addMoveMarker(this.m);
        this.u.updateTrack(0, this.m);
    }

    private void m() {
        l();
        y();
        p();
        t();
        r();
        q();
        s();
        w();
        c(true);
        d((List<PhotoModel>) null);
    }

    private void s() {
        View view = this.f38614c;
        if (view == null) {
            LogUtil.d("AlbumDialog", "initShareSwitchLayout mAlbumDialogView == null");
            return;
        }
        ((LinearLayout) view.findViewById(R.id.share_name_open)).setVisibility(8);
        HealthScrollView healthScrollView = (HealthScrollView) this.f38614c.findViewById(R.id.album_scrollview);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) healthScrollView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -1;
        layoutParams.topMargin = jhl.c(this.f, 90.0f);
        healthScrollView.setLayoutParams(layoutParams);
        this.j = (HealthCardView) this.f38614c.findViewById(R.id.state_layout);
    }

    private void w() {
        this.aw.setChecked(((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).isShowUserInfo());
    }

    private void c(boolean z) {
        if (qqs.e(this.f)) {
            if (z) {
                this.l.setImageDrawable(qqf.c(this.f.getResources().getDrawable(R.drawable.trackalbum_ic_emoji), this.f.getResources().getColor(R.color.healthTintColorPrimaryDark)));
            } else {
                this.l.setImageDrawable(qqf.c(this.f.getResources().getDrawable(R.drawable.trackalbum_ic_keyboard), this.f.getResources().getColor(R.color.healthTintColorPrimaryDark)));
            }
            this.at.setBackground(this.f.getResources().getDrawable(R.drawable.trackalbum_ic_white_triangle_night));
            this.o.setBackground(this.f.getResources().getDrawable(R.drawable.track_bg_edittext_night));
            this.aq.setBackgroundColor(this.f.getResources().getColor(R.color.colorCardPanelBg));
            this.bc.setBackgroundColor(this.f.getResources().getColor(R.color.colorCardPanelBg));
            this.ax.setBackgroundColor(this.f.getResources().getColor(R.color.colorCardPanelBg));
            HealthCardView healthCardView = this.j;
            if (healthCardView != null) {
                healthCardView.setCardBackgroundColor(this.f.getResources().getColor(R.color.colorCardPanelBg));
            }
            LogUtil.a("AlbumDialog", "setDarkLayout night", Boolean.valueOf(qrs.x(this.f)));
            return;
        }
        if (z) {
            this.l.setImageDrawable(this.f.getResources().getDrawable(R.drawable.trackalbum_ic_emoji));
        } else {
            this.l.setImageDrawable(this.f.getResources().getDrawable(R.drawable.trackalbum_ic_keyboard));
        }
        this.at.setBackground(this.f.getResources().getDrawable(R.drawable.trackalbum_ic_white_triangle));
        this.o.setBackground(this.f.getResources().getDrawable(R.drawable.track_bg_edittext));
        this.aq.setBackgroundColor(this.f.getResources().getColor(R.color.colorSubBackground));
        this.bc.setBackgroundColor(this.f.getResources().getColor(R.color.colorSubBackground));
        this.ax.setBackgroundColor(this.f.getResources().getColor(R.color.colorSubBackground));
        LogUtil.a("AlbumDialog", "setDarkLayout", Boolean.valueOf(qrs.x(this.f)));
    }

    private void l() {
        this.i = (HealthTextView) this.f38614c.findViewById(R.id.clear_all);
    }

    private void y() {
        this.aq = (SlideBar) this.f38614c.findViewById(R.id.slide_bar);
        if (LanguageUtil.ba(this.f)) {
            this.aq.setRotationY(180.0f);
        }
        this.aq.setNumberPoints(this.ak);
        this.aq.setTrackSimplify(this.aj);
        this.aq.e();
        this.aq.c();
        this.aq.invalidate();
    }

    private void p() {
        this.o = (AlbumEditText) this.f38614c.findViewById(R.id.edittext);
        HealthTextView healthTextView = (HealthTextView) this.f38614c.findViewById(R.id.current_distance);
        this.am = healthTextView;
        healthTextView.setText("0.00/" + this.au + jho.d(this.f));
        HealthTextView healthTextView2 = (HealthTextView) this.f38614c.findViewById(R.id.information_split);
        this.ar = healthTextView2;
        healthTextView2.setText(" - ");
        this.ar.setVisibility(8);
        HealthTextView healthTextView3 = (HealthTextView) this.f38614c.findViewById(R.id.max_information);
        this.as = healthTextView3;
        healthTextView3.setText(this.aq.getWonderfulText());
        c(this.aq.getWonderfulText());
        this.al = (HealthTextView) this.f38614c.findViewById(R.id.photo_limit);
        HealthTextView healthTextView4 = (HealthTextView) this.f38614c.findViewById(R.id.thinking_limit);
        this.av = healthTextView4;
        healthTextView4.setText(this.f.getResources().getString(R.string.IDS_album_select_dialog_thought, 0, 30));
    }

    private void c(String str) {
        this.ar.setVisibility(8);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith(Constants.LINK) || str.startsWith(" -")) {
            if (str.startsWith(Constants.LINK)) {
                this.ar.setText(" ");
                this.ar.setVisibility(0);
                return;
            }
            return;
        }
        this.ar.setVisibility(0);
    }

    private void t() {
        this.s = (HealthGridView) this.f38614c.findViewById(R.id.gridView_photo);
        HealthTextView healthTextView = (HealthTextView) this.f38614c.findViewById(R.id.choose_number);
        this.g = healthTextView;
        healthTextView.getLayoutParams();
        c(R.string.IDS_album_select_dialog_prompt);
        if (this.ab) {
            this.g.setVisibility(8);
            this.az = new ArrayList<>();
        } else {
            this.g.setVisibility(0);
        }
        this.an = new ArrayList<>();
    }

    private void r() {
        HealthTextView healthTextView = this.g;
        if (healthTextView == null || this.al == null) {
            LogUtil.d("AlbumDialog", "initPremiumEditionView: view is null");
            return;
        }
        if (this.ab) {
            healthTextView.setVisibility(8);
            this.az = new ArrayList<>();
        } else {
            healthTextView.setVisibility(0);
        }
        if (this.ab) {
            this.al.setText(this.f.getResources().getString(R.string.IDS_album_select_picture_or_video));
        } else {
            this.al.setText(this.f.getResources().getString(R.string.IDS_album_select_picture));
        }
    }

    private void c(int i) {
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(jhl.c(this.f, 79.0f));
            this.g.setLayoutParams(layoutParams2);
            this.g.setText(this.f.getResources().getString(i, Integer.valueOf(this.k), 3));
        }
    }

    private void q() {
        Drawable drawable;
        this.t = (LinearLayout) this.f38614c.findViewById(R.id.grip_view_expression_layout);
        this.l = (ImageButton) this.f38614c.findViewById(R.id.add_emoji);
        HealthGridView healthGridView = (HealthGridView) this.f38614c.findViewById(R.id.grip_view_expression);
        this.p = healthGridView;
        healthGridView.setAdapter((ListAdapter) new GridViewEmotionAdapter(this.f, this.af));
        ImageView imageView = (ImageView) this.f38614c.findViewById(R.id.track_expression_delete_image);
        if (qrs.x(this.f)) {
            drawable = qqf.c(this.f.getResources().getDrawable(R.drawable.retrack_album_expression_delete), this.f.getResources().getColor(R.color.healthTintColorPrimaryDark));
        } else {
            drawable = this.f.getResources().getDrawable(R.drawable.retrack_album_expression_delete);
        }
        imageView.setImageDrawable(drawable);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            float dimension = this.f.getResources().getDimension(R.dimen.hw_double_phone_margin_top8);
            layoutParams2.width = (int) (((qrs.q() - dimension) - dimension) / 7.0f);
            layoutParams2.rightMargin = (int) dimension;
            imageView.setLayoutParams(layoutParams2);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: jhd.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KeyEvent keyEvent = new KeyEvent(0, 67);
                KeyEvent keyEvent2 = new KeyEvent(1, 67);
                jhd.this.o.onKeyDown(67, keyEvent);
                jhd.this.o.onKeyUp(67, keyEvent2);
            }
        });
    }

    public void i() {
        v();
        ab();
        ad();
        aa();
        x();
        z();
    }

    private void z() {
        this.aw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview.AlbumDialog$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f10744b.d(compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        LogUtil.a("AlbumDialog", "onListenUserInfo isChecked", Boolean.valueOf(z));
        if (z) {
            ai();
            ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).setIsShowUserInfo(true);
        } else {
            ak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 131;
        this.ae.sendMessage(messageObtain);
    }

    public void b(Handler handler) {
        this.ae = handler;
    }

    public void e(Message message) {
        if (message == null) {
            return;
        }
        a(message);
    }

    private void a(Message message) {
        int i = message.what;
        if (i == 517) {
            if (message.obj instanceof String) {
                this.av.setText((String) message.obj);
                return;
            }
            return;
        }
        if (i != 528) {
            switch (i) {
                case 513:
                    if (jgx.e(message.obj, Integer.class, String.class)) {
                        Pair pair = (Pair) message.obj;
                        this.av.setText(this.f.getResources().getString(R.string.IDS_album_select_dialog_thought, pair.first, 30));
                        this.o.setText((CharSequence) pair.second);
                    }
                    break;
                case d.a.d /* 514 */:
                    if (message.obj instanceof String) {
                        this.am.setText(jho.e((String) message.obj, this.aj.getValidTotalDistance()) + "/" + this.au + jho.d(this.f));
                    }
                    break;
                case 515:
                    if (message.obj instanceof String) {
                        String str = (String) message.obj;
                        this.as.setText(str);
                        c(str);
                        b(str);
                    }
                    break;
                default:
                    switch (i) {
                        case 519:
                            d(message);
                            break;
                        case 520:
                            this.ah.setVisibility(8);
                            break;
                        case 521:
                            this.ah.setVisibility(8);
                            qpx.e(this.f, R.string.IDS_hw_health_music_load_fail_retry);
                            break;
                    }
                    break;
            }
            return;
        }
        b(message);
    }

    private void b(String str) {
        if (TextUtils.equals(str, this.z)) {
            return;
        }
        jhh.a(this.f, this.aj.getSportType(), this.v, 5, str);
        this.z = str;
    }

    private void b(Message message) {
        if (jgx.e(message.obj, VideoModel.class)) {
            a((ArrayList<VideoModel>) message.obj);
        }
    }

    private void d(Message message) {
        this.ah.setVisibility(8);
        if (jgx.e(message.obj, PhotoModel.class)) {
            b((ArrayList<PhotoModel>) message.obj);
        }
        LogUtil.a("AlbumDialog", "AddPhotoIndex0:", String.valueOf(this.m));
    }

    private void a(ArrayList<VideoModel> arrayList) {
        if (arrayList == null) {
            return;
        }
        this.u.clearCurMarker(this.f38612a);
        this.f38612a = -1;
        this.ao = (this.ao - this.n) + arrayList.size();
        this.n = arrayList.size();
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (this.n == 1) {
                layoutParams2.setMarginStart(jhl.c(this.f, (this.k * 73) + 6));
            } else {
                layoutParams2.setMarginStart(jhl.c(this.f, ((this.k + 1) * 73) + 6));
            }
            this.g.setLayoutParams(layoutParams2);
            this.g.setText(this.f.getResources().getString(R.string.IDS_album_select_dialog_prompt, Integer.valueOf(this.k), 1));
        }
        if (arrayList.size() > 0) {
            this.u.addMarker(this.m, InterfaceUpdateReTrack.MarkerType.Video_type);
            this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Video_type);
            this.y.put(Integer.valueOf(this.m), arrayList);
        } else {
            this.y.remove(Integer.valueOf(this.m));
            this.u.clearMarker(this.m);
            this.u.clearCurMarker(this.f38612a);
            if (this.x.containsKey(Integer.valueOf(this.m))) {
                LogUtil.a("AlbumDialog", "[changeCurrentVideo] mIndexOfTexts contains key currentPointIndex.");
                this.u.addMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
                this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
            }
        }
        c(arrayList);
        this.u.addVideoPath(this.y);
        am();
        this.aq.setIndexOfVideo(this.y, this.m);
        this.u.setVideoNumber(this.ao);
    }

    private void c(List<VideoModel> list) {
        ArrayList<VideoModel> arrayList = new ArrayList<>();
        d(list, arrayList);
        arrayList.add(null);
        if (arrayList.equals(this.az)) {
            return;
        }
        if (!njy.c(this.an, 0) || this.an.get(0) == null) {
            this.az = arrayList;
            VideoViewAdapter videoViewAdapter = new VideoViewAdapter(this.f, this.az);
            this.ba = videoViewAdapter;
            videoViewAdapter.a(this.d);
            this.s.setAdapter((ListAdapter) this.ba);
        }
    }

    private void d(List<VideoModel> list, ArrayList<VideoModel> arrayList) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                arrayList.add(list.get(i));
            }
        }
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        jhn jhnVar = new jhn();
        jhnVar.d(this.ap);
        jhnVar.b(this.ao);
        String string = this.o.getText().toString();
        jhnVar.e((string == null || string.isEmpty()) ? false : true);
        iBaseResponseCallback.a(1, jhnVar);
        if (d()) {
            b();
        }
        if (this.aa) {
            e(this.o);
        }
        ah();
    }

    private void v() {
        this.aq.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() { // from class: jhd.9
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                int currentPointIndex = jhd.this.aq.getCurrentPointIndex();
                Message messageObtain = Message.obtain();
                messageObtain.what = d.a.d;
                messageObtain.obj = jpq.b(Math.abs(jhd.this.ai.getCurrentDistance(currentPointIndex)));
                jhd.this.ae.sendMessage(messageObtain);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 515;
                messageObtain2.obj = jhd.this.aq.getWonderfulText();
                jhd.this.ae.sendMessage(messageObtain2);
                if (currentPointIndex != jhd.this.m) {
                    jhd.this.u.updateTrack(jhd.this.m, currentPointIndex);
                    jhd.this.m = currentPointIndex;
                    jhd.this.u.clearCurMarker(jhd.this.f38612a);
                    jhd.this.u.moveMarkerToCurrent(jhd.this.m);
                    jhd.this.f38612a = -1;
                    if (jhd.this.w.containsKey(Integer.valueOf(jhd.this.m))) {
                        jhd jhdVar = jhd.this;
                        jhdVar.k = ((ArrayList) jhdVar.w.get(Integer.valueOf(jhd.this.m))).size();
                    } else {
                        jhd.this.k = 0;
                    }
                    if (jhd.this.y.containsKey(Integer.valueOf(jhd.this.m))) {
                        jhd jhdVar2 = jhd.this;
                        jhdVar2.n = ((ArrayList) jhdVar2.y.get(Integer.valueOf(jhd.this.m))).size();
                    } else {
                        jhd.this.n = 0;
                    }
                    jhd.this.ae();
                    jhd.this.ag();
                    jhd.this.af();
                    jhh.a(jhd.this.f, jhd.this.aj.getSportType(), jhd.this.v, 4, "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i = this.n;
            if (i == 1) {
                layoutParams2.setMarginStart(jhl.c(this.f, (i * 73) + 6));
            } else {
                layoutParams2.setMarginStart(jhl.c(this.f, ((i + 1) * 73) + 6));
            }
            this.g.setLayoutParams(layoutParams2);
            this.g.setText(this.f.getResources().getString(R.string.IDS_album_select_dialog_prompt, Integer.valueOf(this.k), 1));
        }
        if (this.y.containsKey(Integer.valueOf(this.m))) {
            ArrayList<VideoModel> arrayList = this.y.get(Integer.valueOf(this.m));
            if (arrayList == null) {
                LogUtil.d("AlbumDialog", "tempVideoList  is null");
                c((List<VideoModel>) null);
                return;
            }
            c(arrayList);
            if (arrayList.size() <= 0 || this.f38612a != -1) {
                return;
            }
            this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Video_type);
            return;
        }
        c((List<VideoModel>) null);
    }

    private void ab() {
        this.o.addTextChangedListener(new TextWatcher() { // from class: jhd.12
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (jhd.this.o.getText().length() == 0) {
                    jhd.this.av.setText(jhd.this.f.getResources().getString(R.string.IDS_album_select_dialog_thought, 0, 30));
                } else {
                    jhd.this.av.setText(jhd.this.f.getResources().getString(R.string.IDS_album_select_dialog_thought, Integer.valueOf(jhd.this.o.getText().length()), 30));
                }
                jhd.this.f();
                jhd.this.am();
            }
        });
        this.o.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: jhd.15
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!jhd.this.ad) {
                    if (!jhd.this.d() || !jhd.this.aa) {
                        return true;
                    }
                    jhd.this.b();
                    return false;
                }
                if (jhd.this.aa) {
                    return true;
                }
                jhd.this.an();
                jhd.this.ad = false;
                return false;
            }
        });
        n();
    }

    private void n() {
        this.o.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: jhd.11
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() != 66 || !(textView.getContext().getSystemService("input_method") instanceof InputMethodManager)) {
                    return false;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) textView.getContext().getSystemService("input_method");
                if (!inputMethodManager.isActive()) {
                    return true;
                }
                inputMethodManager.hideSoftInputFromWindow(textView.getApplicationWindowToken(), 0);
                return true;
            }
        });
    }

    private void ad() {
        this.s.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: jhd.13
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (jhd.this.az != null && jhd.this.az.size() > 1) {
                    LogUtil.a("AlbumDialog", "add is video");
                    return;
                }
                if ((i != jhd.this.an.size() - 1 || i >= 3) && !(i == 0 && jhd.this.an.size() == 0)) {
                    return;
                }
                if (qrs.e(view)) {
                    LogUtil.a("AlbumDialog", "click too fast");
                } else {
                    jhd.this.j();
                }
            }
        });
    }

    private void aa() {
        this.l.setOnClickListener(new View.OnClickListener() { // from class: jhd.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jhd.this.ac();
                jhh.a(jhd.this.f, jhd.this.aj.getSportType(), jhd.this.v, 3, "");
            }
        });
        this.p.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: jhd.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (adapterView.getAdapter().getItem(i) instanceof jhg) {
                    jhg jhgVar = (jhg) adapterView.getAdapter().getItem(i);
                    if (jhgVar == null) {
                        LogUtil.c("AlbumDialog", "onItemClick note is null.");
                        return;
                    }
                    int selectionStart = jhd.this.o.getSelectionStart();
                    SpannableString spannableStringE = jhj.e(jhd.this.f, jhgVar.b(), (int) jhd.this.o.getTextSize());
                    if (jhd.this.o.getText().length() + spannableStringE.length() > 30) {
                        return;
                    }
                    jhd.this.o.getText().insert(selectionStart, spannableStringE);
                }
            }
        });
    }

    private void x() {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: jhd.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jhd.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.ap -= this.k;
        this.k = 0;
        d((List<PhotoModel>) null);
        c((List<VideoModel>) null);
        this.w.remove(Integer.valueOf(this.m));
        this.r.remove(Integer.valueOf(this.m));
        this.y.remove(Integer.valueOf(this.m));
        this.aq.setIndexOfPhoto(this.w, this.m);
        this.aq.setIndexOfVideo(this.y, this.m);
        this.u.addPhotosList(this.r);
        this.u.addVideoPath(this.y);
        this.u.setPhotosNumber(this.ap);
        this.u.setVideoNumber(this.ao);
        LogUtil.a("AlbumDialog", "[clearCurrentAll] mSumPhotosNumber:", String.valueOf(this.ap), " mSumVideoNumber :", String.valueOf(this.ao));
        this.av.setText(this.f.getResources().getString(R.string.IDS_album_select_dialog_thought, 0, 30));
        if (this.ab) {
            this.al.setText(this.f.getResources().getString(R.string.IDS_album_select_picture_or_video));
        } else {
            this.al.setText(this.f.getResources().getString(R.string.IDS_album_select_picture));
        }
        c(R.string.IDS_album_select_dialog_prompt);
        this.o.setText("");
    }

    private void d(List<PhotoModel> list) {
        ArrayList<PhotoModel> arrayList = new ArrayList<>();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != null) {
                    arrayList.add(list.get(i));
                }
            }
        }
        arrayList.add(null);
        if (arrayList.equals(this.an)) {
            return;
        }
        if (!njy.c(this.az, 0) || this.az.get(0) == null) {
            this.an = arrayList;
            GridViewBaseAdapter gridViewBaseAdapter = new GridViewBaseAdapter(this.f, this.an);
            this.q = gridViewBaseAdapter;
            gridViewBaseAdapter.a(this.f38613b);
            this.s.setAdapter((ListAdapter) this.q);
        }
    }

    private void a(final List<PhotoModel> list) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: jhd.3
            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                for (int i = 0; i < list.size(); i++) {
                    PhotoModel photoModel = (PhotoModel) list.get(i);
                    if (photoModel != null && !jhd.this.ac.containsKey(photoModel)) {
                        Matrix matrix = new Matrix();
                        Bitmap bitmapCreateBitmap = null;
                        try {
                            Bitmap bitmapA = jhk.a(jhd.this.f, (PhotoModel) list.get(i));
                            if (bitmapA == null) {
                                return;
                            }
                            matrix.postRotate(jhk.a(new ExifInterface(photoModel.getPath())));
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                            if (bitmapA != bitmapCreateBitmap) {
                                bitmapA.recycle();
                            }
                        } catch (IOException e) {
                            LogUtil.c("AlbumDialog", LogAnonymous.b(e));
                        }
                        if (bitmapCreateBitmap != null) {
                            jhd.this.ac.put(photoModel, bitmapCreateBitmap);
                        } else {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    jhd.this.b((List<PhotoModel>) list);
                } else {
                    jhd.this.u();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.ae.sendEmptyMessageDelayed(521, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<PhotoModel> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.ac.get(list.get(i)));
        }
        if (arrayList.size() == 0) {
            this.r.remove(Integer.valueOf(this.m));
        } else {
            this.r.put(Integer.valueOf(this.m), arrayList);
        }
        this.u.addPhotosList(this.r);
        this.ae.sendEmptyMessageDelayed(520, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        String string;
        if (this.ab) {
            this.ag = 30;
        } else {
            this.ag = 9;
        }
        int i = this.k;
        if (i == 3 || this.ap >= this.ag) {
            if (i == 3) {
                string = this.f.getResources().getString(R.string.IDS_3_photos_full, 3);
            } else {
                string = this.f.getResources().getString(R.string.IDS_9_sum_photos_full, Integer.valueOf(this.ag));
            }
            Toast.makeText(this.f, string, 0).show();
            return;
        }
        o();
    }

    private void o() {
        PermissionUtil.d(this.f, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.f) { // from class: jhd.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                Intent intent;
                LogUtil.a("AlbumDialog", "[enterImageSelectAct] enter mSumPhotosNumber:", String.valueOf(jhd.this.ap));
                if (jhd.this.ab) {
                    intent = new Intent(jhd.this.f, (Class<?>) PhotoAndVideoSelectActivity.class);
                } else {
                    intent = new Intent(jhd.this.f, (Class<?>) PhotoSelectActivity.class);
                }
                intent.putExtra("key_data_max_photo_count", jhd.this.ab ? 30 : 9);
                intent.putExtra("total_selected_image_num_key", jhd.this.ap);
                intent.putParcelableArrayListExtra("selected_image_path_key", jhd.this.k());
                intent.putExtra("sport_type", jhd.this.aj.getSportType());
                intent.putExtra("trackType", jhd.this.v);
                if (jhd.this.f instanceof Activity) {
                    ((Activity) jhd.this.f).startActivityForResult(intent, 5);
                }
                jhh.a(jhd.this.f, jhd.this.aj.getSportType(), jhd.this.v, 1, "");
                LogUtil.a("AlbumDialog", "[enterImageSelectAct] end mSumPhotosNumber:", String.valueOf(jhd.this.ap));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<PhotoModel> k() {
        if (this.w.containsKey(Integer.valueOf(this.m))) {
            return this.w.get(Integer.valueOf(this.m));
        }
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i = this.k;
            if (i == 3) {
                layoutParams2.setMarginStart(jhl.c(this.f, (i * 73) + 6));
            } else {
                layoutParams2.setMarginStart(jhl.c(this.f, ((i + 1) * 73) + 6));
            }
            this.g.setLayoutParams(layoutParams2);
            this.g.setText(this.f.getResources().getString(R.string.IDS_album_select_dialog_prompt, Integer.valueOf(this.k), 3));
        }
        if (this.w.containsKey(Integer.valueOf(this.m))) {
            ArrayList<PhotoModel> arrayList = this.w.get(Integer.valueOf(this.m));
            if (arrayList == null) {
                d((List<PhotoModel>) null);
                return;
            }
            d(arrayList);
            if (arrayList.size() <= 0 || this.f38612a != -1) {
                return;
            }
            this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Image_type);
            return;
        }
        d((List<PhotoModel>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        if (this.x.containsKey(Integer.valueOf(this.m))) {
            String str = this.x.get(Integer.valueOf(this.m));
            if (str == null) {
                this.o.setText("");
                return;
            }
            this.o.setText(jhj.e(this.f, str, (int) this.o.getTextSize()));
            this.o.setSelection(str.length());
            if (this.f38612a == -1) {
                this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
                return;
            }
            return;
        }
        this.o.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (d()) {
            c(this.o);
        } else {
            if (this.aa) {
                this.ad = true;
                an();
                e(this.o);
                return;
            }
            an();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String string = this.o.getText().toString().length() == 0 ? null : this.o.getText().toString();
        if (string == null) {
            this.x.remove(Integer.valueOf(this.m));
        } else {
            this.x.put(Integer.valueOf(this.m), string);
        }
        if (!this.x.containsKey(Integer.valueOf(this.m)) && !this.w.containsKey(Integer.valueOf(this.m)) && !this.y.containsKey(Integer.valueOf(this.m))) {
            this.u.clearMarker(this.m);
            this.u.clearCurMarker(this.f38612a);
            this.f38612a = -1;
        } else if (!this.w.containsKey(Integer.valueOf(this.m)) || !this.y.containsKey(Integer.valueOf(this.m))) {
            this.u.addMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
            if (this.f38612a == -1) {
                this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
            }
        } else {
            LogUtil.a("AlbumDialog", "No need to add icons");
        }
        this.aq.setIndexOfText(this.x);
        this.u.addText(this.m, string);
    }

    private void b(ArrayList<PhotoModel> arrayList) {
        LogUtil.a("AlbumDialog", "[changeCurrentPhoto] enter mSumPhotosNumber:", Integer.valueOf(this.ap), " mCurPhotosNumber: ", Integer.valueOf(this.k), " selectPhotoList is Size: ", Integer.valueOf(arrayList.size()));
        this.u.clearCurMarker(this.f38612a);
        this.f38612a = -1;
        this.ap = (this.ap - this.k) + arrayList.size();
        this.k = arrayList.size();
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i = this.k;
            if (i == 3) {
                layoutParams2.setMarginStart(jhl.c(this.f, (i * 73) + 6));
            } else {
                layoutParams2.setMarginStart(jhl.c(this.f, ((i + 1) * 73) + 6));
            }
            this.g.setLayoutParams(layoutParams2);
            this.g.setText(this.f.getResources().getString(R.string.IDS_album_select_dialog_prompt, Integer.valueOf(this.k), 3));
        }
        if (arrayList.size() > 0) {
            this.u.addMarker(this.m, InterfaceUpdateReTrack.MarkerType.Image_type);
            this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Image_type);
            this.w.put(Integer.valueOf(this.m), arrayList);
        } else {
            this.w.remove(Integer.valueOf(this.m));
            this.u.clearMarker(this.m);
            this.u.clearCurMarker(this.f38612a);
            if (this.x.containsKey(Integer.valueOf(this.m))) {
                LogUtil.a("AlbumDialog", "[changeCurrentPhoto] mIndexOfTexts contains key currentPointIndex.");
                this.u.addMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
                this.f38612a = this.u.addCurMarker(this.m, InterfaceUpdateReTrack.MarkerType.Text_type);
            }
        }
        d(arrayList);
        a(arrayList);
        am();
        this.aq.setIndexOfPhoto(this.w, this.m);
        this.u.setPhotosNumber(this.ap);
        LogUtil.a("AlbumDialog", "[changeCurrentPhoto] end mSumPhotosNumber:", String.valueOf(this.ap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        if (this.w.containsKey(Integer.valueOf(this.m)) || this.x.containsKey(Integer.valueOf(this.m)) || this.y.containsKey(Integer.valueOf(this.m))) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
    }

    public void d(boolean z) {
        this.aa = z;
    }

    public boolean d() {
        LinearLayout linearLayout = this.t;
        return linearLayout != null && linearLayout.getVisibility() == 0;
    }

    public boolean e() {
        return this.aa;
    }

    private void c(View view) {
        view.requestFocus();
        if (this.f.getSystemService("input_method") instanceof InputMethodManager) {
            ((InputMethodManager) this.f.getSystemService("input_method")).showSoftInput(view, 0);
            c(true);
        }
    }

    private void e(View view) {
        if (this.f.getSystemService("input_method") instanceof InputMethodManager) {
            ((InputMethodManager) this.f.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            c(true);
        }
    }

    public void c() {
        AlbumEditText albumEditText = this.o;
        if (albumEditText != null) {
            e(albumEditText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        this.t.setVisibility(0);
        c(false);
    }

    public void b() {
        this.t.setVisibility(8);
        c(true);
    }

    public boolean a() {
        return (this.x.size() == 0 && this.e.equals(this.w) && this.y.size() == 0) ? false : true;
    }

    public void c(Map<Integer, ArrayList<PhotoModel>> map, Map<PhotoModel, Bitmap> map2, HashMap<Integer, List<Bitmap>> map3) {
        if (map == null || map2 == null || map3 == null) {
            LogUtil.a("AlbumDialog", "No self-matching photos");
            return;
        }
        this.w = map;
        int size = 0;
        for (Map.Entry<Integer, ArrayList<PhotoModel>> entry : map.entrySet()) {
            if (jgx.e(entry.getValue(), PhotoModel.class)) {
                this.w.put(entry.getKey(), entry.getValue());
                size += entry.getValue().size();
                SlideBar slideBar = this.aq;
                if (slideBar != null) {
                    slideBar.setAutoMatchPhoto(entry.getKey().intValue(), this.w);
                }
            }
        }
        this.e.putAll(map);
        for (Map.Entry<Integer, List<Bitmap>> entry2 : map3.entrySet()) {
            this.r.put(entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<PhotoModel, Bitmap> entry3 : map2.entrySet()) {
            this.ac.put(entry3.getKey(), entry3.getValue());
        }
        SlideBar slideBar2 = this.aq;
        if (slideBar2 != null) {
            slideBar2.postInvalidate();
        }
        this.ap = size;
        this.ai.setSumPhotosNumber(size);
        this.ai.updateTrackAnimationControl();
    }

    public void e(int i) {
        SlideBar slideBar = this.aq;
        if (slideBar != null) {
            slideBar.d(i);
        }
    }

    public void b(boolean z) {
        this.v = z;
    }

    private void ak() {
        if (this.h == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f).a(R.string.IDS_share_close_info_title).b(R.string.IDS_share_info_content_now).e(R.string.IDS_motiontrack_show_cancel, new View.OnClickListener() { // from class: jhd.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("AlbumDialog", "showShareTipsDialog cancel");
                    jhd.this.aw.setChecked(true);
                    jhd.this.h.dismiss();
                }
            }).a(R.string.IDS_determine, new View.OnClickListener() { // from class: jhd.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("AlbumDialog", "showShareTipsDialog ok");
                    jhd.this.h.dismiss();
                    ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).setIsShowUserInfo(false);
                    jhd.this.ai();
                }
            }).b();
            this.h = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
        }
        this.h.show();
    }
}
