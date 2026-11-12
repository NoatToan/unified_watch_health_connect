package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.RcmItem;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleEntryContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.SingleHotSeriesRecommendContent;
import com.huawei.health.marketing.datatype.templates.CornerTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFunctionGridContent;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.marketing.utils.EcgFilterManager;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketing.views.holders.OneGridLandscapeHolder;
import com.huawei.health.marketing.views.holders.SingleHotSeriesRecommendHolder;
import com.huawei.health.marketing.views.holders.SquareLandscapeSlideHolder;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.section.section.MeasureCardView;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.CouponResult;
import com.huawei.trade.datatype.Product;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback;
import com.huawei.ui.commonui.utils.ScrollUtil;
import defpackage.fcn;
import defpackage.fww;
import defpackage.fwz;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.fya;
import defpackage.fzj;
import defpackage.gzx;
import defpackage.haa;
import defpackage.ifp;
import defpackage.irz;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsx;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqk;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrg;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ColumnLayoutAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f8219a = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f8220b = 1.4f;
    private static float d = 1.8f;
    private boolean aa;
    private View.OnClickListener ac;
    private List<List<SingleGridContent>> ad;
    private int ae;
    private List<RcmItem> af;
    private ResourceBriefInfo ag;
    private String ah;
    private List<SingleEntryContent> ai;
    private int aj;
    private String ak;
    private List<SingleFunctionGridContent> al;
    private long am;
    private int an;
    private int ar;
    private int h;
    private int i;
    private String j;
    private Context l;
    private e m;
    private List<SingleGridContent> n;
    private String q;
    private int s;
    private LayoutInflater u;
    private List<SingleHotSeriesRecommendContent> g = new ArrayList(10);
    private volatile boolean w = true;
    private volatile boolean y = false;
    private volatile boolean x = false;
    private volatile boolean v = false;
    private volatile boolean ab = true;
    private String f = "";
    private boolean z = false;
    private fzj o = new fzj();
    private Set<SingleGridContent> p = new HashSet();
    private Map<String, SingleGridContent> r = new ConcurrentHashMap();
    private Observer k = new Observer() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.2
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(final String str, final Object... objArr) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.2.5
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLayoutAdapter.this.b(str, objArr);
                }
            }, 1000L);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8221c = true;
    private int t = -1;
    private boolean e = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Object... objArr) {
        if (!"marketing_response_arrived".equals(str)) {
            LogUtil.e("ColumnLayoutAdapter", "label error: ", str);
            return;
        }
        if (objArr == null) {
            LogUtil.e("ColumnLayoutAdapter", "args is null");
            return;
        }
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == -1) {
                ObserverManagerUtil.a(this.k, "marketing_response_arrived");
                LogUtil.a("ColumnLayoutAdapter", "mFunctionMenuObserver is unregistered");
                return;
            }
        }
        if (objArr.length == 5) {
            Object obj2 = objArr[0];
            if ((obj2 instanceof Boolean) && (objArr[1] instanceof Boolean) && (objArr[2] instanceof Boolean) && (objArr[3] instanceof String)) {
                this.w = ((Boolean) obj2).booleanValue();
                this.y = ((Boolean) objArr[1]).booleanValue();
                this.x = ((Boolean) objArr[2]).booleanValue();
                this.f = (String) objArr[3];
                Object obj3 = objArr[4];
                if (obj3 instanceof List) {
                    this.af = (List) obj3;
                }
                LogUtil.a("ColumnLayoutAdapter", "mFunctionMenuObserver: ", Boolean.valueOf(this.w), ", ", Boolean.valueOf(this.y), ", ", Boolean.valueOf(this.x), ", mHasBiEventFunctionMenuMap size: ", Integer.valueOf(this.r.size()));
                if (!this.w || this.y) {
                    if (this.r.isEmpty()) {
                        LogUtil.a("ColumnLayoutAdapter", "mHasBiEventFunctionMenuMap is empty");
                        return;
                    }
                    Iterator<Map.Entry<String, SingleGridContent>> it = this.r.entrySet().iterator();
                    while (it.hasNext()) {
                        SingleGridContent value = it.next().getValue();
                        e(1, value, value.getItemPosition());
                    }
                    this.v = true;
                    ObserverManagerUtil.a(this.k, "marketing_response_arrived");
                    LogUtil.a("ColumnLayoutAdapter", "mFunctionMenuObserver is unregistered");
                    return;
                }
                return;
            }
        }
        LogUtil.e("ColumnLayoutAdapter", "params error");
    }

    public ColumnLayoutAdapter(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        this.aa = false;
        Context applicationContext = context.getApplicationContext();
        this.l = applicationContext;
        this.u = LayoutInflater.from(applicationContext);
        this.ae = i;
        this.h = resourceBriefInfo.getContentType();
        this.ah = resourceBriefInfo.getResourceId();
        this.ak = resourceBriefInfo.getResourceName();
        this.j = resourceBriefInfo.getCategory();
        this.aa = qrs.af(BaseApplication.getActivity());
        this.am = System.currentTimeMillis();
        this.ag = resourceBriefInfo;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void c(boolean z) {
        this.aa = z;
    }

    public void c(List<SingleGridContent> list) {
        this.n = list;
    }

    public void a(String str) {
        this.q = str;
    }

    public void e(List<List<SingleGridContent>> list) {
        this.ad = list;
    }

    public void d(List<SingleEntryContent> list) {
        this.ai = list;
    }

    public void a(List<SingleFunctionGridContent> list) {
        this.al = list;
    }

    public void b(List<SingleHotSeriesRecommendContent> list) {
        this.g = list;
    }

    public void b(View.OnClickListener onClickListener) {
        this.ac = onClickListener;
    }

    public void e(boolean z) {
        this.z = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == 48) {
            viewInflate = this.u.inflate(com.huawei.health.servicesui.R.layout.item_three_grad_full_image, viewGroup, false);
        } else if (i != 113) {
            switch (i) {
                case 6:
                    viewInflate = this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_one_grid_big, viewGroup, false);
                    break;
                case 7:
                case 9:
                    viewInflate = this.u.inflate(com.huawei.health.servicesui.R.layout.item_two_grad_landscape, viewGroup, false);
                    break;
                case 8:
                    viewInflate = this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_one_add_two, viewGroup, false);
                    break;
                default:
                    switch (i) {
                        case 15:
                            viewInflate = this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_grid_small, viewGroup, false);
                            break;
                        case 16:
                            viewInflate = this.u.inflate(com.huawei.health.servicesui.R.layout.item_two_grad_big_landscape, viewGroup, false);
                            break;
                        case 17:
                            viewInflate = this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_grid_two_vertical, viewGroup, false);
                            break;
                        default:
                            switch (i) {
                                case 19:
                                case 20:
                                    return new OneGridLandscapeHolder(this.l, this.u.inflate(com.huawei.health.servicesui.R.layout.item_one_grad_landscape, viewGroup, false), this.ag, this.ae);
                                case 21:
                                    return new SquareLandscapeSlideHolder(this.l, this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_square_landscape_slide, viewGroup, false), this.ag, this.ae);
                                default:
                                    viewInflate = c(viewGroup, i);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            return new SingleHotSeriesRecommendHolder(this.l, this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_hot_series_recommend, viewGroup, false), this.ag, this.ae);
        }
        return new e(viewInflate, i, this.e);
    }

    public int d() {
        return this.t;
    }

    private View c(ViewGroup viewGroup, int i) {
        switch (i) {
            case 10:
            case 23:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_quick_entry, viewGroup, false);
            case 22:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_application_icon, viewGroup, false);
            case 24:
                if (this.e) {
                    return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_image_text_with_blank, viewGroup, false);
                }
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_image_text, viewGroup, false);
            case 35:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_text_link, viewGroup, false);
            case 36:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_app_turn_page, viewGroup, false);
            case 39:
            case 40:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_two_grad_landscape_two, viewGroup, false);
            case 47:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_function_menu, viewGroup, false);
            case 49:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_four_grad_full_image, viewGroup, false);
            case 53:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_grid_small_ecg, viewGroup, false);
            case 59:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_twolines_landscape_slide, viewGroup, false);
            case 76:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_one_carry_three, viewGroup, false);
            case ExerciseSessionRecord.EXERCISE_TYPE_WALKING /* 79 */:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_square_landscape_slide_favorites, viewGroup, false);
            case 80:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_square_landscape_slide_sleep, viewGroup, false);
            case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_series_courses_sleep, viewGroup, false);
            case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_series_courses_sleep, viewGroup, false);
            case 84:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_series_courses_third_part, viewGroup, false);
            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_sleep_yoga, viewGroup, false);
            case GolfCourseInfo.DATA_LENGTH /* 92 */:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_square_landscape_slide_favorites, viewGroup, false);
            case 94:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_vertical_rectangle_slide, viewGroup, false);
            case 96:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_marketing_one_point_eight_grid_slide, viewGroup, false);
            case 107:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_one_grid_list_landscape_slide, viewGroup, false);
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_multi_function, viewGroup, false);
            case 9999:
                return this.u.inflate(com.huawei.health.servicesui.R.layout.measure_card_view_layout_wrapper, viewGroup, false);
            default:
                LogUtil.j("ColumnLayoutAdapter", "onCreateViewHolder default");
                return this.u.inflate(com.huawei.health.servicesui.R.layout.item_two_grad_landscape, viewGroup, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof SingleHotSeriesRecommendHolder) {
            ((SingleHotSeriesRecommendHolder) viewHolder).b(this.g.get(i), i);
            return;
        }
        if (viewHolder instanceof SquareLandscapeSlideHolder) {
            SquareLandscapeSlideHolder squareLandscapeSlideHolder = (SquareLandscapeSlideHolder) viewHolder;
            squareLandscapeSlideHolder.e(this.n, i);
            c(this.n.get(i), squareLandscapeSlideHolder.itemView, i);
        } else if (viewHolder instanceof OneGridLandscapeHolder) {
            OneGridLandscapeHolder oneGridLandscapeHolder = (OneGridLandscapeHolder) viewHolder;
            oneGridLandscapeHolder.a(this.n, i);
            c(this.n.get(i), oneGridLandscapeHolder.itemView, i);
        } else if (viewHolder instanceof e) {
            d((e) viewHolder, i);
        }
    }

    private void d(e eVar, int i) {
        int i2 = this.h;
        if (i2 == 48) {
            eVar.ga.setVisibility(0);
            m(eVar, i);
            return;
        }
        if (i2 != 80) {
            switch (i2) {
                case 6:
                    r(eVar, i);
                    break;
                case 7:
                case 9:
                    ag(eVar, i);
                    break;
                case 8:
                    if (this.aa) {
                        eVar.cw.setVisibility(0);
                        eVar.ci.setVisibility(8);
                        y(eVar, i);
                    } else {
                        eVar.cw.setVisibility(8);
                        eVar.ci.setVisibility(0);
                        m(eVar, i);
                    }
                    break;
                default:
                    switch (i2) {
                        case 15:
                            t(eVar, i);
                            break;
                        case 16:
                            u(eVar, i);
                            break;
                        case 17:
                            y(eVar, i);
                            break;
                        default:
                            switch (i2) {
                                case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                                    ac(eVar, i);
                                    break;
                                case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                                    v(eVar, i);
                                    break;
                                case 84:
                                    ad(eVar, i);
                                    break;
                                case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                                    z(eVar, i);
                                    break;
                                default:
                                    a(eVar, i);
                                    break;
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        ae(eVar, i);
    }

    public int c() {
        return this.aj;
    }

    public int g() {
        return this.ar;
    }

    public void b(int i) {
        this.aj = i;
    }

    public void a(int i) {
        this.ar = i;
    }

    public e e() {
        return this.m;
    }

    private void v(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSleepSeriesCoursesLayout singleGridContent is null.");
            return;
        }
        fya.e(eVar.di, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.dd, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        qqf.b(eVar.de, singleGridContentE.getPicture(), 0, 1, fww.f34656a);
        c(singleGridContentE, eVar.dk, i);
    }

    private void a(e eVar, int i) {
        switch (this.h) {
            case 10:
            case 23:
                x(eVar, i);
                break;
            case 22:
                g(eVar, i);
                break;
            case 24:
                if (this.e) {
                    l(eVar, i);
                } else {
                    n(eVar, i);
                }
                break;
            case 35:
                ai(eVar, i);
                break;
            case 36:
                f(eVar, i);
                break;
            case 39:
            case 40:
                ah(eVar, i);
                break;
            case 47:
                j(eVar, i);
                break;
            case 49:
                i(eVar, i);
                break;
            case 53:
                p(eVar, i);
                break;
            case 59:
                af(eVar, i);
                break;
            case 76:
                q(eVar, i);
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_WALKING /* 79 */:
                ab(eVar, i);
                break;
            case GolfCourseInfo.DATA_LENGTH /* 92 */:
                aa(eVar, i);
                break;
            case 94:
                ak(eVar, i);
                break;
            case 96:
                w(eVar, i);
                break;
            case 107:
                s(eVar, i);
                break;
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                k(eVar, i);
                break;
            case 9999:
                o(eVar, i);
                break;
        }
    }

    private void k(e eVar, int i) {
        SingleFunctionGridContent singleFunctionGridContentH = h(eVar, i);
        if (singleFunctionGridContentH == null) {
            LogUtil.j("ColumnLayoutAdapter", "setQuickEntryLayout content is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.al.size());
        ViewGroup.LayoutParams layoutParams = eVar.ax.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = -2;
        eVar.ax.setLayoutParams(layoutParams);
        String picture = singleFunctionGridContentH.getPicture();
        if (picture == null) {
            return;
        }
        if (picture.endsWith(MetaCreativeType.GIF)) {
            qqf.b(picture, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE), eVar.aw);
        } else {
            qqf.b(eVar.aw, picture, qqf.e, 0, fww.f34656a);
        }
        qsp.b(eVar.av, singleFunctionGridContentH.getTheme());
        qsp.b(eVar.au, singleFunctionGridContentH.getSubTheme());
        c(new SingleGridContent(new SingleGridContent.Builder().setLinkValue(singleFunctionGridContentH.getLinkValue()).setTheme(singleFunctionGridContentH.getTheme())), eVar.ax, i);
    }

    private void d(ViewGroup.LayoutParams layoutParams, int i, Context context) {
        if ((layoutParams instanceof RecyclerView.LayoutParams) && (i < this.n.size() - 1)) {
            ((RecyclerView.LayoutParams) layoutParams).setMarginEnd(context.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.cardMarginMiddle));
        }
    }

    private void q(e eVar, int i) {
        float[] fArr;
        if (njy.e(this.n, i)) {
            return;
        }
        View view = eVar.itemView;
        d(view.getLayoutParams(), i, view.getContext());
        SingleGridContent singleGridContentE = e(eVar, i);
        qqf.e(eVar.br, singleGridContentE.getPicture(), 0, 0, fww.f34656a);
        if (singleGridContentE.isThemeVisibility()) {
            eVar.bp.setText(singleGridContentE.getTheme());
            eVar.bp.setVisibility(0);
        } else {
            eVar.bp.setVisibility(8);
        }
        float fA = fya.a(8.0f);
        if (!LanguageUtil.ba(this.l)) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fA, fA};
        } else {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fA, fA, 0.0f, 0.0f};
        }
        fya.a(eVar.bn, singleGridContentE, fArr);
        e(eVar, singleGridContentE);
        c(singleGridContentE, view, i);
    }

    private void b(e eVar, String str, String str2) {
        eVar.bw.setVisibility(8);
        eVar.bo.setVisibility(8);
        eVar.bq.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) eVar.bq.findViewById(com.huawei.health.servicesui.R.id.price_primary);
        if (healthTextView != null) {
            healthTextView.setTypeface(eVar.ab);
            healthTextView.setText(str);
        }
        HealthTextView healthTextView2 = (HealthTextView) eVar.bq.findViewById(com.huawei.health.servicesui.R.id.price_secondary);
        if (healthTextView2 != null) {
            healthTextView2.setPaintFlags(16);
            healthTextView2.setTypeface(eVar.ab);
            healthTextView2.setText(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void b(e eVar, SingleGridContent singleGridContent) {
        eVar.bq.setVisibility(8);
        eVar.bw.setVisibility(8);
        if (singleGridContent.getDescriptionVisibility()) {
            eVar.bo.setVisibility(0);
            eVar.bo.setText(singleGridContent.getDescription());
        } else {
            eVar.bo.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(e eVar, String str) {
        eVar.bo.setVisibility(8);
        eVar.bq.setVisibility(8);
        eVar.bw.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) eVar.bw.findViewById(com.huawei.health.servicesui.R.id.vip_tag);
        if (healthTextView != null) {
            healthTextView.setTypeface(eVar.ab);
            healthTextView.setText(this.l.getResources().getString(com.huawei.health.servicesui.R.string.IDS_member_price, ""));
        }
        HealthTextView healthTextView2 = (HealthTextView) eVar.bw.findViewById(com.huawei.health.servicesui.R.id.vip_price);
        if (healthTextView2 != null) {
            healthTextView2.setTypeface(eVar.ab);
            healthTextView2.setText(str);
        }
    }

    private void e(final e eVar, final SingleGridContent singleGridContent) {
        PayApi payApi = (PayApi) Services.b("TradeService", PayApi.class);
        final String dynamicDataId = singleGridContent.getDynamicDataId();
        if (TextUtils.isEmpty(dynamicDataId)) {
            LogUtil.e("ColumnLayoutAdapter", "scheduleOneCarryThreePrice failed, cause productId is null!");
            b(eVar, singleGridContent);
        } else {
            payApi.getProductDetails(singleGridContent.getDynamicDataId(), new IBaseResponseCallback() { // from class: fyp
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.b(dynamicDataId, eVar, singleGridContent, i, obj);
                }
            });
        }
    }

    public /* synthetic */ void b(String str, final e eVar, final SingleGridContent singleGridContent, int i, Object obj) {
        if (i != 0) {
            LogUtil.e("ColumnLayoutAdapter", "getProductDetails failed, cause errorCode is: ", Integer.valueOf(i), ", productId = ", str);
            HandlerExecutor.b(new Runnable() { // from class: fym
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34748a.a(eVar, singleGridContent);
                }
            });
            return;
        }
        if (!(obj instanceof Product)) {
            LogUtil.e("ColumnLayoutAdapter", "getProductDetails failed, cause objData is: ", obj, ", productId = ", str);
            HandlerExecutor.b(new Runnable() { // from class: fyj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34742b.b(eVar, singleGridContent);
                }
            });
            return;
        }
        Product product = (Product) obj;
        float microPrice = product.getMicroPrice() / 1000000.0f;
        final String str2 = "￥" + UnitUtil.e(microPrice, 1, (microPrice < 1.0f || (((int) product.getMicroPrice()) % 1000000 > 0)) ? 2 : 0);
        if (!product.getMemberFlag()) {
            HandlerExecutor.b(new Runnable() { // from class: fyi
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(eVar, str2);
                }
            });
        } else {
            HandlerExecutor.b(new Runnable() { // from class: fyn
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(eVar, str2);
                }
            });
        }
    }

    public /* synthetic */ void d(e eVar, String str) {
        b(eVar, str, "");
    }

    private void s(e eVar, int i) {
        if (njy.e(this.n, i)) {
            return;
        }
        View view = eVar.itemView;
        d(view.getLayoutParams(), i, view.getContext());
        SingleGridContent singleGridContentE = e(eVar, i);
        eVar.cg.setText(singleGridContentE.getTheme());
        qqf.b(eVar.by, singleGridContentE.getPicture(), 0, 0, fww.f34656a);
        c(singleGridContentE, view, i);
        String extend = singleGridContentE.getExtend();
        if (TextUtils.isEmpty(extend)) {
            return;
        }
        String[] strArrSplit = extend.split(",");
        if (strArrSplit.length < 2) {
            return;
        }
        int iN = CommonUtil.n(BaseApplication.getContext(), strArrSplit[0]);
        String str = strArrSplit[1];
        String strD = gzx.d(com.huawei.health.servicesui.R.plurals.IDS_kcalories_unit, iN, UnitUtil.e(iN, 1, 0));
        String strE = fwz.e(CommonUtil.n(this.l, str));
        String strD2 = gzx.d(com.huawei.health.servicesui.R.plurals.IDS_plugin_fitnessadvice_min, singleGridContentE.getCostTime(), ifp.d(singleGridContentE.getCostTime()));
        int numberOfPeople = singleGridContentE.getNumberOfPeople();
        String strD3 = ifp.d(BaseApplication.getContext(), R.string.IDS_activity_social_people_attended, Integer.valueOf(numberOfPeople), UnitUtil.e(numberOfPeople, 1, 0));
        eVar.cb.setText(strE);
        eVar.ca.setText(strD2);
        eVar.bz.setText(strD);
        eVar.cd.setText(strD3);
    }

    private void o(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOneGridSmallEcgLayout singleGridContent is null.");
            return;
        }
        fya.e(eVar.q, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        qqf.b(eVar.n, singleGridContentE.getPicture(), 0, 0, fww.f34656a);
        c(singleGridContentE, eVar.o, i);
    }

    private void t(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOneGridSmallLayout singleGridContent is null.");
            return;
        }
        e(eVar);
        fya.e(eVar.ej, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.dv, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.dv, true, false);
        g(eVar, singleGridContentE);
        String picture = singleGridContentE.getPicture();
        if (fxk.b(this.ae)) {
            qqf.b(eVar.dx, picture, qqf.d, 0, fww.f34656a);
        } else {
            qqf.b(eVar.dx, picture, qqf.d, 1, fww.f34656a);
        }
        fya.b(eVar.du, singleGridContentE, this.j);
        if (singleGridContentE.getCornerVisibility()) {
            fya.b(eVar.dy, (CornerTemplate) singleGridContentE, false);
        } else {
            fya.e(eVar.dy, singleGridContentE, this.j, this.ae);
        }
        boolean zE = qrg.e();
        if (TextUtils.isEmpty(singleGridContentE.getLinkValue()) || ((!singleGridContentE.getLinkValue().contains("com.huawei.health.ecg.collection") && !singleGridContentE.getLinkValue().contains("com.huawei.ecgh5") && !singleGridContentE.getLinkValue().contains("com.huawei.health.h5.ecg")) || !zE)) {
            eVar.eh.setVisibility(8);
        } else {
            eVar.eh.setVisibility(0);
        }
        c(singleGridContentE, eVar.eg, i);
        d(eVar, singleGridContentE);
    }

    private static void d(e eVar, SingleGridContent singleGridContent) {
        String strValueOf = eVar.dy.getVisibility() == 0 ? String.valueOf(eVar.dy.getText()) : "";
        String strValueOf2 = eVar.du.getVisibility() == 0 ? String.valueOf(eVar.du.getText()) : "";
        CharSequence charSequenceD = fya.d(singleGridContent);
        if (!TextUtils.isEmpty(strValueOf) && !TextUtils.isEmpty(strValueOf2)) {
            charSequenceD = qre.a(com.huawei.health.servicesui.R.string.accessibility_status_theme_description_join, strValueOf, charSequenceD, strValueOf2);
        } else if (!TextUtils.isEmpty(strValueOf)) {
            charSequenceD = qre.a(com.huawei.health.servicesui.R.string.accessibility_status_theme_description, strValueOf, charSequenceD);
        } else if (!TextUtils.isEmpty(strValueOf2)) {
            charSequenceD = qre.a(com.huawei.health.servicesui.R.string.accessibility_theme_description_join, charSequenceD, strValueOf2);
        }
        lrd.a(eVar.eg, charSequenceD, (Class<?>) ImageView.class);
        LogUtil.a("ColumnLayoutAdapter", "setOneGridSmallLayout contentDescription ", charSequenceD);
    }

    private void g(e eVar, SingleGridContent singleGridContent) {
        if (eVar.dv == null) {
            return;
        }
        if (TextUtils.equals(singleGridContent.getItemCategory(), "AiSleepAudio")) {
            LogUtil.a("ColumnLayoutAdapter", "setOneGridSmallLayout item category:", singleGridContent.getItemCategory());
            eVar.dv.setMaxLines(2);
        } else {
            eVar.dv.setMaxLines(1);
        }
    }

    private void e(e eVar) {
        int iC = fxk.c(this.l, this.h, this.n.size());
        ViewGroup.LayoutParams layoutParams = eVar.dx.getLayoutParams();
        if (fxk.b(this.ae)) {
            Context activity = BaseApplication.getActivity();
            if (activity == null) {
                LogUtil.j("ColumnLayoutAdapter", "getActivity = null");
                activity = BaseApplication.getContext();
            }
            int iB = ScrollUtil.b(activity);
            if (qrs.af(activity)) {
                iC = (iB - qrs.d(this.l, 121.0f)) / 2;
            } else {
                iC = iB - qrs.d(this.l, 109.0f);
            }
        }
        int i = (iC * 9) / 21;
        layoutParams.width = iC;
        layoutParams.height = i;
        eVar.dx.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = eVar.eg.getLayoutParams();
        layoutParams2.height = i;
        layoutParams2.width = iC;
        eVar.eg.setLayoutParams(layoutParams2);
    }

    private void r(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOneGridLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int i2 = (iC * 9) / 16;
        ViewGroup.LayoutParams layoutParams = eVar.bt.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = iC;
            layoutParams2.height = i2;
            eVar.bt.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = eVar.ce.getLayoutParams();
        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.height = i2;
            layoutParams4.width = iC;
            eVar.ce.setLayoutParams(layoutParams4);
        }
        fya.e(eVar.cf, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.bv, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.bv, true, false);
        qqf.b(eVar.bt, singleGridContentE.getPicture(), 0, 1, fww.f34656a);
        fya.b(eVar.bx, singleGridContentE, this.j);
        if (singleGridContentE.getCornerVisibility()) {
            fya.b(eVar.cc, (CornerTemplate) singleGridContentE, false);
        } else {
            fya.e(eVar.cc, singleGridContentE, this.j, this.ae);
        }
        fya.e(eVar.bs, this.j, singleGridContentE.getItemCategory());
        c(singleGridContentE, eVar.bu, i);
    }

    private void ag(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setTwoGridLandscapeLayout singleGridContent is null.");
            return;
        }
        qqf.b(eVar.ge, singleGridContentE.getPicture(), qqf.e, 0, fww.f34656a);
        fya.b(eVar.gd, (CornerTemplate) singleGridContentE, false);
        String theme = singleGridContentE.getTheme();
        String description = singleGridContentE.getDescription();
        boolean z = !TextUtils.isEmpty(theme) && singleGridContentE.isThemeVisibility();
        boolean z2 = !TextUtils.isEmpty(description) && singleGridContentE.getDescriptionVisibility();
        if (z2 || z) {
            eVar.gf.setVisibility(0);
            fya.e(eVar.gi, theme, singleGridContentE.isThemeVisibility());
            fya.d(eVar.gg, description, singleGridContentE.getDescriptionVisibility());
            fya.b(eVar.gg, true, false);
            if (!z2) {
                eVar.gi.setTextSize(0, this.l.getResources().getDimension(com.huawei.health.servicesui.R.dimen.textSizeBody1));
                ViewGroup.LayoutParams layoutParams = eVar.gf.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(qrs.d(this.l, 16.0f));
                    eVar.gf.setLayoutParams(layoutParams2);
                }
            }
        } else {
            eVar.gf.setVisibility(8);
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int iC2 = fxk.c(this.l, this.h, 4) / 2;
        ViewGroup.LayoutParams layoutParams3 = eVar.gm.getLayoutParams();
        layoutParams3.width = iC;
        if (qrs.ac()) {
            layoutParams3.height = -2;
        } else {
            layoutParams3.height = iC2;
        }
        eVar.gm.setLayoutParams(layoutParams3);
        c(singleGridContentE, eVar.gm, i);
    }

    private void u(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSecondPalaceVerticalHolder singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int i2 = (iC * 5) / 4;
        ViewGroup.LayoutParams layoutParams = eVar.cr.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = i2;
        eVar.cr.setLayoutParams(layoutParams);
        qqf.b(eVar.cr, singleGridContentE.getPicture(), qqf.d, 1, fww.f34656a);
        fya.e(eVar.cv, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.cs, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.cs, true, false);
        fya.b(eVar.cu, (CornerTemplate) singleGridContentE, false);
        ViewGroup.LayoutParams layoutParams2 = eVar.cx.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = i2;
        eVar.cx.setLayoutParams(layoutParams2);
        c(singleGridContentE, eVar.cx, i);
    }

    private void y(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSecondPalaceVerticalTwoHolder singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int i2 = (iC * 5) / 4;
        ViewGroup.LayoutParams layoutParams = eVar.cw.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = i2;
        eVar.cw.setLayoutParams(layoutParams);
        String theme = singleGridContentE.getTheme();
        String description = singleGridContentE.getDescription();
        fya.e(eVar.dc, theme, singleGridContentE.isThemeVisibility());
        fya.b(eVar.da, (CornerTemplate) singleGridContentE, false);
        fya.d(eVar.cz, description, singleGridContentE.getDescriptionVisibility(), true);
        if (this.aa && this.h == 8) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            eVar.dc.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            eVar.cz.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredHeight = eVar.dc.getMeasuredHeight();
            int measuredHeight2 = eVar.cz.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams2 = eVar.cy.getLayoutParams();
            int iD = qrs.d(this.l, 16.0f);
            int iD2 = qrs.d(this.l, 2.0f);
            int iD3 = (((((i2 - measuredHeight) - measuredHeight2) - iD) - iD2) - qrs.d(this.l, 20.0f)) - qrs.d(this.l, 16.0f);
            layoutParams2.height = iD3;
            layoutParams2.width = iD3;
            eVar.cy.setLayoutParams(layoutParams2);
        }
        qqf.b(eVar.cy, singleGridContentE.getPicture(), qqf.d, 1, fww.f34656a);
        c(singleGridContentE, eVar.cw, i);
    }

    private void m(e eVar, int i) {
        List<SingleGridContent> listC = c(eVar, i);
        if (njy.e(listC)) {
            LogUtil.j("ColumnLayoutAdapter", "setOneAddTwoHolder contentList is null.");
            return;
        }
        if (njy.e(listC, 0) || njy.e(listC, 1) || njy.e(listC, 2)) {
            LogUtil.j("ColumnLayoutAdapter", "contentList outOfBounds.");
            return;
        }
        SingleGridContent singleGridContent = listC.get(0);
        SingleGridContent singleGridContent2 = listC.get(1);
        SingleGridContent singleGridContent3 = listC.get(2);
        if (singleGridContent == null || singleGridContent2 == null || singleGridContent3 == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOneAddTwoHolder itemObject is null.");
            return;
        }
        b(eVar, singleGridContent, 0, i);
        b(eVar, singleGridContent2, 1, i);
        b(eVar, singleGridContent3, 2, i);
    }

    private void b(e eVar, SingleGridContent singleGridContent, int i, int i2) {
        if (eVar == null || singleGridContent == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOneAddTwoViewSingle holder or content is null.");
            return;
        }
        this.s = i;
        int iC = fxk.c(this.l, this.h, this.ad.size());
        if (qrs.af(BaseApplication.getActivity())) {
            iC += this.l.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_30dp);
        }
        this.i = (iC * 5) / 4;
        this.an = (this.i - this.l.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.cardMarginMiddle)) / 2;
        if (i == 0) {
            if (this.h == 48) {
                b(singleGridContent, eVar.fk, eVar.fm, eVar.fl, iC);
                fya.b(eVar.ff, (CornerTemplate) singleGridContent, false);
                ViewGroup.LayoutParams layoutParams = eVar.fj.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.width = iC;
                    layoutParams2.height = this.i;
                    eVar.fj.setLayoutParams(layoutParams2);
                }
                if (TextUtils.equals(this.j, SingleDailyMomentContent.ACTIVITY_TYPE)) {
                    fya.b(eVar.fn, singleGridContent, this.j);
                }
                c(singleGridContent, eVar.fj, i2);
                return;
            }
            e(singleGridContent, eVar.az, eVar.ba, eVar.ay);
            eVar.bc.setLayoutParams(new RelativeLayout.LayoutParams(iC, this.i));
            fya.b(eVar.bb, (CornerTemplate) singleGridContent, false);
            c(singleGridContent, eVar.bc, i2);
            return;
        }
        if (i == 1) {
            if (this.h == 48) {
                b(singleGridContent, eVar.gb, eVar.fv, eVar.fu, iC);
                fya.b(eVar.ft, (CornerTemplate) singleGridContent, false);
                ViewGroup.LayoutParams layoutParams3 = eVar.gc.getLayoutParams();
                if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = iC;
                    layoutParams4.height = this.an;
                    eVar.gc.setLayoutParams(layoutParams4);
                }
                if (TextUtils.equals(this.j, SingleDailyMomentContent.ACTIVITY_TYPE)) {
                    fya.b(eVar.fw, singleGridContent, this.j);
                }
                c(singleGridContent, eVar.gc, i2);
                return;
            }
            e(singleGridContent, eVar.bk, eVar.bj, eVar.bm);
            eVar.bi.setLayoutParams(new RelativeLayout.LayoutParams(iC, this.an));
            fya.b(eVar.bl, (CornerTemplate) singleGridContent, false);
            c(singleGridContent, eVar.bi, i2);
            return;
        }
        if (i != 2) {
            return;
        }
        if (this.h == 48) {
            b(singleGridContent, eVar.fx, eVar.fp, eVar.fr, iC);
            fya.b(eVar.fs, (CornerTemplate) singleGridContent, false);
            ViewGroup.LayoutParams layoutParams5 = eVar.fq.getLayoutParams();
            if (layoutParams5 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                layoutParams6.width = iC;
                layoutParams6.height = this.an;
                eVar.fq.setLayoutParams(layoutParams6);
            }
            if (TextUtils.equals(this.j, SingleDailyMomentContent.ACTIVITY_TYPE)) {
                fya.b(eVar.fo, singleGridContent, this.j);
            }
            c(singleGridContent, eVar.fq, i2);
            return;
        }
        e(singleGridContent, eVar.bd, eVar.bh, eVar.be);
        eVar.bg.setLayoutParams(new RelativeLayout.LayoutParams(iC, this.an));
        fya.b(eVar.bf, (CornerTemplate) singleGridContent, false);
        c(singleGridContent, eVar.bg, i2);
    }

    private void e(SingleGridContent singleGridContent, HealthTextView healthTextView, HealthTextView healthTextView2, ImageView imageView) {
        int iD;
        fya.d(healthTextView, singleGridContent.getTheme(), singleGridContent.isThemeVisibility(), true);
        fya.d(healthTextView2, singleGridContent.getDescription(), singleGridContent.getDescriptionVisibility(), true);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        healthTextView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        healthTextView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = healthTextView.getMeasuredHeight();
        int measuredHeight2 = healthTextView2.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (this.s == 0) {
            int i = this.i;
            int iD2 = qrs.d(this.l, 16.0f);
            int iD3 = qrs.d(this.l, 2.0f);
            iD = (((((i - measuredHeight) - measuredHeight2) - iD2) - iD3) - qrs.d(this.l, 20.0f)) - qrs.d(this.l, 16.0f);
        } else {
            int i2 = this.an;
            int iD4 = qrs.d(this.l, 16.0f);
            iD = (((i2 - measuredHeight) - iD4) - qrs.d(this.l, 2.0f)) - qrs.d(this.l, 4.0f);
        }
        layoutParams.height = iD;
        layoutParams.width = iD;
        imageView.setLayoutParams(layoutParams);
        qqf.b(imageView, singleGridContent.getPicture(), (int) this.l.getResources().getDimension(com.huawei.health.servicesui.R.dimen.gridCornerRadius), 1, fww.f34656a);
    }

    private void b(SingleGridContent singleGridContent, HealthTextView healthTextView, HealthTextView healthTextView2, ImageView imageView, int i) {
        fya.d(healthTextView, singleGridContent.getTheme(), singleGridContent.isThemeVisibility(), true);
        fya.d(healthTextView2, singleGridContent.getDescription(), singleGridContent.getDescriptionVisibility(), true);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (this.s == 0) {
            layoutParams.height = this.i;
            layoutParams.width = i;
        } else {
            layoutParams.height = this.an;
            layoutParams.width = i;
        }
        imageView.setLayoutParams(layoutParams);
        qqf.b(imageView, singleGridContent.getPicture(), (int) this.l.getResources().getDimension(com.huawei.health.servicesui.R.dimen.cardCornerRadius), 1, fww.f34656a);
        CharSequence charSequenceD = fya.d(singleGridContent);
        lrd.a(imageView, charSequenceD, (Class<?>) ImageView.class);
        LogUtil.a("ColumnLayoutAdapter", "setThreeFullImageView contentDescription ", charSequenceD);
    }

    private void ab(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSquareLandscapeSlideLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int dimension = (int) BaseApplication.getContext().getResources().getDimension(com.huawei.health.servicesui.R.dimen.defaultCornerRadiusM);
        ViewGroup.LayoutParams layoutParams = eVar.et.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = iC;
        eVar.et.setLayoutParams(layoutParams);
        qqf.b(eVar.et, singleGridContentE.getPicture(), dimension, 1, fww.f34656a);
        fya.e(eVar.fa, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.el, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.el, true, false);
        ViewGroup.LayoutParams layoutParams2 = eVar.er.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = iC;
        eVar.er.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = eVar.fb.getLayoutParams();
        layoutParams3.width = iC;
        layoutParams3.height = -2;
        eVar.fb.setLayoutParams(layoutParams3);
        fya.b(eVar.ef, (CornerTemplate) singleGridContentE, true);
        fya.a(eVar.t, singleGridContentE, eVar.ew);
        c(singleGridContentE, eVar.fb, i);
        a(singleGridContentE, eVar.ew, i);
    }

    private void aa(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSquareLandscapeSlideLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int dimension = (int) BaseApplication.getContext().getResources().getDimension(com.huawei.health.servicesui.R.dimen.defaultCornerRadiusM);
        ViewGroup.LayoutParams layoutParams = eVar.eq.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = iC;
        eVar.eq.setLayoutParams(layoutParams);
        qqf.b(eVar.eq, singleGridContentE.getPicture(), dimension, 1, fww.f34656a);
        fya.e(eVar.fd, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.en, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.en, true, false);
        ViewGroup.LayoutParams layoutParams2 = eVar.es.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = iC;
        eVar.es.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = eVar.fc.getLayoutParams();
        layoutParams3.width = iC;
        layoutParams3.height = -2;
        eVar.fc.setLayoutParams(layoutParams3);
        fya.b(eVar.ek, (CornerTemplate) singleGridContentE, true);
        fya.a(eVar.s, singleGridContentE, eVar.ey);
        c(singleGridContentE, eVar.fc, i);
        a(singleGridContentE, eVar.ey, i);
    }

    private void ad(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSleepSeriesCourseThreePart singleGridContent is null.");
            return;
        }
        qqf.b(eVar.ae, singleGridContentE.getPicture(), 0, 1, fww.f34656a);
        fya.e(eVar.gh, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        String strC = haa.c(singleGridContentE.getVip(), singleGridContentE.getIsPay());
        if (TextUtils.isEmpty(strC)) {
            eVar.k.setVisibility(8);
        } else {
            eVar.k.setVisibility(0);
            haa.d(eVar.k, strC);
        }
        fya.d(eVar.cp, singleGridContentE.getPlayPercent(), true);
        c(singleGridContentE, eVar.l, i);
    }

    private void z(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSleepYoga singleGridContent is null.");
            return;
        }
        qqf.b(eVar.dr, singleGridContentE.getPicture(), (int) BaseApplication.getContext().getResources().getDimension(com.huawei.health.servicesui.R.dimen.defaultCornerRadiusM), 1, fww.f34656a);
        fya.e(eVar.dt, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.ds, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        c(singleGridContentE, eVar.dq, i);
    }

    private void ae(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSquareLandscapeSlideLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int dimension = (int) BaseApplication.getContext().getResources().getDimension(com.huawei.health.servicesui.R.dimen.defaultCornerRadiusM);
        ViewGroup.LayoutParams layoutParams = eVar.eu.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = iC;
        eVar.eu.setLayoutParams(layoutParams);
        qqf.b(eVar.eu, singleGridContentE.getPicture(), dimension, 1, fww.f34656a);
        fya.e(eVar.fh, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.em, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.em, true, false);
        int heatCount = singleGridContentE.getHeatCount();
        if (heatCount > 0) {
            eVar.ev.setVisibility(0);
            eVar.ep.setVisibility(0);
            eVar.ep.setText(qqk.b(heatCount));
        } else {
            eVar.ev.setVisibility(8);
            eVar.ep.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams2 = eVar.ex.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = iC;
        eVar.ex.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = eVar.ez.getLayoutParams();
        layoutParams3.width = iC;
        layoutParams3.height = -2;
        eVar.ez.setLayoutParams(layoutParams3);
        fya.b(eVar.eo, (CornerTemplate) singleGridContentE, true);
        c(singleGridContentE, eVar.ez, i);
        a(singleGridContentE, eVar.ev, i);
    }

    private void ac(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSleepSeriesCoursesLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        int i2 = (iC * 9) / 16;
        ViewGroup.LayoutParams layoutParams = eVar.dp.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = i2;
            layoutParams2.width = iC;
            eVar.dp.setLayoutParams(layoutParams2);
        }
        fya.e(eVar.dl, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.dn, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        eVar.dg.setText(singleGridContentE.getTheme());
        qqf.b(eVar.dh, singleGridContentE.getPicture(), 0, 1, fww.f34656a);
        eVar.f1do.setVisibility(0);
        c(singleGridContentE, eVar.dp, i);
        c(singleGridContentE, eVar.f1do, i);
    }

    private void w(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOnePointEightGridSlideLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        ViewGroup.LayoutParams layoutParams = eVar.cl.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = Math.round(iC / d);
        eVar.cl.setLayoutParams(layoutParams);
        qqf.b(eVar.cl, singleGridContentE.getPicture(), 0, 1, fww.f34656a);
        fya.e(eVar.ck, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.ch, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.ch, true, false);
        ViewGroup.LayoutParams layoutParams2 = eVar.cj.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = -2;
        eVar.cj.setLayoutParams(layoutParams2);
        c(singleGridContentE, eVar.cj, i);
    }

    private void ak(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setSquareLandscapeSlideLayout singleGridContent is null.");
            return;
        }
        int iD = qrs.d(BaseApplication.getContext(), 130.0f);
        ViewGroup.LayoutParams layoutParams = eVar.gw.getLayoutParams();
        layoutParams.width = iD;
        layoutParams.height = Math.round(iD * 1.246f);
        eVar.gw.setLayoutParams(layoutParams);
        qqf.b(eVar.gw, singleGridContentE.getPicture(), 0, 0, fww.f34656a);
        fya.e(eVar.gx, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.b(eVar.gx, false, false);
        ViewGroup.LayoutParams layoutParams2 = eVar.gz.getLayoutParams();
        layoutParams2.width = iD;
        layoutParams2.height = -2;
        eVar.gz.setLayoutParams(layoutParams2);
        c(singleGridContentE, eVar.gz, i);
    }

    private void af(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setTwoLinesLandscapeSlideLayout singleGridContent is null.");
            return;
        }
        qqf.b(eVar.gn, singleGridContentE.getPicture(), qqf.e, 1, fww.f34656a);
        fya.d(eVar.gt, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility(), true);
        fya.d(eVar.gq, singleGridContentE);
        if (i % 2 != 0) {
            eVar.gr.setVisibility(8);
        } else {
            eVar.gr.setVisibility(0);
        }
        fya.a(eVar.gu, fwz.c(singleGridContentE, 59), true, false);
        fya.b(eVar.gu, true, false);
        ViewGroup.LayoutParams layoutParams = eVar.gs.getLayoutParams();
        layoutParams.width = fxk.c(this.l, this.h, this.n.size());
        layoutParams.height = -2;
        eVar.gs.setLayoutParams(layoutParams);
        c(singleGridContentE, eVar.gs, i);
    }

    private void g(final e eVar, int i) {
        final SingleGridContent singleGridContentE = e(eVar, i);
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("appIconDisplay", 0);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setApplicationIconLayout singleGridContent is null.");
            return;
        }
        sharedPreferences.edit().putBoolean("APP_DISPLAY_ICON", true).apply();
        int iD = qrs.d(BaseApplication.getContext(), 78.0f);
        qqf.d(eVar.f, singleGridContentE.getPicture(), qqf.f46647a, 0, new AsyncLoadDrawableCallback() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.3
            @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
            public void getDrawable(Drawable drawable) {
                if (drawable == null) {
                    LogUtil.d("ColumnLayoutAdapter", "load round rectangle picture failed");
                    return;
                }
                Drawable drawable2 = eVar.f.getDrawable();
                if (drawable2 == null) {
                    LogUtil.d("ColumnLayoutAdapter", "mApplicationIconImage background drawable is null,return");
                    return;
                }
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                float fA = fya.a(8.0f);
                fya.a(eVar.h, singleGridContentE, new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
                fya.d(eVar.h, intrinsicWidth);
            }
        });
        fya.e(eVar.j, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        ViewGroup.LayoutParams layoutParams = eVar.g.getLayoutParams();
        layoutParams.width = iD;
        layoutParams.height = -2;
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = this.l.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.defaultPaddingStart);
            int dimensionPixelSize2 = this.l.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.defaultPaddingEnd);
            if (i == 0) {
                marginLayoutParams.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
            }
            if (i == this.n.size() - 1) {
                marginLayoutParams.setMarginEnd(dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue());
            }
        }
        eVar.g.setLayoutParams(layoutParams);
        int i2 = this.ae;
        if (i2 == 4005 || i2 == 4028) {
            EcgFilterManager ecgFilterManagerB = EcgFilterManager.b();
            CharSequence text = eVar.j.getText();
            singleGridContentE.setLinkValue(ecgFilterManagerB.e(eVar.g, singleGridContentE.getLinkValue(), text != null ? text.toString() : null));
        }
        if (this.ae == 4009) {
            d(eVar);
        }
        c(singleGridContentE, eVar.g, i);
    }

    private void d(e eVar) {
        ViewGroup.LayoutParams layoutParams = eVar.j.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = eVar.f.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.setMargins(0, BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_4dp), 0, BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_16dp));
            eVar.j.setLayoutParams(layoutParams3);
        }
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams4.setMargins(0, BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_12dp), 0, 0);
            eVar.f.setLayoutParams(layoutParams4);
        }
    }

    private void x(e eVar, int i) {
        SingleEntryContent singleEntryContentB = b(eVar, i);
        if (singleEntryContentB == null) {
            LogUtil.j("ColumnLayoutAdapter", "setQuickEntryLayout content is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.ai.size());
        ViewGroup.LayoutParams layoutParams = eVar.cn.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = -2;
        eVar.cn.setLayoutParams(layoutParams);
        String picture = singleEntryContentB.getPicture();
        if (picture.endsWith(MetaCreativeType.GIF)) {
            qqf.b(picture, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE), eVar.cm);
        } else {
            qqf.b(eVar.cm, picture, qqf.e, 0, fww.f34656a);
        }
        fya.e(eVar.ct, singleEntryContentB.getName(), singleEntryContentB.isNameVisibility());
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = singleEntryContentB.getRedEndTime() >= jCurrentTimeMillis && jCurrentTimeMillis >= singleEntryContentB.getRedStartTime();
        if (TextUtils.isEmpty(singleEntryContentB.getRedName()) || !z) {
            if (!TextUtils.isEmpty(singleEntryContentB.getRedName()) || !z) {
                eVar.cq.setVisibility(4);
                eVar.co.setVisibility(4);
            } else {
                eVar.cq.setVisibility(0);
                eVar.co.setVisibility(4);
            }
        } else {
            eVar.co.setVisibility(0);
            eVar.co.setText(singleEntryContentB.getRedName());
            eVar.cq.setVisibility(4);
        }
        c(new SingleGridContent(new SingleGridContent.Builder().setLinkValue(singleEntryContentB.getLinkValue()).setTheme(singleEntryContentB.getName())), eVar.cn, i);
    }

    private void n(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setImageTextLayout content is null.");
            return;
        }
        qqf.b(eVar.ar, singleGridContentE.getPicture(), qqf.e, 0, fww.f34656a);
        fya.e(eVar.aq, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.ao, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.aj, singleGridContentE);
        if (qrs.af(BaseApplication.getActivity()) || i == this.n.size() - 1) {
            eVar.ap.setVisibility(8);
        } else {
            eVar.ap.setVisibility(0);
        }
        c(singleGridContentE, eVar.as, i);
    }

    private void l(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setImageTextLayout content is null.");
            return;
        }
        qqf.b(eVar.al, singleGridContentE.getPicture(), qqf.e, 0, fww.f34656a);
        fya.e(eVar.am, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.af, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        eVar.ah.setVisibility(8);
        eVar.ag.setVisibility(8);
        eVar.ai.setVisibility(8);
        List<String> avatarUrlList = singleGridContentE.getAvatarUrlList();
        if (avatarUrlList != null && avatarUrlList.size() != 0) {
            eVar.ai.setVisibility(0);
            ImageView imageView = eVar.ai;
            String str = avatarUrlList.get(avatarUrlList.size() - 1);
            int i2 = f8219a;
            qqf.b(imageView, str, i2, 0, fww.f34656a);
            if (avatarUrlList.size() > 1) {
                eVar.ag.setVisibility(0);
                qqf.b(eVar.ag, avatarUrlList.get(avatarUrlList.size() - 2), i2, 0, fww.f34656a);
            }
            if (avatarUrlList.size() > 2) {
                eVar.ah.setVisibility(0);
                qqf.b(eVar.ah, avatarUrlList.get(avatarUrlList.size() - 3), i2, 0, fww.f34656a);
            }
        }
        if (fya.d()) {
            eVar.ah.setVisibility(8);
            eVar.ag.setVisibility(8);
            eVar.ai.setVisibility(8);
        }
        fya.d(eVar.an, singleGridContentE.getStatistic(), singleGridContentE.getDescriptionVisibility());
        c(singleGridContentE, eVar.ak, i);
        ViewGroup.LayoutParams layoutParams = eVar.ak.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i == this.n.size() - 1) {
                marginLayoutParams.bottomMargin = 0;
            } else {
                marginLayoutParams.bottomMargin = qre.d(com.huawei.health.servicesui.R.dimen.health_common_12dp);
            }
            eVar.ak.setLayoutParams(marginLayoutParams);
        }
    }

    private void j(final e eVar, int i) {
        final SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setFunctionMenuLayout singleGridContent is null.");
            return;
        }
        final int iC = fxk.c(this.l, this.h, this.n.size());
        if (this.ae == 4009) {
            iC = this.l.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_73dp);
        }
        final String redDotFlag = singleGridContentE.getRedDotFlag();
        ReleaseLogUtil.d("ColumnLayoutAdapter", "redDotFlag: ", redDotFlag, " MessageCount:", Integer.valueOf(singleGridContentE.getMessageCount()));
        fya.e(eVar.aa, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        if (singleGridContentE.getMessageCount() == 0) {
            if (TextUtils.isEmpty(singleGridContentE.getMarketingIcon()) || TextUtils.equals(singleGridContentE.getMarketingIcon(), "none")) {
                eVar.ac.setVisibility(4);
                eVar.z.setVisibility(4);
            } else {
                eVar.ac.setVisibility(4);
                eVar.z.setVisibility(0);
            }
        } else {
            eVar.ac.setText(String.valueOf(singleGridContentE.getMessageCount()));
            eVar.ac.setVisibility(0);
        }
        c(eVar, singleGridContentE, redDotFlag);
        eVar.w.setText((CharSequence) null);
        eVar.w.setVisibility(8);
        if ("healthManage".equals(redDotFlag)) {
            c(eVar, singleGridContentE);
        }
        ViewGroup.LayoutParams layoutParams = eVar.ad.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = -2;
        eVar.ad.setLayoutParams(layoutParams);
        b(eVar);
        d(singleGridContentE, eVar.ad, i, new IBaseResponseCallback() { // from class: fyk
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f34744b.e(eVar, singleGridContentE, redDotFlag, i2, obj);
            }
        });
        c(i, eVar);
        if (singleGridContentE.getTheme().equals("健康头条")) {
            this.m = eVar;
        }
        HandlerExecutor.c(new Runnable() { // from class: fyl
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(singleGridContentE, eVar, iC);
            }
        }, 100L);
    }

    public /* synthetic */ void e(e eVar, SingleGridContent singleGridContent, String str, int i, Object obj) {
        Drawable drawable = eVar.x.getDrawable();
        if ((drawable == null || (drawable instanceof NinePatchDrawable)) && CommonUtil.ab((Context) null)) {
            LogUtil.a("ColumnLayoutAdapter", "setFunctionMenuImage has no resource, reload");
            c(eVar, singleGridContent, str);
        }
    }

    public /* synthetic */ void d(SingleGridContent singleGridContent, e eVar, int i) {
        if (TextUtils.isEmpty(singleGridContent.getTheme()) || !singleGridContent.isThemeVisibility()) {
            return;
        }
        TextPaint paint = eVar.aa.getPaint();
        paint.setTextSize(eVar.aa.getTextSize());
        if (((int) paint.measureText(singleGridContent.getTheme())) > i - this.l.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_8dp)) {
            eVar.aa.setLines(2);
        } else {
            eVar.aa.setLines(1);
        }
    }

    public void f() {
        this.o.d();
    }

    public void b() {
        this.o.b();
    }

    public void h() {
        this.o.e();
    }

    public void i() {
        this.o.c();
    }

    private void c(e eVar, SingleGridContent singleGridContent, String str) {
        final String picture = singleGridContent.getPicture();
        ReleaseLogUtil.d("ColumnLayoutAdapter", "imgUrl: ", picture);
        if (!SharedPreferenceManager.b("showLocalResources", "FUNCTION_MENU_SHOW_LOCAL_RESOURCES", false)) {
            if (!"healthManage".equals(str) || !qrs.b(picture)) {
                if (TextUtils.isEmpty(picture) || !picture.endsWith(MetaCreativeType.GIF)) {
                    qqf.e(eVar.x, picture, 0, 0, fww.f34656a);
                    return;
                } else {
                    qqf.a(picture, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE), eVar.x, "助眠音乐".equals(singleGridContent.getTheme()) ? ContextCompat.getDrawable(this.l, com.huawei.health.servicesui.R.drawable.ic_sleep_aid_music_native) : null, new RequestListener<GifDrawable>() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.5
                        @Override // com.bumptech.glide.request.RequestListener
                        public boolean onLoadFailed(GlideException glideException, Object obj, Target<GifDrawable> target, boolean z) {
                            LogUtil.e("ColumnLayoutAdapter", "setFunctionMenuImage resource load failed, exception = ", ExceptionUtils.c(glideException));
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public boolean onResourceReady(final GifDrawable gifDrawable, Object obj, Target<GifDrawable> target, DataSource dataSource, boolean z) {
                            LogUtil.a("ColumnLayoutAdapter", "setFunctionMenuImage resource ready for resource = ", gifDrawable, ", url = ", picture, ", isFirstResource = ", Boolean.valueOf(z));
                            if (!z) {
                                return false;
                            }
                            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.5.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    ColumnLayoutAdapter.this.o.e(gifDrawable);
                                }
                            });
                            return false;
                        }
                    });
                    return;
                }
            }
            qqf.e(eVar.x, Integer.parseInt(picture), 0, 0, fww.f34656a);
            return;
        }
        eVar.x.setImageDrawable(ContextCompat.getDrawable(this.l, d(singleGridContent.getPriority())));
    }

    private void c(int i, e eVar) {
        if (this.t == -1 && i == 0) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                SingleGridContent singleGridContent = this.n.get(i2);
                if (singleGridContent != null && TextUtils.equals("健康头条", singleGridContent.getTheme())) {
                    this.t = i2;
                }
            }
        }
    }

    private void c(e eVar, SingleGridContent singleGridContent) {
        if (eVar == null || singleGridContent == null) {
            LogUtil.j("ColumnLayoutAdapter", "loadHealthManageMessage holder == null or content == null");
            return;
        }
        ReleaseLogUtil.d("ColumnLayoutAdapter", "loadHealthManageMessage health_manage_status = ", this.q);
        eVar.ac.setVisibility(4);
        eVar.z.setVisibility(4);
        if (!TextUtils.isEmpty(this.q)) {
            if (!this.q.equals("hasEquity")) {
                if (!this.q.equals("hasInquiring")) {
                    ReleaseLogUtil.d("ColumnLayoutAdapter", "loadHealthManageMessage MessageCount = ", Integer.valueOf(singleGridContent.getMessageCount()));
                    if (singleGridContent.getMessageCount() == 0) {
                        if (this.q.equals("hasSigned")) {
                            eVar.w.setText(com.huawei.health.servicesui.R.string.IDS_health_service_to_be_plan);
                            eVar.w.setVisibility(0);
                            return;
                        } else {
                            eVar.w.setVisibility(8);
                            return;
                        }
                    }
                    eVar.ac.setText(String.valueOf(singleGridContent.getMessageCount()));
                    eVar.ac.setVisibility(0);
                    eVar.w.setVisibility(8);
                    return;
                }
                eVar.w.setText(com.huawei.health.servicesui.R.string.IDS_health_service_inquiring);
                eVar.w.setVisibility(0);
                return;
            }
            eVar.w.setVisibility(8);
            return;
        }
        eVar.w.setText(com.huawei.health.servicesui.R.string.IDS_health_service_experience);
        eVar.w.setVisibility(0);
    }

    private void b(e eVar) {
        int iJ = new HealthColumnSystem(BaseApplication.getContext()).j();
        boolean zAa = qrs.aa(BaseApplication.getContext());
        boolean zT = qrs.t();
        boolean zAf = qrs.af(BaseApplication.getActivity());
        if (this.h == 47) {
            if (zAa && zT && iJ > 4 && !zAf) {
                int iB = b(this.n.size(), fxk.b());
                ViewGroup.LayoutParams layoutParams = eVar.ad.getLayoutParams();
                layoutParams.width = iB;
                layoutParams.height = -2;
                eVar.ad.setLayoutParams(layoutParams);
                eVar.aa.setTextSize(1, 10.0f);
                return;
            }
            eVar.aa.setTextSize(1, 12.0f);
        }
    }

    private int b(int i, int i2) {
        float f;
        float f2;
        if (i > 4) {
            if (qrs.v()) {
                f = i2;
                f2 = 2.5f;
            } else {
                f = i2;
                f2 = 4.5f;
            }
            return (int) (f / f2);
        }
        return i2 / i;
    }

    private int d(int i) {
        switch (i) {
            case 0:
                return com.huawei.health.servicesui.R.drawable.ic_health_management_native;
            case 1:
                return com.huawei.health.servicesui.R.drawable.ic_fat_reduction_program_native;
            case 2:
                return com.huawei.health.servicesui.R.drawable.ic_det_diary_native;
            case 3:
                return com.huawei.health.servicesui.R.drawable.ic_sleep_aid_music_native;
            case 4:
                return com.huawei.health.servicesui.R.drawable.ic_custom_recipes_native;
            case 5:
                return com.huawei.health.servicesui.R.drawable.ic_fitness_courses_native;
            case 6:
                return com.huawei.health.servicesui.R.drawable.ic_sleep_tracking_native;
            case 7:
                return com.huawei.health.servicesui.R.drawable.ic_breathing_exercises_native;
            case 8:
                return com.huawei.health.servicesui.R.drawable.ic_kaka_redemption_native;
            case 9:
                return com.huawei.health.servicesui.R.drawable.ic_top_events_native;
            case 10:
                return com.huawei.health.servicesui.R.drawable.ic_knowledge_headlines_native;
            case 11:
                return com.huawei.health.servicesui.R.drawable.ic_more_services_native;
            default:
                LogUtil.e("ColumnLayoutAdapter", "getDefaultResId error");
                return com.huawei.health.servicesui.R.drawable.ic_health_management_native;
        }
    }

    private void f(final e eVar, int i) {
        final SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setAppTurnPageLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        qqf.d(eVar.d, singleGridContentE.getPicture(), qqf.e, 0, new AsyncLoadDrawableCallback() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.1
            @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
            public void getDrawable(Drawable drawable) {
                if (drawable == null) {
                    LogUtil.d("ColumnLayoutAdapter", "load round rectangle picture failed");
                    return;
                }
                Drawable drawable2 = eVar.d.getDrawable();
                if (drawable2 == null) {
                    LogUtil.d("ColumnLayoutAdapter", "mAppTurnPageImage background drawable is null,return");
                    return;
                }
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                float fA = fya.a(8.0f);
                fya.a(eVar.f8252c, singleGridContentE, new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
                fya.d(eVar.f8252c, intrinsicWidth);
            }
        });
        fya.e(eVar.f8250a, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        if (TextUtils.isEmpty(singleGridContentE.getMarketingIcon()) || TextUtils.equals(singleGridContentE.getMarketingIcon(), "none")) {
            eVar.f8251b.setVisibility(8);
        } else {
            eVar.f8251b.setVisibility(8);
            eVar.f8251b.setText(singleGridContentE.getMarketingIcon().toUpperCase());
        }
        ViewGroup.LayoutParams layoutParams = eVar.e.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = -2;
        eVar.e.setLayoutParams(layoutParams);
        c(singleGridContentE, eVar.e, i);
    }

    private void ah(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOneGridLandscapeLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        ViewGroup.LayoutParams layoutParams = eVar.gj.getLayoutParams();
        int i2 = iC / 2;
        layoutParams.width = iC;
        layoutParams.height = i2;
        eVar.gj.setLayoutParams(layoutParams);
        qqf.b(eVar.gj, singleGridContentE.getPicture(), qqf.d, 1, fww.f34656a);
        fya.e(eVar.go, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.d(eVar.gl, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.gl, true, false);
        fya.b(eVar.gk, (CornerTemplate) singleGridContentE, false);
        ViewGroup.LayoutParams layoutParams2 = eVar.gp.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = i2;
        eVar.gp.setLayoutParams(layoutParams2);
        c(singleGridContentE, eVar.gp, i);
    }

    private void ai(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setTextLinkLayout singleGridContent is null.");
            return;
        }
        if (eVar.fg == null) {
            LogUtil.j("ColumnLayoutAdapter", "setTextLinkLayout titleTextView is null.");
            return;
        }
        if (!TextUtils.isEmpty(singleGridContentE.getTheme())) {
            eVar.fg.setVisibility(0);
            eVar.fg.setText(singleGridContentE.getTheme());
        } else {
            eVar.fg.setVisibility(8);
        }
        if (TextUtils.isEmpty(singleGridContentE.getMarketingIcon()) || TextUtils.equals(singleGridContentE.getMarketingIcon(), "none")) {
            eVar.fe.setVisibility(8);
        } else {
            eVar.fe.setVisibility(0);
            eVar.fe.setText(singleGridContentE.getMarketingIcon().toUpperCase());
            if (TextUtils.equals(singleGridContentE.getMarketingIcon(), "hot")) {
                eVar.fe.setBackground(this.l.getResources().getDrawable(com.huawei.health.servicesui.R.drawable.marketing_text_link_hot));
            } else {
                eVar.fe.setBackground(this.l.getResources().getDrawable(com.huawei.health.servicesui.R.drawable.marketing_text_link_new));
            }
        }
        c(singleGridContentE, eVar.fi, i);
    }

    private void p(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setOneGridSmallEcgLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        ViewGroup.LayoutParams layoutParams = eVar.dw.getLayoutParams();
        int i2 = (iC * 9) / 27;
        layoutParams.width = iC;
        layoutParams.height = i2;
        eVar.dw.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = eVar.ec.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = iC;
        eVar.ec.setLayoutParams(layoutParams2);
        fya.e(eVar.ed, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.e(eVar.dz, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        fya.b(eVar.ea, (CornerTemplate) singleGridContentE, false);
        boolean zAc = qrs.ac();
        if (!zAc) {
            if (fya.d() && eVar.dz.getTextSize() > qrs.d(this.l, 28.0f)) {
                eVar.ed.setTextSize(1, 28.0f);
            }
            eVar.dz.setVisibility(8);
            eVar.ei.setVisibility(8);
            eVar.ed.setVisibility(0);
        } else {
            eVar.dz.setVisibility(0);
            eVar.dz.setTextSize(1, 28.0f);
            eVar.ed.setVisibility(8);
            eVar.eb.setVisibility(8);
        }
        fya.d(eVar.ee, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        fya.b(eVar.ee, true, false);
        if (zAc) {
            eVar.ee.setVisibility(8);
        }
        qqf.b(eVar.dw, singleGridContentE.getPicture(), qqf.d, 0, fww.f34656a);
        boolean z = !TextUtils.isEmpty(singleGridContentE.getLinkValue()) && (singleGridContentE.getLinkValue().contains("com.huawei.health.ecg.collection") || singleGridContentE.getLinkValue().contains("com.huawei.ecgh5") || singleGridContentE.getLinkValue().contains("com.huawei.health.h5.ecg")) && qrg.e();
        if (zAc) {
            eVar.ei.setVisibility(z ? 0 : 8);
        } else {
            eVar.eb.setVisibility(z ? 0 : 8);
        }
        c(singleGridContentE, eVar.ec, i);
    }

    private void i(e eVar, int i) {
        SingleGridContent singleGridContentE = e(eVar, i);
        if (singleGridContentE == null) {
            LogUtil.j("ColumnLayoutAdapter", "setFourGradFullImageLayout singleGridContent is null.");
            return;
        }
        int iC = fxk.c(this.l, this.h, this.n.size());
        ViewGroup.LayoutParams layoutParams = eVar.v.getLayoutParams();
        int i2 = iC / 2;
        layoutParams.width = iC;
        layoutParams.height = i2;
        eVar.v.setLayoutParams(layoutParams);
        qqf.b(eVar.v, singleGridContentE.getPicture(), qqf.d, 1, fww.f34656a);
        fya.b(eVar.p, (CornerTemplate) singleGridContentE, false);
        fya.e(eVar.u, singleGridContentE.getTheme(), singleGridContentE.isThemeVisibility());
        if (qrs.ac()) {
            fya.d(eVar.r, singleGridContentE.getDescription(), false);
        } else {
            fya.d(eVar.r, singleGridContentE.getDescription(), singleGridContentE.getDescriptionVisibility());
        }
        fya.b(eVar.r, true, false);
        ViewGroup.LayoutParams layoutParams2 = eVar.y.getLayoutParams();
        layoutParams2.width = iC;
        layoutParams2.height = i2;
        eVar.y.setLayoutParams(layoutParams2);
        c(singleGridContentE, eVar.y, i);
    }

    private void d(final SingleGridContent singleGridContent, final View view, final int i, IBaseResponseCallback iBaseResponseCallback) {
        if (singleGridContent == null || view == null) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.10
            @Override // java.lang.Runnable
            public void run() {
                ColumnLayoutAdapter.this.b(singleGridContent, view, i);
            }
        }, 100L);
        view.setOnClickListener(b(singleGridContent, i, iBaseResponseCallback));
    }

    private void c(SingleGridContent singleGridContent, View view, int i) {
        d(singleGridContent, view, i, (IBaseResponseCallback) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SingleGridContent singleGridContent, View view, int i) {
        if (view == null || c(singleGridContent)) {
            return;
        }
        qsp.a(view, (ViewTreeObserver.OnGlobalLayoutListener) new b(this, view, singleGridContent, i));
        qsp.a(view, (ViewTreeObserver.OnScrollChangedListener) new b(this, view, singleGridContent, i));
        if (this.h == 47 && this.ab) {
            ObserverManagerUtil.d(this.k, "marketing_response_arrived");
            this.ab = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(SingleGridContent singleGridContent) {
        if (this.h != 47) {
            return singleGridContent != null && this.p.contains(singleGridContent);
        }
        if (singleGridContent == null) {
            return false;
        }
        String itemId = singleGridContent.getItemId();
        if (TextUtils.isEmpty(itemId)) {
            return false;
        }
        if (this.v) {
            return this.r.containsKey(itemId);
        }
        return this.r.containsKey(itemId) && (!this.w || this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SingleGridContent singleGridContent, View view, int i) {
        if (view == null || view.getVisibility() != 0 || singleGridContent == null) {
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        Rect rect = new Rect();
        if (view.getLocalVisibleRect(rect) && ColumnLinearLayout.a(rect, height, width) && !c(singleGridContent)) {
            if (this.h == 47) {
                String itemId = singleGridContent.getItemId();
                singleGridContent.setItemPosition(i);
                if (TextUtils.isEmpty(itemId)) {
                    return;
                }
                if (this.v) {
                    this.r.put(itemId, singleGridContent);
                    e(1, singleGridContent, i);
                    return;
                } else {
                    this.r.put(itemId, singleGridContent);
                    return;
                }
            }
            this.p.add(singleGridContent);
            e(1, singleGridContent, i);
        }
    }

    private void a(final SingleGridContent singleGridContent, final View view, final int i) {
        if (singleGridContent == null || view == null) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.7
            @Override // java.lang.Runnable
            public void run() {
                ColumnLayoutAdapter.this.b(singleGridContent, view, i);
            }
        }, 100L);
        if (TextUtils.isEmpty(singleGridContent.getLinkValue())) {
            LogUtil.j("ColumnLayoutAdapter", "setOnClickListener() linkValue is empty.");
        } else {
            view.setOnClickListener(a(singleGridContent, i));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.marketing.views.ColumnLayoutAdapter$9, reason: invalid class name */
    public class AnonymousClass9 implements View.OnClickListener {
        final /* synthetic */ SingleGridContent d;
        final /* synthetic */ int e;

        AnonymousClass9(SingleGridContent singleGridContent, int i) {
            this.d = singleGridContent;
            this.e = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String linkValue = this.d.getLinkValue();
            if (TextUtils.isEmpty(linkValue) || qrs.r()) {
                return;
            }
            if (ColumnLayoutAdapter.this.ac != null) {
                ColumnLayoutAdapter.this.ac.onClick(view);
            }
            boolean zB = fxk.b(linkValue);
            final String str = linkValue + "&playing=true";
            if (!zB) {
                ColumnLayoutAdapter.this.e(2, this.d, this.e);
                ColumnLayoutAdapter.this.d(str, this.e, this.d);
            } else {
                LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
                final SingleGridContent singleGridContent = this.d;
                final int i = this.e;
                loginInit.browsingToLogin(new IBaseResponseCallback() { // from class: fyq
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        this.e.c(singleGridContent, i, str, i2, obj);
                    }
                }, AnalyticsValue.MARKETING_RESOURCE.value());
            }
        }

        public /* synthetic */ void c(SingleGridContent singleGridContent, int i, String str, int i2, Object obj) {
            if (i2 == 0) {
                ColumnLayoutAdapter.this.e(2, singleGridContent, i);
                ColumnLayoutAdapter.this.d(str, i, singleGridContent);
            } else {
                LogUtil.j("ColumnLayoutAdapter", "getViewClickListener errorCode = ", Integer.valueOf(i2));
            }
        }
    }

    private View.OnClickListener a(SingleGridContent singleGridContent, int i) {
        return new AnonymousClass9(singleGridContent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(SingleGridContent singleGridContent) {
        if (!TextUtils.equals(singleGridContent.getItemCategory(), "OtherBenefitOfDevice") && !TextUtils.equals(singleGridContent.getItemCategory(), "OtherBenefitOfMember")) {
            return false;
        }
        String linkValue = singleGridContent.getLinkValue();
        LogUtil.a("ColumnLayoutAdapter", "dealWithOtherBenefitClick linkValue:", linkValue);
        if (TextUtils.isEmpty(linkValue)) {
            qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_other_benefit_get_failed);
            return true;
        }
        if (!TextUtils.equals(singleGridContent.getItemCategory(), "OtherBenefitOfMember") || irz.i()) {
            return false;
        }
        qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_vip_expired_benefit_get_failed);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SingleGridContent singleGridContent, final View view, final int i) {
        if (!CommonUtil.ab(this.l)) {
            qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_network_connect_error);
            return;
        }
        String dynamicDataId = singleGridContent.getDynamicDataId();
        LogUtil.a("ColumnLayoutAdapter", "dealWithCouponClick.getDynamicDataId = ", dynamicDataId);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dynamicDataId);
        ((PayApi) Services.b("TradeService", PayApi.class)).receiveCouponList(arrayList, new IBaseResponseCallback() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.a("ColumnLayoutAdapter", "receive CouponList errorCode = ", Integer.valueOf(i2));
                if (i2 == 0 || i2 == 3090004) {
                    ColumnLayoutAdapter.this.c(singleGridContent, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.assets?isImmerse&h5pro=true&pName=com.huawei.health&path=CouponDetail&urlType=4&couponId=" + singleGridContent.getDynamicDataId() + "&status=1", view, i);
                    return;
                }
                if (i2 >= 3090006 && i2 <= 3090009) {
                    qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_member_buy_and_receive);
                    return;
                }
                if (i2 == 3090005) {
                    qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_member_coupon_receive_out);
                    return;
                }
                if (i2 == 3090013) {
                    if (!(obj instanceof List)) {
                        LogUtil.j("ColumnLayoutAdapter", "objdata is not list.");
                        qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_system_error);
                        return;
                    }
                    List list = (List) obj;
                    if (list.size() == 1) {
                        int resultCode = ((CouponResult) list.get(0)).getResultCode();
                        LogUtil.a("ColumnLayoutAdapter", "receive single Coupon errorCode = ", Integer.valueOf(i2));
                        ColumnLayoutAdapter.this.b(resultCode, singleGridContent, view, i);
                        return;
                    }
                    qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_system_error);
                    return;
                }
                qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_system_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, SingleGridContent singleGridContent, View view, int i2) {
        if (i == 0 || i == 3090004) {
            c(singleGridContent, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.assets?isImmerse&h5pro=true&pName=com.huawei.health&path=CouponDetail&urlType=4&couponId=" + singleGridContent.getDynamicDataId() + "&status=1", view, i2);
            return;
        }
        if (i >= 3090006 && i <= 3090009) {
            qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_member_buy_and_receive);
        } else if (i == 3090005) {
            qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_member_coupon_receive_out);
        } else {
            qpx.e(BaseApplication.getContext(), com.huawei.health.servicesui.R.string.IDS_system_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final SingleGridContent singleGridContent, String str, View view, final int i) {
        LogUtil.a("ColumnLayoutAdapter", "dealWithCouponClick.linkValue = ", str);
        if (TextUtils.isEmpty(str) || qrs.r()) {
            return;
        }
        View.OnClickListener onClickListener = this.ac;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        boolean zB = fxk.b(str);
        final String str2 = str + "&playing=true";
        if (!zB) {
            e(2, singleGridContent, i);
            d(str2, i, singleGridContent);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fyo
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.e.b(singleGridContent, i, str2, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void b(SingleGridContent singleGridContent, int i, String str, int i2, Object obj) {
        if (i2 == 0) {
            e(2, singleGridContent, i);
            d(str, i, singleGridContent);
        } else {
            LogUtil.j("ColumnLayoutAdapter", "getViewClickListener errorCode = ", Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.marketing.views.ColumnLayoutAdapter$8, reason: invalid class name */
    public class AnonymousClass8 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IBaseResponseCallback f8244a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8246c;
        final /* synthetic */ SingleGridContent d;

        AnonymousClass8(SingleGridContent singleGridContent, IBaseResponseCallback iBaseResponseCallback, int i) {
            this.d = singleGridContent;
            this.f8244a = iBaseResponseCallback;
            this.f8246c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View view) {
            LogUtil.a("ColumnLayoutAdapter", "isCouponIdVisibility = ", Boolean.valueOf(this.d.isCouponIdVisibility()));
            IBaseResponseCallback iBaseResponseCallback = this.f8244a;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
            }
            if (ColumnLayoutAdapter.this.a(this.d)) {
                return;
            }
            if (this.d.isCouponIdVisibility()) {
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final SingleGridContent singleGridContent = this.d;
                final int i = this.f8246c;
                threadPoolManagerC.execute(new Runnable() { // from class: fyr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34758a.b(singleGridContent, view, i);
                    }
                });
                return;
            }
            final String linkValue = this.d.getLinkValue();
            if (TextUtils.isEmpty(linkValue) || qrs.r()) {
                return;
            }
            if (ColumnLayoutAdapter.this.ac != null) {
                ColumnLayoutAdapter.this.ac.onClick(view);
                if (ColumnLayoutAdapter.this.z) {
                    return;
                }
            }
            if ((ColumnLayoutAdapter.this.h == 53 || ColumnLayoutAdapter.this.h == 15) && (linkValue.contains("com.huawei.health.ecg.collection") || linkValue.contains("com.huawei.ecgh5") || linkValue.contains("com.huawei.health.h5.ecg"))) {
                qrg.d(false);
                ColumnLayoutAdapter.this.notifyDataSetChanged();
            }
            if (linkValue.contains("com.huawei.study.hiresearch")) {
                LogUtil.a("ColumnLayoutAdapter", "Not the first time in the Blood Pressure Health Study.");
            }
            if (TextUtils.equals(ColumnLayoutAdapter.this.j, SingleDailyMomentContent.INFORMATION_TYPE)) {
                String dynamicDataId = this.d.getDynamicDataId();
                if (qrs.d(dynamicDataId)) {
                    try {
                        ColumnRequestUtils.reportInfoReadNumber(Integer.parseInt(dynamicDataId));
                    } catch (NumberFormatException unused) {
                        LogUtil.e("ColumnLayoutAdapter", "getViewClickListener dynamicDataId NumberFormatException.");
                    }
                }
            }
            if (!fxk.b(linkValue)) {
                ColumnLayoutAdapter.this.e(2, this.d, this.f8246c);
                ColumnLayoutAdapter.this.d(linkValue, this.f8246c, this.d);
            } else {
                LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
                final SingleGridContent singleGridContent2 = this.d;
                final int i2 = this.f8246c;
                loginInit.browsingToLogin(new IBaseResponseCallback() { // from class: fys
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i3, Object obj) {
                        this.f34762b.d(singleGridContent2, i2, linkValue, i3, obj);
                    }
                }, AnalyticsValue.MARKETING_RESOURCE.value());
            }
        }

        public /* synthetic */ void b(SingleGridContent singleGridContent, View view, int i) {
            ColumnLayoutAdapter.this.e(singleGridContent, view, i);
        }

        public /* synthetic */ void d(SingleGridContent singleGridContent, int i, String str, int i2, Object obj) {
            if (i2 == 0) {
                ColumnLayoutAdapter.this.e(2, singleGridContent, i);
                ColumnLayoutAdapter.this.d(str, i, singleGridContent);
            } else {
                LogUtil.j("ColumnLayoutAdapter", "getViewClickListener errorCode = ", Integer.valueOf(i2));
            }
        }
    }

    private View.OnClickListener b(SingleGridContent singleGridContent, int i, IBaseResponseCallback iBaseResponseCallback) {
        return new AnonymousClass8(singleGridContent, iBaseResponseCallback, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, int i, SingleGridContent singleGridContent) {
        UserMemberInfo userMemberInfoA;
        LogUtil.a("ColumnLayoutAdapter", "linkValue: ", str);
        int i2 = this.h;
        if (i2 == 83 || i2 == 84) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setPackage(this.l.getPackageName());
            intent.setFlags(268435456);
            lsx.c(intent, this.l);
            return;
        }
        if ((i2 == 79 || i2 == 92) && e(str)) {
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent2.setPackage(this.l.getPackageName());
            intent2.setFlags(268435456);
            lsx.c(intent2, this.l);
            return;
        }
        if (this.h == 96 && ((userMemberInfoA = irz.a()) == null || userMemberInfoA.getMemberFlag() == -1 || irz.d(userMemberInfoA))) {
            AppRouter.c("/OperationBundle/MemberTypeSelectActivity").a("MEMBER_TYPE_SELECT_INDEX", 0).a(com.huawei.health.servicesui.R.anim.fade_in, com.huawei.health.servicesui.R.anim.fade_out).b(this.l);
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(fxl.c(fxl.d(str, this.j), this.ae, i + 1, singleGridContent, this.ag));
        }
    }

    private boolean e(String str) {
        return str != null && str.startsWith("huaweischeme://healthapp/basicHealth?healthType=1&pageType=series_course_detail");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = this.h;
        if (i == 8) {
            if (this.aa) {
                List<SingleGridContent> list = this.ad.get(0);
                this.n = list;
                if (list == null) {
                    return 0;
                }
                return list.size();
            }
            List<List<SingleGridContent>> list2 = this.ad;
            if (list2 == null) {
                return 0;
            }
            return list2.size();
        }
        if (i == 48) {
            List<List<SingleGridContent>> list3 = this.ad;
            if (list3 == null) {
                return 0;
            }
            return list3.size();
        }
        if (i == 10 || i == 23) {
            List<SingleEntryContent> list4 = this.ai;
            if (list4 == null) {
                return 0;
            }
            return list4.size();
        }
        if (i == 113) {
            List<SingleHotSeriesRecommendContent> list5 = this.g;
            if (list5 == null) {
                return 0;
            }
            return list5.size();
        }
        if (i == 116) {
            List<SingleFunctionGridContent> list6 = this.al;
            if (list6 == null) {
                return 0;
            }
            return list6.size();
        }
        List<SingleGridContent> list7 = this.n;
        if (list7 == null) {
            return 0;
        }
        return list7.size();
    }

    public static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f8250a;
        private HealthTextView aa;
        private Typeface ab;
        private HealthTextView ac;
        private RelativeLayout ad;
        private ImageView ae;
        private HealthTextView af;
        private ImageView ag;
        private ImageView ah;
        private ImageView ai;
        private HealthTextView aj;
        private LinearLayout ak;
        private ImageView al;
        private HealthTextView am;
        private HealthTextView an;
        private HealthTextView ao;
        private HealthDivider ap;
        private HealthTextView aq;
        private ImageView ar;
        private LinearLayout as;
        private HealthCardView at;
        private HealthTextView au;
        private HealthTextView av;
        private ImageView aw;
        private RelativeLayout ax;
        private ImageView ay;
        private HealthTextView az;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f8251b;
        private HealthTextView ba;
        private HealthTextView bb;
        private LinearLayout bc;
        private HealthTextView bd;
        private ImageView be;
        private HealthTextView bf;
        private LinearLayout bg;
        private HealthTextView bh;
        private LinearLayout bi;
        private HealthTextView bj;
        private HealthTextView bk;
        private HealthTextView bl;
        private ImageView bm;
        private HealthTextView bn;
        private HealthTextView bo;
        private HealthTextView bp;
        private View bq;
        private HealthImageView br;
        private HealthTextView bs;
        private ImageView bt;
        private HealthCardView bu;
        private HealthTextView bv;
        private View bw;
        private HealthTextView bx;
        private ImageView by;
        private HealthTextView bz;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f8252c;
        private HealthTextView ca;
        private HealthTextView cb;
        private HealthTextView cc;
        private HealthTextView cd;
        private RelativeLayout ce;
        private HealthTextView cf;
        private HealthTextView cg;
        private HealthTextView ch;
        private LinearLayout ci;
        private RelativeLayout cj;
        private HealthTextView ck;
        private ImageView cl;
        private ImageView cm;
        private RelativeLayout cn;
        private HealthTextView co;
        private HealthTextView cp;
        private ImageView cq;
        private ImageView cr;
        private HealthTextView cs;
        private HealthTextView ct;
        private HealthTextView cu;
        private HealthTextView cv;
        private HealthCardView cw;
        private RelativeLayout cx;
        private ImageView cy;
        private HealthTextView cz;
        private ImageView d;
        private HealthTextView da;
        private HealthTextView db;
        private HealthTextView dc;
        private HealthTextView dd;
        private ImageView de;
        private ImageView df;
        private HealthTextView dg;
        private ImageView dh;
        private HealthTextView di;
        private HealthCardView dj;
        private LinearLayout dk;
        private HealthTextView dl;
        private HealthCardView dm;
        private HealthTextView dn;

        /* JADX INFO: renamed from: do, reason: not valid java name */
        private ImageView f1do;
        private LinearLayout dp;
        private HealthCardView dq;
        private ImageView dr;
        private HealthTextView ds;
        private HealthTextView dt;
        private HealthTextView du;
        private HealthTextView dv;
        private ImageView dw;
        private ImageView dx;
        private HealthTextView dy;
        private HealthTextView dz;
        private RelativeLayout e;
        private HealthTextView ea;
        private ImageView eb;
        private RelativeLayout ec;
        private HealthTextView ed;
        private HealthTextView ee;
        private HealthTextView ef;
        private RelativeLayout eg;
        private ImageView eh;
        private ImageView ei;
        private HealthTextView ej;
        private HealthTextView ek;
        private HealthTextView el;
        private HealthTextView em;
        private HealthTextView en;
        private HealthTextView eo;
        private HealthTextView ep;
        private ImageView eq;
        private RelativeLayout er;
        private RelativeLayout es;
        private ImageView et;
        private ImageView eu;
        private ImageView ev;
        private ImageView ew;
        private RelativeLayout ex;
        private ImageView ey;
        private RelativeLayout ez;
        private ImageView f;
        private HealthTextView fa;
        private RelativeLayout fb;
        private RelativeLayout fc;
        private HealthTextView fd;
        private HealthTextView fe;
        private HealthTextView ff;
        private HealthTextView fg;
        private HealthTextView fh;
        private RelativeLayout fi;
        private RelativeLayout fj;
        private HealthTextView fk;
        private ImageView fl;
        private HealthTextView fm;
        private HealthTextView fn;
        private HealthTextView fo;
        private HealthTextView fp;
        private RelativeLayout fq;
        private ImageView fr;
        private HealthTextView fs;
        private HealthTextView ft;
        private ImageView fu;
        private HealthTextView fv;
        private HealthTextView fw;
        private HealthTextView fx;
        private HealthCardView fy;
        private HealthCardView fz;
        private RelativeLayout g;
        private RelativeLayout ga;
        private HealthTextView gb;
        private RelativeLayout gc;
        private HealthTextView gd;
        private ImageView ge;
        private LinearLayout gf;
        private HealthTextView gg;
        private HealthTextView gh;
        private HealthTextView gi;
        private ImageView gj;
        private HealthTextView gk;
        private HealthTextView gl;
        private HealthCardView gm;
        private ImageView gn;
        private HealthTextView go;
        private RelativeLayout gp;
        private HealthTextView gq;
        private HealthDivider gr;
        private RelativeLayout gs;
        private HealthTextView gt;
        private HealthTextView gu;
        private HealthTextView gv;
        private ImageView gw;
        private HealthTextView gx;
        private RelativeLayout gz;
        private HealthTextView h;
        private HealthCardView i;
        private HealthTextView j;
        private HealthTextView k;
        private HealthCardView l;
        private MeasureCardView m;
        private ImageView n;
        private RelativeLayout o;
        private HealthTextView p;
        private HealthTextView q;
        private HealthTextView r;
        private HealthTextView s;
        private HealthTextView t;
        private HealthTextView u;
        private ImageView v;
        private HealthTextView w;
        private HealthImageView x;
        private RelativeLayout y;
        private ImageView z;

        e(View view, int i, boolean z) {
            super(view);
            if (i == 35) {
                x(view);
                return;
            }
            if (i == 36) {
                b(view);
                return;
            }
            if (i == 39 || i == 40) {
                z(view);
                return;
            }
            if (i == 53) {
                m(view);
                return;
            }
            if (i == 59) {
                ad(view);
                return;
            }
            if (i == 76) {
                h(view);
                return;
            }
            if (i == 92) {
                w(view);
                return;
            }
            if (i == 94) {
                ab(view);
                return;
            }
            if (i == 96) {
                o(view);
                return;
            }
            if (i == 107) {
                n(view);
                return;
            }
            if (i == 116) {
                j(view);
                return;
            }
            if (i == 9999) {
                f(view);
                return;
            }
            if (i == 79) {
                v(view);
                return;
            }
            if (i != 80) {
                switch (i) {
                    case 6:
                        g(view);
                        return;
                    case 7:
                    case 9:
                        aa(view);
                        return;
                    case 8:
                        ac(view);
                        i(view);
                        return;
                    case 10:
                        break;
                    default:
                        switch (i) {
                            case 15:
                                l(view);
                                return;
                            case 16:
                                s(view);
                                return;
                            case 17:
                                ac(view);
                                return;
                            default:
                                switch (i) {
                                    case 22:
                                        a(view);
                                        break;
                                    case 23:
                                        break;
                                    case 24:
                                        if (z) {
                                            ag(view);
                                        } else {
                                            e(view);
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 47:
                                                c(view);
                                                break;
                                            case 48:
                                                y(view);
                                                break;
                                            case 49:
                                                d(view);
                                                break;
                                            default:
                                                switch (i) {
                                                    case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                                                        q(view);
                                                        break;
                                                    case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                                                        r(view);
                                                        break;
                                                    case 84:
                                                        p(view);
                                                        break;
                                                    case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                                                        t(view);
                                                        break;
                                                    default:
                                                        LogUtil.j("GridPageHolder", "create GridPageHolder failed, unknown contentType = ", Integer.valueOf(i));
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                return;
                        }
                }
                k(view);
                return;
            }
            u(view);
        }

        private void j(View view) {
            this.ax = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_quick_entry_root_layout);
            this.aw = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_multi_function_image);
            this.av = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_multi_function_title);
            this.au = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_quick_entry_sub_title);
            fya.b(this.av, false, true);
            fya.b(this.au, false, true);
        }

        private void h(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.br = (HealthImageView) view.findViewById(com.huawei.health.servicesui.R.id.img);
            this.bp = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.name);
            this.bq = view.findViewById(com.huawei.health.servicesui.R.id.two_prices_layout);
            this.bw = view.findViewById(com.huawei.health.servicesui.R.id.vip_price_layout);
            this.bo = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.description);
            this.bn = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.corner_mark);
            this.ab = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        }

        private void n(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.by = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.background_image);
            this.cg = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.section_title);
            this.cb = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.section_difficulty);
            this.ca = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.section_duration);
            this.bz = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.section_calorie);
            this.cd = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.section_train_number);
            fya.b(this.cg, false, false);
            fya.b(this.cb, false, false);
            fya.b(this.ca, false, false);
            fya.b(this.bz, false, false);
        }

        private void r(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSleepPopluarCoursesHolder() itemView is null.");
                return;
            }
            this.dk = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_sleep_root_layout);
            this.de = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_image);
            this.di = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_title);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_chapters);
            this.db = healthTextView;
            healthTextView.setVisibility(8);
            this.dd = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_recommended_course);
            ImageView imageView = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_play_button);
            this.df = imageView;
            imageView.setVisibility(8);
            this.i = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.card_bottom);
            this.at = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.card_middle);
            Context context = view.getContext();
            if (context != null) {
                if (qqs.e(context)) {
                    this.i.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                    this.at.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                } else {
                    this.i.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_5alpha));
                    this.at.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_5alpha));
                }
            }
            ae(view);
            fya.b(this.di, false, false);
            fya.b(this.db, true, false);
            fya.b(this.dd, false, false);
        }

        private void ae(View view) {
            final HealthCardView healthCardView = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_card_view);
            final HealthCardView healthCardView2 = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.card_middle);
            final HealthCardView healthCardView3 = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.card_bottom);
            healthCardView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.e.5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    healthCardView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = healthCardView.getMeasuredWidth();
                    int iD = qrs.d(BaseApplication.getContext(), 4.0f);
                    ViewGroup.LayoutParams layoutParams = healthCardView2.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.width = measuredWidth - (iD * 2);
                        healthCardView2.setLayoutParams(layoutParams2);
                    }
                    ViewGroup.LayoutParams layoutParams3 = healthCardView3.getLayoutParams();
                    if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                        layoutParams4.width = measuredWidth - (iD * 4);
                        healthCardView3.setLayoutParams(layoutParams4);
                    }
                }
            });
        }

        private void t(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSleepYogaHolder() itemView is null.");
                return;
            }
            this.dq = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.item_sleep_yoga_card_view);
            this.dr = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_sleep_yoga_image);
            this.dt = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.sleep_yoga_title);
            this.ds = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.sleep_yoga_description);
        }

        private void p(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSeriesCourseThirdPartHolder() itemView is null.");
                return;
            }
            this.l = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_card_view);
            this.ae = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_image);
            this.gh = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.title);
            this.k = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.description);
            this.cp = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.play_percent);
            this.fz = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.bottom_card);
            this.fy = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.middle_card);
            Context context = view.getContext();
            if (context != null) {
                if (qqs.e(context)) {
                    this.fz.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                    this.fy.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                } else {
                    this.fz.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_5alpha));
                    this.fy.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_5alpha));
                }
            }
        }

        private void l(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getOneGridSmallHolder() itemView is null.");
                return;
            }
            this.eg = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_root_layout);
            this.dx = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_image);
            this.dy = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_status);
            this.du = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_join_num);
            this.ej = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_title);
            this.dv = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_description);
            this.eh = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_red);
            fya.b(this.dy, false, false);
            fya.b(this.du, false, false);
            fya.b(this.ej, false, true);
            fya.b(this.dv, true, false);
        }

        private void aa(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getTwoGridLandscapeHolder() itemView is null.");
                return;
            }
            this.gm = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_landscape_layout);
            this.ge = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_landscape_image);
            this.gf = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_two_landscape_in_layout);
            this.gi = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_landscape_title);
            this.gg = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_landscape_description);
            this.gd = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_landscape_corner);
            fya.b(this.gi, false, true);
            fya.b(this.gg, true, false);
        }

        private void s(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSecondPalaceVerticalHolder() itemView is null.");
                return;
            }
            this.cx = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_two_big_landscape_layout);
            this.cr = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_big_landscape_image);
            this.cu = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_big_landscape_corner);
            this.cv = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_big_landscape_title);
            this.cs = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_big_landscape_description);
            fya.b(this.cv, false, true);
            fya.b(this.cs, true, false);
        }

        private void ac(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getTwoGridVerticalTwoItemView() itemView is null.");
                return;
            }
            this.cw = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.item_second_vertical_two_layout);
            this.dc = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_second_vertical_two_title);
            this.cz = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_second_vertical_two_describe);
            this.cy = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_second_vertical_two_image);
            this.da = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_second_vertical_two_corner);
            fya.b(this.dc, false, true);
            fya.b(this.cz, true, false);
        }

        private void i(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getOneAddTwoItemView() itemView is null.");
                return;
            }
            this.ci = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_root_layout);
            this.bc = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_big_layout);
            this.az = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_big_title);
            this.ba = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_big_describe);
            this.ay = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_big_image);
            this.bb = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_big_corner);
            this.bi = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_top_layout);
            this.bk = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_top_title);
            this.bj = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_top_describe);
            this.bm = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_top_image);
            this.bl = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_top_corner);
            this.bg = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_bottom_layout);
            this.bd = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_bottom_title);
            this.bh = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_bottom_describe);
            this.be = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_bottom_image);
            this.bf = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_two_right_bottom_corner);
            fya.b(this.az, false, true);
            fya.b(this.ba, true, false);
            fya.b(this.bk, false, true);
            fya.b(this.bj, true, false);
            fya.b(this.bd, false, true);
            fya.b(this.bh, true, false);
        }

        private void y(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getThreeGradFullImageView() itemView is null.");
                return;
            }
            this.ga = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_layout);
            this.fj = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_layout);
            this.fk = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_title);
            this.fm = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_describe);
            this.fl = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_image);
            this.ff = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_corner);
            this.fn = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_join_num);
            this.gc = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_top_layout);
            this.gb = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_top_title);
            this.fv = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_top_describe);
            this.fu = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_top_image);
            this.ft = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_top_corner);
            this.fw = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_top_join_num);
            this.fq = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_bottom_layout);
            this.fx = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_bottom_title);
            this.fp = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_bottom_describe);
            this.fr = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_bottom_image);
            this.fs = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_bottom_corner);
            this.fo = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_three_full_image_bottom_join_num);
            fya.b(this.fk, false, true);
            fya.b(this.fm, true, false);
            fya.b(this.fn, false, false);
            fya.b(this.gb, false, true);
            fya.b(this.fv, true, false);
            fya.b(this.fw, false, false);
            fya.b(this.fx, false, true);
            fya.b(this.fp, true, false);
            fya.b(this.fo, false, false);
        }

        private void g(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getOneGridBigHolder() itemView is null.");
                return;
            }
            this.bu = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_root_layout);
            this.ce = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_image_layout);
            this.bt = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_image);
            this.cc = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_status);
            this.cf = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_title);
            this.bx = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_join_num);
            this.bs = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_attribute_text);
            this.bv = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_big_description);
            fya.b(this.cc, false, false);
            fya.b(this.cf, false, true);
            fya.b(this.bx, false, false);
            fya.b(this.bs, false, false);
            fya.b(this.bv, true, false);
        }

        private void o(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.cj = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_point_eight_grid_slide_root_layout);
            this.cl = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_point_eight_grid_slide_image);
            this.ck = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_point_eight_grid_slide_title);
            this.ch = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_point_eight_grid_slide_description);
            fya.b(this.ck, false, false);
            fya.b(this.ch, false, false);
        }

        private void ab(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.gz = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_vertical_rectangle_slide_root_layout);
            this.gw = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_vertical_rectangle_slide_image);
            this.gv = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_vertical_rectangle_slide_corner);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_vertical_rectangle_slide_title);
            this.gx = healthTextView;
            fya.b(healthTextView, false, false);
        }

        private void ad(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getTwoLinesLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.gs = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_twolines_landscape_slide_root_layout);
            this.gn = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_twolines_landscape_slide_image);
            this.gt = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_twolines_landscape_slide_title);
            this.gu = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_twolines_landscape_slide_time);
            this.gr = (HealthDivider) view.findViewById(com.huawei.health.servicesui.R.id.item_twolines_divider);
            this.gq = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_twolines_landscape_slide_corner);
            fya.b(this.gt, false, true);
            fya.b(this.gu, false, false);
        }

        private void a(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getApplicationIconHolder() itemView is null.");
                return;
            }
            this.g = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_application_icon_root_layout);
            this.f = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_application_icon_image);
            this.j = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_application_icon_title);
            this.h = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_application_icon_root_top_corner_mark);
            fya.b(this.j, false, true);
        }

        private void k(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getQuickEntryHolder() itemView is null.");
                return;
            }
            this.cn = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_quick_entry_root_layout);
            this.cm = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_quick_entry_image);
            this.cq = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_quick_entry_red_point);
            this.co = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_quick_entry_red_name);
            this.ct = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_quick_entry_title);
            fya.b(this.co, false, true);
            fya.b(this.ct, false, true);
        }

        private void e(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getImageTextHolder() itemView is null.");
                return;
            }
            this.as = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_layout);
            this.ar = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_image);
            this.aq = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_title);
            this.ao = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_description);
            this.ap = (HealthDivider) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_line);
            this.aj = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_corner_mark);
            if (qrs.ac()) {
                qrs.a(this.aq);
            }
            if (qrs.i() < 1.45f || qrs.i() >= 2.9f) {
                return;
            }
            this.aq.setTextSize(1, (this.aq.getTextSize() / this.aq.getContext().getResources().getDisplayMetrics().scaledDensity) * ColumnLayoutAdapter.f8220b);
        }

        private void ag(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "initImageTextBlankHolder failed, itemView is null.");
                return;
            }
            this.ak = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_blank_layout);
            this.al = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_blank_image);
            this.am = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_blank_title);
            this.af = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_image_text_blank_description);
            this.ah = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.id_iv_image_text_blank_head_1);
            this.ag = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.id_iv_image_text_blank_head_2);
            this.ai = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.id_iv_image_text_blank_head_3);
            this.an = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.id_tv_image_text_blank_statistic);
            if (qrs.ac()) {
                qrs.a(this.aq);
            }
            if (qrs.i() < 1.45f || qrs.i() >= 2.9f) {
                return;
            }
            this.am.setTextSize(1, (this.am.getTextSize() / this.am.getContext().getResources().getDisplayMetrics().scaledDensity) * ColumnLayoutAdapter.f8220b);
        }

        private void c(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getFunctionMenuHolder() itemView is null.");
                return;
            }
            this.ad = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_function_menu_root_layout);
            this.x = (HealthImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_function_menu_image);
            this.z = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_function_menu_red_dot);
            this.ac = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_function_menu_message);
            this.w = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_function_menu_corner);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_function_menu_title);
            this.aa = healthTextView;
            healthTextView.setHyphenationFrequency(1);
            this.aa.setBreakStrategy(1);
            fya.b(this.aa, false, true);
        }

        private void b(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getAppTurnPageHolder() itemView is null.");
                return;
            }
            this.e = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_app_turn_page_root_layout);
            this.d = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_app_turn_page_image);
            this.f8251b = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_app_turn_page_red_name);
            this.f8250a = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_app_turn_page_title);
            this.f8252c = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_app_turn_page_top_corner_mark);
            fya.b(this.f8251b, false, true);
            fya.b(this.f8250a, false, true);
        }

        private void z(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getTwoGridLandscapeTwoHolder() itemView is null.");
                return;
            }
            this.gp = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_two_grad_landscape_two_layout);
            this.gj = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_grad_landscape_two_image);
            this.go = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_grad_landscape_two_title);
            this.gl = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_grad_landscape_two_description);
            this.gk = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_two_grad_landscape_two_corner);
            fya.b(this.go, false, true);
            fya.b(this.gl, true, false);
        }

        private void x(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getTextLinkHolder() itemView is null.");
                return;
            }
            this.fi = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_text_link_root_layout);
            this.fe = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_text_link_icon);
            this.fg = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_text_link_title);
            fya.b(this.fe, false, false);
            fya.b(this.fg, false, false);
        }

        private void f(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getOneGridSmallEcgHolder() itemView is null.");
                return;
            }
            this.o = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.root_relative_layout);
            this.q = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.title);
            this.n = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.icon);
            this.m = (MeasureCardView) view.findViewById(com.huawei.health.servicesui.R.id.measure_card_view);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.primary_tip);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.secondary_tip);
            HealthTextView healthTextView3 = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.time_text);
            fya.b(this.q, false, true);
            fya.b(healthTextView, false, true);
            fya.b(healthTextView2, false, true);
            fya.b(healthTextView3, false, true);
        }

        private void m(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getOneGridSmallEcgHolder() itemView is null.");
                return;
            }
            this.ec = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_ecg_root_layout);
            this.dw = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_ecg_image);
            this.ed = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_ecg_title);
            this.dz = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_title);
            this.ee = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_ecg_description);
            this.eb = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_ecg_red);
            this.ei = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_red);
            this.ea = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_one_grid_small_ecg_corner);
            fya.b(this.ed, false, true);
            fya.b(this.dz, false, true);
            fya.b(this.ee, true, false);
        }

        private void v(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.fb = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_root_layout_favorites);
            this.er = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_image_layout_favorites);
            this.ew = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_icon_favorites);
            this.et = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_image_favorites);
            this.fa = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_title_favorites);
            this.el = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_description_favorites);
            this.ef = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_corner_favorites);
            this.t = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_series_button);
            fya.b(this.fa, false, true);
            fya.b(this.el, true, false);
        }

        private void w(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.fc = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_root_layout_favorites);
            this.es = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_image_layout_favorites);
            this.ey = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_icon_favorites);
            this.eq = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_image_favorites);
            this.fd = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_title_favorites);
            this.en = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_description_favorites);
            this.ek = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_corner_favorites);
            this.s = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_series_button);
            fya.b(this.fd, false, true);
            fya.b(this.en, true, false);
        }

        private void u(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.ez = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_root_layout_sleep);
            this.ex = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_image_layout_sleep);
            this.ev = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_icon_sleep);
            this.ep = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_hot_amount_sleep);
            this.eu = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_image_sleep);
            this.fh = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_title_sleep);
            this.em = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_slide_description_sleep);
            this.eo = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_square_landscape_corner_sleep);
            fya.b(this.ep, false, false);
            fya.b(this.fh, false, true);
            fya.b(this.em, true, false);
        }

        private void q(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getSquareLandscapeSlideHolder() itemView is null.");
                return;
            }
            this.dp = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_sleep_root_layout);
            this.dh = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_image);
            this.dl = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_title);
            this.dg = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_chapters);
            this.dn = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_recommended_course);
            this.f1do = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_series_courses_play_button);
            this.dj = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.card_bottom);
            this.dm = (HealthCardView) view.findViewById(com.huawei.health.servicesui.R.id.card_middle);
            Context context = view.getContext();
            if (context != null) {
                if (qqs.e(context)) {
                    this.dj.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                    this.dm.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                } else {
                    this.dj.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_10alpha));
                    this.dm.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_10alpha));
                }
            }
            ae(view);
            fya.b(this.dl, false, false);
            fya.b(this.dg, true, false);
            fya.b(this.dn, false, false);
        }

        private void d(View view) {
            if (view == null) {
                LogUtil.j("GridPageHolder", "getFourGradFullImageHolder() itemView is null.");
                return;
            }
            this.y = (RelativeLayout) view.findViewById(com.huawei.health.servicesui.R.id.item_four_grad_full_image_layout);
            this.v = (ImageView) view.findViewById(com.huawei.health.servicesui.R.id.item_four_grad_full_image_image);
            this.p = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_four_grad_full_image_corner);
            this.u = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_four_grad_full_image_title);
            this.r = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.item_four_grad_full_image_description);
            fya.b(this.u, false, true);
            fya.b(this.r, true, false);
        }
    }

    private SingleGridContent e(e eVar, int i) {
        SingleGridContent singleGridContent = new SingleGridContent(new SingleGridContent.Builder());
        if (eVar == null || njy.e(this.n)) {
            LogUtil.j("ColumnLayoutAdapter", "getCardItemObject() holder or mGridContentList or position is null.");
            return singleGridContent;
        }
        if (!njy.c(this.n, i)) {
            LogUtil.j("ColumnLayoutAdapter", "getCardItemObject() outOfBounds, position = ", Integer.valueOf(i));
            return singleGridContent;
        }
        return this.n.get(i);
    }

    private List<SingleGridContent> c(e eVar, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (eVar == null || njy.e(this.ad)) {
            LogUtil.j("ColumnLayoutAdapter", "getOneAddTwoObject() holder or mOneAddTwoList or position is null.");
            return arrayList;
        }
        if (!njy.c(this.ad, i)) {
            LogUtil.j("ColumnLayoutAdapter", "getOneAddTwoObject() outOfBounds, position = ", Integer.valueOf(i));
            return arrayList;
        }
        return this.ad.get(i);
    }

    private SingleEntryContent b(e eVar, int i) {
        SingleEntryContent singleEntryContent = new SingleEntryContent(new SingleEntryContent.Builder());
        if (eVar == null || njy.e(this.ai)) {
            LogUtil.j("ColumnLayoutAdapter", "getSingleEntryObject() holder or mQuickEntryList or position is null.");
            return singleEntryContent;
        }
        if (!njy.c(this.ai, i)) {
            LogUtil.j("ColumnLayoutAdapter", "getSingleEntryObject() outOfBounds, position = ", Integer.valueOf(i));
            return singleEntryContent;
        }
        return this.ai.get(i);
    }

    private SingleFunctionGridContent h(e eVar, int i) {
        SingleFunctionGridContent singleFunctionGridContent = new SingleFunctionGridContent(new SingleGridContent.Builder());
        if (eVar == null || njy.e(this.al)) {
            LogUtil.j("ColumnLayoutAdapter", "getSingleEntryObject() holder or mQuickEntryList or position is null.");
            return singleFunctionGridContent;
        }
        if (!njy.c(this.al, i)) {
            LogUtil.j("ColumnLayoutAdapter", "getSingleEntryObject() outOfBounds, position = ", Integer.valueOf(i));
            return singleFunctionGridContent;
        }
        return this.al.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i, final SingleGridContent singleGridContent, final int i2) {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLayoutAdapter.4
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLayoutAdapter.this.e(i, singleGridContent, i2);
                }
            });
            return;
        }
        HashMap map = new HashMap(4);
        map.put("resourcePositionId", Integer.valueOf(this.ae));
        map.put("resourceId", this.ah);
        map.put("resourceName", this.ak);
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", singleGridContent.getTheme());
        if (this.h == 47) {
            if (TextUtils.isEmpty(singleGridContent.getTheme())) {
                LogUtil.j("ColumnLayoutAdapter", "resourceName is empty");
                return;
            } else {
                map.put("functionID", singleGridContent.getItemId());
                map.put("smartRecommend", Boolean.valueOf(this.x));
                map.put("algId", singleGridContent.isRecommendInfoGenerated() ? singleGridContent.getAlgId() : fxl.e(this.af, singleGridContent.getItemId()));
            }
        } else {
            map.put("smartRecommend", Boolean.valueOf(singleGridContent.isRecommendInfoGenerated() ? singleGridContent.isSmartRecommend() : this.ag.getSmartRecommend()));
            map.put("algId", singleGridContent.isRecommendInfoGenerated() ? singleGridContent.getAlgId() : fxl.e(this.ag.getRecommendList(), singleGridContent.getItemId()));
        }
        if (i == 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.am));
            this.am = jCurrentTimeMillis;
            d(singleGridContent.getTheme());
            b(singleGridContent.getTheme());
        }
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        map.put("itemId", this.ag.getSmartRecommend() ? singleGridContent.getItemId() : singleGridContent.getDynamicDataId());
        LogUtil.a("ColumnLayoutAdapter", "marketing biEvent: mPositionId: ", Integer.valueOf(this.ae), ", mResourceName: ", this.ak, ", sortingRules: ", this.ag.getSortingRules(), ", biMap: ", map.toString());
        int i3 = this.h;
        if (i3 == 21 || i3 == 19 || i3 == 15) {
            LogUtil.a("ColumnLayoutAdapter", "biEvent with ab_info. contentType = ", Integer.valueOf(i3));
            MarketingBiUtils.c(map, this.ag);
        } else {
            lmf.d().c(this.l, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
        }
        c(i, singleGridContent.getTheme());
    }

    private void d(String str) {
        int i = this.ae;
        if (i < 4062 || i > 4071) {
            return;
        }
        LogUtil.a("ColumnLayoutAdapter", "set DiscoveryCourse event");
        MarketingBiUtils.c(22, str, 6);
    }

    private void b(String str) {
        if (this.ae == 4014 && this.h == 15) {
            LogUtil.a("ColumnLayoutAdapter", "set checkOneGridSmallTemplateEvent event");
            MarketingBiUtils.c(22, str, 10);
        }
    }

    private void c(int i, String str) {
        if (this.ae == 4061) {
            int i2 = this.h;
            if (i2 == 22 || i2 == 21 || i2 == 47 || i2 == 36) {
                LogUtil.a("ColumnLayoutAdapter", "set vip privilege event");
                if (i == 1) {
                    fcn.j(str);
                } else if (i == 2) {
                    fcn.f(str);
                }
            }
        }
    }

    static class b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ColumnLayoutAdapter> f8249c;
        private final SingleGridContent d;
        private final WeakReference<View> e;

        public b(ColumnLayoutAdapter columnLayoutAdapter, View view, SingleGridContent singleGridContent, int i) {
            this.f8249c = new WeakReference<>(columnLayoutAdapter);
            this.e = new WeakReference<>(view);
            this.d = singleGridContent;
            this.f8248b = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ColumnLayoutAdapter columnLayoutAdapter = this.f8249c.get();
            View view = this.e.get();
            if (columnLayoutAdapter == null || view == null) {
                return;
            }
            if (!columnLayoutAdapter.c(this.d)) {
                columnLayoutAdapter.d(this.d, view, this.f8248b);
            } else {
                qsp.b(view, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            ColumnLayoutAdapter columnLayoutAdapter = this.f8249c.get();
            View view = this.e.get();
            if (columnLayoutAdapter == null || view == null) {
                return;
            }
            if (!columnLayoutAdapter.c(this.d)) {
                columnLayoutAdapter.d(this.d, view, this.f8248b);
            } else {
                qsp.c(view, this);
            }
        }
    }
}
