package com.xiaomi.fitness.detail.inner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.search.SearchContract;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.GroupSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.data.sport.RouteReportData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.SwimmingPassage;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.data.SportFeedbackModel;
import com.xiaomi.fitness.detail.inner.SportDetailInnerFragment;
import com.xiaomi.fitness.detail.model.SportCourseInfoModel;
import com.xiaomi.fitness.detail.model.SportDivingInfoModel;
import com.xiaomi.fitness.detail.model.SportGolfInfoModel;
import com.xiaomi.fitness.detail.model.SportSkiingInfoModel;
import com.xiaomi.fitness.detail.model.SportTargetModel;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.detail.view.FeedbackStatue;
import com.xiaomi.fitness.detail.view.SportDetailBehaviorView;
import com.xiaomi.fitness.detail.view.SportEnvironmentalView;
import com.xiaomi.fitness.detail.view.SportFeedbackView;
import com.xiaomi.fitness.detail.view.SportRecordExtraBasicInfoView;
import com.xiaomi.fitness.detail.view.SportTargetView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import com.xiaomi.fitness.util.ConsistencyEventUtils;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordPreference;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.distribute.DistributeDataUtil;
import defpackage.av6;
import defpackage.ben;
import defpackage.bl5;
import defpackage.byi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.mea;
import defpackage.tz6;
import defpackage.uz6;
import defpackage.x44;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 \u0096\u00022\u00020\u00012\u00020\u0002:\u0002\u0096\u0002B\b¢\u0006\u0005\b\u0095\u0002\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\tJ\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\tJ=\u0010+\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\b\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00052\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0013H\u0002¢\u0006\u0004\b/\u00100J+\u00102\u001a\u0002012\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%H\u0002¢\u0006\u0004\b2\u00103JE\u00105\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\b\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u00106JK\u00108\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010)\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b8\u00109J1\u0010;\u001a\b\u0012\u0004\u0012\u0002010:2\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0005H\u0002¢\u0006\u0004\b=\u0010\tJ\u000f\u0010>\u001a\u00020\u0005H\u0002¢\u0006\u0004\b>\u0010\tJK\u0010@\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u00109JK\u0010A\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bA\u00109JC\u0010B\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010)\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\bB\u00106JC\u0010C\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\bC\u00106J'\u0010D\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\bD\u0010EJC\u0010F\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\bF\u00106J\u0017\u0010G\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010\u0010J;\u0010H\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\bH\u0010,J;\u0010I\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\bI\u0010,J;\u0010J\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\bJ\u0010,JC\u0010K\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\bK\u00106J\u000f\u0010L\u001a\u00020\u0005H\u0002¢\u0006\u0004\bL\u0010\tJC\u0010M\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\bM\u00106JK\u0010N\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\bN\u00109JK\u0010O\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bO\u00109JK\u0010P\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bP\u00109JK\u0010Q\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bQ\u00109JC\u0010R\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\bR\u00106JK\u0010S\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bS\u00109J\u0017\u0010T\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010\u0010J\u0017\u0010U\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\bU\u0010\u0010J\u0017\u0010V\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\bV\u0010\u0010JK\u0010W\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bW\u00109JK\u0010X\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bX\u00109JK\u0010Y\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bY\u00109JK\u0010Z\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bZ\u00109JK\u0010[\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b[\u00109JK\u0010\\\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\\\u00109JK\u0010]\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b]\u00109JK\u0010^\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b^\u00109JK\u0010_\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b_\u00109JK\u0010`\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\b`\u00109JK\u0010a\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\ba\u00109JK\u0010b\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bb\u00109JK\u0010c\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bc\u00109JK\u0010d\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bd\u00109JK\u0010e\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\be\u00109JK\u0010f\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bf\u00109JK\u0010g\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bg\u00109JK\u0010h\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bh\u00109JK\u0010i\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bi\u00109JK\u0010j\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bj\u00109JK\u0010k\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bk\u00109JK\u0010l\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bl\u00109JK\u0010m\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bm\u00109JK\u0010n\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bn\u00109JK\u0010o\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bo\u00109JK\u0010p\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bp\u00109JK\u0010q\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bq\u00109JK\u0010r\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\br\u00109JK\u0010s\u001a\u00020\u00052\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00130%2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0002¢\u0006\u0004\bs\u00109J\u0017\u0010t\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\bt\u0010\u0010J\u0019\u0010w\u001a\u00020\u00052\b\u0010v\u001a\u0004\u0018\u00010uH\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u0005H\u0002¢\u0006\u0004\by\u0010\tJ#\u0010}\u001a\u00020\u00052\b\u0010{\u001a\u0004\u0018\u00010z2\b\b\u0002\u0010|\u001a\u000201H\u0002¢\u0006\u0004\b}\u0010~J\u001a\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010\u007f\u001a\u000201H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J5\u0010\u0087\u0001\u001a\u00020z2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010uH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u0005H\u0016¢\u0006\u0005\b\u0089\u0001\u0010\tJ\u0011\u0010\u008a\u0001\u001a\u00020\u0005H\u0016¢\u0006\u0005\b\u008a\u0001\u0010\tJ\u001b\u0010\u008b\u0001\u001a\u00020\u00052\b\u0010v\u001a\u0004\u0018\u00010uH\u0016¢\u0006\u0005\b\u008b\u0001\u0010xJ&\u0010\u008d\u0001\u001a\u00020\u00052\u0007\u0010\u008c\u0001\u001a\u00020z2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010uH\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020\u0005¢\u0006\u0005\b\u008f\u0001\u0010\tJ\u0017\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u0013¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0094\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020\u0014¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0019\u0010\u0096\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020\u0014¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001J\u0019\u0010\u0097\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020\u0014¢\u0006\u0006\b\u0097\u0001\u0010\u0095\u0001J.\u0010\u009c\u0001\u001a\u00020\u00052\u0007\u0010\u0098\u0001\u001a\u0002012\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0011\u0010\u009e\u0001\u001a\u00020\u0005H\u0014¢\u0006\u0005\b\u009e\u0001\u0010\tJ6\u0010£\u0001\u001a\u00030¢\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010\u009f\u0001\u001a\u00020\u001d2\u0007\u0010 \u0001\u001a\u00020\u001d2\u0007\u0010¡\u0001\u001a\u00020\u0014H\u0007¢\u0006\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¦\u0001\u001a\u00030¥\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010©\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010«\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b«\u0001\u0010ª\u0001R\u001a\u0010¬\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¬\u0001\u0010ª\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010ª\u0001R\u001a\u0010®\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0001\u0010ª\u0001R\u001a\u0010¯\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¯\u0001\u0010ª\u0001R\u001a\u0010°\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b°\u0001\u0010ª\u0001R\u001a\u0010±\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b±\u0001\u0010ª\u0001R\u001a\u0010²\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b²\u0001\u0010ª\u0001R\u001a\u0010³\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b³\u0001\u0010ª\u0001R\u001a\u0010´\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b´\u0001\u0010ª\u0001R\u001a\u0010µ\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bµ\u0001\u0010ª\u0001R\u001a\u0010¶\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¶\u0001\u0010ª\u0001R\u001a\u0010·\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b·\u0001\u0010ª\u0001R\u001a\u0010¸\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¸\u0001\u0010ª\u0001R\u001a\u0010¹\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¹\u0001\u0010ª\u0001R\u001a\u0010º\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bº\u0001\u0010ª\u0001R\u001a\u0010»\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b»\u0001\u0010ª\u0001R\u001a\u0010¼\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¼\u0001\u0010ª\u0001R\u001a\u0010½\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b½\u0001\u0010ª\u0001R\u001a\u0010¾\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¾\u0001\u0010ª\u0001R\u001a\u0010¿\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¿\u0001\u0010ª\u0001R\u001a\u0010À\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010ª\u0001R\u001a\u0010Á\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÁ\u0001\u0010ª\u0001R\u001a\u0010Â\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÂ\u0001\u0010ª\u0001R\u001a\u0010Ã\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÃ\u0001\u0010ª\u0001R\u001a\u0010Ä\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÄ\u0001\u0010ª\u0001R\u001a\u0010Å\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÅ\u0001\u0010ª\u0001R\u001a\u0010Æ\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÆ\u0001\u0010ª\u0001R\u001a\u0010Ç\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÇ\u0001\u0010ª\u0001R\u001a\u0010È\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÈ\u0001\u0010ª\u0001R\u001a\u0010É\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÉ\u0001\u0010ª\u0001R\u001a\u0010Ê\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÊ\u0001\u0010ª\u0001R\u001a\u0010Ë\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bË\u0001\u0010ª\u0001R\u001a\u0010Í\u0001\u001a\u00030Ì\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010Ð\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001a\u0010Ó\u0001\u001a\u00030Ò\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u001a\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001a\u0010Ù\u0001\u001a\u00030Ø\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0019\u0010Û\u0001\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u001a\u0010Ý\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÝ\u0001\u0010ª\u0001R\u001a\u0010Þ\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÞ\u0001\u0010ª\u0001R\u001a\u0010à\u0001\u001a\u00030ß\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001a\u0010â\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bâ\u0001\u0010ª\u0001R\u001c\u0010ä\u0001\u001a\u0005\u0018\u00010ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\"\u0010ç\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u001a\u0010í\u0001\u001a\u00030ì\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u001b\u0010ï\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u0019\u0010ñ\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0017\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010ò\u0001R\u0019\u0010ó\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u001c\u0010ö\u0001\u001a\u0005\u0018\u00010õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u001c\u0010ù\u0001\u001a\u0005\u0018\u00010ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0019\u0010û\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ô\u0001R\u001c\u0010ý\u0001\u001a\u0005\u0018\u00010ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u001f\u0010\u0080\u0002\u001a\n\u0012\u0005\u0012\u00030ÿ\u00010æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010è\u0001R)\u0010\u0081\u0002\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010ô\u0001\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0081\u0001R)\u0010\u0084\u0002\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0002\u0010ò\u0001\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002\"\u0006\b\u0087\u0002\u0010\u0095\u0001R0\u0010\u0088\u0002\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0088\u0002\u0010è\u0001\u001a\u0006\b\u0089\u0002\u0010\u0092\u0001\"\u0005\b\u008a\u0002\u00100R\u0015\u0010\u008d\u0002\u001a\u00030é\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0014\u0010\u008e\u0002\u001a\u0002018F¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u0082\u0002R\u0014\u0010\u0090\u0002\u001a\u00020\u00148F¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0086\u0002R\u0014\u0010\u0092\u0002\u001a\u00020\u00148F¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0086\u0002R\u0014\u0010\u0094\u0002\u001a\u00020\u00148F¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0086\u0002¨\u0006\u0097\u0002"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/fitness/detail/view/SportFeedbackView$OnFeedbackUploadListener;", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "data", "", "updateRecoverRateView", "(Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;)V", "showRecoverRateFragment", "()V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "acquireTriathlonReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "initDistributeCard", "sportValues", "refreshDistributeCard", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Landroid/content/Context;", "context", "", "", "frisbeeValue", "totalCount", "Luz6;", "createDistributeModelList", "(Landroid/content/Context;Ljava/util/List;I)Ljava/util/List;", "type", "getFrisbeeColorByType", "(I)I", "", "getFrisbeeStringByType", "(I)Ljava/lang/String;", "sid", "getDeviceName", "(Ljava/lang/String;)Ljava/lang/String;", "showFeedbackView", "onFeedbackCommitClick", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "sportRecordDataObjectMap", "report", "triathlonNum", "updateRecordDetailData", "(Ljava/util/Map;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;I)V", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "sportBehaviorModelList", "updateBehaviorData", "(Ljava/util/List;)V", "", "checkRecordDataMap", "(Ljava/util/Map;)Z", DailyRecordKey.sportType, "showFragments", "(Ljava/util/Map;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;II)V", "mDetailSportType", "showJustDanceDataLayout", "(Ljava/util/Map;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;III)V", "Landroidx/lifecycle/MutableLiveData;", "getAbnormalSportFlag", "(Ljava/util/Map;)Landroidx/lifecycle/MutableLiveData;", "initSportAbnormalGuide", "bindSportEnvironmentalView", "sportDetailType", "showPowerFragment", "showResistanceFragment", "showRowingFrequencyFragment", "showSkippingHeightFragment", "showSportPluginsFrequencyFragment", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;II)V", "showSkippingFrequencyFragment", "addExtraDataListSkipping", "showSkiingDetailInfoFragment", "showDivingDetailInfoFragment", "showGolfDetailInfoFragment", "showCourseInfoFragment", "bindSportTargetView", "showGroupInfoFragment", "showSwimSegmentFragment", "showSkippingSegmentFragment", "showRateFragment", "showRateExampleFragment", "showStressFragment", "showStepsFrequencyFragment", "addExtraDataListStress", "addExtraDataListStepsFeq", "addExtraDataListStepsLength", "showStepsLengthFragment", "showPaceFragment", "showPaceChartFragment", "showSpeedFragment", "showHeightFragment", "showDepthFragment", "showTemperatureFragment", "showStrokeFragment", "showSwolfFragment", "showFreeBreathFragment", "showFreePitchFragment", "showFrogBreathFragment", "showFrogDurationFragment", "showRunningPowerFragment", "showEqualPaceFragment", "showStepDownTime", "showStepUpTime", "showStepDownUp", "showStepImpactLanding", "showVerticalAmplitude", "showVerticalStepRatio", "showContainerTrample", "showContainerBehavior", "showTrainingExperience", "showPermissionLayout", "showRoutePathLayout", "showDataFromLayout", "showMedalLayout", "showStepAttitude", "addExtraDataListSwolf", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "initContentView", "Landroid/view/View;", "containerView", "revers", "createShareBitmapItem", "(Landroid/view/View;Z)V", "isSuccess", "onUploadResult", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_RESUME, "onNewIntent", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initTitleView", "Landroid/graphics/Bitmap;", "createShareBitmap", "()Ljava/util/List;", "visibility", "setFeedbackViewVisibility", "(I)V", "setTrainingExperienceVisibility", "setPermissionViewVisibility", "isUploadFile", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "feedBackModel", "labelStr", "uploadInfo", "(ZLcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;Ljava/lang/String;)V", "loadData", "originalText", "targetSubstring", SearchContract.COLUMN_ICON_RESID, "Landroid/text/SpannableString;", "insertIconInText", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Landroid/text/SpannableString;", "Landroid/widget/LinearLayout;", "llContainer", "Landroid/widget/LinearLayout;", "Landroid/widget/FrameLayout;", "containerGolfInfo", "Landroid/widget/FrameLayout;", "containerDetailInfo", "containerPluginsFrequency", "containerGroupInfo", "containerCourseInfo", "containerRate", "containerRateExample", "containerRecoverRate", "containerSwimSegment", "containerPace", "containerPaceChart", "containerStress", "containerStep", "containerSkipping", "containerRowing", "containerStepLength", "containerSkippingHeight", "containerSkippingSegment", "containerHeight", "containerStroke", "containerSwolf", "containerSpeed", "containerStepDownTime", "containerStepUpTime", "containerStepDownUp", "containerStepImpactLanding", "containerVerticalAmplitude", "containerVerticalRatio", "containerStepAttitude", "containerTrample", "containerDepth", "containerTemperature", "containerEqualPace", "containerRunPower", "Lcom/xiaomi/fitness/detail/view/SportRecordExtraBasicInfoView;", "extraBasicInfoView", "Lcom/xiaomi/fitness/detail/view/SportRecordExtraBasicInfoView;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/detail/view/SportFeedbackView;", "feedbackView", "Lcom/xiaomi/fitness/detail/view/SportFeedbackView;", "Lcom/xiaomi/fitness/detail/view/SportTargetView;", "sportTargetView", "Lcom/xiaomi/fitness/detail/view/SportTargetView;", "Lcom/xiaomi/fitness/detail/view/SportEnvironmentalView;", "sportEnvironmentalView", "Lcom/xiaomi/fitness/detail/view/SportEnvironmentalView;", "sportAbnormalGuide", "Landroid/view/View;", "containerResistance", "containerPower", "Landroidx/recyclerview/widget/RecyclerView;", "sportFrisbeeView", "Landroidx/recyclerview/widget/RecyclerView;", "permissionFragment", "Ltz6;", "mDistributeAdapter", "Ltz6;", "", "mDistributeData", "Ljava/util/List;", "Lmea;", "_binding", "Lmea;", "Lcom/xiaomi/fitness/detail/view/SportDetailBehaviorView;", "mSportBehaviorView", "Lcom/xiaomi/fitness/detail/view/SportDetailBehaviorView;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportDataType", "I", "showFeedback", "Z", "Lcom/xiaomi/fitness/detail/data/SportFeedbackModel;", "sportFeedbackModel", "Lcom/xiaomi/fitness/detail/data/SportFeedbackModel;", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "detailViewModel", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "fromCourse", "Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "routeData", "Lcom/xiaomi/fit/data/common/data/sport/RouteReportData;", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "originalBasicItemInfoList", "isPermissionLayoutShow", "()Z", "setPermissionLayoutShow", "shareHeight", "getShareHeight", "()I", "setShareHeight", "shareBitmapList", "getShareBitmapList", "setShareBitmapList", "getMBinding", "()Lmea;", "mBinding", "isFeedbackVisibility", "getFeedbackViewHeight", "feedbackViewHeight", "getTrainingExperienceHeight", "trainingExperienceHeight", "getPermissionViewHeight", "permissionViewHeight", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportDetailInnerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailInnerFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailInnerFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2089:1\n216#2,2:2090\n1#3:2092\n*S KotlinDebug\n*F\n+ 1 SportDetailInnerFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailInnerFragment\n*L\n1002#1:2090,2\n*E\n"})
public final class SportDetailInnerFragment extends BaseFragment implements SportFeedbackView.OnFeedbackUploadListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailFragment";

    @Nullable
    private mea _binding;
    private FrameLayout containerCourseInfo;
    private FrameLayout containerDepth;
    private FrameLayout containerDetailInfo;
    private FrameLayout containerEqualPace;
    private FrameLayout containerGolfInfo;
    private FrameLayout containerGroupInfo;
    private FrameLayout containerHeight;
    private FrameLayout containerPace;
    private FrameLayout containerPaceChart;
    private FrameLayout containerPluginsFrequency;
    private FrameLayout containerPower;
    private FrameLayout containerRate;
    private FrameLayout containerRateExample;
    private FrameLayout containerRecoverRate;
    private FrameLayout containerResistance;
    private FrameLayout containerRowing;
    private FrameLayout containerRunPower;
    private FrameLayout containerSkipping;
    private FrameLayout containerSkippingHeight;
    private FrameLayout containerSkippingSegment;
    private FrameLayout containerSpeed;
    private FrameLayout containerStep;
    private FrameLayout containerStepAttitude;
    private FrameLayout containerStepDownTime;
    private FrameLayout containerStepDownUp;
    private FrameLayout containerStepImpactLanding;
    private FrameLayout containerStepLength;
    private FrameLayout containerStepUpTime;
    private FrameLayout containerStress;
    private FrameLayout containerStroke;
    private FrameLayout containerSwimSegment;
    private FrameLayout containerSwolf;
    private FrameLayout containerTemperature;
    private FrameLayout containerTrample;
    private FrameLayout containerVerticalAmplitude;
    private FrameLayout containerVerticalRatio;

    @Nullable
    private SportRecordDetailViewModel detailViewModel;
    private SportRecordExtraBasicInfoView extraBasicInfoView;
    private SportFeedbackView feedbackView;
    private boolean fromCourse;
    private boolean isPermissionLayoutShow;
    private LinearLayout llContainer;

    @Nullable
    private SportBasicReport mBasicReport;
    private int mDetailSportType;

    @Nullable
    private tz6 mDistributeAdapter;

    @Nullable
    private List<uz6> mDistributeData;
    private SportDetailBehaviorView mSportBehaviorView;

    @NotNull
    private final List<BasicItemInfo> originalBasicItemInfoList;
    private FrameLayout permissionFragment;

    @Nullable
    private RouteReportData routeData;

    @NotNull
    private List<Bitmap> shareBitmapList;
    private int shareHeight;
    private boolean showFeedback;
    private View sportAbnormalGuide;
    private int sportDataType;
    private SportEnvironmentalView sportEnvironmentalView;

    @Nullable
    private SportFeedbackModel sportFeedbackModel;
    private RecyclerView sportFrisbeeView;
    private SportTargetView sportTargetView;
    private TextView titleView;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ8\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment$Companion;", "", "<init>", "()V", "TAG", "", "createIntentBundle", "Landroid/os/Bundle;", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportDataType", "", "showFeedback", "", "switchSportDetailFragment", "Lcom/xiaomi/fitness/detail/inner/SportDetailInnerFragment;", "containerId", "clz", "Ljava/lang/Class;", "tag", SdkContants.KEY_BUNDLE, "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle createIntentBundle(@Nullable SportBasicReport basicReport, int sportDataType, boolean showFeedback) {
            Bundle bundle = new Bundle();
            if (basicReport == null) {
                return bundle;
            }
            bundle.putLong("time_stamp", basicReport.getTimeStamp());
            bundle.putSerializable("sport_report", basicReport);
            bundle.putBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SHOW_SPORT_FEEDBACK, showFeedback);
            bundle.putInt("sport_type", sportDataType);
            return bundle;
        }

        @Nullable
        public final SportDetailInnerFragment switchSportDetailFragment(int containerId, @NotNull Class<?> clz, @Nullable String tag, @Nullable Bundle bundle, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(clz, "clz");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            k kVarO = fragmentManager.o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
            SportDetailInnerFragment sportDetailInnerFragment = (SportDetailInnerFragment) fragmentManager.l0(tag);
            if (sportDetailInnerFragment == null) {
                try {
                    Object objNewInstance = clz.newInstance();
                    Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.detail.inner.SportDetailInnerFragment");
                    SportDetailInnerFragment sportDetailInnerFragment2 = (SportDetailInnerFragment) objNewInstance;
                    try {
                        sportDetailInnerFragment2.setArguments(bundle);
                        kVarO.x(containerId, sportDetailInnerFragment2, tag);
                        sportDetailInnerFragment = sportDetailInnerFragment2;
                    } catch (Fragment.InstantiationException e) {
                        e = e;
                        sportDetailInnerFragment = sportDetailInnerFragment2;
                        e.printStackTrace();
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        sportDetailInnerFragment = sportDetailInnerFragment2;
                        e.printStackTrace();
                    } catch (InstantiationException e3) {
                        e = e3;
                        sportDetailInnerFragment = sportDetailInnerFragment2;
                        e.printStackTrace();
                    }
                } catch (Fragment.InstantiationException e4) {
                    e = e4;
                } catch (IllegalAccessException e5) {
                    e = e5;
                } catch (InstantiationException e6) {
                    e = e6;
                }
                kVarO.m();
            } else {
                kVarO.F(sportDetailInnerFragment);
                sportDetailInnerFragment.setArguments(bundle);
                kVarO.m();
            }
            return sportDetailInnerFragment;
        }
    }

    public SportDetailInnerFragment() {
        super(0, 1, null);
        this.mDetailSportType = -1;
        this.originalBasicItemInfoList = new ArrayList();
        this.shareBitmapList = new ArrayList();
    }

    private final SportBasicReport acquireTriathlonReport() {
        int i = this.mDetailSportType;
        if (i == 0) {
            SportBasicReport sportBasicReport = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport);
            return sportBasicReport.getOpenSwimmingReport();
        }
        if (i == 1) {
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport2);
            return sportBasicReport2.getOutdoorRidingReport();
        }
        if (i != 2) {
            return null;
        }
        SportBasicReport sportBasicReport3 = this.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport3);
        return sportBasicReport3.getOutdoorRunningReport();
    }

    private final void addExtraDataListSkipping(SportBasicReport sportValues) {
        if (sportValues.getAvgSkipFreq() != null) {
            Integer avgSkipFreq = sportValues.getAvgSkipFreq();
            Intrinsics.checkNotNull(avgSkipFreq);
            int iIntValue = avgSkipFreq.intValue();
            int sport_data_info_avg_skip_freq = BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_AVG_SKIP_FREQ();
            int i = j1j.r3;
            String string = Integer.toString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            SportDetailUtil.INSTANCE.updateExtraToBasicList(sport_data_info_avg_skip_freq, new BasicItemInfo(i, string, "", sport_data_info_avg_skip_freq, null, null, 48, null));
        }
        if (sportValues.getBestSkipFreq() != null) {
            Integer bestSkipFreq = sportValues.getBestSkipFreq();
            Intrinsics.checkNotNull(bestSkipFreq);
            int iIntValue2 = bestSkipFreq.intValue();
            int sport_data_info_best_skip_freq = BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_BEST_SKIP_FREQ();
            int i2 = j1j.D3;
            String string2 = Integer.toString(iIntValue2);
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            SportDetailUtil.INSTANCE.updateExtraToBasicList(sport_data_info_best_skip_freq, new BasicItemInfo(i2, string2, "", sport_data_info_best_skip_freq, null, null, 48, null));
        }
    }

    private final void addExtraDataListStepsFeq(SportBasicReport sportValues) {
        Integer avgCadence = SportReportComputeUtil.getAvgCadence(sportValues);
        if (avgCadence != null) {
            int sport_data_info_steps_freq = BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_STEPS_FREQ();
            SportDetailUtil.INSTANCE.updateExtraToBasicList(sport_data_info_steps_freq, new BasicItemInfo(j1j.z7, avgCadence.toString(), "", sport_data_info_steps_freq, null, null, 48, null));
        }
    }

    private final void addExtraDataListStepsLength(SportBasicReport sportValues) {
        Integer avgStepLength = SportReportComputeUtil.getAvgStepLength(sportValues);
        if (avgStepLength != null) {
            int sport_data_info_step_length = BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_STEP_LENGTH();
            SportDetailUtil.INSTANCE.updateExtraToBasicList(sport_data_info_step_length, new BasicItemInfo(j1j.w3, avgStepLength.toString(), "", sport_data_info_step_length, null, null, 48, null));
        }
    }

    private final void addExtraDataListStress(SportBasicReport sportValues) {
        Integer avgCadence = SportReportComputeUtil.getAvgCadence(sportValues);
        if (avgCadence != null) {
            int sport_info_avg_stress = BasicItemInfo.INSTANCE.getSPORT_INFO_AVG_STRESS();
            SportDetailUtil.INSTANCE.updateExtraToBasicList(sport_info_avg_stress, new BasicItemInfo(j1j.u8, avgCadence.toString(), "", sport_info_avg_stress, null, null, 48, null));
        }
    }

    private final void addExtraDataListSwolf(SportBasicReport sportValues) {
        if (sportValues.getAvgSwolf() != null) {
            Integer avgSwolf = sportValues.getAvgSwolf();
            Intrinsics.checkNotNull(avgSwolf);
            int iIntValue = avgSwolf.intValue();
            int sport_data_info_avg_swolf = BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_AVG_SWOLF();
            int i = j1j.M9;
            String string = Integer.toString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            SportDetailUtil.INSTANCE.updateExtraToBasicList(sport_data_info_avg_swolf, new BasicItemInfo(i, string, "", sport_data_info_avg_swolf, null, null, 48, null));
        }
        if (sportValues.getBestSwolf() != null) {
            Integer bestSwolf = sportValues.getBestSwolf();
            Intrinsics.checkNotNull(bestSwolf);
            int iIntValue2 = bestSwolf.intValue();
            int sport_data_info_best_swolf = BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_BEST_SWOLF();
            int i2 = j1j.N9;
            String string2 = Integer.toString(iIntValue2);
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            SportDetailUtil.INSTANCE.updateExtraToBasicList(sport_data_info_best_swolf, new BasicItemInfo(i2, string2, "", sport_data_info_best_swolf, null, null, 48, null));
        }
    }

    private final void bindSportEnvironmentalView() {
        SportBasicReport sportBasicReport = this.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport);
        Integer environmental = sportBasicReport.getEnvironmental();
        if (environmental != null) {
            SportEnvironmentalView sportEnvironmentalView = this.sportEnvironmentalView;
            SportEnvironmentalView sportEnvironmentalView2 = null;
            if (sportEnvironmentalView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportEnvironmentalView");
                sportEnvironmentalView = null;
            }
            sportEnvironmentalView.setVisibility(0);
            SportEnvironmentalView sportEnvironmentalView3 = this.sportEnvironmentalView;
            if (sportEnvironmentalView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportEnvironmentalView");
            } else {
                sportEnvironmentalView2 = sportEnvironmentalView3;
            }
            sportEnvironmentalView2.bindData(environmental.intValue());
        }
    }

    private final void bindSportTargetView() {
        SportBasicReport sportBasicReport = this.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport);
        Map<Integer, String> targetValue = sportBasicReport.getTargetValue();
        if (targetValue == null || !(!targetValue.isEmpty())) {
            return;
        }
        SportTargetView sportTargetView = this.sportTargetView;
        if (sportTargetView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportTargetView");
            sportTargetView = null;
        }
        sportTargetView.setVisibility(0);
        for (Map.Entry<Integer, String> entry : targetValue.entrySet()) {
            SportTargetModel.Companion companion = SportTargetModel.INSTANCE;
            int iIntValue = entry.getKey().intValue();
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport2);
            SportTargetModel sportTargetModel = new SportTargetModel(entry.getKey().intValue(), entry.getKey().intValue() == 8 ? Float.valueOf(Float.parseFloat(entry.getValue())) : Integer.valueOf(Integer.parseInt(entry.getValue())), companion.getActualValue(iIntValue, sportBasicReport2), this.sportDataType);
            SportTargetView sportTargetView2 = this.sportTargetView;
            if (sportTargetView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportTargetView");
                sportTargetView2 = null;
            }
            sportTargetView2.bindData(sportTargetModel);
        }
        ConsistencyEventUtils.INSTANCE.reportCardInfo(this.mBasicReport, "target", (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
    }

    private final boolean checkRecordDataMap(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap) {
        if (sportRecordDataObjectMap.isEmpty()) {
            Logger.w("SportDetailFragment", "sportRecordDataObjectMap is null or sportRecordDataObjectMap.size is 0.");
            return false;
        }
        LinearLayout linearLayout = this.llContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llContainer");
            linearLayout = null;
        }
        linearLayout.setVisibility(0);
        return true;
    }

    private final List<uz6> createDistributeModelList(Context context, List<Integer> frisbeeValue, int totalCount) {
        ArrayList arrayList = new ArrayList();
        if (totalCount == 0) {
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
        Iterator<Integer> it = frisbeeValue.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            arrayList.add(new uz6(getFrisbeeColorByType(i), getFrisbeeStringByType(i), 5, (iIntValue * 100) / totalCount, String.valueOf(iIntValue), context.getResources().getQuantityString(byi.common_unit_rowing_machine_count, iIntValue)));
            i++;
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    private final void createShareBitmapItem(View containerView, boolean revers) {
        if (containerView != null && containerView.getHeight() == 0) {
            containerView.measure(View.MeasureSpec.makeMeasureSpec(containerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            containerView.layout(0, 0, containerView.getMeasuredWidth(), containerView.getMeasuredHeight());
        }
        Intrinsics.checkNotNull(containerView);
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(containerView, 0, 0, 6, null);
        if (revers) {
            this.shareBitmapList.add(0, bitmapLoadBitmapFromView$default);
        } else {
            this.shareBitmapList.add(bitmapLoadBitmapFromView$default);
        }
        this.shareHeight += bitmapLoadBitmapFromView$default.getHeight();
    }

    public static /* synthetic */ void createShareBitmapItem$default(SportDetailInnerFragment sportDetailInnerFragment, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        sportDetailInnerFragment.createShareBitmapItem(view, z);
    }

    private final MutableLiveData<Boolean> getAbnormalSportFlag(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap) {
        List<? extends Object> list = sportRecordDataObjectMap.get(SportRecordKey.Step);
        List<? extends Object> list2 = sportRecordDataObjectMap.get(SportRecordKey.Distance);
        if (list != null && list2 != null) {
            int iMax = Math.max(list.size(), list2.size());
            int i = 0;
            for (int i2 = 0; i2 < iMax; i2++) {
                if (i2 < list.size() && i2 < list2.size()) {
                    if (!Intrinsics.areEqual((Object) ((SportRecordItem) list.get(i2)).getValue(), (Object) 0) || ((SportRecordItem) list2.get(i2)).getValue().floatValue() <= 0.7f) {
                        i = 0;
                    } else {
                        i++;
                        if (i > 100) {
                            return new MutableLiveData<>(Boolean.TRUE);
                        }
                    }
                }
            }
        }
        return new MutableLiveData<>(Boolean.FALSE);
    }

    private final String getDeviceName(String sid) {
        if (TextUtils.equals(sid, "xiaomiwear_app_manually")) {
            return getString(j1j.common_data_manual_input);
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        SportBasicReport sportBasicReport = this.mBasicReport;
        String sid2 = sportBasicReport != null ? sportBasicReport.getSid() : null;
        Intrinsics.checkNotNull(sid2);
        DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid2);
        if (deviceInfoInAll != null) {
            return deviceInfoInAll.getName();
        }
        return null;
    }

    private final int getFrisbeeColorByType(int type) {
        if (type != 0) {
            return type != 1 ? x44.a(dki.V0) : x44.a(dki.T0);
        }
        return x44.a(dki.U0);
    }

    private final String getFrisbeeStringByType(int type) {
        if (type == 0) {
            String string = getString(j1j.V7);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (type != 1) {
            String string2 = getString(j1j.w8);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = getString(j1j.Q7);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    private final void initContentView() {
        initParamsFromBundle(getArguments());
        initTitleView();
    }

    private final void initDistributeCard() {
        this.mDistributeData = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.detail.inner.SportDetailInnerFragment.initDistributeCard.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                tz6 tz6Var = SportDetailInnerFragment.this.mDistributeAdapter;
                Intrinsics.checkNotNull(tz6Var);
                return tz6Var.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.sportFrisbeeView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportFrisbeeView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        bl5 bl5Var = new bl5(false);
        RecyclerView recyclerView3 = this.sportFrisbeeView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportFrisbeeView");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(bl5Var);
        this.mDistributeAdapter = new tz6(getMActivity(), this.mDistributeData, 5);
        RecyclerView recyclerView4 = this.sportFrisbeeView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportFrisbeeView");
            recyclerView4 = null;
        }
        recyclerView4.setAdapter(this.mDistributeAdapter);
        RecyclerView recyclerView5 = this.sportFrisbeeView;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportFrisbeeView");
        } else {
            recyclerView2 = recyclerView5;
        }
        recyclerView2.setHasFixedSize(true);
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            this.sportDataType = bundle.getInt("sport_type", 22);
            this.mBasicReport = (SportBasicReport) bundle.getSerializable("sport_report");
            this.mDetailSportType = bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1);
            this.showFeedback = bundle.getBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SHOW_SPORT_FEEDBACK, false);
            this.fromCourse = bundle.getBoolean(SportRecordBundleKey.BUNDLE_PARAMS_FROM_COURSE, false);
            this.routeData = (RouteReportData) bundle.getSerializable(SportBasicReportKt.getROUTE_KEY());
        }
    }

    private final void initSportAbnormalGuide() {
        MutableLiveData<Boolean> abnormalFlag;
        View view = this.sportAbnormalGuide;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportAbnormalGuide");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: sgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportDetailInnerFragment.initSportAbnormalGuide$lambda$14(this.f33621a, view2);
            }
        });
        SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
        if (sportRecordDetailViewModel == null || (abnormalFlag = sportRecordDetailViewModel.getAbnormalFlag()) == null) {
            return;
        }
        abnormalFlag.observe(getViewLifecycleOwner(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tgn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailInnerFragment.initSportAbnormalGuide$lambda$15(this.f34681a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSportAbnormalGuide$lambda$14(SportDetailInnerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new CommonDialog.c("abnormal_dialog").setCustomLayoutId(ivi.z1).setDialogTitle(j1j.e6).setPositiveText(j1j.common_known).create().showIfNeed(this$0.getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSportAbnormalGuide$lambda$15(SportDetailInnerFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.sportAbnormalGuide;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportAbnormalGuide");
            view = null;
        }
        Intrinsics.checkNotNull(bool);
        ViewExtKt.setVisible(view, bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$18(UploadFileModel.UploadFileResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void onFeedbackCommitClick() {
        SportFeedbackView sportFeedbackView = this.feedbackView;
        SportFeedbackView sportFeedbackView2 = null;
        if (sportFeedbackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            sportFeedbackView = null;
        }
        if (sportFeedbackView.getStatue() == FeedbackStatue.INIT) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ToastExtKt.toastShort(contextRequireContext, j1j.M4);
            return;
        }
        SportFeedbackView sportFeedbackView3 = this.feedbackView;
        if (sportFeedbackView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            sportFeedbackView3 = null;
        }
        if (sportFeedbackView3.getStatue() == FeedbackStatue.EDIT) {
            SportFeedbackView sportFeedbackView4 = this.feedbackView;
            if (sportFeedbackView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            } else {
                sportFeedbackView2 = sportFeedbackView4;
            }
            final String strCreateFeedbackContent = sportFeedbackView2.createFeedbackContent();
            CommonDialog commonDialogCreate = new CommonDialog.c("repeat").setDialogDescription(j1j.Y0).setNegativeText(j1j.a1).setPositiveText(j1j.Z0).create();
            Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.detail.inner.SportDetailInnerFragment.onFeedbackCommitClick.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    SportFeedbackView sportFeedbackView5 = null;
                    if (which == -1) {
                        SportFeedbackView sportFeedbackView6 = SportDetailInnerFragment.this.feedbackView;
                        if (sportFeedbackView6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
                        } else {
                            sportFeedbackView5 = sportFeedbackView6;
                        }
                        sportFeedbackView5.onUpload(true, strCreateFeedbackContent);
                        return;
                    }
                    SportFeedbackView sportFeedbackView7 = SportDetailInnerFragment.this.feedbackView;
                    if (sportFeedbackView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
                    } else {
                        sportFeedbackView5 = sportFeedbackView7;
                    }
                    sportFeedbackView5.onUpload(false, strCreateFeedbackContent);
                }
            });
            commonDialogCreate.showIfNeed(requireActivity().getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SportDetailInnerFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBasicReport sportBasicReportAcquireTriathlonReport = this$0.acquireTriathlonReport();
        if (sportBasicReportAcquireTriathlonReport != null) {
            sportBasicReportAcquireTriathlonReport.setSportType(10);
        }
        Intrinsics.checkNotNull(map);
        this$0.updateRecordDetailData(map, sportBasicReportAcquireTriathlonReport, 17);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SportDetailInnerFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateBehaviorData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(SportDetailInnerFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBasicReport sportBasicReportAcquireTriathlonReport = this$0.acquireTriathlonReport();
        if (sportBasicReportAcquireTriathlonReport != null) {
            sportBasicReportAcquireTriathlonReport.setSportType(6);
        }
        Intrinsics.checkNotNull(map);
        this$0.updateRecordDetailData(map, sportBasicReportAcquireTriathlonReport, 17);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(SportDetailInnerFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateBehaviorData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(SportDetailInnerFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBasicReport sportBasicReportAcquireTriathlonReport = this$0.acquireTriathlonReport();
        if (sportBasicReportAcquireTriathlonReport != null) {
            sportBasicReportAcquireTriathlonReport.setSportType(1);
        }
        Intrinsics.checkNotNull(map);
        this$0.updateRecordDetailData(map, sportBasicReportAcquireTriathlonReport, 17);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(SportDetailInnerFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateBehaviorData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(SportDetailInnerFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        SportBasicReport sportBasicReport = this$0.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport);
        this$0.updateRecordDetailData(map, sportBasicReport, -1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(SportDetailInnerFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateBehaviorData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(SportDetailInnerFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        this$0.onUploadResult(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(SportDetailInnerFragment this$0, RecoverRateData recoverRateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateRecoverRateView(recoverRateData);
        return Unit.INSTANCE;
    }

    private final void onUploadResult(boolean isSuccess) {
        if (!isSuccess) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ToastExtKt.toastShort(fragmentActivityRequireActivity, j1j.b1);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        ToastExtKt.toastShort(fragmentActivityRequireActivity2, j1j.c1);
        SportFeedbackView sportFeedbackView = this.feedbackView;
        SportFeedbackView sportFeedbackView2 = null;
        if (sportFeedbackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            sportFeedbackView = null;
        }
        sportFeedbackView.resetStatue(FeedbackStatue.COMMIT);
        SportFeedbackView sportFeedbackView3 = this.feedbackView;
        if (sportFeedbackView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            sportFeedbackView3 = null;
        }
        sportFeedbackView3.displayFeedbackView();
        SportBasicReport sportBasicReport = this.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport);
        long timeStamp = sportBasicReport.getTimeStamp();
        SportFeedbackView sportFeedbackView4 = this.feedbackView;
        if (sportFeedbackView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
        } else {
            sportFeedbackView2 = sportFeedbackView4;
        }
        ben.d(new SportFeedbackModel(timeStamp, sportFeedbackView2.getRating()));
    }

    private final void refreshDistributeCard(SportBasicReport sportValues) {
        int forceFrisbeeThrowingCount = sportValues.getForceFrisbeeThrowingCount();
        RecyclerView recyclerView = null;
        if (forceFrisbeeThrowingCount <= 0) {
            RecyclerView recyclerView2 = this.sportFrisbeeView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportFrisbeeView");
            } else {
                recyclerView = recyclerView2;
            }
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Integer smallForceFrisbeeThrowingCount = sportValues.getSmallForceFrisbeeThrowingCount();
        arrayList.add(Integer.valueOf(smallForceFrisbeeThrowingCount != null ? smallForceFrisbeeThrowingCount.intValue() : 0));
        Integer midForceFrisbeeThrowingCount = sportValues.getMidForceFrisbeeThrowingCount();
        arrayList.add(Integer.valueOf(midForceFrisbeeThrowingCount != null ? midForceFrisbeeThrowingCount.intValue() : 0));
        Integer strongForceFrisbeeThrowingCount = sportValues.getStrongForceFrisbeeThrowingCount();
        arrayList.add(Integer.valueOf(strongForceFrisbeeThrowingCount != null ? strongForceFrisbeeThrowingCount.intValue() : 0));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<uz6> listCreateDistributeModelList = createDistributeModelList(contextRequireContext, arrayList, forceFrisbeeThrowingCount);
        List<uz6> list = listCreateDistributeModelList;
        if (!(!list.isEmpty())) {
            RecyclerView recyclerView3 = this.sportFrisbeeView;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportFrisbeeView");
            } else {
                recyclerView = recyclerView3;
            }
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        RecyclerView recyclerView4 = this.sportFrisbeeView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportFrisbeeView");
        } else {
            recyclerView = recyclerView4;
        }
        ViewExtKt.setVisible(recyclerView, true);
        DistributeDataUtil.setPositionOfList(listCreateDistributeModelList);
        List<uz6> list2 = this.mDistributeData;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<uz6> list3 = this.mDistributeData;
        Intrinsics.checkNotNull(list3);
        list3.addAll(list);
        tz6 tz6Var = this.mDistributeAdapter;
        if (tz6Var != null) {
            tz6Var.notifyDataSetChanged();
        }
        ConsistencyEventUtils consistencyEventUtils = ConsistencyEventUtils.INSTANCE;
        SportBasicReport sportBasicReport = this.mBasicReport;
        Integer midForceFrisbeeThrowingCount2 = sportValues.getMidForceFrisbeeThrowingCount();
        Float fValueOf = Float.valueOf(midForceFrisbeeThrowingCount2 != null ? midForceFrisbeeThrowingCount2.intValue() : 0);
        Integer strongForceFrisbeeThrowingCount2 = sportValues.getStrongForceFrisbeeThrowingCount();
        Float fValueOf2 = Float.valueOf(strongForceFrisbeeThrowingCount2 != null ? strongForceFrisbeeThrowingCount2.intValue() : 0);
        Integer smallForceFrisbeeThrowingCount2 = sportValues.getSmallForceFrisbeeThrowingCount();
        consistencyEventUtils.reportCardInfo(sportBasicReport, "throw_force", fValueOf, fValueOf2, Float.valueOf(smallForceFrisbeeThrowingCount2 != null ? smallForceFrisbeeThrowingCount2.intValue() : 0));
    }

    private final void showContainerBehavior(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        Integer totalPunchCount;
        if (sportValues.getTotalPunchCount() == null || ((totalPunchCount = sportValues.getTotalPunchCount()) != null && totalPunchCount.intValue() == 0)) {
            getMBinding().C.setVisibility(8);
        } else {
            getMBinding().C.setVisibility(0);
            SportDetailBehaviorFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, this.mDetailSportType, getChildFragmentManager());
        }
    }

    private final void showContainerTrample(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        if (sportType == 7 || sportType == 6) {
            if (sportValues.getAvgCycleCadence() != null) {
                Integer avgCycleCadence = sportValues.getAvgCycleCadence();
                Intrinsics.checkNotNull(avgCycleCadence);
                if (avgCycleCadence.intValue() > 0) {
                    FrameLayout frameLayout = null;
                    if (sportRecordDataObjectMap.get(SportRecordKey.Frequency) == null) {
                        FrameLayout frameLayout2 = this.containerTrample;
                        if (frameLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("containerTrample");
                        } else {
                            frameLayout = frameLayout2;
                        }
                        frameLayout.setVisibility(8);
                        return;
                    }
                    FrameLayout frameLayout3 = this.containerTrample;
                    if (frameLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("containerTrample");
                    } else {
                        frameLayout = frameLayout3;
                    }
                    frameLayout.setVisibility(0);
                    SportDetailTrampleFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager());
                    return;
                }
            }
            FitnessLogUtils.i(FitnessReportKey.avgCycleCadence, "avgCycleCadence " + sportValues.getAvgCycleCadence());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void showCourseInfoFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum) {
        List<? extends Object> list = sportRecordDataObjectMap.get(SportRecordKey.ITSportInfo);
        SportDetailUtil sportDetailUtil = SportDetailUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ArrayList<SportCourseInfoModel> arrayListCreateCourseInfoList = sportDetailUtil.createCourseInfoList(contextRequireContext, list, sportType);
        FrameLayout frameLayout = null;
        if (arrayListCreateCourseInfoList.isEmpty()) {
            FrameLayout frameLayout2 = this.containerGroupInfo;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerGroupInfo");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerGroupInfo;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerGroupInfo");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailCourseFragment.y(sportValues, sportType, triathlonNum, arrayListCreateCourseInfoList, getChildFragmentManager());
    }

    private final void showDataFromLayout(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        SportBasicReport sportBasicReport = this.mBasicReport;
        String sid = sportBasicReport != null ? sportBasicReport.getSid() : null;
        if (sid != null && sid.length() != 0) {
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            if (!Intrinsics.areEqual("xiaomiwear_app_manually", sportBasicReport2 != null ? sportBasicReport2.getSid() : null)) {
                SportBasicReport sportBasicReport3 = this.mBasicReport;
                if (!Intrinsics.areEqual("xiaomiwear_app", sportBasicReport3 != null ? sportBasicReport3.getSid() : null)) {
                    FrameLayout dataFromLayout = getMBinding().u0;
                    Intrinsics.checkNotNullExpressionValue(dataFromLayout, "dataFromLayout");
                    ViewExtKt.visible(dataFromLayout);
                    SportDetailDateFromFragment.Companion companion = SportDetailDateFromFragment.INSTANCE;
                    SportBasicReport sportBasicReport4 = this.mBasicReport;
                    Intrinsics.checkNotNull(sportBasicReport4);
                    companion.switchDetailFragment(sportBasicReport4, sportType, triathlonNum, this.mDetailSportType, getChildFragmentManager());
                    return;
                }
            }
        }
        FrameLayout dataFromLayout2 = getMBinding().u0;
        Intrinsics.checkNotNullExpressionValue(dataFromLayout2, "dataFromLayout");
        ViewExtKt.gone(dataFromLayout2);
    }

    private final void showDepthFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.DivingDepth) == null) {
            FrameLayout frameLayout2 = this.containerDepth;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerDepth");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerDepth;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerDepth");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailDepthFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDivingDetailInfoFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType) {
        ArrayList<SportDivingInfoModel> arrayListCreateDivingInfoList = SportDetailUtil.INSTANCE.createDivingInfoList(sportRecordDataObjectMap.get(SportRecordKey.DivingSportInfo));
        if (arrayListCreateDivingInfoList.isEmpty()) {
            getMBinding().F.setVisibility(8);
        } else {
            getMBinding().F.setVisibility(0);
            SportDetailDivingInfoFragment.INSTANCE.switchDetailFragment(sportValues, sportType, arrayListCreateDivingInfoList, getChildFragmentManager());
        }
    }

    private final void showEqualPaceFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.EqualIntensityPace) == null) {
            FrameLayout frameLayout2 = this.containerEqualPace;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerEqualPace");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerEqualPace;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerEqualPace");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailEqualPaceFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showFeedbackView() {
        SportFeedbackView sportFeedbackView = null;
        if (!this.showFeedback) {
            SportFeedbackView sportFeedbackView2 = this.feedbackView;
            if (sportFeedbackView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            } else {
                sportFeedbackView = sportFeedbackView2;
            }
            sportFeedbackView.setVisibility(8);
            return;
        }
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport != null) {
            this.sportFeedbackModel = ben.a(new SportFeedbackModel(sportBasicReport.getTimeStamp(), 0.0f));
            SportFeedbackView sportFeedbackView3 = this.feedbackView;
            if (sportFeedbackView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
                sportFeedbackView3 = null;
            }
            sportFeedbackView3.setVisibility(0);
            if (sportBasicReport.getSportType() == 3) {
                SportFeedbackView sportFeedbackView4 = this.feedbackView;
                if (sportFeedbackView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
                    sportFeedbackView4 = null;
                }
                sportFeedbackView4.bindData(true, sportBasicReport, this.sportFeedbackModel, this);
            } else if (FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportBasicReport)) {
                SportFeedbackView sportFeedbackView5 = this.feedbackView;
                if (sportFeedbackView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
                    sportFeedbackView5 = null;
                }
                sportFeedbackView5.bindData(false, sportBasicReport, this.sportFeedbackModel, this);
            }
            SportFeedbackView sportFeedbackView6 = this.feedbackView;
            if (sportFeedbackView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            } else {
                sportFeedbackView = sportFeedbackView6;
            }
            sportFeedbackView.addCommitClick(new Function0() { // from class: ugn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SportDetailInnerFragment.showFeedbackView$lambda$11$lambda$10(this.f35744a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showFeedbackView$lambda$11$lambda$10(SportDetailInnerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onFeedbackCommitClick();
        return Unit.INSTANCE;
    }

    private final void showFragments(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport report, int sportType, int triathlonNum) {
        if (report == null) {
            return;
        }
        SportDetailUtil.INSTANCE.clearExtraBasicList();
        showTrainingExperience(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
        bindSportTargetView();
        refreshDistributeCard(report);
        showJustDanceDataLayout(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
        showSportPluginsFrequencyFragment(report, sportType, triathlonNum);
        showDataFromLayout(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
        if (sportRecordDataObjectMap != null && !sportRecordDataObjectMap.isEmpty()) {
            showRoutePathLayout(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showGroupInfoFragment(sportRecordDataObjectMap, report, sportType, triathlonNum);
            showCourseInfoFragment(sportRecordDataObjectMap, report, sportType, triathlonNum);
            showSkiingDetailInfoFragment(sportRecordDataObjectMap, report, sportType);
            showGolfDetailInfoFragment(sportRecordDataObjectMap, report, sportType);
            showRateFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showPaceFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showPaceChartFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showSpeedFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showSwimSegmentFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showSkippingSegmentFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showStressFragment(sportRecordDataObjectMap, report, sportType, triathlonNum);
            showStepsFrequencyFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showSkippingFrequencyFragment(sportRecordDataObjectMap, report, sportType, triathlonNum);
            showRowingFrequencyFragment(sportRecordDataObjectMap, report, sportType, triathlonNum);
            showStepsLengthFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showHeightFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showSkippingHeightFragment(sportRecordDataObjectMap, report, sportType, triathlonNum);
            showStrokeFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showSwolfFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showStepDownTime(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showStepUpTime(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showStepDownUp(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showStepImpactLanding(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showStepAttitude(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showContainerTrample(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showContainerBehavior(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showPermissionLayout(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showDepthFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showTemperatureFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showRunningPowerFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showPowerFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showResistanceFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showVerticalAmplitude(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showVerticalStepRatio(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            bindSportEnvironmentalView();
            showDivingDetailInfoFragment(sportRecordDataObjectMap, report, sportType);
            showFreeBreathFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showFreePitchFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showFrogBreathFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showFrogDurationFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
            showRateExampleFragment(sportRecordDataObjectMap, report, sportType, triathlonNum, this.mDetailSportType);
        }
        if (triathlonNum == 17) {
            SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
            if (sportRecordDetailViewModel != null) {
                SportBasicReport sportBasicReport = this.mBasicReport;
                Intrinsics.checkNotNull(sportBasicReport);
                sportRecordDetailViewModel.updateBasic(sportBasicReport, 17);
                return;
            }
            return;
        }
        SportRecordDetailViewModel sportRecordDetailViewModel2 = this.detailViewModel;
        if (sportRecordDetailViewModel2 != null) {
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport2);
            sportRecordDetailViewModel2.updateBasic(sportBasicReport2, sportType);
        }
    }

    private final void showFreeBreathFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        Integer avgFreeBreathAngle;
        if (sportRecordDataObjectMap.get(SportRecordKey.FreeBreathAngle) == null || (avgFreeBreathAngle = sportValues.getAvgFreeBreathAngle()) == null || avgFreeBreathAngle.intValue() <= 0) {
            getMBinding().H.setVisibility(8);
        } else {
            getMBinding().H.setVisibility(0);
            SportDetailFreeSwimBreathFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
        }
    }

    private final void showFreePitchFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        Integer avgFreePitchAngle;
        if (sportRecordDataObjectMap.get(SportRecordKey.FreePitchAngle) == null || (avgFreePitchAngle = sportValues.getAvgFreePitchAngle()) == null || avgFreePitchAngle.intValue() <= 0) {
            getMBinding().I.setVisibility(8);
        } else {
            getMBinding().I.setVisibility(0);
            SportDetailFreeSwimPitchFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
        }
    }

    private final void showFrogBreathFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        Integer avgFrogBreathAngle;
        if (sportRecordDataObjectMap.get(SportRecordKey.FrogBreathAngle) == null || (avgFrogBreathAngle = sportValues.getAvgFrogBreathAngle()) == null || avgFrogBreathAngle.intValue() <= 0) {
            getMBinding().J.setVisibility(8);
        } else {
            getMBinding().J.setVisibility(0);
            SportDetailFrogSwimBreathFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
        }
    }

    private final void showFrogDurationFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        Integer avgFrogSkiDuration;
        if (sportRecordDataObjectMap.get(SportRecordKey.FrogSkiDuration) == null || (avgFrogSkiDuration = sportValues.getAvgFrogSkiDuration()) == null || avgFrogSkiDuration.intValue() <= 0) {
            getMBinding().K.setVisibility(8);
        } else {
            getMBinding().K.setVisibility(0);
            SportDetailFrogSwimDurationFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showGolfDetailInfoFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType) {
        ArrayList<SportGolfInfoModel> arrayListCreateGolfInfoList = SportDetailUtil.INSTANCE.createGolfInfoList(sportRecordDataObjectMap.get(SportRecordKey.GolfInfo));
        FrameLayout frameLayout = null;
        if (arrayListCreateGolfInfoList.isEmpty()) {
            FrameLayout frameLayout2 = this.containerGolfInfo;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerGolfInfo");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerGolfInfo;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerGolfInfo");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailGolfInfoFragment.x(sportValues, sportType, arrayListCreateGolfInfoList, getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showGroupInfoFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum) {
        if (sportValues.getGroupCount() != null) {
            Integer groupCount = sportValues.getGroupCount();
            Intrinsics.checkNotNull(groupCount);
            if (groupCount.intValue() < 1) {
                return;
            }
            ArrayList<GroupSportDetailInfo> arrayListCreateTrainingInfoList = SportDetailUtil.INSTANCE.createTrainingInfoList(sportRecordDataObjectMap.get(SportRecordKey.GroupSportInfo));
            FrameLayout frameLayout = null;
            if (arrayListCreateTrainingInfoList.isEmpty()) {
                FrameLayout frameLayout2 = this.containerGroupInfo;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerGroupInfo");
                } else {
                    frameLayout = frameLayout2;
                }
                frameLayout.setVisibility(8);
                return;
            }
            FrameLayout frameLayout3 = this.containerGroupInfo;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerGroupInfo");
            } else {
                frameLayout = frameLayout3;
            }
            frameLayout.setVisibility(0);
            SportDetailGroupInfoFragment.x(sportValues, sportType, triathlonNum, arrayListCreateTrainingInfoList, getChildFragmentManager());
        }
    }

    private final void showHeightFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.Height) == null && !SportBasicReportKt.showClimbDuration(sportValues)) {
            FrameLayout frameLayout2 = this.containerHeight;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerHeight");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerHeight;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerHeight");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailHeightFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showJustDanceDataLayout(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport report, final int sportType, final int triathlonNum, final int mDetailSportType) {
        MutableLiveData<List<SwitchSongItem>> switchJustDanceList;
        if (sportType != 812) {
            getMBinding().y0.setVisibility(8);
            return;
        }
        SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
        if (sportRecordDetailViewModel != null && (switchJustDanceList = sportRecordDetailViewModel.getSwitchJustDanceList()) != null) {
            switchJustDanceList.observe(getViewLifecycleOwner(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wgn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.showJustDanceDataLayout$lambda$13(this.f37959a, sportType, triathlonNum, mDetailSportType, (List) obj);
                }
            }));
        }
        SportRecordDetailViewModel sportRecordDetailViewModel2 = this.detailViewModel;
        if (sportRecordDetailViewModel2 != null) {
            sportRecordDetailViewModel2.getSwitchDanceSongs(report.getTimeStamp());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showJustDanceDataLayout$lambda$13(SportDetailInnerFragment this$0, int i, int i2, int i3, List justDaceList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(justDaceList, "justDaceList");
        Logger.d("SPORTS REPORT", "fresh justDaceList：" + justDaceList);
        if (justDaceList.isEmpty()) {
            this$0.getMBinding().y0.setVisibility(8);
        } else {
            this$0.getMBinding().y0.setVisibility(0);
            SportDetailJustDanceDataFragment.Companion companion = SportDetailJustDanceDataFragment.INSTANCE;
            SportBasicReport sportBasicReport = this$0.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport);
            companion.switchDetailFragment(sportBasicReport, i, i2, i3, justDaceList, this$0.getChildFragmentManager());
        }
        return Unit.INSTANCE;
    }

    private final void showMedalLayout(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout containerMedalLayout = getMBinding().O;
        Intrinsics.checkNotNullExpressionValue(containerMedalLayout, "containerMedalLayout");
        ViewExtKt.visible(containerMedalLayout);
        SportDetailMedalFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, this.mDetailSportType, getChildFragmentManager());
    }

    private final void showPaceChartFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.Pace) == null || !(FitnessSportTypeUtils.INSTANCE.supportPaceSport(sportType, sportValues) || sportDetailType == 2)) {
            FrameLayout frameLayout2 = this.containerPaceChart;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerPaceChart");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerPaceChart;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerPaceChart");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailPaceChartFragment.Companion companion = SportDetailPaceChartFragment.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, childFragmentManager, this.mBasicReport);
    }

    private final void showPaceFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        List<? extends Object> list = sportRecordDataObjectMap.get(SportRecordKey.WholeKMPoint);
        FrameLayout frameLayout = null;
        if (list != null) {
            FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
            if (fitnessSportTypeUtils.supportPaceSport(sportType, sportValues) && list.size() > 1) {
                FrameLayout frameLayout2 = this.containerPace;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerPace");
                } else {
                    frameLayout = frameLayout2;
                }
                frameLayout.setVisibility(0);
                Logger.i("showPaceChartFragment", "objectPace " + list + "  flag " + fitnessSportTypeUtils.supportPaceSport(sportType));
                SportDetailPaceFragment.Companion companion = SportDetailPaceFragment.INSTANCE;
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                companion.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, childFragmentManager, this.mBasicReport);
                return;
            }
        }
        Logger.i("showPaceChartFragment", "objectPace " + list + "  flag " + FitnessSportTypeUtils.INSTANCE.supportPaceSport(sportType));
        FrameLayout frameLayout3 = this.containerPace;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerPace");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(8);
    }

    private final void showPermissionLayout(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (!Intrinsics.areEqual("xiaomiwear_app", sportValues.getSid()) || (sportType != 1 && sportType != 2 && sportType != 6)) {
            this.isPermissionLayoutShow = false;
            FrameLayout frameLayout2 = this.permissionFragment;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permissionFragment");
            } else {
                frameLayout = frameLayout2;
            }
            ViewExtKt.gone(frameLayout);
            return;
        }
        this.isPermissionLayoutShow = true;
        FrameLayout frameLayout3 = this.permissionFragment;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionFragment");
        } else {
            frameLayout = frameLayout3;
        }
        ViewExtKt.visible(frameLayout);
        SportDetailPermissionFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, this.mDetailSportType, getChildFragmentManager());
    }

    private final void showPowerFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.Power) != null && sportValues.getAvgPower() != null) {
            Integer avgPower = sportValues.getAvgPower();
            Intrinsics.checkNotNull(avgPower);
            if (avgPower.intValue() > 0) {
                FrameLayout frameLayout2 = this.containerPower;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerPower");
                } else {
                    frameLayout = frameLayout2;
                }
                frameLayout.setVisibility(0);
                SportDetailPowerFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager());
                return;
            }
        }
        FrameLayout frameLayout3 = this.containerPower;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerPower");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    private final void showRateExampleFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        TimeUtils timeUtils;
        long jCurrentTimeMillis;
        SportRecordPreference sportRecordPreference;
        long j;
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = null;
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            LocaleUtil localeUtil = LocaleUtil.INSTANCE;
            String language = Locale.CHINA.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            if (!localeUtil.isSameLanguage(language)) {
                String language2 = Locale.ENGLISH.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
                if (localeUtil.isSameLanguage(language2)) {
                    if (sportValues.getShowConnectDevice()) {
                        timeUtils = TimeUtils.INSTANCE;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        sportRecordPreference = SportRecordPreference.INSTANCE;
                        j = 1000;
                        if (!timeUtils.isSameDay(jCurrentTimeMillis, sportRecordPreference.getShowRateExampleTime() * j)) {
                            sportRecordPreference.setShowRateExampleTime(System.currentTimeMillis() / j);
                            frameLayout = this.containerRateExample;
                            if (frameLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("containerRateExample");
                            } else {
                                frameLayout2 = frameLayout;
                            }
                            frameLayout2.setVisibility(0);
                            SportDetailRateExampleFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
                            return;
                        }
                    }
                }
            } else if (sportValues.getShowConnectDevice()) {
                timeUtils = TimeUtils.INSTANCE;
                jCurrentTimeMillis = System.currentTimeMillis();
                sportRecordPreference = SportRecordPreference.INSTANCE;
                j = 1000;
                if (!timeUtils.isSameDay(jCurrentTimeMillis, sportRecordPreference.getShowRateExampleTime() * j)) {
                    sportRecordPreference.setShowRateExampleTime(System.currentTimeMillis() / j);
                    frameLayout = this.containerRateExample;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("containerRateExample");
                    } else {
                        frameLayout2 = frameLayout;
                    }
                    frameLayout2.setVisibility(0);
                    SportDetailRateExampleFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
                    return;
                }
            }
        }
        FrameLayout frameLayout3 = this.containerRateExample;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerRateExample");
        } else {
            frameLayout2 = frameLayout3;
        }
        frameLayout2.setVisibility(8);
    }

    private final void showRateFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.Hr) == null) {
            FrameLayout frameLayout2 = this.containerRate;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerRate");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerRate;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerRate");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailRateFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showRecoverRateFragment() {
        if (this.mBasicReport == null) {
            return;
        }
        int i = this.mDetailSportType;
        int i2 = (i == 0 || i == 1 || i == 2) ? 17 : -1;
        SportBasicReport sportBasicReportAcquireTriathlonReport = acquireTriathlonReport();
        if (sportBasicReportAcquireTriathlonReport == null) {
            sportBasicReportAcquireTriathlonReport = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReportAcquireTriathlonReport);
        }
        int sportType = sportBasicReportAcquireTriathlonReport.getSportType();
        if (this.mDetailSportType == -1 || sportType == 1) {
            SportRecoverRateFragment.Companion companion = SportRecoverRateFragment.INSTANCE;
            SportBasicReport sportBasicReport = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport);
            companion.switchDetailFragment(sportBasicReport, sportType, i2, this.mDetailSportType, getChildFragmentManager());
            return;
        }
        FrameLayout frameLayout = this.containerRecoverRate;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerRecoverRate");
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
    }

    private final void showResistanceFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        List<? extends Object> list = sportRecordDataObjectMap.get(SportRecordKey.Resistance);
        Integer avgResistance = sportValues.getAvgResistance();
        FrameLayout frameLayout = null;
        if (list == null || avgResistance == null || avgResistance.intValue() <= 0) {
            FrameLayout frameLayout2 = this.containerResistance;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerResistance");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerResistance;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerResistance");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailResistanceFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager());
    }

    private final void showRoutePathLayout(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout containerRecordRunningRouteLayout = getMBinding().V;
        Intrinsics.checkNotNullExpressionValue(containerRecordRunningRouteLayout, "containerRecordRunningRouteLayout");
        ViewExtKt.visible(containerRecordRunningRouteLayout);
        SportDetailRouteFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, this.mDetailSportType, this.routeData, getChildFragmentManager());
    }

    private final void showRowingFrequencyFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport report, int sportType, int triathlonNum) {
        if (sportType != 13) {
            return;
        }
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.Frequency) == null) {
            FrameLayout frameLayout2 = this.containerRowing;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerRowing");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerRowing;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerRowing");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailRowingFragment.INSTANCE.switchDetailFragment(report, sportType, triathlonNum, getChildFragmentManager());
    }

    private final void showRunningPowerFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.RunningPower) == null) {
            FrameLayout frameLayout2 = this.containerRunPower;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerRunPower");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerRunPower;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerRunPower");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailRunningPowerFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSkiingDetailInfoFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType) {
        ArrayList<SportSkiingInfoModel> arrayListCreateSkiingInfoList = SportDetailUtil.INSTANCE.createSkiingInfoList(sportRecordDataObjectMap.get(SportRecordKey.SkiInfo));
        Integer turnCount = sportValues.getTurnCount();
        if ((turnCount != null ? turnCount.intValue() : 0) < arrayListCreateSkiingInfoList.size() && (!arrayListCreateSkiingInfoList.isEmpty())) {
            arrayListCreateSkiingInfoList.remove(arrayListCreateSkiingInfoList.size() - 1);
        }
        FrameLayout frameLayout = null;
        if (arrayListCreateSkiingInfoList.isEmpty()) {
            FrameLayout frameLayout2 = this.containerDetailInfo;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerDetailInfo");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerDetailInfo;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerDetailInfo");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailSkiingInfoFragment.INSTANCE.switchDetailFragment(sportValues, sportType, arrayListCreateSkiingInfoList, getChildFragmentManager());
    }

    private final void showSkippingFrequencyFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum) {
        if (sportType != 14) {
            return;
        }
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.Frequency) == null) {
            FrameLayout frameLayout2 = this.containerSkipping;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSkipping");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerSkipping;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerSkipping");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        addExtraDataListSkipping(sportValues);
        SportDetailSkippingFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, getChildFragmentManager());
    }

    private final void showSkippingHeightFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.SkippingHeight) == null) {
            FrameLayout frameLayout2 = this.containerSkippingHeight;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSkippingHeight");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerSkippingHeight;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerSkippingHeight");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailSkippingHeightFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, getChildFragmentManager());
    }

    private final void showSkippingSegmentFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.RopeSkipStumbleInfo) == null) {
            FrameLayout frameLayout2 = this.containerSkippingSegment;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSkippingSegment");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerSkippingSegment;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerSkippingSegment");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailSkippingSegmentFragment.Companion companion = SportDetailSkippingSegmentFragment.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, childFragmentManager);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if ((r9 != null ? r9.floatValue() : 0.0f) > 0.0f) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showSpeedFragment(java.util.Map<com.xiaomi.fit.data.common.data.sport.SportRecordKey, ? extends java.util.List<? extends java.lang.Object>> r9, com.xiaomi.fit.data.common.data.sport.SportBasicReport r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            com.xiaomi.fit.data.common.data.sport.SportRecordKey r0 = com.xiaomi.fit.data.common.data.sport.SportRecordKey.Speed
            java.lang.Object r9 = r9.get(r0)
            java.util.List r9 = (java.util.List) r9
            r0 = 0
            java.lang.String r1 = "containerSpeed"
            if (r9 == 0) goto L50
            com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils r9 = com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils.INSTANCE
            boolean r9 = r9.supportSpeedSport(r11, r10)
            if (r9 != 0) goto L2e
            r9 = 1
            if (r13 == r9) goto L2e
            r9 = 7
            if (r11 != r9) goto L50
            com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil r9 = com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil.INSTANCE
            java.lang.Float r9 = r9.getAvgSpeed(r10)
            r2 = 0
            if (r9 == 0) goto L29
            float r9 = r9.floatValue()
            goto L2a
        L29:
            r9 = r2
        L2a:
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto L50
        L2e:
            android.widget.FrameLayout r9 = r8.containerSpeed
            if (r9 != 0) goto L36
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L37
        L36:
            r0 = r9
        L37:
            r9 = 0
            r0.setVisibility(r9)
            com.xiaomi.fitness.detail.inner.SportDetailSpeedFragment$Companion r1 = com.xiaomi.fitness.detail.inner.SportDetailSpeedFragment.INSTANCE
            androidx.fragment.app.FragmentManager r6 = r8.getChildFragmentManager()
            java.lang.String r9 = "getChildFragmentManager(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            com.xiaomi.fit.data.common.data.sport.SportBasicReport r7 = r8.mBasicReport
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.switchDetailFragment(r2, r3, r4, r5, r6, r7)
            goto L5e
        L50:
            android.widget.FrameLayout r9 = r8.containerSpeed
            if (r9 != 0) goto L58
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L59
        L58:
            r0 = r9
        L59:
            r9 = 8
            r0.setVisibility(r9)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.detail.inner.SportDetailInnerFragment.showSpeedFragment(java.util.Map, com.xiaomi.fit.data.common.data.sport.SportBasicReport, int, int, int):void");
    }

    private final void showSportPluginsFrequencyFragment(SportBasicReport sportValues, int sportType, int triathlonNum) {
        Integer maxFreq;
        Integer gymTrainingTotalTimes;
        if ((sportType != 313 || (gymTrainingTotalTimes = sportValues.getGymTrainingTotalTimes()) == null || gymTrainingTotalTimes.intValue() <= 0) && sportType != 334) {
            return;
        }
        Integer avgFreq = sportValues.getAvgFreq();
        FrameLayout frameLayout = null;
        if ((avgFreq == null || avgFreq.intValue() <= 0) && ((maxFreq = sportValues.getMaxFreq()) == null || maxFreq.intValue() <= 0)) {
            FrameLayout frameLayout2 = this.containerPluginsFrequency;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerPluginsFrequency");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerPluginsFrequency;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerPluginsFrequency");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailPluginsFrequencyFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, getChildFragmentManager());
    }

    private final void showStepAttitude(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        Integer mainLandingMode;
        FrameLayout frameLayout = null;
        if (sportValues.getMainLandingMode() == null || ((mainLandingMode = sportValues.getMainLandingMode()) != null && mainLandingMode.intValue() == 0)) {
            FrameLayout frameLayout2 = this.containerStepAttitude;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStepAttitude");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStepAttitude;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStepAttitude");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailStepAttitudeFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager());
    }

    private final void showStepDownTime(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.TouchdownTime) == null) {
            FrameLayout frameLayout2 = this.containerStepDownTime;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStepDownTime");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStepDownTime;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStepDownTime");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailStepDownTimeFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showStepDownUp(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.TouchAirRatio) == null) {
            FrameLayout frameLayout2 = this.containerStepDownUp;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStepDownUp");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStepDownUp;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStepDownUp");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailStepDownUpFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager());
    }

    private final void showStepImpactLanding(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.LandingImpact) == null) {
            FrameLayout frameLayout2 = this.containerStepImpactLanding;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStepImpactLanding");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStepImpactLanding;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStepImpactLanding");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailStepImpactLandingFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager());
    }

    private final void showStepUpTime(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.InTheAirTime) == null) {
            FrameLayout frameLayout2 = this.containerStepUpTime;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStepUpTime");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStepUpTime;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStepUpTime");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailStepUpTimeFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager());
    }

    private final void showStepsFrequencyFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.StepsFrequency) == null) {
            FrameLayout frameLayout2 = this.containerStep;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStep");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStep;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStep");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        addExtraDataListStepsFeq(sportValues);
        SportDetailStepFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showStepsLengthFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        List<? extends Object> list = sportRecordDataObjectMap.get(SportRecordKey.StepsLength);
        Integer avgStepLength = SportReportComputeUtil.getAvgStepLength(sportValues);
        int iIntValue = avgStepLength != null ? avgStepLength.intValue() : 0;
        FrameLayout frameLayout = null;
        if (list == null || iIntValue > 200) {
            Logger.i("containerStepLength$ GONE", new Object[0]);
            FrameLayout frameLayout2 = this.containerStepLength;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStepLength");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStepLength;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStepLength");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        Logger.i("containerStepLength$ VISIBLE", new Object[0]);
        addExtraDataListStepsLength(sportValues);
        SportDetailStepLengthFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showStressFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.Stress) == null) {
            FrameLayout frameLayout2 = this.containerStress;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStress");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStress;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStress");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        addExtraDataListStress(sportValues);
        SportDetailStressFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, getChildFragmentManager());
    }

    private final void showStrokeFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.SwimStrokeFreq) == null) {
            FrameLayout frameLayout2 = this.containerStroke;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStroke");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerStroke;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerStroke");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailStrokeFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showSwimSegmentFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int mDetailSportType) {
        List<? extends Object> list = sportRecordDataObjectMap.get(SportRecordKey.SwimPace);
        ArrayList<SwimmingPassage> arrayList = (ArrayList) sportRecordDataObjectMap.get(SportRecordKey.SwimPassage);
        FrameLayout frameLayout = null;
        if (list == null) {
            FrameLayout frameLayout2 = this.containerSwimSegment;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSwimSegment");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerSwimSegment;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerSwimSegment");
            frameLayout3 = null;
        }
        frameLayout3.setVisibility(0);
        if ((arrayList == null || arrayList.size() != 0) && (arrayList == null || arrayList.size() <= 2000)) {
            SportDetailSwimPaceFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, mDetailSportType, arrayList, getChildFragmentManager(), this.mBasicReport);
            return;
        }
        FrameLayout frameLayout4 = this.containerSwimSegment;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerSwimSegment");
        } else {
            frameLayout = frameLayout4;
        }
        frameLayout.setVisibility(8);
    }

    private final void showSwolfFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.SwimSwolf) == null) {
            FrameLayout frameLayout2 = this.containerSwolf;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSwolf");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerSwolf;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerSwolf");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        addExtraDataListSwolf(sportValues);
        SportDetailSwolfFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showTemperatureFragment(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.DivingTemperature) == null) {
            FrameLayout frameLayout2 = this.containerTemperature;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerTemperature");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerTemperature;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerTemperature");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailTemperatureFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showTrainingExperience(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        getMBinding().F0.setVisibility(0);
        SportTrainingExperienceFragment.INSTANCE.switchDetailFragment(sportValues, this.mBasicReport, sportType, triathlonNum, this.mDetailSportType, getChildFragmentManager());
    }

    private final void showVerticalAmplitude(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.VerticalAmplitude) == null) {
            FrameLayout frameLayout2 = this.containerVerticalAmplitude;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerVerticalAmplitude");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerVerticalAmplitude;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerVerticalAmplitude");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailVerticalAmplitudeFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void showVerticalStepRatio(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType) {
        FrameLayout frameLayout = null;
        if (sportRecordDataObjectMap.get(SportRecordKey.VerticalStrideRatio) == null) {
            FrameLayout frameLayout2 = this.containerVerticalRatio;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerVerticalRatio");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerVerticalRatio;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerVerticalRatio");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        SportDetailVerticalRatioFragment.INSTANCE.switchDetailFragment(sportValues, sportType, triathlonNum, sportDetailType, getChildFragmentManager(), this.mBasicReport);
    }

    private final void updateBehaviorData(List<? extends SportBehaviorModel> sportBehaviorModelList) {
        List<? extends SportBehaviorModel> list = sportBehaviorModelList;
        SportDetailBehaviorView sportDetailBehaviorView = null;
        if (list == null || list.isEmpty()) {
            SportDetailBehaviorView sportDetailBehaviorView2 = this.mSportBehaviorView;
            if (sportDetailBehaviorView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSportBehaviorView");
            } else {
                sportDetailBehaviorView = sportDetailBehaviorView2;
            }
            sportDetailBehaviorView.setVisibility(8);
            return;
        }
        SportDetailBehaviorView sportDetailBehaviorView3 = this.mSportBehaviorView;
        if (sportDetailBehaviorView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSportBehaviorView");
            sportDetailBehaviorView3 = null;
        }
        sportDetailBehaviorView3.setVisibility(0);
        SportDetailBehaviorView sportDetailBehaviorView4 = this.mSportBehaviorView;
        if (sportDetailBehaviorView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSportBehaviorView");
            sportDetailBehaviorView4 = null;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        sportDetailBehaviorView4.setActivity(fragmentActivityRequireActivity);
        SportDetailBehaviorView sportDetailBehaviorView5 = this.mSportBehaviorView;
        if (sportDetailBehaviorView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSportBehaviorView");
            sportDetailBehaviorView5 = null;
        }
        sportDetailBehaviorView5.setMClickListener(new View.OnClickListener() { // from class: ogn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailInnerFragment.updateBehaviorData$lambda$12(this.f29150a, view);
            }
        });
        SportDetailBehaviorView sportDetailBehaviorView6 = this.mSportBehaviorView;
        if (sportDetailBehaviorView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSportBehaviorView");
        } else {
            sportDetailBehaviorView = sportDetailBehaviorView6;
        }
        sportDetailBehaviorView.bindData(sportBehaviorModelList);
        ConsistencyEventUtils consistencyEventUtils = ConsistencyEventUtils.INSTANCE;
        SportBasicReport sportBasicReport = this.mBasicReport;
        consistencyEventUtils.reportCardInfo(sportBasicReport, (sportBasicReport == null || sportBasicReport.getProtoType() != 25) ? "performance" : "toxicity", (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBehaviorData$lambda$12(SportDetailInnerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBasicReport sportBasicReport = this$0.mBasicReport;
        int iA = sportBasicReport == null ? -1 : lp5.a(sportBasicReport);
        String str = (sportBasicReport == null || sportBasicReport.getProtoType() != 25) ? "performance" : "toxicity";
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("tip", "56.93.0.1.36903");
        pairArr[1] = TuplesKt.to("name", "btn_introduction");
        pairArr[2] = TuplesKt.to("type_str", lp5.c(iA));
        pairArr[3] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, String.valueOf(sportBasicReport != null ? sportBasicReport.getSportType() : -1));
        pairArr[4] = TuplesKt.to("data_type", str);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
        WebViewUtilKt.startWebView$default(SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "performance"), ApplicationExtKt.getApplication().getString(j1j.T2), false, false, null, false, null, false, 252, null);
    }

    private final void updateRecordDetailData(Map<SportRecordKey, ? extends List<? extends Object>> sportRecordDataObjectMap, SportBasicReport report, int triathlonNum) {
        int sportType;
        if (isInvalid()) {
            return;
        }
        checkRecordDataMap(sportRecordDataObjectMap);
        if (report != null) {
            sportType = report.getSportType();
        } else {
            SportBasicReport sportBasicReport = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport);
            sportType = sportBasicReport.getSportType();
        }
        showFragments(sportRecordDataObjectMap, report, sportType, triathlonNum);
    }

    private final void updateRecoverRateView(RecoverRateData data) {
        List<Integer> recoverRateList;
        if (isInvalid()) {
            return;
        }
        FrameLayout frameLayout = null;
        if (data == null || (recoverRateList = data.getRecoverRateList()) == null || recoverRateList.isEmpty()) {
            FrameLayout frameLayout2 = this.containerRecoverRate;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerRecoverRate");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.containerRecoverRate;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerRecoverRate");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
        showRecoverRateFragment();
    }

    @NotNull
    public final List<Bitmap> createShareBitmap() {
        if (this.shareBitmapList.size() > 0) {
            this.shareBitmapList.clear();
            this.shareHeight = 0;
        }
        int i = this.mDetailSportType;
        TextView textView = null;
        if (i == 0) {
            FrameLayout frameLayout = this.containerSwimSegment;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSwimSegment");
                frameLayout = null;
            }
            if (frameLayout.getVisibility() == 0) {
                FrameLayout frameLayout2 = this.containerSwimSegment;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerSwimSegment");
                    frameLayout2 = null;
                }
                createShareBitmapItem$default(this, frameLayout2, false, 2, null);
            }
            FrameLayout frameLayout3 = this.containerPace;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerPace");
                frameLayout3 = null;
            }
            if (frameLayout3.getVisibility() == 0) {
                FrameLayout frameLayout4 = this.containerPace;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerPace");
                    frameLayout4 = null;
                }
                createShareBitmapItem$default(this, frameLayout4, false, 2, null);
            }
            FrameLayout frameLayout5 = this.containerStroke;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStroke");
                frameLayout5 = null;
            }
            if (frameLayout5.getVisibility() == 0) {
                FrameLayout frameLayout6 = this.containerStroke;
                if (frameLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerStroke");
                    frameLayout6 = null;
                }
                createShareBitmapItem$default(this, frameLayout6, false, 2, null);
            }
            FrameLayout frameLayout7 = this.containerSwolf;
            if (frameLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSwolf");
                frameLayout7 = null;
            }
            if (frameLayout7.getVisibility() == 0) {
                FrameLayout frameLayout8 = this.containerSwolf;
                if (frameLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerSwolf");
                    frameLayout8 = null;
                }
                createShareBitmapItem$default(this, frameLayout8, false, 2, null);
            }
        } else if (i == 1) {
            FrameLayout frameLayout9 = this.containerSpeed;
            if (frameLayout9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerSpeed");
                frameLayout9 = null;
            }
            if (frameLayout9.getVisibility() == 0) {
                FrameLayout frameLayout10 = this.containerSpeed;
                if (frameLayout10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerSpeed");
                    frameLayout10 = null;
                }
                createShareBitmapItem$default(this, frameLayout10, false, 2, null);
            }
        } else {
            FrameLayout frameLayout11 = this.containerPace;
            if (frameLayout11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerPace");
                frameLayout11 = null;
            }
            if (frameLayout11.getVisibility() == 0) {
                FrameLayout frameLayout12 = this.containerPace;
                if (frameLayout12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerPace");
                    frameLayout12 = null;
                }
                createShareBitmapItem$default(this, frameLayout12, false, 2, null);
            }
            FrameLayout frameLayout13 = this.containerStep;
            if (frameLayout13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("containerStep");
                frameLayout13 = null;
            }
            if (frameLayout13.getVisibility() == 0) {
                FrameLayout frameLayout14 = this.containerStep;
                if (frameLayout14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerStep");
                    frameLayout14 = null;
                }
                createShareBitmapItem$default(this, frameLayout14, false, 2, null);
            }
        }
        if (this.shareBitmapList.size() > 0) {
            TextView textView2 = this.titleView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            } else {
                textView = textView2;
            }
            createShareBitmapItem(textView, true);
        }
        return this.shareBitmapList;
    }

    public final int getFeedbackViewHeight() {
        if (!isFeedbackVisibility()) {
            return 0;
        }
        SportFeedbackView sportFeedbackView = this.feedbackView;
        if (sportFeedbackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            sportFeedbackView = null;
        }
        return sportFeedbackView.getHeight();
    }

    @NotNull
    public final mea getMBinding() {
        mea meaVar = this._binding;
        Intrinsics.checkNotNull(meaVar);
        return meaVar;
    }

    public final int getPermissionViewHeight() {
        if (this.isPermissionLayoutShow) {
            return getMBinding().A0.getHeight();
        }
        return 0;
    }

    @NotNull
    public final List<Bitmap> getShareBitmapList() {
        return this.shareBitmapList;
    }

    public final int getShareHeight() {
        return this.shareHeight;
    }

    public final int getTrainingExperienceHeight() {
        if (getMBinding().F0.getVisibility() == 0) {
            return getMBinding().F0.getHeight();
        }
        return 0;
    }

    public final void initTitleView() {
        String strC;
        int i = this.mDetailSportType;
        if (i == 0) {
            strC = lp5.c(24);
        } else if (i == 1) {
            strC = lp5.c(26);
        } else {
            strC = i == 2 ? lp5.c(22) : "";
        }
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
            textView = null;
        }
        textView.setText(strC);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    @NotNull
    public final SpannableString insertIconInText(@NotNull Context context, @NotNull String originalText, @NotNull String targetSubstring, int iconResId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        Intrinsics.checkNotNullParameter(targetSubstring, "targetSubstring");
        Drawable drawable = context.getDrawable(iconResId);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        ImageSpan imageSpan = drawable != null ? new ImageSpan(drawable, 1) : null;
        SpannableString spannableString = new SpannableString(originalText);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) originalText, targetSubstring, 0, false, 6, (Object) null) + targetSubstring.length();
        int length = targetSubstring.length() + iIndexOf$default;
        if (iIndexOf$default != -1 && imageSpan != null) {
            spannableString.setSpan(imageSpan, iIndexOf$default, length, 17);
        }
        return spannableString;
    }

    public final boolean isFeedbackVisibility() {
        SportFeedbackView sportFeedbackView = this.feedbackView;
        if (sportFeedbackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            sportFeedbackView = null;
        }
        return sportFeedbackView.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: isPermissionLayoutShow, reason: from getter */
    public final boolean getIsPermissionLayoutShow() {
        return this.isPermissionLayoutShow;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        NetUtil netUtil = NetUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (netUtil.getNetWorkAvailable(contextRequireContext) && this.sportFeedbackModel == null) {
            try {
                SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
                if (sportRecordDetailViewModel != null) {
                    sportRecordDetailViewModel.getUploadFileInfo(false, new Function1() { // from class: vgn
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SportDetailInnerFragment.loadData$lambda$18((UploadFileModel.UploadFileResult) obj);
                        }
                    });
                }
            } catch (Exception e) {
                Logger.e("SportDetailFragment", "getUploadFileInfo exception: " + e.getMessage());
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = mea.A0(inflater, container, false);
        this.llContainer = getMBinding().z0;
        this.containerGolfInfo = getMBinding().L;
        this.containerDetailInfo = getMBinding().a0;
        this.containerPluginsFrequency = getMBinding().R;
        this.containerGroupInfo = getMBinding().M;
        this.containerCourseInfo = getMBinding().D;
        this.containerRate = getMBinding().T;
        this.containerRecoverRate = getMBinding().W;
        this.containerSwimSegment = getMBinding().o0;
        this.containerPace = getMBinding().P;
        this.containerPaceChart = getMBinding().Q;
        this.containerStress = getMBinding().m0;
        this.containerStep = getMBinding().f0;
        this.containerSkipping = getMBinding().b0;
        this.containerRowing = getMBinding().Y;
        this.containerStepLength = getMBinding().k0;
        this.containerSkippingHeight = getMBinding().c0;
        this.containerSkippingSegment = getMBinding().d0;
        this.containerHeight = getMBinding().N;
        this.containerStroke = getMBinding().n0;
        this.containerSwolf = getMBinding().p0;
        this.containerSpeed = getMBinding().e0;
        this.mSportBehaviorView = getMBinding().B;
        this.extraBasicInfoView = getMBinding().v0;
        this.titleView = getMBinding().G0;
        this.feedbackView = getMBinding().w0;
        this.containerStepDownTime = getMBinding().h0;
        this.containerStepUpTime = getMBinding().l0;
        this.containerStepDownUp = getMBinding().i0;
        this.containerStepImpactLanding = getMBinding().j0;
        this.containerStepAttitude = getMBinding().g0;
        this.containerTrample = getMBinding().r0;
        this.sportAbnormalGuide = getMBinding().C0;
        this.sportTargetView = getMBinding().E0;
        this.sportFrisbeeView = getMBinding().x0;
        this.permissionFragment = getMBinding().A0;
        this.containerDepth = getMBinding().E;
        this.containerTemperature = getMBinding().q0;
        this.containerEqualPace = getMBinding().G;
        this.containerRunPower = getMBinding().Z;
        this.sportEnvironmentalView = getMBinding().D0;
        this.containerPower = getMBinding().S;
        this.containerResistance = getMBinding().X;
        this.containerVerticalAmplitude = getMBinding().s0;
        this.containerVerticalRatio = getMBinding().t0;
        this.containerRateExample = getMBinding().U;
        View root = getMBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LinearLayout linearLayout = this.llContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llContainer");
            linearLayout = null;
        }
        linearLayout.requestLayout();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.mBasicReport == null || isInvalid()) {
            return;
        }
        initDistributeCard();
        SportBasicReport sportBasicReport = this.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport);
        Integer algorithmDataSource = sportBasicReport.getAlgorithmDataSource();
        if (algorithmDataSource != null && algorithmDataSource.intValue() == 1) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String string = requireContext().getString(j1j.D2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = requireContext().getString(j1j.E2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            SpannableString spannableStringInsertIconInText = insertIconInText(contextRequireContext, string, string2, hoi.T1);
            getMBinding().A.setVisibility(0);
            getMBinding().A.setText(spannableStringInsertIconInText);
        } else {
            getMBinding().A.setVisibility(8);
        }
        SportBasicReport sportBasicReport2 = this.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport2);
        this.sportFeedbackModel = ben.a(new SportFeedbackModel(sportBasicReport2.getTimeStamp(), 0.0f));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SportRecordDetailViewModel sportRecordDetailViewModel = (SportRecordDetailViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SportRecordDetailViewModel.class);
        this.detailViewModel = sportRecordDetailViewModel;
        int i = this.mDetailSportType;
        if (i == 0) {
            Intrinsics.checkNotNull(sportRecordDetailViewModel);
            sportRecordDetailViewModel.getTriathlonSwimMaps().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xgn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$0(this.f39104a, (Map) obj);
                }
            }));
            SportRecordDetailViewModel sportRecordDetailViewModel2 = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel2);
            sportRecordDetailViewModel2.getTriathlonSwimBehaviorLiveData().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ygn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$1(this.f40163a, (List) obj);
                }
            }));
        } else if (i == 1) {
            Intrinsics.checkNotNull(sportRecordDetailViewModel);
            sportRecordDetailViewModel.getTriathlonRidMaps().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zgn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$2(this.f41261a, (Map) obj);
                }
            }));
            SportRecordDetailViewModel sportRecordDetailViewModel3 = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel3);
            sportRecordDetailViewModel3.getTriathlonRidBehaviorLiveData().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ahn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$3(this.f1035a, (List) obj);
                }
            }));
        } else if (i == 2) {
            Intrinsics.checkNotNull(sportRecordDetailViewModel);
            sportRecordDetailViewModel.getTriathlonRunMaps().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bhn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$4(this.f4230a, (Map) obj);
                }
            }));
            SportRecordDetailViewModel sportRecordDetailViewModel4 = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel4);
            sportRecordDetailViewModel4.getTriathlonRunBehaviorLiveData().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: chn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$5(this.f5355a, (List) obj);
                }
            }));
        } else {
            Intrinsics.checkNotNull(sportRecordDetailViewModel);
            sportRecordDetailViewModel.getRecordDetailMaps().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dhn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$6(this.f15538a, (Map) obj);
                }
            }));
            SportRecordDetailViewModel sportRecordDetailViewModel5 = this.detailViewModel;
            Intrinsics.checkNotNull(sportRecordDetailViewModel5);
            sportRecordDetailViewModel5.getBehaviorListData().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pgn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailInnerFragment.onStart$lambda$7(this.f30381a, (List) obj);
                }
            }));
        }
        SportRecordDetailViewModel sportRecordDetailViewModel6 = this.detailViewModel;
        Intrinsics.checkNotNull(sportRecordDetailViewModel6);
        sportRecordDetailViewModel6.getFeedbackLiveData().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qgn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailInnerFragment.onStart$lambda$8(this.f31508a, (Boolean) obj);
            }
        }));
        SportRecordDetailViewModel sportRecordDetailViewModel7 = this.detailViewModel;
        Intrinsics.checkNotNull(sportRecordDetailViewModel7);
        sportRecordDetailViewModel7.getRecoverRateDataLiveData().observe(requireActivity(), new SportDetailInnerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rgn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailInnerFragment.onStart$lambda$9(this.f32527a, (RecoverRateData) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initContentView();
        setActionBarDisplayable(false);
    }

    public final void setFeedbackViewVisibility(int visibility) {
        SportFeedbackView sportFeedbackView = this.feedbackView;
        if (sportFeedbackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedbackView");
            sportFeedbackView = null;
        }
        sportFeedbackView.setVisibility(visibility);
    }

    public final void setPermissionLayoutShow(boolean z) {
        this.isPermissionLayoutShow = z;
    }

    public final void setPermissionViewVisibility(int visibility) {
        getMBinding().A0.setVisibility(visibility);
    }

    public final void setShareBitmapList(@NotNull List<Bitmap> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shareBitmapList = list;
    }

    public final void setShareHeight(int i) {
        this.shareHeight = i;
    }

    public final void setTrainingExperienceVisibility(int visibility) {
        getMBinding().F0.setVisibility(visibility);
    }

    @Override // com.xiaomi.fitness.detail.view.SportFeedbackView.OnFeedbackUploadListener
    public void uploadInfo(boolean isUploadFile, @NotNull FeedBackModelData feedBackModel, @NotNull String labelStr) {
        Intrinsics.checkNotNullParameter(feedBackModel, "feedBackModel");
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        if (TextUtils.isEmpty(labelStr)) {
            Logger.d("SportDetailFragment", "uploadInfo: " + labelStr);
            onUploadResult(true);
            return;
        }
        String logDirPath = FileUtils.INSTANCE.getLogDirPath();
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport == null || logDirPath == null || sportBasicReport == null) {
            return;
        }
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportBasicReport.getTimeStamp()).timeZoneIn15Min(sportBasicReport.getTzIn15Min()).sportType(sportBasicReport.getProtoType()).fileType(2).build();
        if (TextUtils.isEmpty(sportBasicReport.getSid())) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String sid = sportBasicReport.getSid();
        Intrinsics.checkNotNull(sid);
        File fDSDataFile = FitnessFileUtils.getFDSDataFile(contextRequireContext, sid, fitnessDataIdBuild);
        SportRecordDetailViewModel sportRecordDetailViewModel = this.detailViewModel;
        if (sportRecordDetailViewModel != null) {
            sportRecordDetailViewModel.uploadInfo(isUploadFile, feedBackModel, logDirPath, fDSDataFile);
        }
    }
}
