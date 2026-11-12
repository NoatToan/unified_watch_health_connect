package com.huami.moving.ui.sport.detail.segment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.tabs.TabLayout;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.model.KilometreOrMileMarked;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.sport.detail.segment.SportSegmentFragments;
import com.huami.moving.ui.sport.detail.segment.factory.impl.SportDetailSegmentContainerFuseFgFactory;
import com.huami.moving.ui.sport.detail.segment.factory.impl.SportDetailSegmentContainerManualFgFactory;
import com.huami.moving.ui.sport.detail.segment.factory.impl.SportDetailSegmentContainerTrainFgFactory;
import com.huami.moving.ui.utils.ConvertSportTypeKt;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.view.NestViewPager;
import com.huami.moving.webapi.SportWebParams;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0001038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u0010/R\u001c\u00108\u001a\b\u0012\u0004\u0012\u000206038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u0010/R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010/R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010/R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010/R\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010/R\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010/R\u0016\u0010H\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010\u001e¨\u0006L"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportSegmentFragments;", "Landroidx/fragment/app/Fragment;", "", "initData", "c", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "", "a", "J", "mTrackId", "", LogUtil.I, "deviceSource", "mSportType", GoogleApiAvailabilityLight.a, "mSegmentType", "e", "mSportMode", "", "f", "Z", TdmillHmFragment.ARG_IS_METRIC, "g", "isEdit", "h", "showEditBox", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "i", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "trackData", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", z.j, "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecord", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", hl.k, "Ljava/util/List;", "mAutoSegmentDataList", "l", "mManualSegmentDataList", "", "m", "mFragmentList", "", GoogleApiAvailabilityLight.b, "mFragmentTitleList", "Lcom/huami/moving/ui/sport/detail/segment/SportSegmentParams;", "o", "Lcom/huami/moving/ui/sport/detail/segment/SportSegmentParams;", "sportSegmentParams", b.r, "mIntervalSegmentDataList", DTransferConstants.SEARCH_KEY, "mSkiingSegmentDataList", "r", "mRopeSkippingSegmentDataList", SOAP.XMLNS, "mFuseSegmentDataList", "t", "mTrainSegmentDataList", "u", "isMarkedEmpty", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportSegmentFragments extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long mTrackId = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int deviceSource = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mSportType = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mSegmentType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mSportMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isEdit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean showEditBox;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ParsedSportDetailData trackData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Trackrecord trackRecord;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mAutoSegmentDataList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mManualSegmentDataList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private List<Fragment> mFragmentList;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private List<String> mFragmentTitleList;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private SportSegmentParams sportSegmentParams;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mIntervalSegmentDataList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mSkiingSegmentDataList;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mRopeSkippingSegmentDataList;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mFuseSegmentDataList;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mTrainSegmentDataList;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean isMarkedEmpty;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportSegmentFragments$Companion;", "", "", "trackId", "", "deviceSource", "mSportType", "", TdmillHmFragment.ARG_IS_METRIC, "openEdit", "showEditBox", "Lcom/huami/moving/ui/sport/detail/segment/SportSegmentFragments;", "newInstance", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SportSegmentFragments newInstance(long trackId, int deviceSource, int mSportType, boolean isMetric, boolean openEdit, boolean showEditBox) {
            SportSegmentFragments sportSegmentFragments = new SportSegmentFragments();
            Bundle bundle = new Bundle();
            bundle.putLong("trackid", trackId);
            bundle.putInt("source", deviceSource);
            bundle.putInt("type", mSportType);
            bundle.putBoolean(SportWebParams.PARAMA_METRIC, isMetric);
            bundle.putBoolean(SportWebParams.PARAM_SEGMENT_EDIT, openEdit);
            bundle.putBoolean(SportWebParams.PARAM_SEGMENT_SHOW_EDIT_BOX, showEditBox);
            Unit unit = Unit.INSTANCE;
            sportSegmentFragments.setArguments(bundle);
            return sportSegmentFragments;
        }
    }

    private final void b() {
        this.mFragmentList = new ArrayList();
        this.mFragmentTitleList = new ArrayList();
        if (SportTypeIdentifier.isSupportIntervalSegment(this.mSportType, this.mSportMode)) {
            List<SportSegmentData> list = this.mIntervalSegmentDataList;
            if (!(list == null || list.isEmpty())) {
                SportDetailIntervalSegmentFragment sportDetailIntervalSegmentFragment = new SportDetailIntervalSegmentFragment();
                Bundle bundle = new Bundle();
                bundle.putLong("trackid", this.mTrackId);
                bundle.putInt("source", this.deviceSource);
                bundle.putInt("type", this.mSportType);
                bundle.putBoolean(SportWebParams.PARAMA_METRIC, this.isMetric);
                sportDetailIntervalSegmentFragment.setArguments(bundle);
                List<Fragment> list2 = this.mFragmentList;
                Objects.requireNonNull(list2);
                list2.add(sportDetailIntervalSegmentFragment);
                List<String> list3 = this.mFragmentTitleList;
                Objects.requireNonNull(list3);
                list3.add(getString(R.string.segment_tab_interval));
                return;
            }
        }
        if (SportTypeIdentifier.isSupportPerKmSegment(this.mSportType) && !this.isMarkedEmpty) {
            SportDetailKMSegmentFragment sportDetailKMSegmentFragment = new SportDetailKMSegmentFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("trackid", this.mTrackId);
            bundle2.putInt("source", this.deviceSource);
            bundle2.putInt("type", this.mSportType);
            bundle2.putBoolean(SportWebParams.PARAMA_METRIC, this.isMetric);
            sportDetailKMSegmentFragment.setArguments(bundle2);
            List<Fragment> list4 = this.mFragmentList;
            Objects.requireNonNull(list4);
            list4.add(sportDetailKMSegmentFragment);
            if (this.isMetric) {
                List<String> list5 = this.mFragmentTitleList;
                Objects.requireNonNull(list5);
                list5.add(getString(R.string.segment_tab_kilometers));
            } else {
                List<String> list6 = this.mFragmentTitleList;
                Objects.requireNonNull(list6);
                list6.add(getString(R.string.segment_tab_miles));
            }
        }
        boolean z = DataTypeSource.RunSource.RUN_SOURCE_WATCH.getValue() == this.deviceSource;
        if (SportTypeIdentifier.isSupportAutoSegment(this.mSportType)) {
            List<SportSegmentData> list7 = this.mAutoSegmentDataList;
            if (list7 != null && (list7.isEmpty() ^ true)) {
                SportDetailSegmentContainerFragment sportDetailSegmentContainerFragment = new SportDetailSegmentContainerFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("trackid", this.mTrackId);
                bundle3.putInt("source", this.deviceSource);
                bundle3.putInt("type", this.mSportType);
                bundle3.putInt("segment_type", 1);
                bundle3.putBoolean(SportWebParams.PARAMA_METRIC, this.isMetric);
                sportDetailSegmentContainerFragment.setArguments(bundle3);
                List<Fragment> list8 = this.mFragmentList;
                Objects.requireNonNull(list8);
                list8.add(sportDetailSegmentContainerFragment);
                List<String> list9 = this.mFragmentTitleList;
                Objects.requireNonNull(list9);
                list9.add(getString(R.string.segment_tab_auto));
            }
        }
        if (SportTypeIdentifier.isSupportManualSegment(this.mSportType) && !z) {
            List<SportSegmentData> list10 = this.mManualSegmentDataList;
            if (list10 != null && (list10.isEmpty() ^ true)) {
                this.mSegmentType = 0;
                Fragment fragmentCreate = new SportDetailSegmentContainerManualFgFactory().create(this.sportSegmentParams);
                List<Fragment> list11 = this.mFragmentList;
                Objects.requireNonNull(list11);
                list11.add(fragmentCreate);
                if (SportTypeIdentifier.isSupportManualGroupSegment(this.mSportType)) {
                    List<String> list12 = this.mFragmentTitleList;
                    Objects.requireNonNull(list12);
                    list12.add(getString(R.string.segment_tab_manual_group));
                } else {
                    List<String> list13 = this.mFragmentTitleList;
                    Objects.requireNonNull(list13);
                    list13.add(getString(R.string.segment_tab_manual));
                }
            }
        }
        if (SportTypeIdentifier.isSupportManualSegment(this.mSportType) && !z) {
            List<SportSegmentData> list14 = this.mFuseSegmentDataList;
            if (list14 != null && (list14.isEmpty() ^ true)) {
                List<SportSegmentData> list15 = this.mFuseSegmentDataList;
                if ((list15 == null ? 0 : list15.size()) > 1) {
                    this.mSegmentType = 5;
                    Fragment fragmentCreate2 = new SportDetailSegmentContainerFuseFgFactory().create(this.sportSegmentParams);
                    List<Fragment> list16 = this.mFragmentList;
                    Objects.requireNonNull(list16);
                    list16.add(fragmentCreate2);
                    List<String> list17 = this.mFragmentTitleList;
                    Objects.requireNonNull(list17);
                    list17.add(getString(R.string.segment_tab_fuse));
                }
            }
        }
        if (SportTypeIdentifier.isSupportTrainSegment(this.mSportType)) {
            List<SportSegmentData> list18 = this.mTrainSegmentDataList;
            if (list18 != null && (list18.isEmpty() ^ true)) {
                this.mSegmentType = 6;
                Fragment fragmentCreate3 = new SportDetailSegmentContainerTrainFgFactory().create(this.sportSegmentParams);
                List<Fragment> list19 = this.mFragmentList;
                Objects.requireNonNull(list19);
                list19.add(fragmentCreate3);
                List<String> list20 = this.mFragmentTitleList;
                Objects.requireNonNull(list20);
                list20.add(getString(R.string.segment_tab_fuse));
            }
        }
        if (SportTypeIdentifier.isSupportRopeSkippingSegment(this.mSportType)) {
            List<SportSegmentData> list21 = this.mRopeSkippingSegmentDataList;
            if (!(list21 == null || list21.isEmpty())) {
                SportDetailMultiplexSegmentFragment sportDetailMultiplexSegmentFragment = new SportDetailMultiplexSegmentFragment();
                Bundle bundle4 = new Bundle();
                bundle4.putLong("trackid", this.mTrackId);
                bundle4.putInt("source", this.deviceSource);
                bundle4.putInt("type", this.mSportType);
                bundle4.putBoolean(SportWebParams.PARAMA_METRIC, this.isMetric);
                sportDetailMultiplexSegmentFragment.setArguments(bundle4);
                List<Fragment> list22 = this.mFragmentList;
                Objects.requireNonNull(list22);
                list22.add(sportDetailMultiplexSegmentFragment);
                List<String> list23 = this.mFragmentTitleList;
                Objects.requireNonNull(list23);
                list23.add(getString(R.string.segment_tab_manual_group));
                return;
            }
        }
        if (SportTypeIdentifier.isSupportSkiingSegment(this.mSportType)) {
            List<SportSegmentData> list24 = this.mSkiingSegmentDataList;
            if (list24 == null || list24.isEmpty()) {
                return;
            }
            SportDetailSkiingSegmentFragment sportDetailSkiingSegmentFragment = new SportDetailSkiingSegmentFragment();
            Bundle bundle5 = new Bundle();
            bundle5.putLong("trackid", this.mTrackId);
            bundle5.putInt("source", this.deviceSource);
            bundle5.putInt("type", this.mSportType);
            bundle5.putBoolean(SportWebParams.PARAMA_METRIC, this.isMetric);
            sportDetailSkiingSegmentFragment.setArguments(bundle5);
            List<Fragment> list25 = this.mFragmentList;
            Objects.requireNonNull(list25);
            list25.add(sportDetailSkiingSegmentFragment);
            List<String> list26 = this.mFragmentTitleList;
            Objects.requireNonNull(list26);
            list26.add(getString(R.string.segment_tab_skiing));
        }
    }

    private final void c() {
        this.sportSegmentParams = new SportSegmentParams.Builder().trackId(this.mTrackId).deviceSource(this.deviceSource).sportType(this.mSportType).sportMode(this.mSportMode).isMetric(this.isMetric).isEdit(this.isEdit).showEditBox(this.showEditBox).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SportSegmentFragments sportSegmentFragments, View view) {
        SportDetailSegmentEditActivity.INSTANCE.startMe(sportSegmentFragments.requireContext(), sportSegmentFragments.mTrackId, sportSegmentFragments.mSportType, sportSegmentFragments.deviceSource, sportSegmentFragments.mSegmentType);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    private final void initData() {
        boolean z;
        Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(this.mTrackId, this.deviceSource);
        this.trackRecord = trackRecordById;
        if (trackRecordById == null) {
            return;
        }
        this.mSportMode = trackRecordById.getSportMode();
        ParsedSportDetailData trackData = TrackDataManager.getInstance().getTrackData(this.mTrackId, this.deviceSource, this.mSportType);
        this.trackData = trackData;
        if (trackData != null) {
            if (this.mSportMode == 1) {
                this.mIntervalSegmentDataList = trackData != null ? trackData.getIntervalSegmentDataList() : null;
                return;
            }
            this.mAutoSegmentDataList = trackData == null ? null : trackData.getAutoSegmentDataList();
            ParsedSportDetailData parsedSportDetailData = this.trackData;
            this.mManualSegmentDataList = parsedSportDetailData == null ? null : parsedSportDetailData.getManualSegmentDataList();
            ParsedSportDetailData parsedSportDetailData2 = this.trackData;
            this.mSkiingSegmentDataList = parsedSportDetailData2 == null ? null : parsedSportDetailData2.getSkiingSegmentDataList();
            ParsedSportDetailData parsedSportDetailData3 = this.trackData;
            this.mRopeSkippingSegmentDataList = parsedSportDetailData3 == null ? null : parsedSportDetailData3.getRopeSkippingSegmentDataList();
            ParsedSportDetailData parsedSportDetailData4 = this.trackData;
            this.mFuseSegmentDataList = parsedSportDetailData4 == null ? null : parsedSportDetailData4.getFuseSegmentDataList();
            ParsedSportDetailData parsedSportDetailData5 = this.trackData;
            this.mTrainSegmentDataList = parsedSportDetailData5 == null ? null : parsedSportDetailData5.getTrainSegmentDataList();
            ParsedSportDetailData parsedSportDetailData6 = this.trackData;
            List<KilometreOrMileMarked> kmMarkedList = parsedSportDetailData6 == null ? null : parsedSportDetailData6.getKmMarkedList();
            if (kmMarkedList == null || kmMarkedList.isEmpty()) {
                ParsedSportDetailData parsedSportDetailData7 = this.trackData;
                List<KilometreOrMileMarked> mileMarkedList = parsedSportDetailData7 != null ? parsedSportDetailData7.getMileMarkedList() : null;
                z = mileMarkedList == null || mileMarkedList.isEmpty();
            }
            this.isMarkedEmpty = z;
        }
    }

    @JvmStatic
    @NotNull
    public static final SportSegmentFragments newInstance(long j, int i, int i2, boolean z, boolean z2, boolean z3) {
        return INSTANCE.newInstance(j, i, i2, z, z2, z3);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view_sport_segment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mTrackId = arguments.getLong("trackid", -1L);
        this.deviceSource = arguments.getInt("source", -1);
        this.mSportType = arguments.getInt("type", -1);
        this.isMetric = arguments.getBoolean(SportWebParams.PARAMA_METRIC, false);
        this.isEdit = arguments.getBoolean(SportWebParams.PARAM_SEGMENT_EDIT, false);
        this.showEditBox = arguments.getBoolean(SportWebParams.PARAM_SEGMENT_SHOW_EDIT_BOX, false);
        initData();
        c();
        b();
        View view2 = getView();
        View viewFindViewById = null;
        ((NestViewPager) (view2 == null ? null : view2.findViewById(R.id.view_pager))).setOffscreenPageLimit(3);
        View view3 = getView();
        View viewFindViewById2 = view3 == null ? null : view3.findViewById(R.id.view_pager);
        final FragmentManager childFragmentManager = getChildFragmentManager();
        ((NestViewPager) viewFindViewById2).setAdapter(new FragmentPagerAdapter(childFragmentManager) { // from class: com.huami.moving.ui.sport.detail.segment.SportSegmentFragments$onViewCreated$1$1
            @Override // androidx.viewpager.widget.PagerAdapter
            /* JADX INFO: renamed from: getCount */
            public int getPageCount() {
                List list = this.a.mFragmentList;
                Objects.requireNonNull(list);
                return list.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            @NotNull
            public Fragment getItem(int position) {
                List list = this.a.mFragmentList;
                Objects.requireNonNull(list);
                return (Fragment) list.get(position);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            @NotNull
            public CharSequence getPageTitle(int position) {
                List list = this.a.mFragmentTitleList;
                Objects.requireNonNull(list);
                return (CharSequence) list.get(position);
            }
        });
        View view4 = getView();
        TabLayout tabLayout = (TabLayout) (view4 == null ? null : view4.findViewById(R.id.tab_layout));
        View view5 = getView();
        tabLayout.setupWithViewPager((ViewPager) (view5 == null ? null : view5.findViewById(R.id.view_pager)));
        View view6 = getView();
        ((TabLayout) (view6 == null ? null : view6.findViewById(R.id.tab_layout))).addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener<TabLayout.Tab>() { // from class: com.huami.moving.ui.sport.detail.segment.SportSegmentFragments$onViewCreated$1$2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(@Nullable TabLayout.Tab p0) {
                View view7 = this.a.getView();
                ((NestViewPager) (view7 == null ? null : view7.findViewById(R.id.view_pager))).resetHeight(p0 == null ? 0 : p0.getPosition());
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(@Nullable TabLayout.Tab p0) {
                View view7 = this.a.getView();
                ((NestViewPager) (view7 == null ? null : view7.findViewById(R.id.view_pager))).resetHeight(p0 == null ? 0 : p0.getPosition());
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(@Nullable TabLayout.Tab p0) {
            }
        });
        if (ConvertSportTypeKt.convertSportType(this.mSportType) == 52) {
            if (this.isEdit && SportDeviceUtils.isSupportStrengthTrainingCategory(this.deviceSource)) {
                View view7 = getView();
                ((ImageView) (view7 == null ? null : view7.findViewById(R.id.edit_segment))).setVisibility(0);
                View view8 = getView();
                ((ImageView) (view8 == null ? null : view8.findViewById(R.id.edit_segment))).setOnClickListener(new View.OnClickListener() { // from class: ub7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view9) {
                        SportSegmentFragments.d(this.a, view9);
                    }
                });
            } else {
                View view9 = getView();
                ((ImageView) (view9 == null ? null : view9.findViewById(R.id.edit_segment))).setVisibility(8);
            }
        }
        List<Fragment> list = this.mFragmentList;
        Objects.requireNonNull(list);
        if (list.size() == 1) {
            View view10 = getView();
            if (((TabLayout) (view10 == null ? null : view10.findViewById(R.id.tab_layout))).getChildCount() == 1) {
                View view11 = getView();
                ((TabLayout) (view11 == null ? null : view11.findViewById(R.id.tab_layout))).setSelectedTabIndicatorColor(ContextCompat.getColor(requireContext(), R.color.s38));
                View view12 = getView();
                View viewFindViewById3 = view12 == null ? null : view12.findViewById(R.id.tab_layout);
                Context contextRequireContext = requireContext();
                int i = R.color.s1;
                ((TabLayout) viewFindViewById3).setTabTextColors(ContextCompat.getColor(contextRequireContext, i), ContextCompat.getColor(requireContext(), i));
                try {
                    View view13 = getView();
                    Field declaredField = (view13 == null ? null : view13.findViewById(R.id.tab_layout)).getClass().getDeclaredField("slidingTabIndicator");
                    declaredField.setAccessible(true);
                    View view14 = getView();
                    if (view14 != null) {
                        viewFindViewById = view14.findViewById(R.id.tab_layout);
                    }
                    Object obj = declaredField.get(viewFindViewById);
                    Field declaredField2 = obj.getClass().getDeclaredField("selectedIndicatorHeight");
                    declaredField2.setAccessible(true);
                    declaredField2.setInt(obj, 0);
                    ViewCompat.postInvalidateOnAnimation((LinearLayout) obj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchFieldException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
