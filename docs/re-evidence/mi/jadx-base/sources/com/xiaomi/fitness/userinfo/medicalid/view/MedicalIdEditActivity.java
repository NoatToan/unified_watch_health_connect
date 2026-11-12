package com.xiaomi.fitness.userinfo.medicalid.view;

import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.widget.YearMonthDayDialog;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.view.PickSleepTimeDialog;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.user.info.export.medicalid.DonorType;
import com.xiaomi.fitness.user.info.export.medicalid.Gender;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRecord;
import com.xiaomi.fitness.userinfo.medicalid.baseui.EmergencyContactView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.GenderView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.UserInfoRightArrowSingleLineTextView;
import com.xiaomi.fitness.userinfo.medicalid.util.AvatarUtil;
import com.xiaomi.fitness.userinfo.medicalid.util.BirthdateConverter;
import com.xiaomi.fitness.userinfo.medicalid.util.BloodTypeConverter;
import com.xiaomi.fitness.userinfo.medicalid.util.ChannelAndRegionExtKt;
import com.xiaomi.fitness.userinfo.medicalid.util.UriUtil;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import com.xiaomi.fitness.userinfo.medicalid.viewmodel.MedicalIdViewModel;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.akq;
import defpackage.av6;
import defpackage.ehi;
import defpackage.fyi;
import defpackage.hsi;
import defpackage.moi;
import defpackage.nuf;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.yo2;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import miuix.appcompat.widget.Spinner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 £\u00022\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002£\u0002B\b¢\u0006\u0005\b¢\u0002\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0006J\u0019\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J%\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0.2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020*H\u0002¢\u0006\u0004\b5\u0010-J\u000f\u00106\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u0010\u0006J\u0019\u00107\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b7\u0010(J!\u0010;\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0002¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\u0004H\u0002¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\u0004H\u0002¢\u0006\u0004\bA\u0010\u0006J\u000f\u0010B\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010\u0006J\u000f\u0010D\u001a\u00020\u0004H\u0002¢\u0006\u0004\bD\u0010\u0006J\u000f\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bE\u0010\u0006J#\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0H2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0FH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0004H\u0002¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020\u0004H\u0002¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\u0004H\u0002¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0004H\u0002¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\u0004H\u0002¢\u0006\u0004\bO\u0010\u0006J\u000f\u0010P\u001a\u00020\u0004H\u0002¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0004H\u0002¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\u0004H\u0002¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020\u0004H\u0002¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ\u001f\u0010[\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020*2\u0006\u0010&\u001a\u00020ZH\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\u00042\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u0019\u0010b\u001a\u00020\u00042\b\u0010a\u001a\u0004\u0018\u00010ZH\u0014¢\u0006\u0004\bb\u0010cJ\u0019\u0010f\u001a\u00020\t2\b\u0010e\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0004H\u0016¢\u0006\u0004\bh\u0010\u0006J)\u0010i\u001a\u00020\u00042\u0006\u00104\u001a\u00020*2\u0006\u0010Y\u001a\u00020*2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010r\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010`R$\u0010x\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010\u007f\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R3\u0010\u0099\u0001\u001a\f\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010\u0088\u0001\u001a\u0005\b \u0001\u0010\u001c\"\u0006\b¡\u0001\u0010¢\u0001R+\u0010£\u0001\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R+\u0010©\u0001\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010¤\u0001\u001a\u0006\bª\u0001\u0010¦\u0001\"\u0006\b«\u0001\u0010¨\u0001R,\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R&\u0010³\u0001\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0001\u0010s\u001a\u0005\b´\u0001\u0010u\"\u0005\bµ\u0001\u0010`R&\u0010¶\u0001\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¶\u0001\u0010s\u001a\u0005\b·\u0001\u0010u\"\u0005\b¸\u0001\u0010`R(\u0010¹\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0005\b»\u0001\u0010X\"\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010º\u0001R/\u0010¿\u0001\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b¿\u0001\u0010À\u0001\u0012\u0005\bÄ\u0001\u0010\u0006\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0005\bÃ\u0001\u0010-R*\u0010Æ\u0001\u001a\u00030Å\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R/\u0010Ì\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u001e\n\u0006\bÌ\u0001\u0010À\u0001\u0012\u0005\bÏ\u0001\u0010\u0006\u001a\u0006\bÍ\u0001\u0010Â\u0001\"\u0005\bÎ\u0001\u0010-R/\u0010Ð\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u001e\n\u0006\bÐ\u0001\u0010À\u0001\u0012\u0005\bÓ\u0001\u0010\u0006\u001a\u0006\bÑ\u0001\u0010Â\u0001\"\u0005\bÒ\u0001\u0010-R(\u0010Ô\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÔ\u0001\u0010À\u0001\u001a\u0006\bÕ\u0001\u0010Â\u0001\"\u0005\bÖ\u0001\u0010-R*\u0010×\u0001\u001a\u00030Å\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b×\u0001\u0010Ç\u0001\u001a\u0006\bØ\u0001\u0010É\u0001\"\u0006\bÙ\u0001\u0010Ë\u0001R*\u0010Ú\u0001\u001a\u00030Å\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Ç\u0001\u001a\u0006\bÛ\u0001\u0010É\u0001\"\u0006\bÜ\u0001\u0010Ë\u0001R*\u0010Þ\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R*\u0010ä\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bä\u0001\u0010ß\u0001\u001a\u0006\bå\u0001\u0010á\u0001\"\u0006\bæ\u0001\u0010ã\u0001R/\u0010ç\u0001\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\bç\u0001\u0010À\u0001\u0012\u0005\bê\u0001\u0010\u0006\u001a\u0006\bè\u0001\u0010Â\u0001\"\u0005\bé\u0001\u0010-R*\u0010ë\u0001\u001a\u00030Å\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bë\u0001\u0010Ç\u0001\u001a\u0006\bì\u0001\u0010É\u0001\"\u0006\bí\u0001\u0010Ë\u0001R*\u0010ï\u0001\u001a\u00030î\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R(\u0010õ\u0001\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bõ\u0001\u0010À\u0001\u001a\u0006\bö\u0001\u0010Â\u0001\"\u0005\b÷\u0001\u0010-R0\u0010ø\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bø\u0001\u0010\u009a\u0001\u001a\u0006\bù\u0001\u0010\u009c\u0001\"\u0006\bú\u0001\u0010\u009e\u0001R*\u0010û\u0001\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bû\u0001\u0010\u0088\u0001\u001a\u0005\bü\u0001\u0010\u001c\"\u0006\bý\u0001\u0010¢\u0001R*\u0010þ\u0001\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bþ\u0001\u0010\u0088\u0001\u001a\u0005\bÿ\u0001\u0010\u001c\"\u0006\b\u0080\u0002\u0010¢\u0001R/\u0010\u0081\u0002\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u001e\n\u0006\b\u0081\u0002\u0010À\u0001\u0012\u0005\b\u0084\u0002\u0010\u0006\u001a\u0006\b\u0082\u0002\u0010Â\u0001\"\u0005\b\u0083\u0002\u0010-R0\u0010\u0085\u0002\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u009a\u0001\u001a\u0006\b\u0086\u0002\u0010\u009c\u0001\"\u0006\b\u0087\u0002\u0010\u009e\u0001R0\u0010\u0088\u0002\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u009a\u0001\u001a\u0006\b\u0089\u0002\u0010\u009c\u0001\"\u0006\b\u008a\u0002\u0010\u009e\u0001R,\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u008b\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R+\u0010\u0092\u0002\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0080\u0001\u001a\u0006\b\u0093\u0002\u0010\u0082\u0001\"\u0006\b\u0094\u0002\u0010\u0084\u0001R(\u0010\u0095\u0002\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u0095\u0002\u0010\u0086\u0001\u001a\u0005\b\u0096\u0002\u0010S\"\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0019\u0010\u0099\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010º\u0001R0\u0010\u009a\u0002\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0002\u0010\u009a\u0001\u001a\u0006\b\u009b\u0002\u0010\u009c\u0001\"\u0006\b\u009c\u0002\u0010\u009e\u0001R\u0017\u0010\u009d\u0002\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u0088\u0001R\u0017\u0010\u009f\u0002\u001a\u00020*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010Â\u0001R\u0017\u0010¡\u0002\u001a\u00020*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010Â\u0001¨\u0006¤\u0002"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/view/MedicalIdEditActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/medicalid/viewmodel/MedicalIdViewModel;", "Lakq;", "", "initUI", "()V", "Landroid/content/Context;", "context", "", "supportsLockScreenEnter", "(Landroid/content/Context;)Z", "initLockScreenShowView", "initAvatarFilePath", "initToolBar", "initEmergencyContact", "Lkotlin/Function0;", "importFromContacts", "setSpinnerItemSelectedCallback", "(Lkotlin/jvm/functions/Function0;)V", "showEmergencyContactOperationDialog", "clearContact", "refreshEmergencyContactViewIfNeed", "checkContactPermission", "gotoAddOrEditContactsPage", "jumpToPickEmergencyContact", "", "getReadContactsNecessaryPermission", "()Ljava/lang/String;", "initAvatarName", "handleClickAvatar", "deleteCurrentAvatar", "refreshAvatar", "checkCameraPermissionIfNeed", "openCamera", "checkExternalPermissionIfNeed", "openGallery", "Landroid/content/Intent;", "data", "handlePickContactResult", "(Landroid/content/Intent;)V", "showRelationIfNeed", "", "which", "handleRelationDialogClickResult", "(I)V", "Landroid/util/Pair;", "dealIntentData", "(Landroid/content/Intent;)Landroid/util/Pair;", "origin", "formatPhoneNumber", "(Ljava/lang/String;)Ljava/lang/String;", AccountInteractActivity.KEY_REQUEST_CODE, "handleImageCrop", "handCameraResult", "handlePickImageResult", "Landroid/net/Uri;", "imgPickedFromGallery", "useCamera", "cropAvatar", "(Landroid/net/Uri;Z)V", "initBirthdate", "updateBirthdayRemindText", "showBirthdateDialogIfNeed", "initDonorType", "refreshDonorSpinner", "initBloodType", "refreshPairBloodType", "updateBloodResult", "updateRhVisibility", "", "entries", "Landroid/widget/ArrayAdapter;", "getSpinnerAdapter", "([Ljava/lang/String;)Landroid/widget/ArrayAdapter;", "initGender", "refreshGenderSpinner", "initChronic", "initTreatment", "initAllergyDrugs", "saveRecordAndSeeDisplay", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "getCurrentMedicalRecord", "()Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "discardChangesAndGoBack", "showExitDialogIfNeed", "showLockScreenShowConfirmationDialogIfNeed", "hasModified", "()Z", "resultCode", "Landroid/os/Bundle;", "handleBirthDialog", "(ILandroid/os/Bundle;)V", "", "birthdayLong", "setBirthday", "(J)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MotionEvent;", "event", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onBackPressed", "onActivityResult", "(IILandroid/content/Intent;)V", "Lyo2;", "mBirthdayItem", "Lyo2;", "getMBirthdayItem", "()Lyo2;", "setMBirthdayItem", "(Lyo2;)V", "mBirthdayLong", "J", "getMBirthdayLong", "()J", "setMBirthdayLong", "Lcom/xiaomi/fitness/baseui/widget/YearMonthDayDialog;", "mBirthdayDialog", "Lcom/xiaomi/fitness/baseui/widget/YearMonthDayDialog;", "getMBirthdayDialog", "()Lcom/xiaomi/fitness/baseui/widget/YearMonthDayDialog;", "setMBirthdayDialog", "(Lcom/xiaomi/fitness/baseui/widget/YearMonthDayDialog;)V", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;", "birthdayView", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;", "getBirthdayView", "()Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;", "setBirthdayView", "(Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;)V", "currentMedicalIdRecord", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "mUsername", "Ljava/lang/String;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "mIvAvatar", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getMIvAvatar", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "setMIvAvatar", "(Lcom/xiaomi/fitness/widget/view/RoundImageView;)V", "Landroid/widget/EditText;", "mAvatarNameView", "Landroid/widget/EditText;", "getMAvatarNameView", "()Landroid/widget/EditText;", "setMAvatarNameView", "(Landroid/widget/EditText;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "mAvatarDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getMAvatarDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setMAvatarDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "mAvatarFilePath", "getMAvatarFilePath", "setMAvatarFilePath", "(Ljava/lang/String;)V", "unCroppedFileUri", "Landroid/net/Uri;", "getUnCroppedFileUri", "()Landroid/net/Uri;", "setUnCroppedFileUri", "(Landroid/net/Uri;)V", "croppedFileUri", "getCroppedFileUri", "setCroppedFileUri", "Ljava/io/File;", "croppedAvatarFile", "Ljava/io/File;", "getCroppedAvatarFile", "()Ljava/io/File;", "setCroppedAvatarFile", "(Ljava/io/File;)V", "unCroppedFileTimeStamp", "getUnCroppedFileTimeStamp", "setUnCroppedFileTimeStamp", "croppedFileTimeStamp", "getCroppedFileTimeStamp", "setCroppedFileTimeStamp", "fromCamera", "Z", "getFromCamera", "setFromCamera", "(Z)V", "isGalleryInstalled", "mGender", "I", "getMGender", "()I", "setMGender", "getMGender$annotations", "Lmiuix/appcompat/widget/Spinner;", "genderSpinner", "Lmiuix/appcompat/widget/Spinner;", "getGenderSpinner", "()Lmiuix/appcompat/widget/Spinner;", "setGenderSpinner", "(Lmiuix/appcompat/widget/Spinner;)V", "mBloodType", "getMBloodType", "setMBloodType", "getMBloodType$annotations", "mRhType", "getMRhType", "setMRhType", "getMRhType$annotations", "mUniversalBloodType", "getMUniversalBloodType", "setMUniversalBloodType", "bloodSpinner", "getBloodSpinner", "setBloodSpinner", "rhSpinner", "getRhSpinner", "setRhSpinner", "Landroid/view/View;", "bloodView", "Landroid/view/View;", "getBloodView", "()Landroid/view/View;", "setBloodView", "(Landroid/view/View;)V", "rhBloodView", "getRhBloodView", "setRhBloodView", "mDonorType", "getMDonorType", "setMDonorType", "getMDonorType$annotations", "mDonorSpinner", "getMDonorSpinner", "setMDonorSpinner", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "lockScreenShowView", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "getLockScreenShowView", "()Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "setLockScreenShowView", "(Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;)V", "lockScreenShowStatus", "getLockScreenShowStatus", "setLockScreenShowStatus", "mLockScreenShowConfirmationDialog", "getMLockScreenShowConfirmationDialog", "setMLockScreenShowConfirmationDialog", "mContactName", "getMContactName", "setMContactName", "mContactNumber", "getMContactNumber", "setMContactNumber", "mContactRelationType", "getMContactRelationType", "setMContactRelationType", "getMContactRelationType$annotations", "mContactRelationDialog", "getMContactRelationDialog", "setMContactRelationDialog", "mEditDeleteContactDialog", "getMEditDeleteContactDialog", "setMEditDeleteContactDialog", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/EmergencyContactView;", "mEmergencyContactView", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/EmergencyContactView;", "getMEmergencyContactView", "()Lcom/xiaomi/fitness/userinfo/medicalid/baseui/EmergencyContactView;", "setMEmergencyContactView", "(Lcom/xiaomi/fitness/userinfo/medicalid/baseui/EmergencyContactView;)V", "mFilledEmergencyContact", "getMFilledEmergencyContact", "setMFilledEmergencyContact", "mMedicalIdRecord", "getMMedicalIdRecord", "setMMedicalIdRecord", "(Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;)V", "mNeedConfirmStatus", "mNotSaveRecordDialog", "getMNotSaveRecordDialog", "setMNotSaveRecordDialog", "TAG", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedicalIdEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedicalIdEditActivity.kt\ncom/xiaomi/fitness/userinfo/medicalid/view/MedicalIdEditActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1334:1\n37#2:1335\n36#2,3:1336\n1#3:1339\n*S KotlinDebug\n*F\n+ 1 MedicalIdEditActivity.kt\ncom/xiaomi/fitness/userinfo/medicalid/view/MedicalIdEditActivity\n*L\n503#1:1335\n503#1:1336,3\n*E\n"})
public final class MedicalIdEditActivity extends Hilt_MedicalIdEditActivity<MedicalIdViewModel, akq> {

    @NotNull
    private static final String ACTION_CROP = "com.android.camera.action.CROP";
    public static final long DEFAULT_BIRTHDAY_TIME = 631123200000L;
    private static final int DELETE_RESULT = 1;

    @NotNull
    private static final String DIALOG_NAME = "birth";
    private static final int EDIT_RESULT = 0;

    @NotNull
    private static final String GALLERY_PACKAGE = "com.miui.gallery";
    public static final int REQ_CODE_EMERGENCY_CONTACT = 123;
    public static final int REQ_DIALOG_BIRTH = 2;
    public static final int REQ_INTENT_CAMERA_CROP = 5;
    public static final int REQ_INTENT_GALLERY_CROP = 4;
    private static final int SELECT_ALBUM = 0;

    @NotNull
    public static final String SYSTEM_CONTACT_PACKAGE = "com.android.contacts";
    public static final int USERNAME_MAX_CHARACTER_SIZE = 64;
    public UserInfoRightArrowSingleLineTextView birthdayView;
    public Spinner bloodSpinner;
    public View bloodView;

    @Nullable
    private File croppedAvatarFile;
    private long croppedFileTimeStamp;

    @Nullable
    private Uri croppedFileUri;

    @Nullable
    private MedicalIdRecord currentMedicalIdRecord;
    private boolean fromCamera;
    public Spinner genderSpinner;
    public SwitchButtonTwoLineTextView lockScreenShowView;

    @Nullable
    private CommonDialog<DialogParams> mAvatarDialog;

    @Nullable
    private String mAvatarFilePath;
    public EditText mAvatarNameView;

    @Nullable
    private YearMonthDayDialog mBirthdayDialog;
    public yo2 mBirthdayItem;
    private int mBloodType;

    @Nullable
    private String mContactName;

    @Nullable
    private String mContactNumber;

    @Nullable
    private CommonDialog<?> mContactRelationDialog;
    private int mContactRelationType;
    public Spinner mDonorSpinner;
    private int mDonorType;

    @Nullable
    private CommonDialog<?> mEditDeleteContactDialog;

    @Nullable
    private EmergencyContactView mEmergencyContactView;

    @Nullable
    private UserInfoRightArrowSingleLineTextView mFilledEmergencyContact;
    private int mGender;
    public RoundImageView mIvAvatar;

    @Nullable
    private CommonDialog<?> mLockScreenShowConfirmationDialog;
    public MedicalIdRecord mMedicalIdRecord;

    @Nullable
    private CommonDialog<?> mNotSaveRecordDialog;
    private int mRhType;
    private int mUniversalBloodType;

    @Nullable
    private String mUsername;
    public View rhBloodView;
    public Spinner rhSpinner;
    private long unCroppedFileTimeStamp;

    @Nullable
    private Uri unCroppedFileUri;
    private static boolean hasCameraFeature = true;
    private static int SELECT_CAMERA = 1;
    private static int SELECT_DELETE = 2;
    private long mBirthdayLong = 631123200000L;
    private boolean isGalleryInstalled = true;
    private int lockScreenShowStatus = -1;
    private boolean mNeedConfirmStatus = true;

    @NotNull
    private final String TAG = "MedicalIdEditActivity";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ akq access$getMBinding(MedicalIdEditActivity medicalIdEditActivity) {
        return (akq) medicalIdEditActivity.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCameraPermissionIfNeed() {
        AvatarUtil avatarUtil = AvatarUtil.INSTANCE;
        String[] cameraNecessaryPerm = avatarUtil.getCameraNecessaryPerm();
        PermissionExtKt.permissions(this, (String[]) Arrays.copyOf(cameraNecessaryPerm, cameraNecessaryPerm.length), avatarUtil.getCameraNecessaryPermDesc(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: nmf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedicalIdEditActivity.checkCameraPermissionIfNeed$lambda$17(this.f28071a, (MultiplePermissionsBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCameraPermissionIfNeed$lambda$17(final MedicalIdEditActivity this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: pmf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MedicalIdEditActivity.checkCameraPermissionIfNeed$lambda$17$lambda$14(this.f30540a);
            }
        });
        permissions.denied(new Function1() { // from class: qmf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedicalIdEditActivity.checkCameraPermissionIfNeed$lambda$17$lambda$16(this.f31661a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCameraPermissionIfNeed$lambda$17$lambda$14(MedicalIdEditActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.openCamera();
        } catch (Exception e) {
            Logger.i(this$0.TAG, "checkCameraPermissionIfNeed permissions allGranted, exception caught. cause=" + e.getCause() + " message=" + e.getMessage() + " ");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCameraPermissionIfNeed$lambda$17$lambda$16(final MedicalIdEditActivity this$0, final List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), this$0, it, null, null, new Function0() { // from class: tmf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MedicalIdEditActivity.checkCameraPermissionIfNeed$lambda$17$lambda$16$lambda$15(this.f34854a, it);
            }
        }, 24, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCameraPermissionIfNeed$lambda$17$lambda$16$lambda$15(MedicalIdEditActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.INSTANCE.showSettingDialog(this$0, (String) it.get(0), false, null);
        return Unit.INSTANCE;
    }

    private final void checkContactPermission() {
        PermissionExtKt.permission(this, getReadContactsNecessaryPermission(), getString(o1j.h), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: omf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedicalIdEditActivity.checkContactPermission$lambda$10(this.f29297a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkContactPermission$lambda$10(final MedicalIdEditActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: kmf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedicalIdEditActivity.checkContactPermission$lambda$10$lambda$7(this.f23984a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: umf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedicalIdEditActivity.checkContactPermission$lambda$10$lambda$9(this.f35934a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkContactPermission$lambda$10$lambda$7(MedicalIdEditActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.jumpToPickEmergencyContact();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkContactPermission$lambda$10$lambda$9(final MedicalIdEditActivity this$0, final String it) {
        Spinner spinner;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        EmergencyContactView emergencyContactView = this$0.mEmergencyContactView;
        if (emergencyContactView != null && (spinner = emergencyContactView.getSpinner()) != null) {
            spinner.setSelection(0);
        }
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, this$0, null, null, null, new Function0() { // from class: lmf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MedicalIdEditActivity.checkContactPermission$lambda$10$lambda$9$lambda$8(this.f25219a, it);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkContactPermission$lambda$10$lambda$9$lambda$8(MedicalIdEditActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        PermissionsUtil.INSTANCE.showSettingDialog(this$0, it, false, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkExternalPermissionIfNeed() {
        openGallery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearContact() {
        this.mContactName = null;
        this.mContactNumber = null;
        this.mContactRelationType = 0;
        refreshEmergencyContactViewIfNeed();
    }

    private final void cropAvatar(Uri imgPickedFromGallery, boolean useCamera) {
        Uri uriFromFile;
        if (Build.VERSION.SDK_INT >= 29) {
            Logger.d(this.TAG, "useCamera " + useCamera);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.croppedFileTimeStamp = jCurrentTimeMillis;
            Logger.d(this.TAG, "cropAvatar croppedFileTimeStamp " + jCurrentTimeMillis);
            Uri uriAddCroppedAvatarFileAndGetUri = AvatarUtil.INSTANCE.addCroppedAvatarFileAndGetUri(this.croppedFileTimeStamp);
            this.croppedFileUri = uriAddCroppedAvatarFileAndGetUri;
            Logger.d(this.TAG, "cropAvatar croppedFileUri " + uriAddCroppedAvatarFileAndGetUri);
            String str = this.TAG;
            File file = this.croppedAvatarFile;
            Logger.d(str, "croppedAvatarFile path " + (file != null ? file.getPath() : null));
            if (useCamera) {
                imgPickedFromGallery = this.unCroppedFileUri;
                this.fromCamera = true;
            } else {
                this.fromCamera = false;
            }
            uriFromFile = this.croppedFileUri;
        } else {
            uriFromFile = Uri.fromFile(AvatarUtil.INSTANCE.getExternalCropTempAvatarFile());
        }
        if (imgPickedFromGallery == null) {
            Logger.e(this.TAG, "cropAvatar imgToCropUri is null");
            return;
        }
        Logger.d(this.TAG, "isGalleryInstalled=" + this.isGalleryInstalled);
        if (!RomUtils.isXiaomi() || this.isGalleryInstalled) {
            Intent intentPutExtra = new Intent(ACTION_CROP).setDataAndType(imgPickedFromGallery, "image/*").addFlags(1).addFlags(2).putExtra("crop", "true").putExtra("aspectX", 1).putExtra("aspectY", 1).putExtra("return-data", false).putExtra("output", uriFromFile);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            if (RomUtils.isXiaomi()) {
                intentPutExtra.setPackage(GALLERY_PACKAGE);
            }
            final int i = useCamera ? 5 : 4;
            startForActivityResult(intentPutExtra, new Function2() { // from class: mmf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MedicalIdEditActivity.cropAvatar$lambda$21(this.f27002a, i, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
            return;
        }
        AvatarUtil avatarUtil = AvatarUtil.INSTANCE;
        Intrinsics.checkNotNull(imgPickedFromGallery);
        boolean zCopyCroppedAvatarToPersistentLocation = avatarUtil.copyCroppedAvatarToPersistentLocation(imgPickedFromGallery);
        Logger.d(this.TAG, "cropAvatar copyResult=" + zCopyCroppedAvatarToPersistentLocation);
        if (zCopyCroppedAvatarToPersistentLocation) {
            String absolutePath = avatarUtil.addFirstAidPersistentCroppedAvatarFileAndGetFile().getAbsolutePath();
            this.mAvatarFilePath = absolutePath;
            Logger.d(this.TAG, "mAvatarFilePath=" + absolutePath);
        }
        refreshAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cropAvatar$lambda$21(MedicalIdEditActivity this$0, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleImageCrop(i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    private final Pair<String, String> dealIntentData(Intent data) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        String str;
        String phoneNumber = "";
        if (data == null || data.getData() == null) {
            return new Pair<>("", "");
        }
        Cursor cursorQuery2 = null;
        try {
            Uri data2 = data.getData();
            ContentResolver contentResolver = getContentResolver();
            Intrinsics.checkNotNull(data2);
            cursorQuery = contentResolver.query(data2, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("has_phone_number"));
                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("display_name"));
                            try {
                                Intrinsics.checkNotNull(string2);
                                if (Integer.parseInt(string2) > 0 && (cursorQuery2 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{string}, null)) != null && cursorQuery2.moveToNext()) {
                                    phoneNumber = formatPhoneNumber(cursorQuery2.getString(cursorQuery2.getColumnIndexOrThrow("data1")));
                                }
                                str = phoneNumber;
                                phoneNumber = string3;
                            } catch (Exception e) {
                                e = e;
                                cursor = cursorQuery2;
                                phoneNumber = string3;
                                try {
                                    Logger.e(this.TAG, "ContactIntent cursor deal fail", e);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    str = "";
                                } catch (Throwable th) {
                                    th = th;
                                    cursorQuery2 = cursorQuery;
                                    if (cursorQuery2 != null) {
                                        cursorQuery2.close();
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            str = "";
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery2;
                        cursorQuery2 = cursorQuery;
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    cursor = null;
                    Logger.e(this.TAG, "ContactIntent cursor deal fail", e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    str = "";
                    return new Pair<>(phoneNumber, str);
                }
            } else {
                str = "";
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return new Pair<>(phoneNumber, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void deleteCurrentAvatar() {
        Uri uri;
        this.mAvatarFilePath = null;
        refreshAvatar();
        Uri uri2 = this.croppedFileUri;
        if (uri2 != null) {
            AvatarUtil avatarUtil = AvatarUtil.INSTANCE;
            long j = this.croppedFileTimeStamp;
            Intrinsics.checkNotNull(uri2);
            avatarUtil.deleteImgFromMediaStore(j, uri2);
            this.croppedFileUri = null;
        }
        if (this.fromCamera && (uri = this.unCroppedFileUri) != null) {
            AvatarUtil avatarUtil2 = AvatarUtil.INSTANCE;
            long j2 = this.unCroppedFileTimeStamp;
            Intrinsics.checkNotNull(uri);
            avatarUtil2.deleteImgFromMediaStore(j2, uri);
            this.unCroppedFileUri = null;
        }
        boolean zDeletePersistentAvatarFile = ((MedicalIdViewModel) getMViewModel()).deletePersistentAvatarFile();
        Logger.d(this.TAG, "deleteCurrentAvatar=" + zDeletePersistentAvatarFile);
    }

    private final void discardChangesAndGoBack() {
        if (hasModified()) {
            showExitDialogIfNeed();
        } else {
            Logger.d(this.TAG, "MedicalId hasModified false");
            finish();
        }
    }

    private final String formatPhoneNumber(String origin) {
        Intrinsics.checkNotNull(origin);
        if (TextUtils.isEmpty(origin)) {
            return origin;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(origin, "+86", false, 2, null)) {
            origin = StringsKt__StringsJVMKt.replace$default(origin, "+86", "", false, 4, (Object) null);
        }
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(origin, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MedicalIdRecord getCurrentMedicalRecord() {
        MedicalIdRecord medicalIdRecord = new MedicalIdRecord(0, 1, null);
        String string = getMAvatarNameView().getText().toString();
        Logger.d(this.TAG, "home save mUsername " + this.mUsername);
        int i = this.mGender;
        int i2 = this.mDonorType;
        long j = this.mBirthdayLong;
        int i3 = this.mUniversalBloodType;
        String str = this.mAvatarFilePath;
        String string2 = ((EditText) ((akq) getMBinding()).A.findViewById(hsi.D)).getText().toString();
        String string3 = ((EditText) ((akq) getMBinding()).E.findViewById(hsi.D)).getText().toString();
        String string4 = ((EditText) ((akq) getMBinding()).J.findViewById(hsi.D)).getText().toString();
        medicalIdRecord.setName(string);
        medicalIdRecord.setGender(i);
        medicalIdRecord.setBirthday(Long.valueOf(j));
        medicalIdRecord.setBloodType(i3);
        medicalIdRecord.setDonorType(i2);
        medicalIdRecord.setAvatarFilePath(str);
        medicalIdRecord.setAllergyDrugs(string2);
        medicalIdRecord.setChronic(string3);
        medicalIdRecord.setTreatment(string4);
        medicalIdRecord.setLockShowStatus(this.lockScreenShowStatus);
        medicalIdRecord.setContactName(this.mContactName);
        medicalIdRecord.setContactNumber(this.mContactNumber);
        medicalIdRecord.setContactRelationType(this.mContactRelationType);
        return medicalIdRecord;
    }

    public static /* synthetic */ void getMBloodType$annotations() {
    }

    public static /* synthetic */ void getMContactRelationType$annotations() {
    }

    @DonorType
    public static /* synthetic */ void getMDonorType$annotations() {
    }

    @Gender
    public static /* synthetic */ void getMGender$annotations() {
    }

    public static /* synthetic */ void getMRhType$annotations() {
    }

    private final String getReadContactsNecessaryPermission() {
        return "android.permission.READ_CONTACTS";
    }

    private final ArrayAdapter<String> getSpinnerAdapter(String[] entries) {
        return new ArrayAdapter<>(this, nvi.G, R.id.text1, entries);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoAddOrEditContactsPage() {
        Logger.d(this.TAG, "gotoAddOrEditContactsPage mContactName=" + this.mContactName);
        Logger.d(this.TAG, "gotoAddOrEditContactsPage mContactNumber=" + this.mContactNumber);
        Logger.d(this.TAG, "gotoAddOrEditContactsPage mContactRelationType=" + this.mContactRelationType);
        Intent intent = new Intent(this, (Class<?>) MedicalIdAddEmergencyContactActivity.class);
        intent.putExtra(MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NAME, this.mContactName);
        intent.putExtra(MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NUMBER, this.mContactNumber);
        intent.putExtra(MedicalIdAddEmergencyContactActivity.KEY_CONTACT_RELATION_TYPE_ID, this.mContactRelationType);
        startActivityForResult(intent, 123);
    }

    private final void handCameraResult() {
        Logger.d(this.TAG, "handCameraResult running");
        if (Build.VERSION.SDK_INT >= 29) {
            cropAvatar(null, true);
            Logger.d(this.TAG, "handCameraResult SDK_INT > Q");
        } else {
            cropAvatar(AvatarUtil.INSTANCE.getExternalCameraTempAvatarUri(this), true);
            Logger.d(this.TAG, "handCameraResult SDK_INT <= Q");
        }
    }

    private final void handleBirthDialog(int resultCode, Bundle data) {
        if (resultCode != -1 || Intrinsics.areEqual(data, Bundle.EMPTY)) {
            return;
        }
        setBirthday(data.getLong(PickSleepTimeDialog.KEY_SELECT_TIME));
    }

    private final void handleClickAvatar() {
        boolean zHasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.camera.any");
        hasCameraFeature = zHasSystemFeature;
        SELECT_CAMERA = zHasSystemFeature ? 1 : -1;
        SELECT_DELETE = zHasSystemFeature ? 2 : 1;
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(getString(o1j.w));
        if (hasCameraFeature) {
            listMutableListOf.add(getString(o1j.B0));
        }
        listMutableListOf.add(getString(o1j.P));
        if (this.mAvatarDialog == null) {
            CommonDialog<DialogParams> commonDialogCreate = new CommonDialog.c(getString(o1j.I0)).setDialogTitle(o1j.M0).setNegativeText(o1j.f28645b).setItems((String[]) listMutableListOf.toArray(new String[0])).create();
            this.mAvatarDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate != null ? commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.handleClickAvatar.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == 0) {
                        MedicalIdEditActivity.this.checkExternalPermissionIfNeed();
                    } else if (which == MedicalIdEditActivity.SELECT_CAMERA) {
                        MedicalIdEditActivity.this.checkCameraPermissionIfNeed();
                    } else if (which == MedicalIdEditActivity.SELECT_DELETE) {
                        MedicalIdEditActivity.this.deleteCurrentAvatar();
                    }
                }
            }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        }
        CommonDialog<DialogParams> commonDialog = this.mAvatarDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void handleImageCrop(int requestCode) {
        Uri uri;
        if (Build.VERSION.SDK_INT < 29) {
            File avatar = requestCode == 4 ? AvatarUtil.INSTANCE.getAvatar(this, String.valueOf(System.currentTimeMillis()), false) : AvatarUtil.INSTANCE.getAvatar(this, String.valueOf(System.currentTimeMillis()), true);
            if (avatar == null) {
                Logger.d(this.TAG, "avatarFile is null.");
                return;
            }
            String absolutePath = avatar.getAbsolutePath();
            this.mAvatarFilePath = absolutePath;
            Logger.d(this.TAG, "avatarFile absolutePath=" + absolutePath);
            refreshAvatar();
            return;
        }
        if (this.croppedFileUri == null) {
            return;
        }
        UriUtil uriUtil = UriUtil.INSTANCE;
        Uri uri2 = this.croppedFileUri;
        Intrinsics.checkNotNull(uri2);
        File file = new File(uriUtil.getPath(uri2));
        this.croppedAvatarFile = file;
        Intrinsics.checkNotNull(file);
        if (file.exists()) {
            AvatarUtil avatarUtil = AvatarUtil.INSTANCE;
            Uri uri3 = this.croppedFileUri;
            Intrinsics.checkNotNull(uri3);
            if (avatarUtil.copyCroppedAvatarToPersistentLocation(uri3)) {
                this.mAvatarFilePath = avatarUtil.addFirstAidPersistentCroppedAvatarFileAndGetFile().getAbsolutePath();
                if (requestCode == 5 && (uri = this.unCroppedFileUri) != null) {
                    long j = this.unCroppedFileTimeStamp;
                    Intrinsics.checkNotNull(uri);
                    avatarUtil.deleteImgFromMediaStore(j, uri);
                    this.fromCamera = true;
                }
                if (requestCode == 4) {
                    this.fromCamera = false;
                }
                Uri uri4 = this.croppedFileUri;
                if (uri4 != null) {
                    long j2 = this.croppedFileTimeStamp;
                    Intrinsics.checkNotNull(uri4);
                    avatarUtil.deleteImgFromMediaStore(j2, uri4);
                }
            } else {
                this.mAvatarFilePath = null;
                Logger.d(this.TAG, "addPersistentCroppedAvatarToExternalStorageMedicalIdDir failed");
            }
            if (this.mAvatarFilePath != null) {
                refreshAvatar();
                return;
            }
            Logger.d(this.TAG, "handleImageCrop get mAvatarFilePath failed, croppedFileUri=" + this.croppedFileUri);
        }
    }

    private final void handlePickContactResult(Intent data) throws Throwable {
        Boolean boolValueOf;
        Spinner spinner;
        Pair<String, String> pairDealIntentData = dealIntentData(data);
        this.mContactName = (String) pairDealIntentData.first;
        String str = (String) pairDealIntentData.second;
        this.mContactNumber = str;
        this.mContactRelationType = 0;
        if (str != null) {
            boolValueOf = Boolean.valueOf(str.length() == 0);
        } else {
            boolValueOf = null;
        }
        Intrinsics.checkNotNull(boolValueOf);
        if (!boolValueOf.booleanValue()) {
            showRelationIfNeed();
            return;
        }
        EmergencyContactView emergencyContactView = this.mEmergencyContactView;
        if (emergencyContactView == null || (spinner = emergencyContactView.getSpinner()) == null) {
            return;
        }
        spinner.setSelection(0);
    }

    private final void handlePickImageResult(Intent data) {
        Logger.d(this.TAG, "handlePickImageResult running");
        if (data == null || data.getData() == null) {
            return;
        }
        try {
            cropAvatar(data.getData(), false);
        } catch (Exception e) {
            Logger.i(this.TAG, "cropAvatar errorMessage=" + e.getMessage() + " cause=" + e.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRelationDialogClickResult(int which) {
        Spinner spinner;
        if (which >= 0) {
            this.mContactRelationType = which;
            return;
        }
        if (which != -1) {
            this.mContactRelationType = 0;
            EmergencyContactView emergencyContactView = this.mEmergencyContactView;
            if (emergencyContactView != null && (spinner = emergencyContactView.getSpinner()) != null) {
                spinner.setSelection(0);
            }
        }
        refreshEmergencyContactViewIfNeed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean hasModified() {
        this.currentMedicalIdRecord = getCurrentMedicalRecord();
        return !Intrinsics.areEqual(this.currentMedicalIdRecord, ((MedicalIdViewModel) getMViewModel()).getMedicalIdRecordFromSP());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAllergyDrugs() {
        String allergyDrugs = getMMedicalIdRecord().getAllergyDrugs();
        Logger.d(this.TAG, "initAllergyDrugs " + allergyDrugs);
        if (allergyDrugs == null || TextUtils.isEmpty(allergyDrugs)) {
            ((EditText) ((akq) getMBinding()).A.findViewById(hsi.D)).setHint(o1j.s);
        } else {
            ((EditText) ((akq) getMBinding()).A.findViewById(hsi.D)).setText(allergyDrugs);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAvatarFilePath() {
        AvatarUtil avatarUtil = AvatarUtil.INSTANCE;
        PackageManager packageManager = getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        this.isGalleryInstalled = avatarUtil.isGalleryInstalled(GALLERY_PACKAGE, packageManager);
        setMIvAvatar(((akq) getMBinding()).B.getAvatarView());
        getMIvAvatar().setOnClickListener(new View.OnClickListener() { // from class: xmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdEditActivity.initAvatarFilePath$lambda$2(this.f39266a, view);
            }
        });
        this.mAvatarFilePath = ((MedicalIdViewModel) getMViewModel()).getAvatarFilePathString();
        refreshAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAvatarFilePath$lambda$2(MedicalIdEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleClickAvatar();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAvatarName() {
        setMAvatarNameView(((akq) getMBinding()).B.getUsername());
        this.mUsername = getMMedicalIdRecord().getName();
        getMAvatarNameView().setFilters(new InputFilter[]{new InputFilter.LengthFilter(64)});
        Logger.d(this.TAG, "initAvatarName mUsername=" + this.mUsername);
        String str = this.mUsername;
        if (str == null || TextUtils.isEmpty(str)) {
            getMAvatarNameView().setHint(getString(o1j.b0));
        } else {
            getMAvatarNameView().setText(this.mUsername);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBirthdate() {
        setBirthdayView((UserInfoRightArrowSingleLineTextView) findViewById(hsi.S));
        long birthdayLongFromUserProfileOrSp = ((MedicalIdViewModel) getMViewModel()).getBirthdayLongFromUserProfileOrSp();
        this.mBirthdayLong = birthdayLongFromUserProfileOrSp;
        setMBirthdayItem(new yo2(birthdayLongFromUserProfileOrSp));
        updateBirthdayRemindText();
        getBirthdayView().setOnClickListener(new View.OnClickListener() { // from class: rmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdEditActivity.initBirthdate$lambda$22(this.f32705a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBirthdate$lambda$22(MedicalIdEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showBirthdateDialogIfNeed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBloodType() {
        setBloodView(findViewById(hsi.a0));
        setBloodSpinner((Spinner) getBloodView().findViewById(hsi.U0));
        setRhBloodView(findViewById(hsi.b0));
        setRhSpinner((Spinner) getRhBloodView().findViewById(hsi.U0));
        this.mUniversalBloodType = ((MedicalIdViewModel) getMViewModel()).getIntFromSP(MedicalIdSPContract.PREF_BLOOD_TYPE, 0);
        refreshPairBloodType();
        String[] stringArray = getResources().getStringArray(ehi.f);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String[] stringArray2 = getResources().getStringArray(ehi.g);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        final ArrayAdapter<String> spinnerAdapter = getSpinnerAdapter(stringArray);
        final ArrayAdapter<String> spinnerAdapter2 = getSpinnerAdapter(stringArray2);
        int i = nvi.d;
        spinnerAdapter.setDropDownViewResource(i);
        spinnerAdapter2.setDropDownViewResource(i);
        getBloodSpinner().setAdapter((SpinnerAdapter) spinnerAdapter);
        getRhSpinner().setAdapter((SpinnerAdapter) spinnerAdapter2);
        nuf.i(getBloodView(), getBloodSpinner());
        nuf.i(getRhBloodView(), getRhSpinner());
        getBloodSpinner().setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.initBloodType.1
            /* JADX WARN: Code duplicated, block: B:12:0x0058  */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position < 0 || position >= spinnerAdapter.getCount()) {
                    return;
                }
                this.setMBloodType(position);
                this.updateBloodResult();
                View bloodView = this.getBloodView();
                MedicalIdEditActivity medicalIdEditActivity = this;
                int i2 = o1j.O0;
                Object[] objArr = new Object[2];
                objArr[0] = ((TextView) medicalIdEditActivity.getBloodView().findViewById(hsi.C1)).getText();
                Object selectedItem = this.getBloodSpinner().getSelectedItem();
                if (selectedItem != null) {
                    MedicalIdEditActivity medicalIdEditActivity2 = this;
                    if (Intrinsics.areEqual(selectedItem, AbstractJsonLexerKt.NULL)) {
                        selectedItem = medicalIdEditActivity2.getString(o1j.G);
                        Intrinsics.checkNotNullExpressionValue(selectedItem, "getString(...)");
                    }
                    if (selectedItem == null) {
                        selectedItem = this.getString(o1j.G);
                        Intrinsics.checkNotNullExpressionValue(selectedItem, "getString(...)");
                    }
                } else {
                    selectedItem = this.getString(o1j.G);
                    Intrinsics.checkNotNullExpressionValue(selectedItem, "getString(...)");
                }
                objArr[1] = selectedItem;
                bloodView.setContentDescription(medicalIdEditActivity.getString(i2, objArr));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        getRhSpinner().setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.initBloodType.2
            /* JADX WARN: Code duplicated, block: B:12:0x0058  */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position < 0 || position >= spinnerAdapter2.getCount()) {
                    return;
                }
                this.setMRhType(position);
                this.updateBloodResult();
                View rhBloodView = this.getRhBloodView();
                MedicalIdEditActivity medicalIdEditActivity = this;
                int i2 = o1j.O0;
                Object[] objArr = new Object[2];
                objArr[0] = ((TextView) medicalIdEditActivity.getRhBloodView().findViewById(hsi.C1)).getText();
                Object selectedItem = this.getRhSpinner().getSelectedItem();
                if (selectedItem != null) {
                    MedicalIdEditActivity medicalIdEditActivity2 = this;
                    if (Intrinsics.areEqual(selectedItem, AbstractJsonLexerKt.NULL)) {
                        selectedItem = medicalIdEditActivity2.getString(o1j.G);
                        Intrinsics.checkNotNullExpressionValue(selectedItem, "getString(...)");
                    }
                    if (selectedItem == null) {
                        selectedItem = this.getString(o1j.G);
                        Intrinsics.checkNotNullExpressionValue(selectedItem, "getString(...)");
                    }
                } else {
                    selectedItem = this.getString(o1j.G);
                    Intrinsics.checkNotNullExpressionValue(selectedItem, "getString(...)");
                }
                objArr[1] = selectedItem;
                rhBloodView.setContentDescription(medicalIdEditActivity.getString(i2, objArr));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        refreshPairBloodType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initChronic() {
        String chronic = getMMedicalIdRecord().getChronic();
        if (chronic != null) {
            Logger.d(this.TAG, "CHRONIC " + chronic + "  " + chronic.length());
        }
        if (chronic == null || TextUtils.isEmpty(chronic)) {
            ((EditText) ((akq) getMBinding()).E.findViewById(hsi.D)).setHint(o1j.x);
        } else {
            ((EditText) ((akq) getMBinding()).E.findViewById(hsi.D)).setText(chronic);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDonorType() {
        final View viewFindViewById = findViewById(hsi.W);
        setMDonorSpinner((Spinner) viewFindViewById.findViewById(hsi.U0));
        this.mDonorType = ((MedicalIdViewModel) getMViewModel()).getIntFromSP(MedicalIdSPContract.PREF_ORGAN_DONOR, 0);
        refreshDonorSpinner();
        getMDonorSpinner().setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.initDonorType.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    MedicalIdEditActivity.this.setMDonorType(0);
                } else if (position == 1) {
                    MedicalIdEditActivity.this.setMDonorType(1);
                } else if (position == 2) {
                    MedicalIdEditActivity.this.setMDonorType(2);
                }
                View view2 = viewFindViewById;
                MedicalIdEditActivity medicalIdEditActivity = MedicalIdEditActivity.this;
                int i = o1j.O0;
                Object[] objArr = new Object[2];
                objArr[0] = ((TextView) view2.findViewById(hsi.C1)).getText();
                Object selectedItem = MedicalIdEditActivity.this.getMDonorSpinner().getSelectedItem();
                objArr[1] = selectedItem != null ? selectedItem.toString() : null;
                view2.setContentDescription(medicalIdEditActivity.getString(i, objArr));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEmergencyContact() {
        this.mEmergencyContactView = ((akq) getMBinding()).G;
        UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView = ((akq) getMBinding()).H;
        this.mFilledEmergencyContact = userInfoRightArrowSingleLineTextView;
        if (userInfoRightArrowSingleLineTextView != null) {
            userInfoRightArrowSingleLineTextView.setSubTitleMaxLines(6);
        }
        nuf.h(this.mEmergencyContactView);
        Logger.d(this.TAG, "initEmergencyContact mMedicalIdRecord " + getMMedicalIdRecord());
        this.mContactName = getMMedicalIdRecord().getContactName();
        this.mContactNumber = getMMedicalIdRecord().getContactNumber();
        this.mContactRelationType = getMMedicalIdRecord().getContactRelationType();
        Logger.d(this.TAG, "initEmergencyContact mContactName=" + this.mContactName);
        Logger.d(this.TAG, "initEmergencyContact mContactNumber=" + this.mContactNumber);
        Logger.d(this.TAG, "initEmergencyContact mContactRelationType=" + this.mContactRelationType);
        String str = this.mContactNumber;
        if (str == null || TextUtils.isEmpty(str)) {
            UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView2 = this.mFilledEmergencyContact;
            if (userInfoRightArrowSingleLineTextView2 != null) {
                ViewExtKt.gone(userInfoRightArrowSingleLineTextView2);
            }
            EmergencyContactView emergencyContactView = this.mEmergencyContactView;
            if (emergencyContactView != null) {
                ViewExtKt.visible(emergencyContactView);
            }
        } else {
            UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView3 = this.mFilledEmergencyContact;
            if (userInfoRightArrowSingleLineTextView3 != null) {
                ViewExtKt.visible(userInfoRightArrowSingleLineTextView3);
            }
            UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView4 = this.mFilledEmergencyContact;
            if (userInfoRightArrowSingleLineTextView4 != null) {
                userInfoRightArrowSingleLineTextView4.setTitle(o1j.Z);
            }
            EmergencyContactView emergencyContactView2 = this.mEmergencyContactView;
            if (emergencyContactView2 != null) {
                ViewExtKt.gone(emergencyContactView2);
            }
            refreshEmergencyContactViewIfNeed();
        }
        setSpinnerItemSelectedCallback(new Function0() { // from class: bnf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MedicalIdEditActivity.initEmergencyContact$lambda$5(this.f4396a);
            }
        });
        UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView5 = this.mFilledEmergencyContact;
        if (userInfoRightArrowSingleLineTextView5 != null) {
            userInfoRightArrowSingleLineTextView5.setOnClickListener(new View.OnClickListener() { // from class: cnf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MedicalIdEditActivity.initEmergencyContact$lambda$6(this.f5576a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initEmergencyContact$lambda$5(MedicalIdEditActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkContactPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEmergencyContact$lambda$6(MedicalIdEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showEmergencyContactOperationDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initGender() {
        setGenderSpinner((Spinner) ((akq) getMBinding()).I.findViewById(hsi.U0));
        this.mGender = ((MedicalIdViewModel) getMViewModel()).getGenderFromSpOrUserProfile();
        refreshGenderSpinner();
        getGenderSpinner().setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.initGender.1
            /* JADX WARN: Code duplicated, block: B:6:0x000b  */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int i;
                MedicalIdEditActivity medicalIdEditActivity = MedicalIdEditActivity.this;
                if (position == 0) {
                    i = 0;
                } else if (position == 1) {
                    i = 1;
                } else if (position != 2) {
                    i = 0;
                } else {
                    i = 2;
                }
                medicalIdEditActivity.setMGender(i);
                GenderView genderView = MedicalIdEditActivity.access$getMBinding(MedicalIdEditActivity.this).I;
                MedicalIdEditActivity medicalIdEditActivity2 = MedicalIdEditActivity.this;
                int i2 = o1j.O0;
                Object[] objArr = new Object[2];
                objArr[0] = MedicalIdEditActivity.access$getMBinding(medicalIdEditActivity2).I.getTitleView().getText();
                Object selectedItem = MedicalIdEditActivity.this.getGenderSpinner().getSelectedItem();
                objArr[1] = selectedItem != null ? selectedItem.toString() : null;
                genderView.setContentDescription(medicalIdEditActivity2.getString(i2, objArr));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        refreshGenderSpinner();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initLockScreenShowView() {
        setLockScreenShowView(((akq) getMBinding()).M);
        boolean z = false;
        boolean z2 = supportsLockScreenEnter(this) && ChannelAndRegionExtKt.isChinaChannelAndInland();
        ViewExtKt.setVisible(getLockScreenShowView(), z2);
        View lockScreenDivider = ((akq) getMBinding()).L;
        Intrinsics.checkNotNullExpressionValue(lockScreenDivider, "lockScreenDivider");
        ViewExtKt.setVisible(lockScreenDivider, z2);
        if (z2) {
            int intFromSP = ((MedicalIdViewModel) getMViewModel()).getIntFromSP(MedicalIdSPContract.PREF_LOCK_SCREEN_SHOW, 1);
            if (intFromSP == 0) {
                this.lockScreenShowStatus = 0;
            } else if (intFromSP == 1) {
                this.lockScreenShowStatus = 1;
                z = true;
            }
            getLockScreenShowView().setSwitch(z);
            Logger.d(this.TAG, "initLockScreenShowView lockScreenShowStatus  " + this.lockScreenShowStatus);
            getLockScreenShowView().setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: smf
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z3, ISwitchButton iSwitchButton) {
                    MedicalIdEditActivity.initLockScreenShowView$lambda$1(this.f33787a, z3, iSwitchButton);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLockScreenShowView$lambda$1(MedicalIdEditActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lockScreenShowStatus = z ? 1 : 0;
        Logger.d(this$0.TAG, "lockScreenStatus on checked " + (z ? 1 : 0));
    }

    private final void initToolBar() {
        hideBack();
        setTitle(o1j.p0);
        IActionBar.DefaultImpls.setStartView$default(this, 0, moi.c, getString(o1j.F0), new View.OnClickListener() { // from class: ymf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdEditActivity.initToolBar$lambda$3(this.f40325a, view);
            }
        }, 1, null);
        final boolean z = !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
        IActionBar.DefaultImpls.setEndView$default(this, 0, moi.f27051b, getString(o1j.n), new View.OnClickListener() { // from class: zmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdEditActivity.initToolBar$lambda$4(this.f41460a, z, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolBar$lambda$3(MedicalIdEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.discardChangesAndGoBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initToolBar$lambda$4(MedicalIdEditActivity this$0, boolean z, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "lockScreenStatus " + this$0.lockScreenShowStatus);
        if (z && this$0.lockScreenShowStatus == 1 && this$0.hasModified() && ((MedicalIdViewModel) this$0.getMViewModel()).getInitStatus()) {
            this$0.showLockScreenShowConfirmationDialogIfNeed();
        } else {
            this$0.saveRecordAndSeeDisplay();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTreatment() {
        String treatment = getMMedicalIdRecord().getTreatment();
        if (treatment == null || TextUtils.isEmpty(treatment)) {
            ((EditText) ((akq) getMBinding()).J.findViewById(hsi.D)).setHint(o1j.k1);
        } else {
            ((EditText) ((akq) getMBinding()).J.findViewById(hsi.D)).setText(treatment);
        }
    }

    private final void initUI() {
        initToolBar();
        initAvatarName();
        initAvatarFilePath();
        initGender();
        initBirthdate();
        initBloodType();
        initDonorType();
        initEmergencyContact();
        initAllergyDrugs();
        initChronic();
        initTreatment();
        initLockScreenShowView();
    }

    private final void jumpToPickEmergencyContact() {
        Intent data = new Intent("android.intent.action.PICK").setData(ContactsContract.Contacts.CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        if (RomUtils.isXiaomi() && !AppUtil.INSTANCE.isPlayChannel()) {
            data.setPackage(SYSTEM_CONTACT_PACKAGE);
        }
        startForActivityResult(data, new Function2() { // from class: anf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MedicalIdEditActivity.jumpToPickEmergencyContact$lambda$13(this.f3283a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpToPickEmergencyContact$lambda$13(MedicalIdEditActivity this$0, int i, Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handlePickContactResult(intent);
        return Unit.INSTANCE;
    }

    private final void openCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (Build.VERSION.SDK_INT >= 29) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.unCroppedFileTimeStamp = jCurrentTimeMillis;
            Uri uriAddPhotoTakenAndGetUri = AvatarUtil.INSTANCE.addPhotoTakenAndGetUri(jCurrentTimeMillis);
            this.unCroppedFileUri = uriAddPhotoTakenAndGetUri;
            intent.putExtra("output", uriAddPhotoTakenAndGetUri);
        } else {
            intent.putExtra("output", AvatarUtil.INSTANCE.getExternalCameraTempAvatarUriBelowQ());
        }
        startForActivityResult(intent, new Function2() { // from class: wmf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MedicalIdEditActivity.openCamera$lambda$18(this.f38130a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openCamera$lambda$18(MedicalIdEditActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "openCamera intent=" + intent);
        if (intent != null) {
            return Unit.INSTANCE;
        }
        this$0.handCameraResult();
        return Unit.INSTANCE;
    }

    private final void openGallery() {
        Logger.d(this.TAG, "openGallery running");
        Intent data = new Intent("android.intent.action.PICK").setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        if (RomUtils.isXiaomi() && this.isGalleryInstalled) {
            data.setPackage(GALLERY_PACKAGE);
        }
        startForActivityResult(data, new Function2() { // from class: vmf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MedicalIdEditActivity.openGallery$lambda$19(this.f37027a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openGallery$lambda$19(MedicalIdEditActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handlePickImageResult(intent);
        return Unit.INSTANCE;
    }

    private final void refreshAvatar() {
        Logger.d(this.TAG, "refreshAvatar file path " + this.mAvatarFilePath);
        if (TextUtils.isEmpty(this.mAvatarFilePath) && !FileUtils.isExists(this.mAvatarFilePath)) {
            getMIvAvatar().setImageResource(moi.d);
        } else {
            getMIvAvatar().setImageBitmap(BitmapFactory.decodeFile(this.mAvatarFilePath));
        }
    }

    private final void refreshDonorSpinner() {
        getMDonorSpinner().setSelection(this.mDonorType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshEmergencyContactViewIfNeed() {
        Spinner spinner;
        Logger.d(this.TAG, "refreshEmergencyContactViewIfNeed relation  " + this.mContactRelationType);
        Logger.d(this.TAG, "refreshEmergencyContactViewIfNeed number " + this.mContactNumber);
        Logger.d(this.TAG, "refreshEmergencyContactViewIfNeed name " + this.mContactName);
        String str = this.mContactNumber;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            if (str.length() > 0) {
                EmergencyContactView emergencyContactView = this.mEmergencyContactView;
                if (emergencyContactView != null) {
                    ViewExtKt.gone(emergencyContactView);
                }
                UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView = this.mFilledEmergencyContact;
                if (userInfoRightArrowSingleLineTextView != null) {
                    ViewExtKt.visible(userInfoRightArrowSingleLineTextView);
                }
                UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView2 = this.mFilledEmergencyContact;
                if (userInfoRightArrowSingleLineTextView2 != null) {
                    userInfoRightArrowSingleLineTextView2.setTitle(o1j.Z);
                }
                UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView3 = this.mFilledEmergencyContact;
                if (userInfoRightArrowSingleLineTextView3 != null) {
                    userInfoRightArrowSingleLineTextView3.setRemindText(((MedicalIdViewModel) getMViewModel()).constructEmergencyContactRemindText(this.mContactRelationType, this.mContactNumber, this.mContactName));
                    return;
                }
                return;
            }
        }
        EmergencyContactView emergencyContactView2 = this.mEmergencyContactView;
        if (emergencyContactView2 != null) {
            ViewExtKt.visible(emergencyContactView2);
        }
        EmergencyContactView emergencyContactView3 = this.mEmergencyContactView;
        if (emergencyContactView3 != null && (spinner = emergencyContactView3.getSpinner()) != null) {
            spinner.setSelection(0);
        }
        UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView4 = this.mFilledEmergencyContact;
        if (userInfoRightArrowSingleLineTextView4 != null) {
            ViewExtKt.gone(userInfoRightArrowSingleLineTextView4);
        }
    }

    private final void refreshGenderSpinner() {
        getGenderSpinner().setSelection(this.mGender);
    }

    private final void refreshPairBloodType() {
        Pair<Integer, Integer> pairBloodType = BloodTypeConverter.INSTANCE.getPairBloodType(this.mUniversalBloodType);
        this.mBloodType = ((Number) pairBloodType.first).intValue();
        updateRhVisibility();
        this.mRhType = ((Number) pairBloodType.second).intValue();
        getBloodSpinner().setSelection(this.mBloodType);
        getRhSpinner().setSelection(this.mRhType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void saveRecordAndSeeDisplay() {
        this.currentMedicalIdRecord = getCurrentMedicalRecord();
        MedicalIdViewModel medicalIdViewModel = (MedicalIdViewModel) getMViewModel();
        MedicalIdRecord medicalIdRecord = this.currentMedicalIdRecord;
        Intrinsics.checkNotNull(medicalIdRecord);
        medicalIdViewModel.saveOrUpdateRecord(medicalIdRecord);
        ((MedicalIdViewModel) getMViewModel()).setFirstInitStatus(false);
        finish();
    }

    private final void setBirthday(long birthdayLong) {
        getMBirthdayItem().d(birthdayLong);
        updateBirthdayRemindText();
    }

    private final void setSpinnerItemSelectedCallback(final Function0<Unit> importFromContacts) {
        Spinner spinner;
        EmergencyContactView emergencyContactView = this.mEmergencyContactView;
        if (emergencyContactView == null || (spinner = emergencyContactView.getSpinner()) == null) {
            return;
        }
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.setSpinnerItemSelectedCallback.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    MedicalIdEditActivity.this.gotoAddOrEditContactsPage();
                } else if (position == 2) {
                    importFromContacts.invoke();
                }
                EmergencyContactView mEmergencyContactView = MedicalIdEditActivity.this.getMEmergencyContactView();
                if (mEmergencyContactView != null) {
                    MedicalIdEditActivity medicalIdEditActivity = MedicalIdEditActivity.this;
                    int i = o1j.O0;
                    Object[] objArr = new Object[2];
                    objArr[0] = mEmergencyContactView.getTitleView().getText();
                    Object selectedItem = mEmergencyContactView.getSpinner().getSelectedItem();
                    objArr[1] = selectedItem != null ? selectedItem.toString() : null;
                    mEmergencyContactView.setContentDescription(medicalIdEditActivity.getString(i, objArr));
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private final void showBirthdateDialogIfNeed() {
        if (this.mBirthdayDialog == null) {
            YearMonthDayDialog yearMonthDayDialogCreate = new YearMonthDayDialog.a("birth").setCustomLayoutId(nvi.c).setPositiveText(o1j.T).setNegativeText(o1j.f28645b).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this.mBirthdayDialog = yearMonthDayDialogCreate;
            Intrinsics.checkNotNull(yearMonthDayDialogCreate);
            yearMonthDayDialogCreate.setRequestCode(2);
        }
        YearMonthDayDialog yearMonthDayDialog = this.mBirthdayDialog;
        Intrinsics.checkNotNull(yearMonthDayDialog);
        yearMonthDayDialog.setRange(UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE).getBirthdaySelectRange(), getMBirthdayItem().c() ? getMBirthdayItem().b() : 631123200000L);
        YearMonthDayDialog yearMonthDayDialog2 = this.mBirthdayDialog;
        Intrinsics.checkNotNull(yearMonthDayDialog2);
        yearMonthDayDialog2.setShowBirthDesc(true);
        YearMonthDayDialog yearMonthDayDialog3 = this.mBirthdayDialog;
        Intrinsics.checkNotNull(yearMonthDayDialog3);
        yearMonthDayDialog3.showIfNeed(getSupportFragmentManager());
        YearMonthDayDialog yearMonthDayDialog4 = this.mBirthdayDialog;
        Intrinsics.checkNotNull(yearMonthDayDialog4);
        yearMonthDayDialog4.setDialogTitle(o1j.N0);
        YearMonthDayDialog yearMonthDayDialog5 = this.mBirthdayDialog;
        Intrinsics.checkNotNull(yearMonthDayDialog5);
        Intrinsics.checkNotNull(yearMonthDayDialog5.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.showBirthdateDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                YearMonthDayDialog mBirthdayDialog = MedicalIdEditActivity.this.getMBirthdayDialog();
                Long lValueOf = mBirthdayDialog != null ? Long.valueOf(mBirthdayDialog.getSelectTime()) : null;
                Intrinsics.checkNotNull(lValueOf);
                long jLongValue = lValueOf.longValue();
                MedicalIdEditActivity.this.setMBirthdayItem(new yo2(jLongValue));
                MedicalIdEditActivity.this.setMBirthdayLong(jLongValue);
                String dateToString = UserInfoConfigUtil.INSTANCE.getDateToString(jLongValue, "yyyy-MM-dd");
                int iA = new yo2(jLongValue).a();
                if (which == -1) {
                    MedicalIdEditActivity.this.getBirthdayView().setRemindText(dateToString + MedicalIdEditActivity.this.getResources().getQuantityString(fyi.f18375a, iA, Integer.valueOf(iA)));
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
    }

    private final void showEmergencyContactOperationDialog() {
        if (this.mEditDeleteContactDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c(getString(o1j.X)).setDialogTitle(o1j.J0).setNegativeText(o1j.f28645b).setItems(new String[]{getString(o1j.t0), getString(o1j.Q)}).create();
            this.mEditDeleteContactDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.showEmergencyContactOperationDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == 0) {
                        MedicalIdEditActivity.this.gotoAddOrEditContactsPage();
                    } else {
                        if (which != 1) {
                            return;
                        }
                        MedicalIdEditActivity.this.clearContact();
                    }
                }
            }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        }
        CommonDialog<?> commonDialog = this.mEditDeleteContactDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final void showExitDialogIfNeed() {
        if (this.mNotSaveRecordDialog == null) {
            this.mNotSaveRecordDialog = new CommonDialog.c("not_save").setDialogTitle(o1j.U).setDialogDescription(o1j.w0).setPositiveText(o1j.D0).setNegativeText(o1j.t).setCancelable(false).create();
        }
        CommonDialog<?> commonDialog = this.mNotSaveRecordDialog;
        Intrinsics.checkNotNull(commonDialog);
        Intrinsics.checkNotNull(commonDialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.showExitDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    MedicalIdEditActivity.this.deleteCurrentAvatar();
                    MedicalIdEditActivity.this.finish();
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        CommonDialog<?> commonDialog2 = this.mNotSaveRecordDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
    }

    private final void showLockScreenShowConfirmationDialogIfNeed() {
        if (this.mLockScreenShowConfirmationDialog == null) {
            this.mLockScreenShowConfirmationDialog = new CommonDialog.c("lock_screen_show").setDialogTitle(o1j.r0).setDialogDescription(o1j.s0).setPositiveText(o1j.c).setNegativeText(o1j.f28645b).setCancelable(false).create();
        }
        CommonDialog<?> commonDialog = this.mLockScreenShowConfirmationDialog;
        Intrinsics.checkNotNull(commonDialog);
        Intrinsics.checkNotNull(commonDialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.showLockScreenShowConfirmationDialogIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    MedicalIdEditActivity.this.dismissDialog();
                } else {
                    if (which != -1) {
                        return;
                    }
                    MedicalIdEditActivity.this.saveRecordAndSeeDisplay();
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        CommonDialog<?> commonDialog2 = this.mLockScreenShowConfirmationDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
    }

    private final void showRelationIfNeed() {
        if (this.mContactRelationDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("contact_relation").setDialogTitle(o1j.G0).setNegativeText(o1j.f28645b).setPositiveText(o1j.T).setItems(getResources().getStringArray(ehi.c)).setItemsCheckedIndex(0).create();
            this.mContactRelationDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity.showRelationIfNeed.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    MedicalIdEditActivity.this.handleRelationDialogClickResult(which);
                }
            }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        }
        CommonDialog<?> commonDialog = this.mContactRelationDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final boolean supportsLockScreenEnter(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "support_health_in_emergency_dialer", 0) == 1;
    }

    private final void updateBirthdayRemindText() {
        getBirthdayView().setRemindText(BirthdateConverter.INSTANCE.constructBirthdayAndAgeDisplayText(getMBirthdayItem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBloodResult() {
        this.mUniversalBloodType = BloodTypeConverter.INSTANCE.getUniversalBloodType(this.mBloodType, this.mRhType);
        updateRhVisibility();
    }

    private final void updateRhVisibility() {
        getRhBloodView().setVisibility(this.mBloodType == 0 ? 8 : 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent event) {
        if (event != null && event.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                EditText editText = (EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    editText.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @NotNull
    public final UserInfoRightArrowSingleLineTextView getBirthdayView() {
        UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView = this.birthdayView;
        if (userInfoRightArrowSingleLineTextView != null) {
            return userInfoRightArrowSingleLineTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birthdayView");
        return null;
    }

    @NotNull
    public final Spinner getBloodSpinner() {
        Spinner spinner = this.bloodSpinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodSpinner");
        return null;
    }

    @NotNull
    public final View getBloodView() {
        View view = this.bloodView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodView");
        return null;
    }

    @Nullable
    public final File getCroppedAvatarFile() {
        return this.croppedAvatarFile;
    }

    public final long getCroppedFileTimeStamp() {
        return this.croppedFileTimeStamp;
    }

    @Nullable
    public final Uri getCroppedFileUri() {
        return this.croppedFileUri;
    }

    public final boolean getFromCamera() {
        return this.fromCamera;
    }

    @NotNull
    public final Spinner getGenderSpinner() {
        Spinner spinner = this.genderSpinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("genderSpinner");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.t;
    }

    public final int getLockScreenShowStatus() {
        return this.lockScreenShowStatus;
    }

    @NotNull
    public final SwitchButtonTwoLineTextView getLockScreenShowView() {
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.lockScreenShowView;
        if (switchButtonTwoLineTextView != null) {
            return switchButtonTwoLineTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lockScreenShowView");
        return null;
    }

    @Nullable
    public final CommonDialog<DialogParams> getMAvatarDialog() {
        return this.mAvatarDialog;
    }

    @Nullable
    public final String getMAvatarFilePath() {
        return this.mAvatarFilePath;
    }

    @NotNull
    public final EditText getMAvatarNameView() {
        EditText editText = this.mAvatarNameView;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAvatarNameView");
        return null;
    }

    @Nullable
    public final YearMonthDayDialog getMBirthdayDialog() {
        return this.mBirthdayDialog;
    }

    @NotNull
    public final yo2 getMBirthdayItem() {
        yo2 yo2Var = this.mBirthdayItem;
        if (yo2Var != null) {
            return yo2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBirthdayItem");
        return null;
    }

    public final long getMBirthdayLong() {
        return this.mBirthdayLong;
    }

    public final int getMBloodType() {
        return this.mBloodType;
    }

    @Nullable
    public final String getMContactName() {
        return this.mContactName;
    }

    @Nullable
    public final String getMContactNumber() {
        return this.mContactNumber;
    }

    @Nullable
    public final CommonDialog<?> getMContactRelationDialog() {
        return this.mContactRelationDialog;
    }

    public final int getMContactRelationType() {
        return this.mContactRelationType;
    }

    @NotNull
    public final Spinner getMDonorSpinner() {
        Spinner spinner = this.mDonorSpinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDonorSpinner");
        return null;
    }

    public final int getMDonorType() {
        return this.mDonorType;
    }

    @Nullable
    public final CommonDialog<?> getMEditDeleteContactDialog() {
        return this.mEditDeleteContactDialog;
    }

    @Nullable
    public final EmergencyContactView getMEmergencyContactView() {
        return this.mEmergencyContactView;
    }

    @Nullable
    public final UserInfoRightArrowSingleLineTextView getMFilledEmergencyContact() {
        return this.mFilledEmergencyContact;
    }

    public final int getMGender() {
        return this.mGender;
    }

    @NotNull
    public final RoundImageView getMIvAvatar() {
        RoundImageView roundImageView = this.mIvAvatar;
        if (roundImageView != null) {
            return roundImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mIvAvatar");
        return null;
    }

    @Nullable
    public final CommonDialog<?> getMLockScreenShowConfirmationDialog() {
        return this.mLockScreenShowConfirmationDialog;
    }

    @NotNull
    public final MedicalIdRecord getMMedicalIdRecord() {
        MedicalIdRecord medicalIdRecord = this.mMedicalIdRecord;
        if (medicalIdRecord != null) {
            return medicalIdRecord;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMedicalIdRecord");
        return null;
    }

    @Nullable
    public final CommonDialog<?> getMNotSaveRecordDialog() {
        return this.mNotSaveRecordDialog;
    }

    public final int getMRhType() {
        return this.mRhType;
    }

    public final int getMUniversalBloodType() {
        return this.mUniversalBloodType;
    }

    @NotNull
    public final View getRhBloodView() {
        View view = this.rhBloodView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhBloodView");
        return null;
    }

    @NotNull
    public final Spinner getRhSpinner() {
        Spinner spinner = this.rhSpinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhSpinner");
        return null;
    }

    public final long getUnCroppedFileTimeStamp() {
        return this.unCroppedFileTimeStamp;
    }

    @Nullable
    public final Uri getUnCroppedFileUri() {
        return this.unCroppedFileUri;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        EmergencyContactView emergencyContactView;
        Spinner spinner;
        Bundle extras;
        super.onActivityResult(requestCode, resultCode, data);
        Logger.d(this.TAG, "onActivityResult requestCode=" + requestCode + ", resultCode=" + resultCode);
        if (resultCode == 2) {
            if (data == null || (extras = data.getExtras()) == null) {
                return;
            }
            handleBirthDialog(resultCode, extras);
            return;
        }
        if (requestCode == 123) {
            Bundle extras2 = data != null ? data.getExtras() : null;
            this.mContactName = extras2 != null ? extras2.getString(MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NAME) : null;
            this.mContactNumber = extras2 != null ? extras2.getString(MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NUMBER) : null;
            this.mContactRelationType = extras2 != null ? extras2.getInt(MedicalIdAddEmergencyContactActivity.KEY_CONTACT_RELATION_TYPE_ID) : 0;
            if (Intrinsics.areEqual(extras2 != null ? Boolean.valueOf(extras2.getBoolean(MedicalIdAddEmergencyContactActivity.KEY_EMERGENCY_CONTACT_ADD_FAIL)) : null, Boolean.TRUE) && (emergencyContactView = this.mEmergencyContactView) != null && (spinner = emergencyContactView.getSpinner()) != null) {
                spinner.setSelection(0);
            }
            Logger.d(this.TAG, "onActivityResult Contact Updated mContactName=" + this.mContactName + " mContactNumber=" + this.mContactNumber + " mContactRelationType=" + this.mContactRelationType);
            refreshEmergencyContactViewIfNeed();
            Logger.d(this.TAG, "onFragmentResult REQ_CODE_EMERGENCY_CONTACT");
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        discardChangesAndGoBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.medicalid.view.Hilt_MedicalIdEditActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMMedicalIdRecord(((MedicalIdViewModel) getMViewModel()).getMedicalIdRecordFromSP());
        initUI();
    }

    public final void setBirthdayView(@NotNull UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView) {
        Intrinsics.checkNotNullParameter(userInfoRightArrowSingleLineTextView, "<set-?>");
        this.birthdayView = userInfoRightArrowSingleLineTextView;
    }

    public final void setBloodSpinner(@NotNull Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.bloodSpinner = spinner;
    }

    public final void setBloodView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.bloodView = view;
    }

    public final void setCroppedAvatarFile(@Nullable File file) {
        this.croppedAvatarFile = file;
    }

    public final void setCroppedFileTimeStamp(long j) {
        this.croppedFileTimeStamp = j;
    }

    public final void setCroppedFileUri(@Nullable Uri uri) {
        this.croppedFileUri = uri;
    }

    public final void setFromCamera(boolean z) {
        this.fromCamera = z;
    }

    public final void setGenderSpinner(@NotNull Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.genderSpinner = spinner;
    }

    public final void setLockScreenShowStatus(int i) {
        this.lockScreenShowStatus = i;
    }

    public final void setLockScreenShowView(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView) {
        Intrinsics.checkNotNullParameter(switchButtonTwoLineTextView, "<set-?>");
        this.lockScreenShowView = switchButtonTwoLineTextView;
    }

    public final void setMAvatarDialog(@Nullable CommonDialog<DialogParams> commonDialog) {
        this.mAvatarDialog = commonDialog;
    }

    public final void setMAvatarFilePath(@Nullable String str) {
        this.mAvatarFilePath = str;
    }

    public final void setMAvatarNameView(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mAvatarNameView = editText;
    }

    public final void setMBirthdayDialog(@Nullable YearMonthDayDialog yearMonthDayDialog) {
        this.mBirthdayDialog = yearMonthDayDialog;
    }

    public final void setMBirthdayItem(@NotNull yo2 yo2Var) {
        Intrinsics.checkNotNullParameter(yo2Var, "<set-?>");
        this.mBirthdayItem = yo2Var;
    }

    public final void setMBirthdayLong(long j) {
        this.mBirthdayLong = j;
    }

    public final void setMBloodType(int i) {
        this.mBloodType = i;
    }

    public final void setMContactName(@Nullable String str) {
        this.mContactName = str;
    }

    public final void setMContactNumber(@Nullable String str) {
        this.mContactNumber = str;
    }

    public final void setMContactRelationDialog(@Nullable CommonDialog<?> commonDialog) {
        this.mContactRelationDialog = commonDialog;
    }

    public final void setMContactRelationType(int i) {
        this.mContactRelationType = i;
    }

    public final void setMDonorSpinner(@NotNull Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.mDonorSpinner = spinner;
    }

    public final void setMDonorType(int i) {
        this.mDonorType = i;
    }

    public final void setMEditDeleteContactDialog(@Nullable CommonDialog<?> commonDialog) {
        this.mEditDeleteContactDialog = commonDialog;
    }

    public final void setMEmergencyContactView(@Nullable EmergencyContactView emergencyContactView) {
        this.mEmergencyContactView = emergencyContactView;
    }

    public final void setMFilledEmergencyContact(@Nullable UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView) {
        this.mFilledEmergencyContact = userInfoRightArrowSingleLineTextView;
    }

    public final void setMGender(int i) {
        this.mGender = i;
    }

    public final void setMIvAvatar(@NotNull RoundImageView roundImageView) {
        Intrinsics.checkNotNullParameter(roundImageView, "<set-?>");
        this.mIvAvatar = roundImageView;
    }

    public final void setMLockScreenShowConfirmationDialog(@Nullable CommonDialog<?> commonDialog) {
        this.mLockScreenShowConfirmationDialog = commonDialog;
    }

    public final void setMMedicalIdRecord(@NotNull MedicalIdRecord medicalIdRecord) {
        Intrinsics.checkNotNullParameter(medicalIdRecord, "<set-?>");
        this.mMedicalIdRecord = medicalIdRecord;
    }

    public final void setMNotSaveRecordDialog(@Nullable CommonDialog<?> commonDialog) {
        this.mNotSaveRecordDialog = commonDialog;
    }

    public final void setMRhType(int i) {
        this.mRhType = i;
    }

    public final void setMUniversalBloodType(int i) {
        this.mUniversalBloodType = i;
    }

    public final void setRhBloodView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.rhBloodView = view;
    }

    public final void setRhSpinner(@NotNull Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.rhSpinner = spinner;
    }

    public final void setUnCroppedFileTimeStamp(long j) {
        this.unCroppedFileTimeStamp = j;
    }

    public final void setUnCroppedFileUri(@Nullable Uri uri) {
        this.unCroppedFileUri = uri;
    }
}
