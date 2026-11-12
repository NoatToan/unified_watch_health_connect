package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\by\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u000b\bÙ\u0001\u0005\u0004VÚ\u0001Û\u0001%B\u000b\b\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0007J&\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0007J|\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0007J|\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0007J\u008e\u0001\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0002J\u0094\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010'\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010)\u001a\u00020(H\u0007J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020(H\u0007J:\u00102\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u00072\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u000100H\u0007J6\u00105\u001a\u0002042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010*\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u000100H\u0007J&\u0010:\u001a\u0004\u0018\u00010\u000b2\u0006\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u0001002\b\u00109\u001a\u0004\u0018\u000108H\u0007J\u0012\u0010;\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010<\u001a\u00020(2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0014\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010?\u001a\u0004\u0018\u0001002\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010@\u001a\u0004\u0018\u0001002\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010B\u001a\u0004\u0018\u0001002\u0006\u0010A\u001a\u00020\u000bH\u0007J\u0010\u0010C\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u000bH\u0007J\u0012\u0010D\u001a\u0004\u0018\u0001002\u0006\u0010A\u001a\u00020\u000bH\u0007J\u0014\u0010F\u001a\u0004\u0018\u0001082\b\u0010E\u001a\u0004\u0018\u000100H\u0007J\u0014\u0010G\u001a\u0004\u0018\u0001002\b\u0010%\u001a\u0004\u0018\u000108H\u0007J\u0010\u0010I\u001a\u00020(2\u0006\u0010H\u001a\u00020(H\u0007J\u0018\u0010L\u001a\u00020.2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010K\u001a\u00020JH\u0007J \u0010N\u001a\u00020.2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010K\u001a\u00020JH\u0002J\b\u0010O\u001a\u000204H\u0007J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0P2\u0006\u0010\r\u001a\u00020\u0003H\u0002J(\u0010T\u001a\u00020(2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010P2\u0006\u0010S\u001a\u00020(2\u0006\u0010K\u001a\u00020JH\u0007J\u0010\u0010V\u001a\u00020U2\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u0016\u0010W\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010YR\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010YR\u0016\u0010\\\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010YR\u0016\u0010]\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010YR\u0016\u0010^\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010YR\u0016\u0010_\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010YR\u0016\u0010`\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010YR\u0016\u0010a\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010YR\u0016\u0010b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010YR\u0016\u0010c\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010XR\u0016\u0010d\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010XR\u0016\u0010e\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010XR\u0016\u0010f\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010XR\u0016\u0010g\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bg\u0010XR\u0016\u0010h\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bh\u0010XR\u0016\u0010i\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bi\u0010XR\u0016\u0010j\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bj\u0010XR\u0016\u0010k\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bk\u0010XR\u0016\u0010l\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bl\u0010XR\u0016\u0010m\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bm\u0010XR\u0016\u0010n\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bn\u0010XR\u0016\u0010o\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bo\u0010XR\u0016\u0010p\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bp\u0010XR\u0016\u0010q\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bq\u0010XR\u0016\u0010r\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\br\u0010XR\u0016\u0010s\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bs\u0010XR\u0016\u0010t\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bt\u0010YR\u0016\u0010u\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bu\u0010YR\u0016\u0010v\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bv\u0010YR\u0016\u0010w\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bw\u0010YR\u0016\u0010x\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bx\u0010YR\u0016\u0010y\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\by\u0010YR\u0016\u0010z\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bz\u0010YR\u0016\u0010{\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b{\u0010YR\u0016\u0010|\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b|\u0010YR\u0016\u0010}\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b}\u0010YR\u0016\u0010~\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010YR\u0016\u0010\u007f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u007f\u0010YR\u0018\u0010\u0080\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010YR\u0018\u0010\u0081\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010YR\u0018\u0010\u0082\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010XR\u0018\u0010\u0083\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010XR\u0018\u0010\u0084\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010XR\u0018\u0010\u0085\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010XR\u0018\u0010\u0086\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010XR\u0018\u0010\u0087\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010XR\u0018\u0010\u0088\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010XR\u0018\u0010\u0089\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010XR\u0018\u0010\u008a\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010XR\u0018\u0010\u008b\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010XR\u0018\u0010\u008c\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010XR\u0018\u0010\u008d\u0001\u001a\u00020(8\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010XR\u0018\u0010\u008e\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010YR\u0018\u0010\u008f\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010YR\u0018\u0010\u0090\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010YR\u0018\u0010\u0091\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010YR\u0018\u0010\u0092\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010YR\u0018\u0010\u0093\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010YR\u0018\u0010\u0094\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010YR\u0018\u0010\u0095\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010YR\u0018\u0010\u0096\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010YR\u0018\u0010\u0097\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010YR\u0018\u0010\u0098\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010YR\u0018\u0010\u0099\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010YR\u0018\u0010\u009a\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010YR\u0018\u0010\u009b\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010YR\u0018\u0010\u009c\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010YR\u0018\u0010\u009d\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010YR\u0018\u0010\u009e\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010YR\u0018\u0010\u009f\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010YR\u0018\u0010 \u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b \u0001\u0010YR\u0018\u0010¡\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¡\u0001\u0010YR\u0018\u0010¢\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¢\u0001\u0010YR\u0018\u0010£\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b£\u0001\u0010YR\u0018\u0010¤\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¤\u0001\u0010YR\u0018\u0010¥\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¥\u0001\u0010YR\u0018\u0010¦\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¦\u0001\u0010YR\u0018\u0010§\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b§\u0001\u0010YR\u0018\u0010¨\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¨\u0001\u0010YR\u0018\u0010©\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b©\u0001\u0010YR\u0018\u0010ª\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\bª\u0001\u0010YR\u0018\u0010«\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b«\u0001\u0010YR\u0018\u0010¬\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¬\u0001\u0010YR\u0018\u0010\u00ad\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010YR\u0018\u0010®\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b®\u0001\u0010YR\u0018\u0010¯\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¯\u0001\u0010YR\u0018\u0010°\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b°\u0001\u0010YR\u0018\u0010±\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b±\u0001\u0010YR\u0018\u0010²\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b²\u0001\u0010YR\u0018\u0010³\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b³\u0001\u0010YR\u0018\u0010´\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b´\u0001\u0010YR\u0018\u0010µ\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\bµ\u0001\u0010YR\u0018\u0010¶\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¶\u0001\u0010YR\u0018\u0010·\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b·\u0001\u0010YR\u0018\u0010¸\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¸\u0001\u0010YR\u0018\u0010¹\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¹\u0001\u0010YR\u0018\u0010º\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\bº\u0001\u0010YR\u0018\u0010»\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b»\u0001\u0010YR\u0018\u0010¼\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¼\u0001\u0010YR\u0018\u0010½\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b½\u0001\u0010YR\u0018\u0010¾\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¾\u0001\u0010YR\u0018\u0010¿\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b¿\u0001\u0010YR\u0018\u0010À\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\bÀ\u0001\u0010YR\u0018\u0010Á\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\bÁ\u0001\u0010YR\u0018\u0010Â\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\bÂ\u0001\u0010YR\u0017\u0010Ã\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010YR\u0017\u0010Ä\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010YR\u0017\u0010Å\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010YR\u0017\u0010Æ\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010YR\u001f\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001f\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010È\u0001R+\u0010Î\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020(0Ó\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001¨\u0006Ü\u0001"}, d2 = {"Lcom/facebook/internal/NativeProtocol;", "", "", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "c", "b", "", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "appInfo", "validateActivityIntent", "validateServiceIntent", "applicationId", "", "permissions", "e2e", "", "isRerequest", "isForPublish", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "clientState", "authType", "messengerPageId", "resetMessengerState", "isFamilyLogin", "shouldSkipAccountDedupe", "createFacebookLiteIntent", "createInstagramIntent", "ignoreAppSwitchToLoggedOut", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "nonce", "e", "createProxyAuthIntents", "createTokenRefreshIntent", "", "getLatestKnownVersion", "version", "isVersionCompatibleWithBucketedIntent", "callId", "action", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "versionResult", "Landroid/os/Bundle;", "extras", "createPlatformActivityIntent", "params", "", "setupProtocolRequestIntent", "requestIntent", "results", "Lcom/facebook/FacebookException;", "error", "createProtocolResultIntent", "createPlatformServiceIntent", "getProtocolVersionFromIntent", "Ljava/util/UUID;", "getCallIdFromIntent", "getBridgeArgumentsFromIntent", "getMethodArgumentsFromIntent", "resultIntent", "getSuccessResultsFromIntent", "isErrorResult", "getErrorDataFromResultIntent", "errorData", "getExceptionFromErrorData", "createBundleForException", "minimumVersion", "getLatestAvailableProtocolVersionForService", "", "versionSpec", "getLatestAvailableProtocolVersionForAction", "appInfoList", "g", "updateAllAvailableProtocolVersionsAsync", "Ljava/util/TreeSet;", "f", "allAvailableFacebookAppVersions", "latestSdkVersion", "computeLatestAvailableVersionFromVersionSpec", "Landroid/net/Uri;", GoogleApiAvailabilityLight.a, "NO_PROTOCOL_AVAILABLE", LogUtil.I, "Ljava/lang/String;", "TAG", "FACEBOOK_PROXY_AUTH_ACTIVITY", "FACEBOOK_TOKEN_REFRESH_ACTIVITY", "FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY", "FACEBOOK_PROXY_AUTH_APP_ID_KEY", "FACEBOOK_PROXY_AUTH_E2E_KEY", "FACEBOOK_SDK_VERSION_KEY", "INTENT_ACTION_PLATFORM_ACTIVITY", "INTENT_ACTION_PLATFORM_SERVICE", "PROTOCOL_VERSION_20121101", "PROTOCOL_VERSION_20130502", "PROTOCOL_VERSION_20130618", "PROTOCOL_VERSION_20131107", "PROTOCOL_VERSION_20140204", "PROTOCOL_VERSION_20140324", "PROTOCOL_VERSION_20140701", "PROTOCOL_VERSION_20141001", "PROTOCOL_VERSION_20141028", "PROTOCOL_VERSION_20141107", "PROTOCOL_VERSION_20141218", "PROTOCOL_VERSION_20160327", "PROTOCOL_VERSION_20170213", "PROTOCOL_VERSION_20170411", "PROTOCOL_VERSION_20170417", "PROTOCOL_VERSION_20171115", "PROTOCOL_VERSION_20210906", "EXTRA_PROTOCOL_VERSION", "EXTRA_PROTOCOL_ACTION", "EXTRA_PROTOCOL_CALL_ID", "EXTRA_GET_INSTALL_DATA_PACKAGE", "EXTRA_PROTOCOL_BRIDGE_ARGS", "EXTRA_PROTOCOL_METHOD_ARGS", "EXTRA_PROTOCOL_METHOD_RESULTS", "BRIDGE_ARG_APP_NAME_STRING", "BRIDGE_ARG_ACTION_ID_STRING", "BRIDGE_ARG_ERROR_BUNDLE", "EXTRA_DIALOG_COMPLETE_KEY", "EXTRA_DIALOG_COMPLETION_GESTURE_KEY", "RESULT_ARGS_DIALOG_COMPLETE_KEY", "RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY", "MESSAGE_GET_ACCESS_TOKEN_REQUEST", "MESSAGE_GET_ACCESS_TOKEN_REPLY", "MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST", "MESSAGE_GET_PROTOCOL_VERSIONS_REPLY", "MESSAGE_GET_INSTALL_DATA_REQUEST", "MESSAGE_GET_INSTALL_DATA_REPLY", "MESSAGE_GET_LIKE_STATUS_REQUEST", "MESSAGE_GET_LIKE_STATUS_REPLY", "MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST", "MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY", "MESSAGE_GET_LOGIN_STATUS_REQUEST", "MESSAGE_GET_LOGIN_STATUS_REPLY", "EXTRA_PROTOCOL_VERSIONS", "ACTION_FEED_DIALOG", "ACTION_MESSAGE_DIALOG", "ACTION_OGACTIONPUBLISH_DIALOG", "ACTION_OGMESSAGEPUBLISH_DIALOG", "ACTION_LIKE_DIALOG", "ACTION_APPINVITE_DIALOG", "ACTION_CAMERA_EFFECT", "ACTION_SHARE_STORY", "EXTRA_PERMISSIONS", "EXTRA_APPLICATION_ID", "EXTRA_APPLICATION_NAME", "EXTRA_USER_ID", "EXTRA_LOGGER_REF", "EXTRA_TOAST_DURATION_MS", "EXTRA_GRAPH_API_VERSION", "EXTRA_NONCE", "EXTRA_ACCESS_TOKEN", "EXTRA_EXPIRES_SECONDS_SINCE_EPOCH", "EXTRA_DATA_ACCESS_EXPIRATION_TIME", "EXTRA_AUTHENTICATION_TOKEN", "RESULT_ARGS_ACCESS_TOKEN", "RESULT_ARGS_GRAPH_DOMAIN", "RESULT_ARGS_SIGNED_REQUEST", "RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH", "RESULT_ARGS_PERMISSIONS", "OPEN_GRAPH_CREATE_OBJECT_KEY", "IMAGE_USER_GENERATED_KEY", "IMAGE_URL_KEY", "STATUS_ERROR_TYPE", "STATUS_ERROR_DESCRIPTION", "STATUS_ERROR_CODE", "STATUS_ERROR_SUBCODE", "STATUS_ERROR_JSON", "BRIDGE_ARG_ERROR_TYPE", "BRIDGE_ARG_ERROR_DESCRIPTION", "BRIDGE_ARG_ERROR_CODE", "BRIDGE_ARG_ERROR_SUBCODE", "BRIDGE_ARG_ERROR_JSON", "ERROR_UNKNOWN_ERROR", "ERROR_PROTOCOL_ERROR", "ERROR_USER_CANCELED", "ERROR_APPLICATION_ERROR", "ERROR_NETWORK_ERROR", "ERROR_PERMISSION_DENIED", "ERROR_SERVICE_DISABLED", "WEB_DIALOG_URL", "WEB_DIALOG_ACTION", "WEB_DIALOG_PARAMS", "WEB_DIALOG_IS_FALLBACK", "AUDIENCE_ME", "AUDIENCE_FRIENDS", "AUDIENCE_EVERYONE", "CONTENT_SCHEME", "PLATFORM_PROVIDER", "PLATFORM_PROVIDER_VERSIONS", "PLATFORM_PROVIDER_VERSION_COLUMN", "h", "Ljava/util/List;", "facebookAppInfoList", "i", "effectCameraAppInfoList", z.j, "Ljava/util/Map;", "actionToAppInfoMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", hl.k, "Ljava/util/concurrent/atomic/AtomicBoolean;", "protocolVersionsAsyncUpdating", "", "l", "[Ljava/lang/Integer;", "KNOWN_PROTOCOL_VERSIONS", "<init>", "()V", "FBLiteAppInfo", "NativeAppInfo", "ProtocolVersionQueryResult", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class NativeProtocol {

    @NotNull
    public static final String ACTION_APPINVITE_DIALOG = "com.facebook.platform.action.request.APPINVITES_DIALOG";

    @NotNull
    public static final String ACTION_CAMERA_EFFECT = "com.facebook.platform.action.request.CAMERA_EFFECT";

    @NotNull
    public static final String ACTION_FEED_DIALOG = "com.facebook.platform.action.request.FEED_DIALOG";

    @NotNull
    public static final String ACTION_LIKE_DIALOG = "com.facebook.platform.action.request.LIKE_DIALOG";

    @NotNull
    public static final String ACTION_MESSAGE_DIALOG = "com.facebook.platform.action.request.MESSAGE_DIALOG";

    @NotNull
    public static final String ACTION_OGACTIONPUBLISH_DIALOG = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";

    @NotNull
    public static final String ACTION_OGMESSAGEPUBLISH_DIALOG = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";

    @NotNull
    public static final String ACTION_SHARE_STORY = "com.facebook.platform.action.request.SHARE_STORY";

    @NotNull
    public static final String AUDIENCE_EVERYONE = "everyone";

    @NotNull
    public static final String AUDIENCE_FRIENDS = "friends";

    @NotNull
    public static final String AUDIENCE_ME = "only_me";

    @NotNull
    public static final String BRIDGE_ARG_ACTION_ID_STRING = "action_id";

    @NotNull
    public static final String BRIDGE_ARG_APP_NAME_STRING = "app_name";

    @NotNull
    public static final String BRIDGE_ARG_ERROR_BUNDLE = "error";

    @NotNull
    public static final String BRIDGE_ARG_ERROR_CODE = "error_code";

    @NotNull
    public static final String BRIDGE_ARG_ERROR_DESCRIPTION = "error_description";

    @NotNull
    public static final String BRIDGE_ARG_ERROR_JSON = "error_json";

    @NotNull
    public static final String BRIDGE_ARG_ERROR_SUBCODE = "error_subcode";

    @NotNull
    public static final String BRIDGE_ARG_ERROR_TYPE = "error_type";

    @NotNull
    public static final String ERROR_APPLICATION_ERROR = "ApplicationError";

    @NotNull
    public static final String ERROR_NETWORK_ERROR = "NetworkError";

    @NotNull
    public static final String ERROR_PERMISSION_DENIED = "PermissionDenied";

    @NotNull
    public static final String ERROR_PROTOCOL_ERROR = "ProtocolError";

    @NotNull
    public static final String ERROR_SERVICE_DISABLED = "ServiceDisabled";

    @NotNull
    public static final String ERROR_UNKNOWN_ERROR = "UnknownError";

    @NotNull
    public static final String ERROR_USER_CANCELED = "UserCanceled";

    @NotNull
    public static final String EXTRA_ACCESS_TOKEN = "com.facebook.platform.extra.ACCESS_TOKEN";

    @NotNull
    public static final String EXTRA_APPLICATION_ID = "com.facebook.platform.extra.APPLICATION_ID";

    @NotNull
    public static final String EXTRA_APPLICATION_NAME = "com.facebook.platform.extra.APPLICATION_NAME";

    @NotNull
    public static final String EXTRA_AUTHENTICATION_TOKEN = "com.facebook.platform.extra.ID_TOKEN";

    @NotNull
    public static final String EXTRA_DATA_ACCESS_EXPIRATION_TIME = "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME";

    @NotNull
    public static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";

    @NotNull
    public static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";

    @NotNull
    public static final String EXTRA_EXPIRES_SECONDS_SINCE_EPOCH = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";

    @NotNull
    public static final String EXTRA_GET_INSTALL_DATA_PACKAGE = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";

    @NotNull
    public static final String EXTRA_GRAPH_API_VERSION = "com.facebook.platform.extra.GRAPH_API_VERSION";

    @NotNull
    public static final String EXTRA_LOGGER_REF = "com.facebook.platform.extra.LOGGER_REF";

    @NotNull
    public static final String EXTRA_NONCE = "com.facebook.platform.extra.NONCE";

    @NotNull
    public static final String EXTRA_PERMISSIONS = "com.facebook.platform.extra.PERMISSIONS";

    @NotNull
    public static final String EXTRA_PROTOCOL_ACTION = "com.facebook.platform.protocol.PROTOCOL_ACTION";

    @NotNull
    public static final String EXTRA_PROTOCOL_BRIDGE_ARGS = "com.facebook.platform.protocol.BRIDGE_ARGS";

    @NotNull
    public static final String EXTRA_PROTOCOL_CALL_ID = "com.facebook.platform.protocol.CALL_ID";

    @NotNull
    public static final String EXTRA_PROTOCOL_METHOD_ARGS = "com.facebook.platform.protocol.METHOD_ARGS";

    @NotNull
    public static final String EXTRA_PROTOCOL_METHOD_RESULTS = "com.facebook.platform.protocol.RESULT_ARGS";

    @NotNull
    public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.platform.protocol.PROTOCOL_VERSION";

    @NotNull
    public static final String EXTRA_PROTOCOL_VERSIONS = "com.facebook.platform.extra.PROTOCOL_VERSIONS";

    @NotNull
    public static final String EXTRA_TOAST_DURATION_MS = "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS";

    @NotNull
    public static final String EXTRA_USER_ID = "com.facebook.platform.extra.USER_ID";

    @NotNull
    public static final String FACEBOOK_PROXY_AUTH_APP_ID_KEY = "client_id";

    @NotNull
    public static final String FACEBOOK_PROXY_AUTH_E2E_KEY = "e2e";

    @NotNull
    public static final String FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY = "scope";

    @NotNull
    public static final String FACEBOOK_SDK_VERSION_KEY = "facebook_sdk_version";

    @NotNull
    public static final String IMAGE_URL_KEY = "url";

    @NotNull
    public static final String IMAGE_USER_GENERATED_KEY = "user_generated";

    @NotNull
    public static final NativeProtocol INSTANCE;

    @NotNull
    public static final String INTENT_ACTION_PLATFORM_ACTIVITY = "com.facebook.platform.PLATFORM_ACTIVITY";

    @NotNull
    public static final String INTENT_ACTION_PLATFORM_SERVICE = "com.facebook.platform.PLATFORM_SERVICE";
    public static final int MESSAGE_GET_ACCESS_TOKEN_REPLY = 65537;
    public static final int MESSAGE_GET_ACCESS_TOKEN_REQUEST = 65536;
    public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY = 65545;
    public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST = 65544;
    public static final int MESSAGE_GET_INSTALL_DATA_REPLY = 65541;
    public static final int MESSAGE_GET_INSTALL_DATA_REQUEST = 65540;
    public static final int MESSAGE_GET_LIKE_STATUS_REPLY = 65543;
    public static final int MESSAGE_GET_LIKE_STATUS_REQUEST = 65542;
    public static final int MESSAGE_GET_LOGIN_STATUS_REPLY = 65547;
    public static final int MESSAGE_GET_LOGIN_STATUS_REQUEST = 65546;
    public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REPLY = 65539;
    public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST = 65538;
    public static final int NO_PROTOCOL_AVAILABLE = -1;

    @NotNull
    public static final String OPEN_GRAPH_CREATE_OBJECT_KEY = "fbsdk:create_object";
    public static final int PROTOCOL_VERSION_20121101 = 20121101;
    public static final int PROTOCOL_VERSION_20130502 = 20130502;
    public static final int PROTOCOL_VERSION_20130618 = 20130618;
    public static final int PROTOCOL_VERSION_20131107 = 20131107;
    public static final int PROTOCOL_VERSION_20140204 = 20140204;
    public static final int PROTOCOL_VERSION_20140324 = 20140324;
    public static final int PROTOCOL_VERSION_20140701 = 20140701;
    public static final int PROTOCOL_VERSION_20141001 = 20141001;
    public static final int PROTOCOL_VERSION_20141028 = 20141028;
    public static final int PROTOCOL_VERSION_20141107 = 20141107;
    public static final int PROTOCOL_VERSION_20141218 = 20141218;
    public static final int PROTOCOL_VERSION_20160327 = 20160327;
    public static final int PROTOCOL_VERSION_20170213 = 20170213;
    public static final int PROTOCOL_VERSION_20170411 = 20170411;
    public static final int PROTOCOL_VERSION_20170417 = 20170417;
    public static final int PROTOCOL_VERSION_20171115 = 20171115;
    public static final int PROTOCOL_VERSION_20210906 = 20210906;

    @NotNull
    public static final String RESULT_ARGS_ACCESS_TOKEN = "access_token";

    @NotNull
    public static final String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";

    @NotNull
    public static final String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";

    @NotNull
    public static final String RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH = "expires_seconds_since_epoch";

    @NotNull
    public static final String RESULT_ARGS_GRAPH_DOMAIN = "graph_domain";

    @NotNull
    public static final String RESULT_ARGS_PERMISSIONS = "permissions";

    @NotNull
    public static final String RESULT_ARGS_SIGNED_REQUEST = "signed request";

    @NotNull
    public static final String STATUS_ERROR_CODE = "com.facebook.platform.status.ERROR_CODE";

    @NotNull
    public static final String STATUS_ERROR_DESCRIPTION = "com.facebook.platform.status.ERROR_DESCRIPTION";

    @NotNull
    public static final String STATUS_ERROR_JSON = "com.facebook.platform.status.ERROR_JSON";

    @NotNull
    public static final String STATUS_ERROR_SUBCODE = "com.facebook.platform.status.ERROR_SUBCODE";

    @NotNull
    public static final String STATUS_ERROR_TYPE = "com.facebook.platform.status.ERROR_TYPE";

    @NotNull
    public static final String WEB_DIALOG_ACTION = "action";

    @NotNull
    public static final String WEB_DIALOG_IS_FALLBACK = "is_fallback";

    @NotNull
    public static final String WEB_DIALOG_PARAMS = "params";

    @NotNull
    public static final String WEB_DIALOG_URL = "url";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String FACEBOOK_PROXY_AUTH_ACTIVITY = "com.facebook.katana.ProxyAuth";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String FACEBOOK_TOKEN_REFRESH_ACTIVITY = "com.facebook.katana.platform.TokenRefreshService";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String CONTENT_SCHEME = "content://";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String PLATFORM_PROVIDER = ".provider.PlatformProvider";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String PLATFORM_PROVIDER_VERSIONS = ".provider.PlatformProvider/versions";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String PLATFORM_PROVIDER_VERSION_COLUMN = "version";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final List<NativeAppInfo> facebookAppInfoList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final List<NativeAppInfo> effectCameraAppInfoList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final Map<String, List<NativeAppInfo>> actionToAppInfoMap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final AtomicBoolean protocolVersionsAsyncUpdating;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final Integer[] KNOWN_PROTOCOL_VERSIONS;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/facebook/internal/NativeProtocol$FBLiteAppInfo;", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "getLoginActivity", "getPackage", "<init>", "()V", "c", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class FBLiteAppInfo extends NativeAppInfo {

        @NotNull
        public static final String b = "com.facebook.lite.platform.LoginGDPDialogActivity";

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getLoginActivity() {
            return b;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.lite";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "", "getPackage", "getLoginActivity", "getResponseType", "", "onAvailableVersionsNullOrEmpty", "Ljava/util/TreeSet;", "", "getAvailableVersions", "", "force", "fetchAvailableVersions", "a", "Ljava/util/TreeSet;", "availableVersions", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class NativeAppInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private TreeSet<Integer> availableVersions;

        /* JADX WARN: Code duplicated, block: B:16:0x0024  */
        /* JADX WARN: Code duplicated, block: B:18:0x0027 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x0017, B:12:0x001b, B:18:0x0027, B:9:0x000f), top: B:24:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000f A[Catch: all -> 0x002c, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x0017, B:12:0x001b, B:18:0x0027, B:9:0x000f), top: B:24:0x0003 }] */
        public final synchronized void fetchAvailableVersions(boolean force) {
            TreeSet<Integer> treeSet;
            boolean z;
            if (force) {
                this.availableVersions = NativeProtocol.access$fetchAllAvailableProtocolVersionsForAppInfo(NativeProtocol.INSTANCE, this);
                treeSet = this.availableVersions;
                if (treeSet != null) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    onAvailableVersionsNullOrEmpty();
                }
            } else {
                TreeSet<Integer> treeSet2 = this.availableVersions;
                if (treeSet2 == null || treeSet2 == null || treeSet2.isEmpty()) {
                    this.availableVersions = NativeProtocol.access$fetchAllAvailableProtocolVersionsForAppInfo(NativeProtocol.INSTANCE, this);
                }
                treeSet = this.availableVersions;
                if (treeSet != null || treeSet.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    onAvailableVersionsNullOrEmpty();
                }
            }
            throw th;
        }

        @Nullable
        public final TreeSet<Integer> getAvailableVersions() {
            TreeSet<Integer> treeSet = this.availableVersions;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                fetchAvailableVersions(false);
            }
            return this.availableVersions;
        }

        @Nullable
        public abstract String getLoginActivity();

        @NotNull
        public abstract String getPackage();

        @NotNull
        public String getResponseType() {
            return ServerProtocol.DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST;
        }

        public void onAvailableVersionsNullOrEmpty() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "<set-?>", "a", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "getAppInfo", "()Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "appInfo", "", "b", LogUtil.I, "getProtocolVersion", "()I", BehaviorTaggingWebApi.g.g, "<init>", "()V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ProtocolVersionQueryResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private NativeAppInfo appInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int protocolVersion;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult$Companion;", "", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "nativeAppInfo", "", BehaviorTaggingWebApi.g.g, "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "create", "createEmpty", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final ProtocolVersionQueryResult create(@Nullable NativeAppInfo nativeAppInfo, int protocolVersion) {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.appInfo = nativeAppInfo;
                protocolVersionQueryResult.protocolVersion = protocolVersion;
                return protocolVersionQueryResult;
            }

            @JvmStatic
            @NotNull
            public final ProtocolVersionQueryResult createEmpty() {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.protocolVersion = -1;
                return protocolVersionQueryResult;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private ProtocolVersionQueryResult() {
        }

        @JvmStatic
        @NotNull
        public static final ProtocolVersionQueryResult create(@Nullable NativeAppInfo nativeAppInfo, int i) {
            return INSTANCE.create(nativeAppInfo, i);
        }

        @JvmStatic
        @NotNull
        public static final ProtocolVersionQueryResult createEmpty() {
            return INSTANCE.createEmpty();
        }

        @Nullable
        public final NativeAppInfo getAppInfo() {
            return this.appInfo;
        }

        public final int getProtocolVersion() {
            return this.protocolVersion;
        }

        public /* synthetic */ ProtocolVersionQueryResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/facebook/internal/NativeProtocol$a", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "a", "", "getPackage", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends NativeAppInfo {
        @Nullable
        public Void a() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ String getLoginActivity() {
            return (String) a();
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.arstudio.player";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/facebook/internal/NativeProtocol$b", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "getLoginActivity", "getPackage", "getResponseType", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getLoginActivity() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return PkgNameConstants.INSTAGRAM;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getResponseType() {
            return ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/facebook/internal/NativeProtocol$c", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "a", "", "getLoginActivity", "getPackage", "", "onAvailableVersionsNullOrEmpty", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c extends NativeAppInfo {
        private final boolean a() {
            return FacebookSdk.getApplicationContext().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getLoginActivity() {
            return NativeProtocol.FACEBOOK_PROXY_AUTH_ACTIVITY;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public void onAvailableVersionsNullOrEmpty() {
            if (a()) {
                Log.w(NativeProtocol.access$getTAG$p(NativeProtocol.INSTANCE), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/facebook/internal/NativeProtocol$d", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "a", "", "getPackage", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class d extends NativeAppInfo {
        @Nullable
        public Void a() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ String getLoginActivity() {
            return (String) a();
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.orca";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/internal/NativeProtocol$e", "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;", "", "getLoginActivity", "getPackage", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class e extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getLoginActivity() {
            return NativeProtocol.FACEBOOK_PROXY_AUTH_ACTIVITY;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return RemoteServiceWrapper.RECEIVER_SERVICE_PACKAGE_WAKIZASHI;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f implements Runnable {
        public static final f a = new f();

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                try {
                    Iterator it2 = NativeProtocol.access$getFacebookAppInfoList$p(NativeProtocol.INSTANCE).iterator();
                    while (it2.hasNext()) {
                        ((NativeAppInfo) it2.next()).fetchAvailableVersions(true);
                    }
                    NativeProtocol.access$getProtocolVersionsAsyncUpdating$p(NativeProtocol.INSTANCE).set(false);
                } catch (Throwable th) {
                    NativeProtocol.access$getProtocolVersionsAsyncUpdating$p(NativeProtocol.INSTANCE).set(false);
                    throw th;
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    static {
        NativeProtocol nativeProtocol = new NativeProtocol();
        INSTANCE = nativeProtocol;
        TAG = NativeProtocol.class.getName();
        facebookAppInfoList = nativeProtocol.c();
        effectCameraAppInfoList = nativeProtocol.b();
        actionToAppInfoMap = nativeProtocol.a();
        protocolVersionsAsyncUpdating = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{Integer.valueOf(PROTOCOL_VERSION_20210906), Integer.valueOf(PROTOCOL_VERSION_20170417), Integer.valueOf(PROTOCOL_VERSION_20160327), Integer.valueOf(PROTOCOL_VERSION_20141218), Integer.valueOf(PROTOCOL_VERSION_20141107), Integer.valueOf(PROTOCOL_VERSION_20141028), Integer.valueOf(PROTOCOL_VERSION_20141001), Integer.valueOf(PROTOCOL_VERSION_20140701), Integer.valueOf(PROTOCOL_VERSION_20140324), Integer.valueOf(PROTOCOL_VERSION_20140204), Integer.valueOf(PROTOCOL_VERSION_20131107), Integer.valueOf(PROTOCOL_VERSION_20130618), Integer.valueOf(PROTOCOL_VERSION_20130502), Integer.valueOf(PROTOCOL_VERSION_20121101)};
    }

    private NativeProtocol() {
    }

    private final Map<String, List<NativeAppInfo>> a() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<NativeAppInfo> list = facebookAppInfoList;
            map.put(ACTION_OGACTIONPUBLISH_DIALOG, list);
            map.put(ACTION_FEED_DIALOG, list);
            map.put(ACTION_LIKE_DIALOG, list);
            map.put(ACTION_APPINVITE_DIALOG, list);
            map.put(ACTION_MESSAGE_DIALOG, arrayList);
            map.put(ACTION_OGMESSAGEPUBLISH_DIALOG, arrayList);
            map.put(ACTION_CAMERA_EFFECT, effectCameraAppInfoList);
            map.put(ACTION_SHARE_STORY, list);
            return map;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet access$fetchAllAvailableProtocolVersionsForAppInfo(NativeProtocol nativeProtocol, NativeAppInfo nativeAppInfo) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return nativeProtocol.f(nativeAppInfo);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    public static final /* synthetic */ List access$getFacebookAppInfoList$p(NativeProtocol nativeProtocol) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return facebookAppInfoList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$getProtocolVersionsAsyncUpdating$p(NativeProtocol nativeProtocol) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return protocolVersionsAsyncUpdating;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p(NativeProtocol nativeProtocol) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    private final List<NativeAppInfo> b() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(new a());
            arrayListArrayListOf.addAll(c());
            return arrayListArrayListOf;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final List<NativeAppInfo> c() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return CollectionsKt__CollectionsKt.arrayListOf(new c(), new e());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    public static final int computeLatestAvailableVersionFromVersionSpec(@Nullable TreeSet<Integer> allAvailableFacebookAppVersions, int latestSdkVersion, @NotNull int[] versionSpec) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        if (allAvailableFacebookAppVersions == null) {
            return -1;
        }
        try {
            int length = versionSpec.length - 1;
            Iterator<Integer> itDescendingIterator = allAvailableFacebookAppVersions.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer next = itDescendingIterator.next();
                iMax = Math.max(iMax, next.intValue());
                while (length >= 0 && versionSpec[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(iMax, latestSdkVersion);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    @JvmStatic
    @Nullable
    public static final Bundle createBundleForException(@Nullable FacebookException e2) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || e2 == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", e2.toString());
            if (e2 instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", ERROR_USER_CANCELED);
            }
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent createFacebookLiteIntent(@NotNull Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean isRerequest, boolean isForPublish, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, @Nullable String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            FBLiteAppInfo fBLiteAppInfo = new FBLiteAppInfo();
            return validateActivityIntent(context, INSTANCE.e(fBLiteAppInfo, applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, false, messengerPageId, resetMessengerState, LoginTargetApp.FACEBOOK, isFamilyLogin, shouldSkipAccountDedupe, ""), fBLiteAppInfo);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent createInstagramIntent(@NotNull Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean isRerequest, boolean isForPublish, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, @Nullable String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            b bVar = new b();
            return validateActivityIntent(context, INSTANCE.e(bVar, applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, false, messengerPageId, resetMessengerState, LoginTargetApp.INSTAGRAM, isFamilyLogin, shouldSkipAccountDedupe, ""), bVar);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent createPlatformActivityIntent(@NotNull Context context, @Nullable String callId, @Nullable String action, @Nullable ProtocolVersionQueryResult versionResult, @Nullable Bundle extras) {
        Intent intentValidateActivityIntent;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || versionResult == null) {
            return null;
        }
        try {
            NativeAppInfo appInfo = versionResult.getAppInfo();
            if (appInfo == null || (intentValidateActivityIntent = validateActivityIntent(context, new Intent().setAction(INTENT_ACTION_PLATFORM_ACTIVITY).setPackage(appInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), appInfo)) == null) {
                return null;
            }
            setupProtocolRequestIntent(intentValidateActivityIntent, callId, action, versionResult.getProtocolVersion(), extras);
            return intentValidateActivityIntent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent createPlatformServiceIntent(@NotNull Context context) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            for (NativeAppInfo nativeAppInfo : facebookAppInfoList) {
                Intent intentValidateServiceIntent = validateServiceIntent(context, new Intent(INTENT_ACTION_PLATFORM_SERVICE).setPackage(nativeAppInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), nativeAppInfo);
                if (intentValidateServiceIntent != null) {
                    return intentValidateServiceIntent;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent createProtocolResultIntent(@NotNull Intent requestIntent, @Nullable Bundle results, @Nullable FacebookException error) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            UUID callIdFromIntent = getCallIdFromIntent(requestIntent);
            if (callIdFromIntent == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra(EXTRA_PROTOCOL_VERSION, getProtocolVersionFromIntent(requestIntent));
            Bundle bundle = new Bundle();
            bundle.putString("action_id", callIdFromIntent.toString());
            if (error != null) {
                bundle.putBundle("error", createBundleForException(error));
            }
            intent.putExtra(EXTRA_PROTOCOL_BRIDGE_ARGS, bundle);
            if (results != null) {
                intent.putExtra(EXTRA_PROTOCOL_METHOD_RESULTS, results);
            }
            return intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final List<Intent> createProxyAuthIntents(@Nullable Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean isRerequest, boolean isForPublish, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, boolean ignoreAppSwitchToLoggedOut, @Nullable String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, @Nullable String nonce) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            List<NativeAppInfo> list = facebookAppInfoList;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Intent intentE = INSTANCE.e((NativeAppInfo) it2.next(), applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, ignoreAppSwitchToLoggedOut, messengerPageId, resetMessengerState, LoginTargetApp.FACEBOOK, isFamilyLogin, shouldSkipAccountDedupe, nonce);
                if (intentE != null) {
                    arrayList.add(intentE);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent createTokenRefreshIntent(@NotNull Context context) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            for (NativeAppInfo nativeAppInfo : facebookAppInfoList) {
                Intent intentValidateServiceIntent = validateServiceIntent(context, new Intent().setClassName(nativeAppInfo.getPackage(), FACEBOOK_TOKEN_REFRESH_ACTIVITY), nativeAppInfo);
                if (intentValidateServiceIntent != null) {
                    return intentValidateServiceIntent;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    private final Uri d(NativeAppInfo appInfo) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return Uri.parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Intent e(NativeAppInfo appInfo, String applicationId, Collection<String> permissions, String e2e, boolean isForPublish, DefaultAudience defaultAudience, String clientState, String authType, boolean ignoreAppSwitchToLoggedOut, String messengerPageId, boolean resetMessengerState, LoginTargetApp targetApp, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, String nonce) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String loginActivity = appInfo.getLoginActivity();
            if (loginActivity == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(appInfo.getPackage(), loginActivity).putExtra("client_id", applicationId);
            intentPutExtra.putExtra(FACEBOOK_SDK_VERSION_KEY, FacebookSdk.getSdkVersion());
            if (!Utility.isNullOrEmpty(permissions)) {
                intentPutExtra.putExtra("scope", TextUtils.join(",", permissions));
            }
            if (!Utility.isNullOrEmpty(e2e)) {
                intentPutExtra.putExtra("e2e", e2e);
            }
            intentPutExtra.putExtra("state", clientState);
            intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, appInfo.getResponseType());
            intentPutExtra.putExtra("nonce", nonce);
            intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
            if (isForPublish) {
                intentPutExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_LEGACY_OVERRIDE, FacebookSdk.getGraphApiVersion());
            intentPutExtra.putExtra("auth_type", authType);
            if (ignoreAppSwitchToLoggedOut) {
                intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_FAIL_ON_LOGGED_OUT, true);
            }
            intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_MESSENGER_PAGE_ID, messengerPageId);
            intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_RESET_MESSENGER_STATE, resetMessengerState);
            if (isFamilyLogin) {
                intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_FX_APP, targetApp.getTargetApp());
            }
            if (shouldSkipAccountDedupe) {
                intentPutExtra.putExtra(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, true);
            }
            return intentPutExtra;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x0094, TryCatch #3 {all -> 0x0094, blocks: (B:5:0x000d, B:35:0x0090, B:36:0x0093, B:30:0x0088), top: B:44:0x000d }] */
    private final TreeSet<Integer> f(NativeAppInfo appInfo) {
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = FacebookSdk.getApplicationContext().getContentResolver();
            String[] strArr = {"version"};
            Uri uriD = d(appInfo);
            try {
                try {
                    providerInfoResolveContentProvider = FacebookSdk.getApplicationContext().getPackageManager().resolveContentProvider(appInfo.getPackage() + PLATFORM_PROVIDER, 0);
                } catch (RuntimeException e2) {
                    Log.e(TAG, "Failed to query content resolver.", e2);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uriD, strArr, null, null, null);
                    } catch (IllegalArgumentException unused) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (NullPointerException unused2) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th) {
                                cursor = cursorQuery;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            CrashShieldHandler.handleThrowable(th3, this);
            return null;
        }
    }

    private final ProtocolVersionQueryResult g(List<? extends NativeAppInfo> appInfoList, int[] versionSpec) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            updateAllAvailableProtocolVersionsAsync();
            if (appInfoList == null) {
                return ProtocolVersionQueryResult.INSTANCE.createEmpty();
            }
            for (NativeAppInfo nativeAppInfo : appInfoList) {
                int iComputeLatestAvailableVersionFromVersionSpec = computeLatestAvailableVersionFromVersionSpec(nativeAppInfo.getAvailableVersions(), getLatestKnownVersion(), versionSpec);
                if (iComputeLatestAvailableVersionFromVersionSpec != -1) {
                    return ProtocolVersionQueryResult.INSTANCE.create(nativeAppInfo, iComputeLatestAvailableVersionFromVersionSpec);
                }
            }
            return ProtocolVersionQueryResult.INSTANCE.createEmpty();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Bundle getBridgeArgumentsFromIntent(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            if (isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                return intent.getBundleExtra(EXTRA_PROTOCOL_BRIDGE_ARGS);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final UUID getCallIdFromIntent(@Nullable Intent intent) {
        String stringExtra;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || intent == null) {
            return null;
        }
        try {
            if (isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                Bundle bundleExtra = intent.getBundleExtra(EXTRA_PROTOCOL_BRIDGE_ARGS);
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra(EXTRA_PROTOCOL_CALL_ID);
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Bundle getErrorDataFromResultIntent(@NotNull Intent resultIntent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            if (!isErrorResult(resultIntent)) {
                return null;
            }
            Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
            return bridgeArgumentsFromIntent != null ? bridgeArgumentsFromIntent.getBundle("error") : resultIntent.getExtras();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final FacebookException getExceptionFromErrorData(@Nullable Bundle errorData) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || errorData == null) {
            return null;
        }
        try {
            String string = errorData.getString("error_type");
            if (string == null) {
                string = errorData.getString(STATUS_ERROR_TYPE);
            }
            String string2 = errorData.getString("error_description");
            if (string2 == null) {
                string2 = errorData.getString(STATUS_ERROR_DESCRIPTION);
            }
            return (string == null || !m.equals(string, ERROR_USER_CANCELED, true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAction(@NotNull String action, @NotNull int[] versionSpec) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            List<NativeAppInfo> listEmptyList = actionToAppInfoMap.get(action);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            return INSTANCE.g(listEmptyList, versionSpec);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    public static final int getLatestAvailableProtocolVersionForService(int minimumVersion) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        try {
            return INSTANCE.g(facebookAppInfoList, new int[]{minimumVersion}).getProtocolVersion();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    @JvmStatic
    public static final int getLatestKnownVersion() {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        try {
            return KNOWN_PROTOCOL_VERSIONS[0].intValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    @JvmStatic
    @Nullable
    public static final Bundle getMethodArgumentsFromIntent(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return !isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)) ? intent.getExtras() : intent.getBundleExtra(EXTRA_PROTOCOL_METHOD_ARGS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    public static final int getProtocolVersionFromIntent(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra(EXTRA_PROTOCOL_VERSION, 0);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    @JvmStatic
    @Nullable
    public static final Bundle getSuccessResultsFromIntent(@NotNull Intent resultIntent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            int protocolVersionFromIntent = getProtocolVersionFromIntent(resultIntent);
            Bundle extras = resultIntent.getExtras();
            if (isVersionCompatibleWithBucketedIntent(protocolVersionFromIntent) && extras != null) {
                return extras.getBundle(EXTRA_PROTOCOL_METHOD_RESULTS);
            }
            return extras;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isErrorResult(@NotNull Intent resultIntent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return false;
        }
        try {
            Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
            return bridgeArgumentsFromIntent != null ? bridgeArgumentsFromIntent.containsKey("error") : resultIntent.hasExtra(STATUS_ERROR_TYPE);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return false;
        }
    }

    @JvmStatic
    public static final boolean isVersionCompatibleWithBucketedIntent(int version) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return false;
        }
        try {
            return ArraysKt___ArraysKt.contains(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(version)) && version >= 20140701;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return false;
        }
    }

    @JvmStatic
    public static final void setupProtocolRequestIntent(@NotNull Intent intent, @Nullable String callId, @Nullable String action, int version, @Nullable Bundle params) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return;
        }
        try {
            String applicationId = FacebookSdk.getApplicationId();
            String applicationName = FacebookSdk.getApplicationName();
            intent.putExtra(EXTRA_PROTOCOL_VERSION, version).putExtra(EXTRA_PROTOCOL_ACTION, action).putExtra(EXTRA_APPLICATION_ID, applicationId);
            if (!isVersionCompatibleWithBucketedIntent(version)) {
                intent.putExtra(EXTRA_PROTOCOL_CALL_ID, callId);
                if (!Utility.isNullOrEmpty(applicationName)) {
                    intent.putExtra(EXTRA_APPLICATION_NAME, applicationName);
                }
                if (params != null) {
                    intent.putExtras(params);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("action_id", callId);
            Utility.putNonEmptyString(bundle, "app_name", applicationName);
            intent.putExtra(EXTRA_PROTOCOL_BRIDGE_ARGS, bundle);
            if (params == null) {
                params = new Bundle();
            }
            intent.putExtra(EXTRA_PROTOCOL_METHOD_ARGS, params);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
        }
    }

    @JvmStatic
    public static final void updateAllAvailableProtocolVersionsAsync() {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return;
        }
        try {
            if (protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
                FacebookSdk.getExecutor().execute(f.a);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent validateActivityIntent(@NotNull Context context, @Nullable Intent intent, @Nullable NativeAppInfo appInfo) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveInfoResolveActivity == null || !FacebookSignatureValidator.validateSignature(context, resolveInfoResolveActivity.activityInfo.packageName)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent validateServiceIntent(@NotNull Context context, @Nullable Intent intent, @Nullable NativeAppInfo appInfo) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService == null || !FacebookSignatureValidator.validateSignature(context, resolveInfoResolveService.serviceInfo.packageName)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }
}
