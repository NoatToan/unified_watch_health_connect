package com.huami.mifit.sportlib.model;

import android.location.Location;
import android.util.Log;
import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.fitness.FitnessActivities;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.core.Geohash;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportDetailSegmentParser;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.mifit.sportlib.utils.RunUtils;
import com.huami.mifit.sportlib.utils.SportDataVerificationKt;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b£\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010%\n\u0002\b\n\b\u0007\u0018\u0000 \u009c\u00032\u00020\u0001:\u0002\u009c\u0003B\u001d\u0012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001\u0012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b\u009a\u0003\u0010\u009b\u0003J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b0\u0004H\u0002J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0004H\u0002J.\u0010\u0013\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J(\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014H\u0002J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0014H\u0002J\b\u0010'\u001a\u00020\u0006H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0014H\u0002JB\u0010/\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u001d2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u00100\u001a\u00020\u0006H\u0002J\b\u00101\u001a\u00020\u0006H\u0002J\b\u00102\u001a\u00020\u0006H\u0002J\b\u00103\u001a\u00020\u0006H\u0002J\b\u00104\u001a\u00020\u0006H\u0002J\u0012\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u00107\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u00108\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u00109\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0002H\u0002J(\u0010<\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010\u00022\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010,\u001a\u00020\tH\u0002J\u0010\u0010>\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0014H\u0002J\u0018\u0010B\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u001dH\u0002J\u0018\u0010D\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u000bH\u0002J\u001a\u0010G\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0011H\u0002J\u001c\u0010J\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010M\u001a\u00020\u00062\b\u0010K\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020?H\u0002J\u001a\u0010P\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010\u00022\u0006\u0010O\u001a\u00020?H\u0002J\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u0010\u0010S\u001a\u00020\u00062\u0006\u0010O\u001a\u00020?H\u0002J \u0010X\u001a\u00020\u00062\u0006\u0010C\u001a\u00020T2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020?H\u0002J(\u0010\\\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020?2\b\u0010Z\u001a\u0004\u0018\u00010\u00022\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J$\u0010_\u001a\u00020\u00062\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\n2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J\b\u0010a\u001a\u00020`H\u0002J,\u0010c\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020?2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\n2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010d\u001a\u00020\u0006H\u0002J:\u0010g\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00140\b2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010e\u001a\u00020\u001d2\u0006\u0010f\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0002J\u001e\u0010i\u001a\u00020\u00062\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010,\u001a\u00020\tH\u0002J\u0006\u0010j\u001a\u00020\u0006J\u0016\u0010m\u001a\u00020?2\u0006\u0010k\u001a\u00020?2\u0006\u0010l\u001a\u00020?J\u0010\u0010o\u001a\u00020\u00062\b\u0010n\u001a\u0004\u0018\u00010\u0002J\u0010\u0010q\u001a\u00020\u00062\b\u0010p\u001a\u0004\u0018\u00010\u0002J\u0010\u0010s\u001a\u00020\u00062\b\u0010r\u001a\u0004\u0018\u00010\u0002J\u0010\u0010u\u001a\u00020\u00062\b\u0010t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010w\u001a\u00020\u00062\b\u0010v\u001a\u0004\u0018\u00010\u0002J\u0010\u0010y\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010\u0002J\u0010\u0010{\u001a\u00020\u00062\b\u0010z\u001a\u0004\u0018\u00010\u0002J\u0010\u0010}\u001a\u00020\u00062\b\u0010|\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u007f\u001a\u00020\u00062\b\u0010~\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0081\u0001\u001a\u00020\u00062\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0083\u0001\u001a\u00020\u00062\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0085\u0001\u001a\u00020\u00062\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0087\u0001\u001a\u00020\u00062\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0089\u0001\u001a\u00020\u00062\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u008b\u0001\u001a\u00020\u00062\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0002R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R)\u0010\u0092\u0001\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u0098\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R)\u0010\u009e\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0099\u0001\u001a\u0006\b\u009f\u0001\u0010\u009b\u0001\"\u0006\b \u0001\u0010\u009d\u0001R2\u0010¢\u0001\u001a\u000b ¡\u0001*\u0004\u0018\u00010?0?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R)\u0010¨\u0001\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010\u0093\u0001\u001a\u0006\b©\u0001\u0010\u0095\u0001\"\u0006\bª\u0001\u0010\u0097\u0001R'\u0010«\u0001\u001a\u000b ¡\u0001*\u0004\u0018\u00010?0?8\u0006@\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010£\u0001\u001a\u0006\b¬\u0001\u0010¥\u0001R\u001e\u0010\u00ad\u0001\u001a\u00020?8\u0006@\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0099\u0001\u001a\u0006\b®\u0001\u0010\u009b\u0001R\u001e\u0010¯\u0001\u001a\u00020\u00148\u0006@\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0099\u0001R)\u0010´\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010\u0099\u0001\u001a\u0006\bµ\u0001\u0010\u009b\u0001\"\u0006\b¶\u0001\u0010\u009d\u0001R\u001e\u0010·\u0001\u001a\u00020?8\u0006@\u0006¢\u0006\u0010\n\u0006\b·\u0001\u0010\u0099\u0001\u001a\u0006\b¸\u0001\u0010\u009b\u0001R\u001e\u0010¹\u0001\u001a\u00020?8\u0006@\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0099\u0001\u001a\u0006\bº\u0001\u0010\u009b\u0001R)\u0010»\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010\u0099\u0001\u001a\u0006\b¼\u0001\u0010\u009b\u0001\"\u0006\b½\u0001\u0010\u009d\u0001R)\u0010¾\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010\u0099\u0001\u001a\u0006\b¿\u0001\u0010\u009b\u0001\"\u0006\bÀ\u0001\u0010\u009d\u0001R)\u0010Á\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010\u0099\u0001\u001a\u0006\bÂ\u0001\u0010\u009b\u0001\"\u0006\bÃ\u0001\u0010\u009d\u0001R)\u0010Ä\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R)\u0010Ê\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Å\u0001\u001a\u0006\bË\u0001\u0010Ç\u0001\"\u0006\bÌ\u0001\u0010É\u0001R)\u0010Í\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Å\u0001\u001a\u0006\bÎ\u0001\u0010Ç\u0001\"\u0006\bÏ\u0001\u0010É\u0001R)\u0010Ð\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Å\u0001\u001a\u0006\bÑ\u0001\u0010Ç\u0001\"\u0006\bÒ\u0001\u0010É\u0001R)\u0010Ó\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Å\u0001\u001a\u0006\bÔ\u0001\u0010Ç\u0001\"\u0006\bÕ\u0001\u0010É\u0001R)\u0010Ö\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÖ\u0001\u0010Å\u0001\u001a\u0006\b×\u0001\u0010Ç\u0001\"\u0006\bØ\u0001\u0010É\u0001R)\u0010Ù\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Å\u0001\u001a\u0006\bÚ\u0001\u0010Ç\u0001\"\u0006\bÛ\u0001\u0010É\u0001R)\u0010Ü\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Å\u0001\u001a\u0006\bÝ\u0001\u0010Ç\u0001\"\u0006\bÞ\u0001\u0010É\u0001R)\u0010ß\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010Å\u0001\u001a\u0006\bà\u0001\u0010Ç\u0001\"\u0006\bá\u0001\u0010É\u0001R)\u0010â\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bâ\u0001\u0010Å\u0001\u001a\u0006\bã\u0001\u0010Ç\u0001\"\u0006\bä\u0001\u0010É\u0001R)\u0010å\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bå\u0001\u0010Å\u0001\u001a\u0006\bæ\u0001\u0010Ç\u0001\"\u0006\bç\u0001\u0010É\u0001R)\u0010è\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bè\u0001\u0010Å\u0001\u001a\u0006\bé\u0001\u0010Ç\u0001\"\u0006\bê\u0001\u0010É\u0001R)\u0010ë\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bë\u0001\u0010Å\u0001\u001a\u0006\bì\u0001\u0010Ç\u0001\"\u0006\bí\u0001\u0010É\u0001R)\u0010î\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bî\u0001\u0010Å\u0001\u001a\u0006\bï\u0001\u0010Ç\u0001\"\u0006\bð\u0001\u0010É\u0001R)\u0010ñ\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bñ\u0001\u0010Å\u0001\u001a\u0006\bò\u0001\u0010Ç\u0001\"\u0006\bó\u0001\u0010É\u0001R)\u0010ô\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010Å\u0001\u001a\u0006\bõ\u0001\u0010Ç\u0001\"\u0006\bö\u0001\u0010É\u0001R)\u0010÷\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b÷\u0001\u0010Å\u0001\u001a\u0006\bø\u0001\u0010Ç\u0001\"\u0006\bù\u0001\u0010É\u0001R)\u0010ú\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bú\u0001\u0010Å\u0001\u001a\u0006\bû\u0001\u0010Ç\u0001\"\u0006\bü\u0001\u0010É\u0001R/\u0010ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R/\u0010\u0083\u0002\u001a\b\u0012\u0004\u0012\u00020?0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010þ\u0001\u001a\u0006\b\u0084\u0002\u0010\u0080\u0002\"\u0006\b\u0085\u0002\u0010\u0082\u0002R/\u0010\u0086\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0002\u0010þ\u0001\u001a\u0006\b\u0087\u0002\u0010\u0080\u0002\"\u0006\b\u0088\u0002\u0010\u0082\u0002R/\u0010\u0089\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010þ\u0001\u001a\u0006\b\u008a\u0002\u0010\u0080\u0002\"\u0006\b\u008b\u0002\u0010\u0082\u0002R/\u0010\u008c\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010þ\u0001\u001a\u0006\b\u008d\u0002\u0010\u0080\u0002\"\u0006\b\u008e\u0002\u0010\u0082\u0002R/\u0010\u008f\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010þ\u0001\u001a\u0006\b\u0090\u0002\u0010\u0080\u0002\"\u0006\b\u0091\u0002\u0010\u0082\u0002R/\u0010\u0092\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010þ\u0001\u001a\u0006\b\u0093\u0002\u0010\u0080\u0002\"\u0006\b\u0094\u0002\u0010\u0082\u0002R/\u0010\u0095\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010þ\u0001\u001a\u0006\b\u0096\u0002\u0010\u0080\u0002\"\u0006\b\u0097\u0002\u0010\u0082\u0002R/\u0010\u0098\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0002\u0010þ\u0001\u001a\u0006\b\u0099\u0002\u0010\u0080\u0002\"\u0006\b\u009a\u0002\u0010\u0082\u0002R/\u0010\u009b\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010þ\u0001\u001a\u0006\b\u009c\u0002\u0010\u0080\u0002\"\u0006\b\u009d\u0002\u0010\u0082\u0002R/\u0010\u009e\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0002\u0010þ\u0001\u001a\u0006\b\u009f\u0002\u0010\u0080\u0002\"\u0006\b \u0002\u0010\u0082\u0002R/\u0010¡\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¡\u0002\u0010þ\u0001\u001a\u0006\b¢\u0002\u0010\u0080\u0002\"\u0006\b£\u0002\u0010\u0082\u0002R/\u0010¤\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0002\u0010þ\u0001\u001a\u0006\b¥\u0002\u0010\u0080\u0002\"\u0006\b¦\u0002\u0010\u0082\u0002R/\u0010§\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0002\u0010þ\u0001\u001a\u0006\b¨\u0002\u0010\u0080\u0002\"\u0006\b©\u0002\u0010\u0082\u0002R/\u0010ª\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0002\u0010þ\u0001\u001a\u0006\b«\u0002\u0010\u0080\u0002\"\u0006\b¬\u0002\u0010\u0082\u0002R/\u0010\u00ad\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010þ\u0001\u001a\u0006\b®\u0002\u0010\u0080\u0002\"\u0006\b¯\u0002\u0010\u0082\u0002R/\u0010°\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0002\u0010þ\u0001\u001a\u0006\b±\u0002\u0010\u0080\u0002\"\u0006\b²\u0002\u0010\u0082\u0002R0\u0010´\u0002\u001a\t\u0012\u0005\u0012\u00030³\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0002\u0010þ\u0001\u001a\u0006\bµ\u0002\u0010\u0080\u0002\"\u0006\b¶\u0002\u0010\u0082\u0002R0\u0010·\u0002\u001a\t\u0012\u0005\u0012\u00030³\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b·\u0002\u0010þ\u0001\u001a\u0006\b¸\u0002\u0010\u0080\u0002\"\u0006\b¹\u0002\u0010\u0082\u0002R0\u0010»\u0002\u001a\t\u0012\u0005\u0012\u00030º\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b»\u0002\u0010þ\u0001\u001a\u0006\b¼\u0002\u0010\u0080\u0002\"\u0006\b½\u0002\u0010\u0082\u0002R/\u0010¾\u0002\u001a\b\u0012\u0004\u0012\u00020U0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¾\u0002\u0010þ\u0001\u001a\u0006\b¿\u0002\u0010\u0080\u0002\"\u0006\bÀ\u0002\u0010\u0082\u0002R%\u0010Â\u0002\u001a\t\u0012\u0005\u0012\u00030Á\u00020\n8\u0006@\u0006¢\u0006\u0010\n\u0006\bÂ\u0002\u0010þ\u0001\u001a\u0006\bÃ\u0002\u0010\u0080\u0002R/\u0010Ä\u0002\u001a\b\u0012\u0004\u0012\u00020]0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0002\u0010þ\u0001\u001a\u0006\bÅ\u0002\u0010\u0080\u0002\"\u0006\bÆ\u0002\u0010\u0082\u0002R/\u0010Ç\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÇ\u0002\u0010þ\u0001\u001a\u0006\bÈ\u0002\u0010\u0080\u0002\"\u0006\bÉ\u0002\u0010\u0082\u0002R/\u0010Ê\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÊ\u0002\u0010þ\u0001\u001a\u0006\bË\u0002\u0010\u0080\u0002\"\u0006\bÌ\u0002\u0010\u0082\u0002R/\u0010Í\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÍ\u0002\u0010þ\u0001\u001a\u0006\bÎ\u0002\u0010\u0080\u0002\"\u0006\bÏ\u0002\u0010\u0082\u0002R/\u0010Ð\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0002\u0010þ\u0001\u001a\u0006\bÑ\u0002\u0010\u0080\u0002\"\u0006\bÒ\u0002\u0010\u0082\u0002R/\u0010Ó\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÓ\u0002\u0010þ\u0001\u001a\u0006\bÔ\u0002\u0010\u0080\u0002\"\u0006\bÕ\u0002\u0010\u0082\u0002R2\u0010×\u0002\u001a\u000b\u0012\u0005\u0012\u00030Ö\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b×\u0002\u0010þ\u0001\u001a\u0006\bØ\u0002\u0010\u0080\u0002\"\u0006\bÙ\u0002\u0010\u0082\u0002R2\u0010Ú\u0002\u001a\u000b\u0012\u0005\u0012\u00030Ö\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÚ\u0002\u0010þ\u0001\u001a\u0006\bÛ\u0002\u0010\u0080\u0002\"\u0006\bÜ\u0002\u0010\u0082\u0002R2\u0010Ý\u0002\u001a\u000b\u0012\u0005\u0012\u00030Ö\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÝ\u0002\u0010þ\u0001\u001a\u0006\bÞ\u0002\u0010\u0080\u0002\"\u0006\bß\u0002\u0010\u0082\u0002R2\u0010à\u0002\u001a\u000b\u0012\u0005\u0012\u00030Ö\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bà\u0002\u0010þ\u0001\u001a\u0006\bá\u0002\u0010\u0080\u0002\"\u0006\bâ\u0002\u0010\u0082\u0002R2\u0010ã\u0002\u001a\u000b\u0012\u0005\u0012\u00030Ö\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bã\u0002\u0010þ\u0001\u001a\u0006\bä\u0002\u0010\u0080\u0002\"\u0006\bå\u0002\u0010\u0082\u0002R2\u0010æ\u0002\u001a\u000b\u0012\u0005\u0012\u00030Ö\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bæ\u0002\u0010þ\u0001\u001a\u0006\bç\u0002\u0010\u0080\u0002\"\u0006\bè\u0002\u0010\u0082\u0002R2\u0010é\u0002\u001a\u000b\u0012\u0005\u0012\u00030Ö\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0002\u0010þ\u0001\u001a\u0006\bê\u0002\u0010\u0080\u0002\"\u0006\bë\u0002\u0010\u0082\u0002R/\u0010ì\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bì\u0002\u0010þ\u0001\u001a\u0006\bí\u0002\u0010\u0080\u0002\"\u0006\bî\u0002\u0010\u0082\u0002R/\u0010ï\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bï\u0002\u0010þ\u0001\u001a\u0006\bð\u0002\u0010\u0080\u0002\"\u0006\bñ\u0002\u0010\u0082\u0002R/\u0010ò\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bò\u0002\u0010þ\u0001\u001a\u0006\bó\u0002\u0010\u0080\u0002\"\u0006\bô\u0002\u0010\u0082\u0002R/\u0010õ\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bõ\u0002\u0010þ\u0001\u001a\u0006\bö\u0002\u0010\u0080\u0002\"\u0006\b÷\u0002\u0010\u0082\u0002R/\u0010ø\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bø\u0002\u0010þ\u0001\u001a\u0006\bù\u0002\u0010\u0080\u0002\"\u0006\bú\u0002\u0010\u0082\u0002R/\u0010û\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bû\u0002\u0010þ\u0001\u001a\u0006\bü\u0002\u0010\u0080\u0002\"\u0006\bý\u0002\u0010\u0082\u0002R/\u0010þ\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bþ\u0002\u0010þ\u0001\u001a\u0006\bÿ\u0002\u0010\u0080\u0002\"\u0006\b\u0080\u0003\u0010\u0082\u0002R/\u0010\u0081\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0003\u0010þ\u0001\u001a\u0006\b\u0082\u0003\u0010\u0080\u0002\"\u0006\b\u0083\u0003\u0010\u0082\u0002R/\u0010\u0084\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0003\u0010þ\u0001\u001a\u0006\b\u0085\u0003\u0010\u0080\u0002\"\u0006\b\u0086\u0003\u0010\u0082\u0002R/\u0010\u0087\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0003\u0010þ\u0001\u001a\u0006\b\u0088\u0003\u0010\u0080\u0002\"\u0006\b\u0089\u0003\u0010\u0082\u0002R/\u0010\u008a\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0003\u0010þ\u0001\u001a\u0006\b\u008b\u0003\u0010\u0080\u0002\"\u0006\b\u008c\u0003\u0010\u0082\u0002R/\u0010\u008d\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008d\u0003\u0010þ\u0001\u001a\u0006\b\u008e\u0003\u0010\u0080\u0002\"\u0006\b\u008f\u0003\u0010\u0082\u0002R/\u0010\u0090\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0003\u0010þ\u0001\u001a\u0006\b\u0091\u0003\u0010\u0080\u0002\"\u0006\b\u0092\u0003\u0010\u0082\u0002R<\u0010\u0094\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0093\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0003\u0010\u0095\u0003\u001a\u0006\b\u0096\u0003\u0010\u0097\u0003\"\u0006\b\u0098\u0003\u0010\u0099\u0003¨\u0006\u009d\u0003"}, d2 = {"Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "", "", "str", "", "formatBulkStrAsList", "", "parseFlagList", "Lkotlin/Pair;", "Lcom/huami/mifit/sportlib/model/PeakIndexTimeValue;", "", "Lcom/huami/mifit/sportlib/model/CommonTimeValuePoint;", "packagePeakAndRawList", "packageAlignedList", "bulkPace", "bulkAlti", "bulkTime", "", "emptyBulkSpeed", "parsePaceAndAltitudeAndTimeList", "", "pace", "formatPace", "Lcom/huami/mifit/sportlib/model/ChartDataType;", "chartDataType", "prev", "now", "next", "checkIsSpecialPoint", "", "currentTime", "currentAlti", "fillAltitudeListAndPeak", "currentPace", "fillPaceAlignPointList", "fillPaceListAndPeak", "fillPaceListNoPeak", "currentSpeed", "fillSpeedListAndPeak", "checkIsSpeedAndPaceNull", "speed", "speed2Pace", "dataList", "specialList", "peak", "trackId", "strList", "parseDeltaTimeAndDeltaValue", "samplingPressureList", "initGolfBeatList", "initGolfDownTimeList", "initGolfUpTimeList", "initGolfAngleList", FitnessActivities.GOLF, "parseGolfBeatList", "parseGolfAngleList", "parseGolfUpTimeList", "parseGolfDowntimeList", "bulkTimeValue", "list", "parseCommonTimeDeltaAndValueList", "value", "isValidSingleValue", "", "delta", "prevTime", "tryReviseTime", "point", "fillPeakValue", "daily", TdmillHmFragment.ARG_IS_METRIC, "parseDailyPerformanceList", "kiloStr", "mileStr", "parseKmAndMileMarkedList", "markedStr", "type", "parseMarkedList", "distanceStr", "missType", "getKmOrMileMarkedByOtherRawData", "disStrList", "genDistanceList", "genKmOrMileMarkedByPointLocation", "Lcom/huami/mifit/sportlib/model/GPSPoint;", "Lcom/huami/mifit/sportlib/model/PointTrackLocation;", "location", "index", "updateGpsPointFromLocation", "heartZoneType", "hrZones", "originHeartList", "parseHeartRateZoneList", "Lcom/huami/mifit/sportlib/model/HeartRateZone;", "heartZoneList", "setHrZoneListUseVersion1", "", "calculateHrRangeArray", "arrHeartRange", "setHrZoneListUseVersion2", "alignAllDataByTime", "time", "startIndex", "findIndexAndValueByTime", "alignedList", "insertSpecialAndPeakValues2AlignedList", "processAllRawDatas", "offsetTime", "costtime", "calculateAvgHeartRate", "bulkSpeed", "parseExactSpeedAndPaceList", "bulkHr", "parseHeartList", "bulkSpo2", "parseSpo2List", "bulkTemp", "parseTemperatureList", "bulkPressure", "parsePressureList", "bulkGps", "parsePointLocationList", "bulkGait", "parseStepGaitList", "bulkStroke", "parseStrokeSpeedOrRateList", "bulkCadence", "parseCadenceList", "bulkRopeSkip", "parseRopeSkipList", "bulkTimeDeltaAltitude", "parseTimeDeltaAltitudeList", "golfSwing", "parseGolfSwingRtList", "power", "parsePowerMeterList", "coachSegment", "setCoachSegmentList", "pauseStr", "genPauseList", "Lcom/huami/mifit/sportlib/model/SportRecord;", "trackRecord", "Lcom/huami/mifit/sportlib/model/SportRecord;", "Lcom/huami/mifit/sportlib/model/SportDetailData;", "sportDetailData", "Lcom/huami/mifit/sportlib/model/SportDetailData;", "id", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "size", LogUtil.I, "getSize", "()I", "setSize", "(I)V", "source", "getSource", "setSource", "kotlin.jvm.PlatformType", "sportType", "Ljava/lang/Integer;", "getSportType", "()Ljava/lang/Integer;", "setSportType", "(Ljava/lang/Integer;)V", "currentTrackId", "getCurrentTrackId", "setCurrentTrackId", "totalCostTime", "getTotalCostTime", "totalDistance", "getTotalDistance", Constants.DATA_KEY_AVG_PACE, "F", "getAvgPace", "()F", "totalPauseTime", "detailVersion", "getDetailVersion", "setDetailVersion", "provider", "getProvider", "halfStartTime", "getHalfStartTime", "averageAltitude", "getAverageAltitude", "setAverageAltitude", "samplingInterval", "getSamplingInterval", "setSamplingInterval", "segmentTag", "getSegmentTag", "setSegmentTag", "speedPeak", "Lcom/huami/mifit/sportlib/model/PeakIndexTimeValue;", "getSpeedPeak", "()Lcom/huami/mifit/sportlib/model/PeakIndexTimeValue;", "setSpeedPeak", "(Lcom/huami/mifit/sportlib/model/PeakIndexTimeValue;)V", "pacePeak", "getPacePeak", "setPacePeak", "altiPeak", "getAltiPeak", "setAltiPeak", "heartPeak", "getHeartPeak", "setHeartPeak", "spo2Peak", "getSpo2Peak", "setSpo2Peak", "stepStridePeak", "getStepStridePeak", "setStepStridePeak", "stepFreqPeak", "getStepFreqPeak", "setStepFreqPeak", "strokePeak", "getStrokePeak", "setStrokePeak", "cadencePeak", "getCadencePeak", "setCadencePeak", "ropeSkipPeak", "getRopeSkipPeak", "setRopeSkipPeak", "timeDeltaAltiPeak", "getTimeDeltaAltiPeak", "setTimeDeltaAltiPeak", "temperaturePeak", "getTemperaturePeak", "setTemperaturePeak", "pressurePeak", "getPressurePeak", "setPressurePeak", "golfBeatPeak", "getGolfBeatPeak", "setGolfBeatPeak", "golfAnglePeak", "getGolfAnglePeak", "setGolfAnglePeak", "golfUpTimePeak", "getGolfUpTimePeak", "setGolfUpTimePeak", "golfDownTimePeak", "getGolfDownTimePeak", "setGolfDownTimePeak", "powerMeterPeak", "getPowerMeterPeak", "setPowerMeterPeak", "timeList", "Ljava/util/List;", "getTimeList", "()Ljava/util/List;", "setTimeList", "(Ljava/util/List;)V", "flagList", "getFlagList", "setFlagList", "paceAlignPointList", "getPaceAlignPointList", "setPaceAlignPointList", "paceList", "getPaceList", "setPaceList", "altiList", "getAltiList", "setAltiList", "speedList", "getSpeedList", "setSpeedList", "heartList", "getHeartList", "setHeartList", "spo2List", "getSpo2List", "setSpo2List", "stepStrideList", "getStepStrideList", "setStepStrideList", "stepFreqList", "getStepFreqList", "setStepFreqList", "strokeList", "getStrokeList", "setStrokeList", "cadenceList", "getCadenceList", "setCadenceList", "ropeSkipList", "getRopeSkipList", "setRopeSkipList", "temperatureList", "getTemperatureList", "setTemperatureList", "pressureList", "getPressureList", "setPressureList", "dailyPerformanceList", "getDailyPerformanceList", "setDailyPerformanceList", "timeDeltaAltitudeList", "getTimeDeltaAltitudeList", "setTimeDeltaAltitudeList", "Lcom/huami/mifit/sportlib/model/KilometreOrMileMarked;", "kmMarkedList", "getKmMarkedList", "setKmMarkedList", "mileMarkedList", "getMileMarkedList", "setMileMarkedList", "Lcom/huami/mifit/sportlib/model/CoachSegment;", "coachList", "getCoachList", "setCoachList", "pointLocationList", "getPointLocationList", "setPointLocationList", "Lcom/huami/mifit/sportlib/model/PauseModel;", "pauseModelList", "getPauseModelList", "hrZoneList", "getHrZoneList", "setHrZoneList", "golfBeatList", "getGolfBeatList", "setGolfBeatList", "golfAngleList", "getGolfAngleList", "setGolfAngleList", "golfUpTimeList", "getGolfUpTimeList", "setGolfUpTimeList", "golfDownTimeList", "getGolfDownTimeList", "setGolfDownTimeList", "powerMeterList", "getPowerMeterList", "setPowerMeterList", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "autoSegmentDataList", "getAutoSegmentDataList", "setAutoSegmentDataList", "manualSegmentDataList", "getManualSegmentDataList", "setManualSegmentDataList", "intervalSegmentDataList", "getIntervalSegmentDataList", "setIntervalSegmentDataList", "skiingSegmentDataList", "getSkiingSegmentDataList", "setSkiingSegmentDataList", "ropeSkippingSegmentDataList", "getRopeSkippingSegmentDataList", "setRopeSkippingSegmentDataList", "fuseSegmentDataList", "getFuseSegmentDataList", "setFuseSegmentDataList", "trainSegmentDataList", "getTrainSegmentDataList", "setTrainSegmentDataList", "alignedPaceList", "getAlignedPaceList", "setAlignedPaceList", "alignedAltiList", "getAlignedAltiList", "setAlignedAltiList", "alignedSpeedList", "getAlignedSpeedList", "setAlignedSpeedList", "alignedHeartList", "getAlignedHeartList", "setAlignedHeartList", "alignedStepStrideList", "getAlignedStepStrideList", "setAlignedStepStrideList", "alignedStepFreqList", "getAlignedStepFreqList", "setAlignedStepFreqList", "alignedStrokeList", "getAlignedStrokeList", "setAlignedStrokeList", "alignedCadenceList", "getAlignedCadenceList", "setAlignedCadenceList", "alignedRopeSkipList", "getAlignedRopeSkipList", "setAlignedRopeSkipList", "alignedPowerMeterList", "getAlignedPowerMeterList", "setAlignedPowerMeterList", "alignedTemperatureList", "getAlignedTemperatureList", "setAlignedTemperatureList", "alignedPressureList", "getAlignedPressureList", "setAlignedPressureList", "alignedTimeDeltaAltitudeList", "getAlignedTimeDeltaAltitudeList", "setAlignedTimeDeltaAltitudeList", "", "specialPoints", "Ljava/util/Map;", "getSpecialPoints", "()Ljava/util/Map;", "setSpecialPoints", "(Ljava/util/Map;)V", "<init>", "(Lcom/huami/mifit/sportlib/model/SportRecord;Lcom/huami/mifit/sportlib/model/SportDetailData;)V", "Companion", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final class ParsedSportDetailData {
    private static final int CHART_POINT_MAX_SIZE = 240;

    @NotNull
    private static final String COLON = ";";

    @NotNull
    private static final String COMMA = ",";
    private static final float INVALID_VALUE = -1.0E7f;
    public static final int SEARCH_TIME_DELTA_15 = 15;
    public static final int SEARCH_TIME_DELTA_3 = 3;

    @NotNull
    private static final String SPECIAL_GPS_STATE_FLAG_MARK = "131";
    private static final int SPLIT_1 = 1;
    private static final int SPLIT_2 = 2;

    @NotNull
    private static final String TAG = "ParsedSportDetailData";
    private static final int TYPE_MARKED_KILO = 0;
    private static final int TYPE_MARKED_MILE = 1;

    @NotNull
    private List<CommonTimeValuePoint> alignedAltiList;

    @NotNull
    private List<CommonTimeValuePoint> alignedCadenceList;

    @NotNull
    private List<CommonTimeValuePoint> alignedHeartList;

    @NotNull
    private List<CommonTimeValuePoint> alignedPaceList;

    @NotNull
    private List<CommonTimeValuePoint> alignedPowerMeterList;

    @NotNull
    private List<CommonTimeValuePoint> alignedPressureList;

    @NotNull
    private List<CommonTimeValuePoint> alignedRopeSkipList;

    @NotNull
    private List<CommonTimeValuePoint> alignedSpeedList;

    @NotNull
    private List<CommonTimeValuePoint> alignedStepFreqList;

    @NotNull
    private List<CommonTimeValuePoint> alignedStepStrideList;

    @NotNull
    private List<CommonTimeValuePoint> alignedStrokeList;

    @NotNull
    private List<CommonTimeValuePoint> alignedTemperatureList;

    @NotNull
    private List<CommonTimeValuePoint> alignedTimeDeltaAltitudeList;
    public List<CommonTimeValuePoint> altiList;
    public PeakIndexTimeValue altiPeak;

    @Nullable
    private List<SportSegmentData> autoSegmentDataList;
    private int averageAltitude;
    private final float avgPace;
    public List<CommonTimeValuePoint> cadenceList;
    public PeakIndexTimeValue cadencePeak;
    public List<CoachSegment> coachList;
    private long currentTrackId;
    public List<CommonTimeValuePoint> dailyPerformanceList;
    private int detailVersion;
    public List<Integer> flagList;

    @Nullable
    private List<SportSegmentData> fuseSegmentDataList;
    public List<CommonTimeValuePoint> golfAngleList;
    public PeakIndexTimeValue golfAnglePeak;
    public List<CommonTimeValuePoint> golfBeatList;
    public PeakIndexTimeValue golfBeatPeak;
    public List<CommonTimeValuePoint> golfDownTimeList;
    public PeakIndexTimeValue golfDownTimePeak;
    public List<CommonTimeValuePoint> golfUpTimeList;
    public PeakIndexTimeValue golfUpTimePeak;
    private final int halfStartTime;
    public List<CommonTimeValuePoint> heartList;
    public PeakIndexTimeValue heartPeak;
    public List<HeartRateZone> hrZoneList;
    private long id;

    @Nullable
    private List<SportSegmentData> intervalSegmentDataList;
    public List<KilometreOrMileMarked> kmMarkedList;

    @Nullable
    private List<SportSegmentData> manualSegmentDataList;
    public List<KilometreOrMileMarked> mileMarkedList;
    public List<CommonTimeValuePoint> paceAlignPointList;
    public List<CommonTimeValuePoint> paceList;
    public PeakIndexTimeValue pacePeak;

    @NotNull
    private final List<PauseModel> pauseModelList;
    public List<PointTrackLocation> pointLocationList;
    public List<CommonTimeValuePoint> powerMeterList;
    public PeakIndexTimeValue powerMeterPeak;
    public List<CommonTimeValuePoint> pressureList;
    public PeakIndexTimeValue pressurePeak;
    private final int provider;
    public List<CommonTimeValuePoint> ropeSkipList;
    public PeakIndexTimeValue ropeSkipPeak;

    @Nullable
    private List<SportSegmentData> ropeSkippingSegmentDataList;
    private int samplingInterval;
    private int segmentTag;
    private int size;

    @Nullable
    private List<SportSegmentData> skiingSegmentDataList;
    private int source;

    @NotNull
    private Map<ChartDataType, List<CommonTimeValuePoint>> specialPoints;
    public List<CommonTimeValuePoint> speedList;
    public PeakIndexTimeValue speedPeak;
    public List<CommonTimeValuePoint> spo2List;
    public PeakIndexTimeValue spo2Peak;

    @NotNull
    private final SportDetailData sportDetailData;
    private Integer sportType;
    public List<CommonTimeValuePoint> stepFreqList;
    public PeakIndexTimeValue stepFreqPeak;
    public List<CommonTimeValuePoint> stepStrideList;
    public PeakIndexTimeValue stepStridePeak;
    public List<CommonTimeValuePoint> strokeList;
    public PeakIndexTimeValue strokePeak;
    public List<CommonTimeValuePoint> temperatureList;
    public PeakIndexTimeValue temperaturePeak;
    public PeakIndexTimeValue timeDeltaAltiPeak;
    public List<CommonTimeValuePoint> timeDeltaAltitudeList;
    public List<Long> timeList;
    private final Integer totalCostTime;
    private final int totalDistance;
    private int totalPauseTime;

    @NotNull
    private final SportRecord trackRecord;

    @Nullable
    private List<SportSegmentData> trainSegmentDataList;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartDataType.values().length];
            iArr[ChartDataType.ALTI_CHART_TYPE.ordinal()] = 1;
            iArr[ChartDataType.PACE_CHART_TYPE.ordinal()] = 2;
            iArr[ChartDataType.SPEED_CHART_TYPE.ordinal()] = 3;
            iArr[ChartDataType.STEP_STRIDE_CHART_TYPE.ordinal()] = 4;
            iArr[ChartDataType.STEP_FREQ_CHART_TYPE.ordinal()] = 5;
            iArr[ChartDataType.HR_CHART_TYPE.ordinal()] = 6;
            iArr[ChartDataType.SPO2_CHART_TYPE.ordinal()] = 7;
            iArr[ChartDataType.STROKE_CHART_TYPE.ordinal()] = 8;
            iArr[ChartDataType.CADENCE_CHART_TYPE.ordinal()] = 9;
            iArr[ChartDataType.ROPE_SKIP_CHART_TYPE.ordinal()] = 10;
            iArr[ChartDataType.TEMPERATURE_CHART_TYPE.ordinal()] = 11;
            iArr[ChartDataType.PRESUURE_CHART_TYPE.ordinal()] = 12;
            iArr[ChartDataType.TIME_DELTA_ALTI_CHART_TYPE.ordinal()] = 13;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ParsedSportDetailData(@NotNull SportRecord sportRecord, @NotNull SportDetailData sportDetailData) {
        this.trackRecord = sportRecord;
        this.sportDetailData = sportDetailData;
        this.source = sportRecord.getSource().intValue();
        this.sportType = sportRecord.getType();
        this.currentTrackId = sportRecord.getTrackid().longValue();
        this.totalCostTime = sportRecord.getCosttime();
        Integer distance = sportRecord.getDistance();
        this.totalDistance = distance == null ? 0 : distance.intValue();
        Float pace = sportRecord.getPace();
        this.avgPace = pace == null ? 0.0f : pace.floatValue();
        Integer v = sportDetailData.getV();
        this.detailVersion = v == null ? 12 : v.intValue();
        Integer provider = sportDetailData.getProvider();
        this.provider = provider == null ? 1 : provider.intValue();
        Integer halfStartTime = sportRecord.getHalfStartTime();
        this.halfStartTime = halfStartTime != null ? halfStartTime.intValue() : 0;
        this.averageAltitude = -1000000;
        Integer segment = sportDetailData.getSegment();
        this.segmentTag = segment != null ? segment.intValue() : 1;
        this.pauseModelList = new ArrayList();
        this.alignedPaceList = new ArrayList();
        this.alignedAltiList = new ArrayList();
        this.alignedSpeedList = new ArrayList();
        this.alignedHeartList = new ArrayList();
        this.alignedStepStrideList = new ArrayList();
        this.alignedStepFreqList = new ArrayList();
        this.alignedStrokeList = new ArrayList();
        this.alignedCadenceList = new ArrayList();
        this.alignedRopeSkipList = new ArrayList();
        this.alignedPowerMeterList = new ArrayList();
        this.alignedTemperatureList = new ArrayList();
        this.alignedPressureList = new ArrayList();
        this.alignedTimeDeltaAltitudeList = new ArrayList();
        this.specialPoints = new LinkedHashMap();
    }

    private final void alignAllDataByTime() {
        long jIntValue = this.trackRecord.getCosttime().intValue();
        int i = 240;
        long j = 240;
        long j2 = (jIntValue / j) + 1;
        if (j2 > 1 && jIntValue % j <= 120) {
            j2--;
        }
        this.samplingInterval = (int) j2;
        ArrayList arrayList = new ArrayList();
        long j3 = this.currentTrackId;
        LongRange longRange = new LongRange(j3, jIntValue + j3);
        long first = longRange.getFirst();
        long last = longRange.getLast();
        if (j2 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + j2 + ".");
        }
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(first, last, j2);
        if (first <= progressionLastElement) {
            while (true) {
                long j4 = first + j2;
                arrayList.add(Long.valueOf(first));
                if (first == progressionLastElement) {
                    break;
                } else {
                    first = j4;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<Pair<PeakIndexTimeValue, List<CommonTimeValuePoint>>> listPackagePeakAndRawList = packagePeakAndRawList();
        List<List<CommonTimeValuePoint>> listPackageAlignedList = packageAlignedList();
        int size = listPackagePeakAndRawList.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int i3 = 0;
            do {
                i3++;
                arrayList2.add(0);
            } while (i3 <= size);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            int i4 = 0;
            for (Object obj : listPackagePeakAndRawList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                if (!((List) pair.getSecond()).isEmpty()) {
                    if (((List) pair.getSecond()).size() > i) {
                        int i6 = i4;
                        Pair<Integer, Float> pairFindIndexAndValueByTime = findIndexAndValueByTime((List) pair.getSecond(), jLongValue, ((Number) arrayList2.get(i4)).intValue(), ((PeakIndexTimeValue) pair.getFirst()).getDataType() == ChartDataType.HR_CHART_TYPE ? 15 : 3);
                        arrayList2.set(i6, Integer.valueOf(((Number) (pairFindIndexAndValueByTime.getFirst().intValue() > 0 ? pairFindIndexAndValueByTime.getFirst() : arrayList2.get(i6))).intValue()));
                        listPackageAlignedList.get(i6).add(new CommonTimeValuePoint(jLongValue, pairFindIndexAndValueByTime.getSecond().floatValue()));
                    } else if (!listPackageAlignedList.get(i4).containsAll((Collection) pair.getSecond())) {
                        listPackageAlignedList.get(i4).addAll((Collection) pair.getSecond());
                    }
                }
                i4 = i5;
                i = 240;
            }
        }
        for (Object obj2 : listPackagePeakAndRawList) {
            int i7 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Pair pair2 = (Pair) obj2;
            if (!listPackageAlignedList.get(i2).isEmpty()) {
                insertSpecialAndPeakValues2AlignedList(listPackageAlignedList.get(i2), (PeakIndexTimeValue) pair2.getFirst());
            }
            i2 = i7;
        }
    }

    private final float[] calculateHrRangeArray() {
        float[] fArr = new float[6];
        fArr[0] = 40.0f;
        float[] fArr2 = HeartRateConstant.rangeArray;
        if (fArr2 == null || fArr2.length != 5 || ArraysKt___ArraysKt.last(fArr2) <= 0.0f) {
            int age = 220 - RunnerData.getRunner().getAge();
            int i = 1;
            while (true) {
                int i2 = i + 1;
                fArr[i] = RunUtils.scaleFloat(age * ((i + 4) / 10.0f), 1);
                if (i2 >= 6) {
                    break;
                }
                i = i2;
            }
        } else {
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                fArr[i3] = RunUtils.scaleFloat(fArr2[i3 - 1], 1);
                if (i4 >= 6) {
                    break;
                }
                i3 = i4;
            }
        }
        return fArr;
    }

    private final boolean checkIsSpecialPoint(ChartDataType chartDataType, float prev, float now, float next) {
        Number numberValueOf = 5;
        switch (WhenMappings.$EnumSwitchMapping$0[chartDataType.ordinal()]) {
            case 1:
            case 13:
                numberValueOf = 100;
                break;
            case 2:
                numberValueOf = Float.valueOf(0.05f);
                break;
            case 3:
                numberValueOf = Float.valueOf(0.3f);
                break;
            case 4:
            case 7:
                break;
            case 5:
            case 9:
            case 10:
                numberValueOf = 10;
                break;
            case 6:
                numberValueOf = 3;
                break;
            case 8:
                numberValueOf = Float.valueOf(0.08f);
                break;
            case 11:
                numberValueOf = Float.valueOf(0.2f);
                break;
            case 12:
                numberValueOf = 2;
                break;
            default:
                numberValueOf = 0;
                break;
        }
        float f = now - prev;
        float f2 = now - next;
        if (f * f2 < 0.0f) {
            return false;
        }
        if (!(now == prev) || Math.abs(f2) < numberValueOf.floatValue()) {
            if ((!(now == next) || Math.abs(f) < numberValueOf.floatValue()) && (Math.abs(f) < numberValueOf.floatValue() || Math.abs(f2) < numberValueOf.floatValue())) {
                return false;
            }
        }
        return true;
    }

    private final void checkIsSpeedAndPaceNull() {
        List<CommonTimeValuePoint> speedList = getSpeedList();
        if (speedList == null || speedList.isEmpty()) {
            setSpeedPeak(new PeakIndexTimeValue(ChartDataType.SPEED_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
            setSpeedList(new ArrayList());
        }
        List<CommonTimeValuePoint> paceList = getPaceList();
        if (paceList == null || paceList.isEmpty()) {
            setPacePeak(new PeakIndexTimeValue(ChartDataType.PACE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
            setPaceList(new ArrayList());
        }
    }

    private final void fillAltitudeListAndPeak(long currentTime, float currentAlti) {
        CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(currentTime, currentAlti);
        getAltiList().add(commonTimeValuePoint);
        fillPeakValue(getAltiPeak(), commonTimeValuePoint);
    }

    private final void fillPaceAlignPointList(long currentTime, float currentPace) {
        getPaceAlignPointList().add(new CommonTimeValuePoint(currentTime, currentPace));
    }

    private final void fillPaceListAndPeak(long currentTime, float currentPace) {
        CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(currentTime, currentPace);
        getPaceList().add(commonTimeValuePoint);
        fillPeakValue(getPacePeak(), commonTimeValuePoint);
    }

    private final void fillPaceListNoPeak(long currentTime, float currentPace) {
        getPaceList().add(new CommonTimeValuePoint(currentTime, currentPace));
    }

    private final void fillPeakValue(PeakIndexTimeValue peak, CommonTimeValuePoint point) {
        if (peak.getMaxValue() < point.getValue()) {
            peak.setMaxIndexTime(point.getAbsoluteTime());
            peak.setMaxValue(point.getValue());
        }
        if (peak.getMinValue() > point.getValue()) {
            peak.setMinIndexTime(point.getAbsoluteTime());
            peak.setMinValue(point.getValue());
        }
    }

    private final void fillSpeedListAndPeak(long currentTime, float currentSpeed) {
        CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(currentTime, currentSpeed);
        getSpeedList().add(commonTimeValuePoint);
        fillPeakValue(getSpeedPeak(), commonTimeValuePoint);
    }

    private final Pair<Integer, Float> findIndexAndValueByTime(List<CommonTimeValuePoint> list, long time, int startIndex, int delta) {
        int i = startIndex - delta;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        if (list.isEmpty()) {
            return new Pair<>(-1, Float.valueOf(-1.0f));
        }
        for (Object obj : list.subList(i, list.size())) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CommonTimeValuePoint commonTimeValuePoint = (CommonTimeValuePoint) obj;
            long j = delta;
            long j2 = time - j;
            if (time <= j2) {
                long j3 = time;
                while (true) {
                    long j4 = j3 + 1;
                    if (commonTimeValuePoint.getAbsoluteTime() == j3) {
                        return new Pair<>(Integer.valueOf(i2), Float.valueOf(commonTimeValuePoint.getValue()));
                    }
                    if (j3 == j2) {
                        break;
                    }
                    j3 = j4;
                }
            }
            long j5 = time + 1;
            long j6 = time + j;
            if (j5 <= j6) {
                while (true) {
                    long j7 = j5 + 1;
                    if (commonTimeValuePoint.getAbsoluteTime() == j5) {
                        return new Pair<>(Integer.valueOf(i2), Float.valueOf(commonTimeValuePoint.getValue()));
                    }
                    if (j5 == j6) {
                        break;
                    }
                    j5 = j7;
                }
            }
            i2 = i3;
        }
        return new Pair<>(-1, Float.valueOf(-1.0f));
    }

    private final List<String> formatBulkStrAsList(String str) {
        List<String> listEmptyList;
        if (str == null) {
            listEmptyList = null;
        } else {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            List<String> listSplit = new Regex(";").split(str.subSequence(i, length + 1).toString(), 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    }
                }
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        return listEmptyList == null ? CollectionsKt__CollectionsKt.emptyList() : listEmptyList;
    }

    private final float formatPace(float pace) {
        float f = DataTypeSource.isSwimSport(this.sportType.intValue()) ? 6.0f : 1.8f;
        return (!((pace > 0.0f ? 1 : (pace == 0.0f ? 0 : -1)) == 0) && pace < f) ? pace : f;
    }

    private final List<CommonTimeValuePoint> genDistanceList(List<String> disStrList) {
        CommonTimeValuePoint commonTimeValuePoint;
        ArrayList arrayList = new ArrayList();
        CommonTimeValuePoint commonTimeValuePoint2 = new CommonTimeValuePoint(this.currentTrackId, 0.0f);
        long j = this.currentTrackId;
        int i = 0;
        for (Object obj : disStrList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) obj, new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                CharSequence charSequence = (CharSequence) listSplit$default.get(0);
                int i3 = charSequence == null || charSequence.length() == 0 ? 1 : Integer.parseInt((String) listSplit$default.get(0));
                long jTryReviseTime = tryReviseTime(i3, j);
                if (jTryReviseTime == -1) {
                    jTryReviseTime = commonTimeValuePoint2.getAbsoluteTime() + ((long) i3);
                }
                j += (long) i3;
                commonTimeValuePoint = new CommonTimeValuePoint(jTryReviseTime, commonTimeValuePoint2.getValue() + Float.parseFloat((String) listSplit$default.get(1)));
            } else {
                commonTimeValuePoint = commonTimeValuePoint2;
            }
            arrayList.add(commonTimeValuePoint);
            i = i2;
        }
        return arrayList;
    }

    private final void genKmOrMileMarkedByPointLocation(int missType) {
        GPSPoint gPSPoint;
        int i = missType == 0 ? 1000 : 1609;
        float f = 0.0f;
        if (getPointLocationList().size() != getFlagList().size()) {
            return;
        }
        GPSPoint gPSPoint2 = new GPSPoint();
        GPSPoint gPSPoint3 = new GPSPoint();
        gPSPoint2.setVersion(this.detailVersion);
        gPSPoint3.setVersion(this.detailVersion);
        int size = getPointLocationList().size();
        int i2 = 1;
        if (1 >= size) {
            return;
        }
        int i3 = 1;
        int time = 0;
        int i4 = 0;
        int costTime = 0;
        while (true) {
            int i5 = i3 + 1;
            int i6 = i3 - 1;
            updateGpsPointFromLocation(gPSPoint2, getPointLocationList().get(i6), i6);
            updateGpsPointFromLocation(gPSPoint3, getPointLocationList().get(i3), i3);
            if (gPSPoint2.getAttr() == i2) {
                float[] fArr = new float[i2];
                Location.distanceBetween(gPSPoint3.mLatitude, gPSPoint3.mLongitude, gPSPoint2.mLatitude, gPSPoint2.mLongitude, fArr);
                f += fArr[0];
            }
            float f2 = f;
            if (gPSPoint2.getAttr() != i2 && i6 != 0) {
                time += (int) (gPSPoint3.getTime() - gPSPoint2.getTime());
            }
            int i7 = time;
            if (((int) f2) / i == i2) {
                System.out.println((Object) ("current Distance :" + f2));
                int i8 = i4 + 1;
                int time2 = (int) ((gPSPoint3.getTime() - ((long) i7)) - this.currentTrackId);
                int i9 = i8 == i2 ? time2 : time2 - costTime;
                GPSPoint gPSPoint4 = gPSPoint3;
                gPSPoint = gPSPoint4;
                KilometreOrMileMarked kilometreOrMileMarked = new KilometreOrMileMarked(i8, missType, i9, gPSPoint4.mLatitude, gPSPoint4.mLongitude, time2, calculateAvgHeartRate(time2 - i9, i9));
                costTime += kilometreOrMileMarked.getCostTime();
                if (missType == 0) {
                    getKmMarkedList().add(kilometreOrMileMarked);
                } else {
                    getMileMarkedList().add(kilometreOrMileMarked);
                }
                f = f2 - i;
                i4 = i8;
            } else {
                gPSPoint = gPSPoint3;
                f = f2;
                i4 = i4;
            }
            int i10 = size;
            if (i5 >= i10) {
                return;
            }
            time = i7;
            gPSPoint3 = gPSPoint;
            size = i10;
            i3 = i5;
            i2 = 1;
        }
    }

    private final void getKmOrMileMarkedByOtherRawData(String distanceStr, int missType) {
        formatBulkStrAsList(distanceStr);
        genKmOrMileMarkedByPointLocation(missType);
    }

    private final void initGolfAngleList() {
        setGolfAnglePeak(new PeakIndexTimeValue(ChartDataType.GOLF_ANGLE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setGolfAngleList(new ArrayList());
    }

    private final void initGolfBeatList() {
        setGolfBeatPeak(new PeakIndexTimeValue(ChartDataType.GOLF_BEAT_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setGolfBeatList(new ArrayList());
    }

    private final void initGolfDownTimeList() {
        setGolfDownTimePeak(new PeakIndexTimeValue(ChartDataType.GOLF_DOWN_TIME_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setGolfDownTimeList(new ArrayList());
    }

    private final void initGolfUpTimeList() {
        setGolfUpTimePeak(new PeakIndexTimeValue(ChartDataType.GOLF_UP_TIME_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setGolfUpTimeList(new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void insertSpecialAndPeakValues2AlignedList(List<CommonTimeValuePoint> alignedList, PeakIndexTimeValue peak) {
        Iterator it2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        long absoluteTime = alignedList.size() == 1 ? 0L : ((CommonTimeValuePoint) alignedList.get(1)).getAbsoluteTime() - ((CommonTimeValuePoint) alignedList.get(0)).getAbsoluteTime();
        if (this.specialPoints.containsKey(peak.getDataType())) {
            List<CommonTimeValuePoint> list = this.specialPoints.get(peak.getDataType());
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    long absoluteTime2 = list.get(0).getAbsoluteTime();
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CommonTimeValuePoint commonTimeValuePoint = (CommonTimeValuePoint) obj;
                        if (i > 0) {
                            if (commonTimeValuePoint.getAbsoluteTime() - absoluteTime2 >= absoluteTime / ((long) 3)) {
                                arrayList.add(commonTimeValuePoint);
                                absoluteTime2 = commonTimeValuePoint.getAbsoluteTime();
                            }
                            i = i2;
                        } else {
                            arrayList.add(commonTimeValuePoint);
                        }
                        absoluteTime2 = absoluteTime2;
                        i = i2;
                    }
                }
            }
            ArrayList arrayList2 = arrayList.isEmpty() ^ true ? arrayList : null;
            if (arrayList2 != null && arrayList2.size() > 1) {
                g.sortWith(arrayList2, new Comparator<T>() { // from class: com.huami.mifit.sportlib.model.ParsedSportDetailData$insertSpecialAndPeakValues2AlignedList$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CommonTimeValuePoint) t).getAbsoluteTime()), Long.valueOf(((CommonTimeValuePoint) t2).getAbsoluteTime()));
                    }
                });
            }
            Iterator it3 = arrayList.iterator();
            int i3 = 0;
            int i4 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                CommonTimeValuePoint commonTimeValuePoint2 = (CommonTimeValuePoint) next;
                int size = alignedList.size() - 1;
                if (i4 < size) {
                    int i6 = i4;
                    while (true) {
                        int i7 = i6 + 1;
                        if (commonTimeValuePoint2.getAbsoluteTime() > ((CommonTimeValuePoint) alignedList.get(i6)).getAbsoluteTime() && commonTimeValuePoint2.getAbsoluteTime() < ((CommonTimeValuePoint) alignedList.get(i7)).getAbsoluteTime()) {
                            it2 = it3;
                            if (commonTimeValuePoint2.getAbsoluteTime() - ((CommonTimeValuePoint) alignedList.get(i6)).getAbsoluteTime() >= absoluteTime / ((long) 2)) {
                                i4 = i6;
                                z = true;
                                break;
                            }
                        } else {
                            it2 = it3;
                        }
                        if (i7 < size) {
                            i6 = i7;
                            it3 = it2;
                        }
                    }
                    if (!z && !alignedList.contains(arrayList.get(i3))) {
                        alignedList.add(arrayList.get(i3));
                    }
                    i3 = i5;
                    it3 = it2;
                } else {
                    it2 = it3;
                }
                z = false;
                if (!z) {
                }
                i3 = i5;
                it3 = it2;
            }
            CommonTimeValuePoint commonTimeValuePoint3 = new CommonTimeValuePoint(peak.getMaxIndexTime(), peak.getMaxValue());
            CommonTimeValuePoint commonTimeValuePoint4 = new CommonTimeValuePoint(peak.getMinIndexTime(), peak.getMinValue());
            if (!alignedList.contains(commonTimeValuePoint3)) {
                alignedList.add(commonTimeValuePoint3);
            }
            if (!alignedList.contains(commonTimeValuePoint4)) {
                alignedList.add(commonTimeValuePoint4);
            }
            if (alignedList.size() > 1) {
                g.sortWith(alignedList, new Comparator<T>() { // from class: com.huami.mifit.sportlib.model.ParsedSportDetailData$insertSpecialAndPeakValues2AlignedList$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CommonTimeValuePoint) t).getAbsoluteTime()), Long.valueOf(((CommonTimeValuePoint) t2).getAbsoluteTime()));
                    }
                });
            }
        }
    }

    private final boolean isValidSingleValue(float value) {
        return value > INVALID_VALUE;
    }

    private final List<List<CommonTimeValuePoint>> packageAlignedList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.alignedPaceList);
        arrayList.add(this.alignedSpeedList);
        arrayList.add(this.alignedAltiList);
        arrayList.add(this.alignedStepFreqList);
        arrayList.add(this.alignedStepStrideList);
        arrayList.add(this.alignedStrokeList);
        arrayList.add(this.alignedRopeSkipList);
        arrayList.add(this.alignedCadenceList);
        arrayList.add(this.alignedHeartList);
        arrayList.add(this.alignedTemperatureList);
        arrayList.add(this.alignedTimeDeltaAltitudeList);
        arrayList.add(this.alignedPowerMeterList);
        return arrayList;
    }

    private final List<Pair<PeakIndexTimeValue, List<CommonTimeValuePoint>>> packagePeakAndRawList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(getPacePeak(), getPaceList()));
        arrayList.add(new Pair(getSpeedPeak(), getSpeedList()));
        arrayList.add(new Pair(getAltiPeak(), getAltiList()));
        arrayList.add(new Pair(getStepFreqPeak(), getStepFreqList()));
        arrayList.add(new Pair(getStepStridePeak(), getStepStrideList()));
        arrayList.add(new Pair(getStrokePeak(), getStrokeList()));
        arrayList.add(new Pair(getRopeSkipPeak(), getRopeSkipList()));
        arrayList.add(new Pair(getCadencePeak(), getCadenceList()));
        arrayList.add(new Pair(getHeartPeak(), getHeartList()));
        arrayList.add(new Pair(getTemperaturePeak(), getTemperatureList()));
        arrayList.add(new Pair(getTimeDeltaAltiPeak(), getTimeDeltaAltitudeList()));
        arrayList.add(new Pair(getPowerMeterPeak(), getPowerMeterList()));
        return arrayList;
    }

    private final void parseCommonTimeDeltaAndValueList(String bulkTimeValue, List<CommonTimeValuePoint> list, PeakIndexTimeValue peak) {
        List<String> bulkStrAsList = formatBulkStrAsList(bulkTimeValue);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(this.currentTrackId, 0.0f);
        long j = this.currentTrackId;
        int i = 0;
        int i2 = 0;
        for (Object obj : bulkStrAsList) {
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) obj, new String[]{","}, false, 0, 6, (Object) null);
            if (Integer.parseInt((String) listSplit$default.get(i)) > 0 && (peak.getDataType() != ChartDataType.TIME_DELTA_ALTI_CHART_TYPE || SportDataVerificationKt.isValidAltitude(Integer.parseInt((String) listSplit$default.get(1))))) {
                long jTryReviseTime = tryReviseTime(Integer.parseInt((String) listSplit$default.get(i)), j);
                CommonTimeValuePoint commonTimeValuePoint2 = jTryReviseTime == -1 ? new CommonTimeValuePoint(((long) Integer.parseInt((String) listSplit$default.get(i))) + commonTimeValuePoint.getAbsoluteTime(), Float.parseFloat((String) listSplit$default.get(1))) : new CommonTimeValuePoint(jTryReviseTime, Float.parseFloat((String) listSplit$default.get(1)));
                j += (long) Integer.parseInt((String) listSplit$default.get(0));
                float f = INVALID_VALUE;
                float value = i2 > 0 ? commonTimeValuePoint.getValue() : INVALID_VALUE;
                if (i2 < bulkStrAsList.size() - 1) {
                    f = Float.parseFloat((String) StringsKt__StringsKt.split$default((CharSequence) bulkStrAsList.get(i2), new String[]{","}, false, 0, 6, (Object) null).get(1));
                }
                if (isValidSingleValue(value) && isValidSingleValue(f) && checkIsSpecialPoint(peak.getDataType(), value, commonTimeValuePoint2.getValue(), f)) {
                    arrayList.add(commonTimeValuePoint2);
                }
                list.add(commonTimeValuePoint2);
                fillPeakValue(peak, commonTimeValuePoint2);
                commonTimeValuePoint = commonTimeValuePoint2;
                i = 0;
            }
        }
        this.specialPoints.put(peak.getDataType(), arrayList);
    }

    private final void parseDailyPerformanceList(String daily, boolean isMetric) {
        List<String> bulkStrAsList = formatBulkStrAsList(daily);
        setDailyPerformanceList(new ArrayList());
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        Iterator<T> it2 = bulkStrAsList.iterator();
        while (it2.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it2.next(), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                float f = Float.parseFloat((String) listSplit$default.get(0));
                if (!isMetric) {
                    f *= 0.6213712f;
                }
                getDailyPerformanceList().add(new CommonTimeValuePoint((int) (f * 100), Integer.parseInt((String) listSplit$default.get(1))));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    private final void parseDeltaTimeAndDeltaValue(List<CommonTimeValuePoint> dataList, List<CommonTimeValuePoint> specialList, PeakIndexTimeValue peak, long trackId, List<String> strList) {
        boolean zIsValidHeartrate;
        long j = trackId;
        CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(j, 0.0f);
        int i = 0;
        int i2 = 0;
        for (Object obj : strList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) obj, new String[]{","}, false, 0, 6, (Object) null);
            float f = -1.0f;
            float value = i2 > 0 ? commonTimeValuePoint.getValue() : -1.0f;
            if (i2 < strList.size() - 1) {
                f = Float.parseFloat((String) StringsKt__StringsKt.split$default((CharSequence) strList.get(i3), new String[]{","}, false, 0, 6, (Object) null).get(1));
            }
            if (listSplit$default.size() == 2) {
                CharSequence charSequence = (CharSequence) listSplit$default.get(i);
                int i4 = charSequence == null || charSequence.length() == 0 ? 1 : Integer.parseInt((String) listSplit$default.get(i));
                long jTryReviseTime = tryReviseTime(i4, j);
                if (jTryReviseTime == -1) {
                    jTryReviseTime = commonTimeValuePoint.getAbsoluteTime() + ((long) i4);
                }
                j += (long) i4;
                commonTimeValuePoint = new CommonTimeValuePoint(jTryReviseTime, commonTimeValuePoint.getValue() + Float.parseFloat((String) listSplit$default.get(1)));
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[peak.getDataType().ordinal()];
            if (i5 == 6) {
                zIsValidHeartrate = SportDataVerificationKt.isValidHeartrate((int) commonTimeValuePoint.getValue());
            } else if (i5 == 7 || i5 == 11) {
                zIsValidHeartrate = true;
            } else {
                if (i5 == 12) {
                    int value2 = (int) commonTimeValuePoint.getValue();
                    if ((1 <= value2 && value2 <= 100) && commonTimeValuePoint.getAbsoluteTime() <= ((long) getTotalCostTime().intValue()) + getCurrentTrackId()) {
                        zIsValidHeartrate = true;
                    }
                }
                zIsValidHeartrate = false;
            }
            if (zIsValidHeartrate) {
                dataList.add(commonTimeValuePoint);
                fillPeakValue(peak, commonTimeValuePoint);
                float value3 = commonTimeValuePoint.getValue() + f;
                if (value > 0.0f && value3 > 0.0f && checkIsSpecialPoint(peak.getDataType(), value, commonTimeValuePoint.getValue(), value3)) {
                    specialList.add(commonTimeValuePoint);
                }
            }
            i2 = i3;
            i = 0;
        }
        if (!specialList.isEmpty()) {
            this.specialPoints.put(peak.getDataType(), specialList);
        }
    }

    private final void parseFlagList(String str) {
        setFlagList(new ArrayList());
        try {
            List<String> bulkStrAsList = formatBulkStrAsList(str);
            int i = this.detailVersion;
            boolean z = i == 13 || (i == 14 && bulkStrAsList.contains(SPECIAL_GPS_STATE_FLAG_MARK)) || this.detailVersion == 15;
            Iterator<T> it2 = bulkStrAsList.iterator();
            while (it2.hasNext()) {
                int i2 = Integer.parseInt((String) it2.next());
                if (z) {
                    int i3 = (i2 >> 1) & 3;
                    if (i3 == 0) {
                        i2 = 2;
                    } else if (i3 != 1) {
                        i2 = i3 != 2 ? 4 : 3;
                    } else {
                        i2 = 1;
                    }
                }
                getFlagList().add(Integer.valueOf(i2));
            }
        } catch (Exception unused) {
        }
    }

    private final void parseGolfAngleList(String golf) {
        parseCommonTimeDeltaAndValueList(golf, getGolfAngleList(), getGolfAnglePeak());
    }

    private final void parseGolfBeatList(String golf) {
        parseCommonTimeDeltaAndValueList(golf, getGolfBeatList(), getGolfBeatPeak());
    }

    private final void parseGolfDowntimeList(String golf) {
        parseCommonTimeDeltaAndValueList(golf, getGolfDownTimeList(), getGolfDownTimePeak());
    }

    private final void parseGolfUpTimeList(String golf) {
        parseCommonTimeDeltaAndValueList(golf, getGolfUpTimeList(), getGolfUpTimePeak());
    }

    private final void parseHeartRateZoneList(int heartZoneType, String hrZones, List<CommonTimeValuePoint> originHeartList) {
        setHrZoneList(new ArrayList());
        if (originHeartList.isEmpty()) {
            return;
        }
        if (heartZoneType == -1) {
            setHrZoneListUseVersion1(getHrZoneList(), originHeartList);
        } else {
            List<String> listSplit$default = hrZones == null ? null : StringsKt__StringsKt.split$default((CharSequence) hrZones, new String[]{";"}, false, 0, 6, (Object) null);
            if (listSplit$default == null) {
                listSplit$default = new ArrayList<>();
            }
            if ((hrZones != null && StringsKt__StringsKt.contains$default((CharSequence) hrZones, (CharSequence) EcgData.DEFAULT_DIGIT_VALUE, false, 2, (Object) null)) || listSplit$default.size() != 6) {
                setHrZoneListUseVersion1(getHrZoneList(), originHeartList);
            } else {
                setHrZoneListUseVersion2(heartZoneType, getHrZoneList(), listSplit$default);
            }
        }
        for (HeartRateZone heartRateZone : getHrZoneList()) {
            heartRateZone.setPercent((int) ((heartRateZone.getCostTime() / getTotalCostTime().intValue()) * 100));
        }
    }

    private final void parseKmAndMileMarkedList(String kiloStr, String mileStr) {
        parseMarkedList(kiloStr, 0);
        parseMarkedList(mileStr, 1);
    }

    private final void parseMarkedList(String markedStr, int type) {
        List<KilometreOrMileMarked> mileMarkedList;
        if (type == 0) {
            setKmMarkedList(new ArrayList());
            mileMarkedList = getKmMarkedList();
        } else {
            setMileMarkedList(new ArrayList());
            mileMarkedList = getMileMarkedList();
        }
        try {
            Iterator<T> it2 = formatBulkStrAsList(markedStr).iterator();
            int i = 0;
            while (it2.hasNext()) {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it2.next(), new String[]{","}, false, 0, 6, (Object) null);
                double[] dArrDecode = Geohash.decode((String) listSplit$default.get(2));
                int i2 = Integer.parseInt((String) listSplit$default.get(1));
                int i3 = Integer.parseInt((String) listSplit$default.get(5));
                int i4 = i + i2;
                int i5 = i3 <= 0 ? i4 : i3;
                CharSequence charSequence = (CharSequence) listSplit$default.get(4);
                mileMarkedList.add(new KilometreOrMileMarked(Integer.parseInt((String) listSplit$default.get(0)) + 1, type, i2, dArrDecode[0], dArrDecode[1], i5, ((charSequence == null || charSequence.length() == 0) || Integer.parseInt((String) listSplit$default.get(4)) <= 0) ? calculateAvgHeartRate(i5 - i2, i2) : Integer.parseInt((String) listSplit$default.get(4))));
                i = i4;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0255  */
    /* JADX WARN: Code duplicated, block: B:101:0x025a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0263  */
    /* JADX WARN: Code duplicated, block: B:106:0x026f  */
    /* JADX WARN: Code duplicated, block: B:107:0x027e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0208  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:93:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x0231  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Code duplicated, block: B:99:0x0246  */
    private final void parsePaceAndAltitudeAndTimeList(String bulkPace, String bulkAlti, String bulkTime, boolean emptyBulkSpeed) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Integer intOrNull;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Integer intOrNull2;
        int i;
        Integer intOrNull3;
        int i2;
        float f;
        boolean z2;
        List<String> bulkStrAsList = formatBulkStrAsList(bulkPace);
        List<String> bulkStrAsList2 = formatBulkStrAsList(bulkAlti);
        ChartDataType chartDataType = ChartDataType.SPEED_CHART_TYPE;
        float f2 = Constants.PEAK_MINEST_VALUE;
        setSpeedPeak(new PeakIndexTimeValue(chartDataType, -1L, Float.MAX_VALUE, -1L, f2));
        setPacePeak(new PeakIndexTimeValue(ChartDataType.PACE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, f2));
        setAltiPeak(new PeakIndexTimeValue(ChartDataType.ALTI_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, f2));
        setPaceList(new ArrayList());
        setAltiList(new ArrayList());
        setSpeedList(new ArrayList());
        setTimeList(new ArrayList());
        setPaceAlignPointList(new ArrayList());
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (bulkStrAsList.isEmpty()) {
            z = true;
        } else {
            if (!bulkStrAsList.isEmpty()) {
                Iterator<T> it2 = bulkStrAsList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    } else {
                        if (!(Float.parseFloat((String) it2.next()) == 0.0f)) {
                            z2 = false;
                            break;
                        }
                    }
                }
            } else {
                z2 = true;
                break;
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean zIsEmpty = bulkStrAsList2.isEmpty();
        long j = this.currentTrackId;
        Iterator it3 = formatBulkStrAsList(bulkTime).iterator();
        long j2 = j;
        int i3 = 0;
        float f3 = 0.0f;
        int i4 = 0;
        while (true) {
            if (it3.hasNext()) {
                Object next = it3.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str = (String) next;
                long jTryReviseTime = tryReviseTime(Integer.parseInt(str), j);
                j2 = jTryReviseTime == -1 ? j2 + Long.parseLong(str) : jTryReviseTime;
                long j3 = j + Long.parseLong(str);
                getTimeList().add(Long.valueOf(j2));
                if (z) {
                    bulkStrAsList = bulkStrAsList;
                    arrayList2 = arrayList6;
                    z = z;
                    it3 = it3;
                } else if (i3 < bulkStrAsList.size()) {
                    float f4 = Float.parseFloat(bulkStrAsList.get(i3));
                    float pace = i3 > 0 ? formatPace(Float.parseFloat(bulkStrAsList.get(i3 - 1))) : -1.0f;
                    float pace2 = i3 < bulkStrAsList.size() + (-1) ? formatPace(Float.parseFloat(bulkStrAsList.get(i5))) : -1.0f;
                    float pace3 = formatPace(f4);
                    if (emptyBulkSpeed) {
                        if (f4 == 0.0f) {
                            i2 = 1;
                            f = 0.0f;
                        } else {
                            i2 = 1;
                            f = 1 / f4;
                        }
                        arrayList2 = arrayList6;
                        fillSpeedListAndPeak(j2, (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? 0.0f : i2 / f4);
                        if (SportDataVerificationKt.isValidPace(pace, getSportType().intValue()) && SportDataVerificationKt.isValidPace(pace2, getSportType().intValue()) && checkIsSpecialPoint(ChartDataType.PACE_CHART_TYPE, pace, pace3, pace2)) {
                            arrayList5.add(new CommonTimeValuePoint(j2, f));
                        }
                    } else {
                        arrayList2 = arrayList6;
                        z = z;
                        it3 = it3;
                    }
                    if (SportDataVerificationKt.isValidPace(pace3, getSportType().intValue())) {
                        fillPaceAlignPointList(j2, pace3);
                        if (emptyBulkSpeed) {
                            if (f4 == 0.0f) {
                                fillPaceListNoPeak(j2, pace3);
                            } else {
                                fillPaceListAndPeak(j2, pace3);
                            }
                            if (SportDataVerificationKt.isValidPace(pace, getSportType().intValue()) && SportDataVerificationKt.isValidPace(pace2, getSportType().intValue()) && checkIsSpecialPoint(ChartDataType.PACE_CHART_TYPE, pace, pace3, pace2)) {
                                arrayList4.add(new CommonTimeValuePoint(j2, pace3));
                            }
                        }
                    }
                    if (zIsEmpty) {
                        arrayList3 = arrayList2;
                        i4 = i4;
                    } else {
                        if (i3 >= bulkStrAsList2.size()) {
                            arrayList = arrayList2;
                            break;
                        }
                        intOrNull = l.toIntOrNull(bulkStrAsList2.get(i3));
                        if (intOrNull == null) {
                            iIntValue = (int) (Float.parseFloat(bulkStrAsList2.get(i3)) * 100);
                        } else {
                            iIntValue = intOrNull.intValue();
                        }
                        iIntValue2 = -1;
                        if (i3 > 0) {
                            i = i3 - 1;
                            intOrNull3 = l.toIntOrNull(bulkStrAsList2.get(i));
                            if (intOrNull3 == null) {
                                iIntValue3 = (int) (Float.parseFloat(bulkStrAsList2.get(i)) * 100);
                            } else {
                                iIntValue3 = intOrNull3.intValue();
                            }
                        } else {
                            iIntValue3 = -1;
                        }
                        if (i3 < bulkStrAsList2.size() - 1) {
                            intOrNull2 = l.toIntOrNull(bulkStrAsList2.get(i5));
                            if (intOrNull2 == null) {
                                iIntValue2 = (int) (Float.parseFloat(bulkStrAsList2.get(i5)) * 100);
                            } else {
                                iIntValue2 = intOrNull2.intValue();
                            }
                        }
                        if (SportDataVerificationKt.isValidAltitude(iIntValue)) {
                            float f5 = iIntValue;
                            f3 += f5;
                            i4++;
                            fillAltitudeListAndPeak(j2, f5);
                            if (!SportDataVerificationKt.isValidAltitude(iIntValue3) && SportDataVerificationKt.isValidAltitude(iIntValue2) && checkIsSpecialPoint(ChartDataType.ALTI_CHART_TYPE, iIntValue3, f5, iIntValue2)) {
                                CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(j2, f5);
                                arrayList3 = arrayList2;
                                arrayList3.add(commonTimeValuePoint);
                            } else {
                                arrayList3 = arrayList2;
                            }
                        } else {
                            arrayList3 = arrayList2;
                            i4 = i4;
                        }
                    }
                    it3 = it3;
                    arrayList6 = arrayList3;
                    i3 = i5;
                    bulkStrAsList = bulkStrAsList;
                    j = j3;
                    z = z;
                }
                if (zIsEmpty) {
                    arrayList3 = arrayList2;
                    i4 = i4;
                } else {
                    if (i3 >= bulkStrAsList2.size()) {
                        arrayList = arrayList2;
                        break;
                    }
                    intOrNull = l.toIntOrNull(bulkStrAsList2.get(i3));
                    if (intOrNull == null) {
                        iIntValue = (int) (Float.parseFloat(bulkStrAsList2.get(i3)) * 100);
                    } else {
                        iIntValue = intOrNull.intValue();
                    }
                    iIntValue2 = -1;
                    if (i3 > 0) {
                        i = i3 - 1;
                        intOrNull3 = l.toIntOrNull(bulkStrAsList2.get(i));
                        if (intOrNull3 == null) {
                            iIntValue3 = (int) (Float.parseFloat(bulkStrAsList2.get(i)) * 100);
                        } else {
                            iIntValue3 = intOrNull3.intValue();
                        }
                    } else {
                        iIntValue3 = -1;
                    }
                    if (i3 < bulkStrAsList2.size() - 1) {
                        intOrNull2 = l.toIntOrNull(bulkStrAsList2.get(i5));
                        if (intOrNull2 == null) {
                            iIntValue2 = (int) (Float.parseFloat(bulkStrAsList2.get(i5)) * 100);
                        } else {
                            iIntValue2 = intOrNull2.intValue();
                        }
                    }
                    if (SportDataVerificationKt.isValidAltitude(iIntValue)) {
                        float f6 = iIntValue;
                        f3 += f6;
                        i4++;
                        fillAltitudeListAndPeak(j2, f6);
                        if (!SportDataVerificationKt.isValidAltitude(iIntValue3)) {
                            arrayList3 = arrayList2;
                        } else {
                            arrayList3 = arrayList2;
                        }
                    } else {
                        arrayList3 = arrayList2;
                        i4 = i4;
                    }
                }
                it3 = it3;
                arrayList6 = arrayList3;
                i3 = i5;
                bulkStrAsList = bulkStrAsList;
                j = j3;
                z = z;
            }
            arrayList = arrayList6;
            break;
        }
        Unit unit = Unit.INSTANCE;
        if (!arrayList4.isEmpty()) {
            this.specialPoints.put(ChartDataType.PACE_CHART_TYPE, arrayList4);
        }
        if (!arrayList5.isEmpty()) {
            this.specialPoints.put(ChartDataType.SPEED_CHART_TYPE, arrayList5);
        }
        if (!arrayList.isEmpty()) {
            this.specialPoints.put(ChartDataType.ALTI_CHART_TYPE, arrayList);
        }
        if (i4 > 0) {
            this.averageAltitude = (int) (f3 / i4);
        }
    }

    private final void samplingPressureList() {
        int iNextIndex;
        int iNextIndex2;
        if (getPressureList().size() > 0) {
            CommonTimeValuePoint commonTimeValuePoint = (CommonTimeValuePoint) CollectionsKt.first((List) getPressureList());
            CommonTimeValuePoint commonTimeValuePoint2 = (CommonTimeValuePoint) CollectionsKt.last((List) getPressureList());
            int relativeTime = commonTimeValuePoint.getRelativeTime(this.currentTrackId);
            int relativeTime2 = commonTimeValuePoint2.getRelativeTime(this.currentTrackId);
            float f = 180;
            float fFloatValue = (relativeTime / this.totalCostTime.floatValue()) * f;
            float fIntValue = ((this.totalCostTime.intValue() - relativeTime2) / this.totalCostTime.floatValue()) * f;
            Log.i(TAG, "samplingPressureList offset:" + fFloatValue + ",endOffset:" + fIntValue + ", " + getPressureList().size());
            float f2 = (f - fFloatValue) - fIntValue;
            if (getPressureList().size() > f2) {
                ArrayList<CommonTimeValuePoint> arrayList = new ArrayList();
                float fIntValue2 = (this.totalCostTime.intValue() - relativeTime) / f2;
                if (fIntValue2 < 7.0f) {
                    LogKit.w2f(TAG, "interval is so small ,may cause pressure samping error!!!!");
                }
                int i = 0;
                int i2 = 0;
                for (Object obj : getPressureList()) {
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    CommonTimeValuePoint commonTimeValuePoint3 = (CommonTimeValuePoint) obj;
                    if (i == 0 || commonTimeValuePoint3.getAbsoluteTime() - arrayList.get(i2 - 1).getAbsoluteTime() >= fIntValue2) {
                        arrayList.add(commonTimeValuePoint3);
                        i2++;
                    }
                    i = i3;
                }
                for (CommonTimeValuePoint commonTimeValuePoint4 : arrayList) {
                    Log.i(TAG, "samplingPressureList " + commonTimeValuePoint4.getAbsoluteTime() + ", value = " + commonTimeValuePoint4.getValue());
                }
                ListIterator<CommonTimeValuePoint> listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    iNextIndex = -1;
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().getAbsoluteTime() <= getPressurePeak().getMaxIndexTime()) {
                            iNextIndex2 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex2 = -1;
                        break;
                    }
                }
                ListIterator<CommonTimeValuePoint> listIterator2 = arrayList.listIterator(arrayList.size());
                while (listIterator2.hasPrevious()) {
                    if (listIterator2.previous().getAbsoluteTime() <= getPressurePeak().getMinIndexTime()) {
                        iNextIndex = listIterator2.nextIndex();
                        break;
                    }
                }
                CommonTimeValuePoint commonTimeValuePoint5 = new CommonTimeValuePoint(getPressurePeak().getMaxIndexTime(), getPressurePeak().getMaxValue());
                CommonTimeValuePoint commonTimeValuePoint6 = new CommonTimeValuePoint(getPressurePeak().getMinIndexTime(), getPressurePeak().getMinValue());
                if (!arrayList.contains(commonTimeValuePoint5)) {
                    arrayList.add(iNextIndex2 + 1, commonTimeValuePoint5);
                }
                if (!arrayList.contains(commonTimeValuePoint6)) {
                    arrayList.add(iNextIndex + 1, commonTimeValuePoint6);
                }
                setPressureList(arrayList);
            }
        }
    }

    private final void setHrZoneListUseVersion1(List<HeartRateZone> heartZoneList, List<CommonTimeValuePoint> originHeartList) {
        Integer num = HeartRateConstant.reserveHRArray.get(this.source);
        int i = (num == null ? -1 : num.intValue()) > -1 ? 1 : 0;
        float[] fArrCalculateHrRangeArray = calculateHrRangeArray();
        int age = 220 - RunnerData.getRunner().getAge();
        int length = fArrCalculateHrRangeArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            heartZoneList.add(new HeartRateZone(i, (int) fArrCalculateHrRangeArray[i3], i2 < fArrCalculateHrRangeArray.length - 1 ? ((int) fArrCalculateHrRangeArray[i4]) - 1 : age, 0, 0));
            i3++;
            i2 = i4;
        }
        int i5 = 0;
        for (Object obj : originHeartList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CommonTimeValuePoint commonTimeValuePoint = (CommonTimeValuePoint) obj;
            long absoluteTime = commonTimeValuePoint.getAbsoluteTime();
            long absoluteTime2 = (i5 < originHeartList.size() - 1 ? originHeartList.get(i6).getAbsoluteTime() : absoluteTime + 1) - absoluteTime;
            long j = absoluteTime2 <= 60 ? absoluteTime2 : 1L;
            int length2 = fArrCalculateHrRangeArray.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i7 = length2 - 1;
                    IntRange intRange = new IntRange(heartZoneList.get(length2).getZoneStart(), heartZoneList.get(length2).getZoneEnd());
                    int first = intRange.getFirst();
                    int last = intRange.getLast();
                    int value = (int) commonTimeValuePoint.getValue();
                    if (first <= value && value <= last) {
                        HeartRateZone heartRateZone = heartZoneList.get(length2);
                        heartRateZone.setCostTime(heartRateZone.getCostTime() + ((int) j));
                    }
                    if (i7 < 0) {
                        break;
                    } else {
                        length2 = i7;
                    }
                }
            }
            i5 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00bc  */
    private final void setHrZoneListUseVersion2(int heartZoneType, List<HeartRateZone> heartZoneList, List<String> arrHeartRange) {
        int i = 0;
        for (Object obj : arrHeartRange) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ",", false, 2, (Object) null)) {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 2) {
                    if (i >= 1) {
                        heartZoneList.add(new HeartRateZone(heartZoneType, Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) arrHeartRange.get(i - 1), new String[]{","}, false, 0, 6, (Object) null).get(1)), arrHeartRange.size() - 1 == i ? Integer.parseInt((String) listSplit$default.get(1)) : Integer.parseInt((String) listSplit$default.get(1)) - 1, Integer.parseInt((String) listSplit$default.get(0)), 0));
                    } else {
                        heartZoneList.add(new HeartRateZone(heartZoneType, 40, Integer.parseInt((String) listSplit$default.get(1)) - 1, Integer.parseInt((String) listSplit$default.get(0)), 0));
                    }
                }
            }
            i = i2;
        }
    }

    private final float speed2Pace(float speed) {
        float f = DataTypeSource.isSwimSport(this.sportType.intValue()) ? 6.0f : 1.8f;
        if (speed == 0.0f) {
            return f;
        }
        float f2 = 1 / speed;
        return f2 < f ? f2 : f;
    }

    private final long tryReviseTime(int delta, long prevTime) {
        int i;
        List listReversed = CollectionsKt___CollectionsKt.reversed(this.pauseModelList);
        int size = listReversed.size() - 1;
        int pauseDuration = 0;
        if (size < 0) {
            i = -1;
            break;
        }
        i = 0;
        while (true) {
            int i2 = i + 1;
            if (((long) delta) + prevTime >= ((PauseModel) listReversed.get(i)).getPauseEndTime()) {
                break;
            }
            if (i2 > size) {
                i = -1;
                break;
            }
            i = i2;
        }
        if (i == -1) {
            return -1L;
        }
        Iterator it2 = listReversed.subList(i, listReversed.size()).iterator();
        while (it2.hasNext()) {
            pauseDuration += ((PauseModel) it2.next()).getPauseDuration();
        }
        if (pauseDuration == 0) {
            return -1L;
        }
        return (prevTime + ((long) delta)) - ((long) pauseDuration);
    }

    private final void updateGpsPointFromLocation(GPSPoint point, PointTrackLocation location, int index) {
        point.setVersion(this.detailVersion);
        point.mLatitude = location.getPointLatitude();
        point.mLongitude = location.getPointLongitude();
        point.setTime(location.getTime());
        point.setAttr(getFlagList().get(index).intValue());
    }

    public final int calculateAvgHeartRate(int offsetTime, int costtime) {
        boolean z;
        int iNextIndex;
        int iNextIndex2;
        if (this.heartList == null) {
            return -1;
        }
        List<CommonTimeValuePoint> heartList = getHeartList();
        ListIterator<CommonTimeValuePoint> listIterator = heartList.listIterator(heartList.size());
        while (true) {
            z = false;
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().getAbsoluteTime() <= ((long) offsetTime) + getCurrentTrackId()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            iNextIndex = 0;
        }
        long j = this.currentTrackId;
        long jLongValue = ((long) offsetTime) + j + ((long) costtime);
        if (jLongValue > j + this.totalCostTime.longValue()) {
            jLongValue = this.totalCostTime.longValue() + this.currentTrackId;
        }
        List<CommonTimeValuePoint> heartList2 = getHeartList();
        ListIterator<CommonTimeValuePoint> listIterator2 = heartList2.listIterator(heartList2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            if (listIterator2.previous().getAbsoluteTime() <= jLongValue) {
                iNextIndex2 = listIterator2.nextIndex();
                break;
            }
        }
        float value = 0.0f;
        if (iNextIndex >= 0 && iNextIndex <= iNextIndex2) {
            z = true;
        }
        if (!z) {
            return -1;
        }
        Iterator<T> it2 = getHeartList().subList(iNextIndex, iNextIndex2 + 1).iterator();
        while (it2.hasNext()) {
            value += ((CommonTimeValuePoint) it2.next()).getValue();
        }
        return (int) (value / ((iNextIndex2 - iNextIndex) + 1));
    }

    public final void genPauseList(@Nullable String pauseStr) {
        if (pauseStr == null || pauseStr.length() == 0) {
            return;
        }
        this.pauseModelList.clear();
        this.totalPauseTime = 0;
        try {
            for (String str : StringsKt__StringsKt.split$default((CharSequence) pauseStr, new String[]{";"}, false, 0, 6, (Object) null)) {
                int length = str.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str.subSequence(i, length + 1).toString(), new String[]{","}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 5) {
                    long j = Long.parseLong((String) listSplit$default.get(0));
                    int i2 = Integer.parseInt((String) listSplit$default.get(1));
                    if (i2 >= 0) {
                        PauseModel pauseModel = new PauseModel(j, i2, Integer.parseInt((String) listSplit$default.get(2)), Integer.parseInt((String) listSplit$default.get(3)), Integer.parseInt((String) listSplit$default.get(4)));
                        this.totalPauseTime += i2;
                        getPauseModelList().add(pauseModel);
                    }
                }
            }
        } catch (Exception e) {
            LogKit.w2f(TAG, "genPauseList:" + e.getMessage());
        }
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedAltiList() {
        return this.alignedAltiList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedCadenceList() {
        return this.alignedCadenceList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedHeartList() {
        return this.alignedHeartList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedPaceList() {
        return this.alignedPaceList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedPowerMeterList() {
        return this.alignedPowerMeterList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedPressureList() {
        return this.alignedPressureList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedRopeSkipList() {
        return this.alignedRopeSkipList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedSpeedList() {
        return this.alignedSpeedList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedStepFreqList() {
        return this.alignedStepFreqList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedStepStrideList() {
        return this.alignedStepStrideList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedStrokeList() {
        return this.alignedStrokeList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedTemperatureList() {
        return this.alignedTemperatureList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAlignedTimeDeltaAltitudeList() {
        return this.alignedTimeDeltaAltitudeList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getAltiList() {
        List<CommonTimeValuePoint> list = this.altiList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getAltiPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.altiPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @Nullable
    public final List<SportSegmentData> getAutoSegmentDataList() {
        return this.autoSegmentDataList;
    }

    public final int getAverageAltitude() {
        return this.averageAltitude;
    }

    public final float getAvgPace() {
        return this.avgPace;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getCadenceList() {
        List<CommonTimeValuePoint> list = this.cadenceList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getCadencePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.cadencePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CoachSegment> getCoachList() {
        List<CoachSegment> list = this.coachList;
        Objects.requireNonNull(list);
        return list;
    }

    public final long getCurrentTrackId() {
        return this.currentTrackId;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getDailyPerformanceList() {
        List<CommonTimeValuePoint> list = this.dailyPerformanceList;
        Objects.requireNonNull(list);
        return list;
    }

    public final int getDetailVersion() {
        return this.detailVersion;
    }

    @NotNull
    public final List<Integer> getFlagList() {
        List<Integer> list = this.flagList;
        Objects.requireNonNull(list);
        return list;
    }

    @Nullable
    public final List<SportSegmentData> getFuseSegmentDataList() {
        return this.fuseSegmentDataList;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getGolfAngleList() {
        List<CommonTimeValuePoint> list = this.golfAngleList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getGolfAnglePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.golfAnglePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getGolfBeatList() {
        List<CommonTimeValuePoint> list = this.golfBeatList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getGolfBeatPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.golfBeatPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getGolfDownTimeList() {
        List<CommonTimeValuePoint> list = this.golfDownTimeList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getGolfDownTimePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.golfDownTimePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getGolfUpTimeList() {
        List<CommonTimeValuePoint> list = this.golfUpTimeList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getGolfUpTimePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.golfUpTimePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    public final int getHalfStartTime() {
        return this.halfStartTime;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getHeartList() {
        List<CommonTimeValuePoint> list = this.heartList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getHeartPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.heartPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<HeartRateZone> getHrZoneList() {
        List<HeartRateZone> list = this.hrZoneList;
        Objects.requireNonNull(list);
        return list;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final List<SportSegmentData> getIntervalSegmentDataList() {
        return this.intervalSegmentDataList;
    }

    @NotNull
    public final List<KilometreOrMileMarked> getKmMarkedList() {
        List<KilometreOrMileMarked> list = this.kmMarkedList;
        Objects.requireNonNull(list);
        return list;
    }

    @Nullable
    public final List<SportSegmentData> getManualSegmentDataList() {
        return this.manualSegmentDataList;
    }

    @NotNull
    public final List<KilometreOrMileMarked> getMileMarkedList() {
        List<KilometreOrMileMarked> list = this.mileMarkedList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getPaceAlignPointList() {
        List<CommonTimeValuePoint> list = this.paceAlignPointList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getPaceList() {
        List<CommonTimeValuePoint> list = this.paceList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getPacePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.pacePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<PauseModel> getPauseModelList() {
        return this.pauseModelList;
    }

    @NotNull
    public final List<PointTrackLocation> getPointLocationList() {
        List<PointTrackLocation> list = this.pointLocationList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getPowerMeterList() {
        List<CommonTimeValuePoint> list = this.powerMeterList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getPowerMeterPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.powerMeterPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getPressureList() {
        List<CommonTimeValuePoint> list = this.pressureList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getPressurePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.pressurePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    public final int getProvider() {
        return this.provider;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getRopeSkipList() {
        List<CommonTimeValuePoint> list = this.ropeSkipList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getRopeSkipPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.ropeSkipPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @Nullable
    public final List<SportSegmentData> getRopeSkippingSegmentDataList() {
        return this.ropeSkippingSegmentDataList;
    }

    public final int getSamplingInterval() {
        return this.samplingInterval;
    }

    public final int getSegmentTag() {
        return this.segmentTag;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final List<SportSegmentData> getSkiingSegmentDataList() {
        return this.skiingSegmentDataList;
    }

    public final int getSource() {
        return this.source;
    }

    @NotNull
    public final Map<ChartDataType, List<CommonTimeValuePoint>> getSpecialPoints() {
        return this.specialPoints;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getSpeedList() {
        List<CommonTimeValuePoint> list = this.speedList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getSpeedPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.speedPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getSpo2List() {
        List<CommonTimeValuePoint> list = this.spo2List;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getSpo2Peak() {
        PeakIndexTimeValue peakIndexTimeValue = this.spo2Peak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    public final Integer getSportType() {
        return this.sportType;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getStepFreqList() {
        List<CommonTimeValuePoint> list = this.stepFreqList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getStepFreqPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.stepFreqPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getStepStrideList() {
        List<CommonTimeValuePoint> list = this.stepStrideList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getStepStridePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.stepStridePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getStrokeList() {
        List<CommonTimeValuePoint> list = this.strokeList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getStrokePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.strokePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getTemperatureList() {
        List<CommonTimeValuePoint> list = this.temperatureList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final PeakIndexTimeValue getTemperaturePeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.temperaturePeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final PeakIndexTimeValue getTimeDeltaAltiPeak() {
        PeakIndexTimeValue peakIndexTimeValue = this.timeDeltaAltiPeak;
        Objects.requireNonNull(peakIndexTimeValue);
        return peakIndexTimeValue;
    }

    @NotNull
    public final List<CommonTimeValuePoint> getTimeDeltaAltitudeList() {
        List<CommonTimeValuePoint> list = this.timeDeltaAltitudeList;
        Objects.requireNonNull(list);
        return list;
    }

    @NotNull
    public final List<Long> getTimeList() {
        List<Long> list = this.timeList;
        Objects.requireNonNull(list);
        return list;
    }

    public final Integer getTotalCostTime() {
        return this.totalCostTime;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    @Nullable
    public final List<SportSegmentData> getTrainSegmentDataList() {
        return this.trainSegmentDataList;
    }

    public final void parseCadenceList(@Nullable String bulkCadence) {
        setCadencePeak(new PeakIndexTimeValue(ChartDataType.CADENCE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setCadenceList(new ArrayList());
        parseCommonTimeDeltaAndValueList(bulkCadence, getCadenceList(), getCadencePeak());
    }

    public final void parseExactSpeedAndPaceList(@Nullable String bulkSpeed) {
        List<String> list;
        float f;
        int i;
        checkIsSpeedAndPaceNull();
        List<String> bulkStrAsList = formatBulkStrAsList(bulkSpeed);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        int i2 = 0;
        List<String> bulkStrAsList2 = !StringsKt__StringsKt.contains$default((CharSequence) bulkStrAsList.get(0), (CharSequence) ",", false, 2, (Object) null) ? formatBulkStrAsList(this.sportDetailData.getBulktime()) : CollectionsKt__CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(this.currentTrackId, 0.0f);
        long j = this.currentTrackId;
        int i3 = 0;
        for (Object obj : bulkStrAsList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List<String> listSplit = new Regex(",").split((String) obj, i2);
            if (listSplit.size() == 1 && (!bulkStrAsList2.isEmpty())) {
                String[] strArr = new String[2];
                strArr[i2] = bulkStrAsList2.get(i3);
                strArr[1] = listSplit.get(i2);
                listSplit = CollectionsKt__CollectionsKt.mutableListOf(strArr);
            }
            long jTryReviseTime = tryReviseTime(Integer.parseInt(listSplit.get(i2)), j);
            if (jTryReviseTime == -1) {
                jTryReviseTime = commonTimeValuePoint.getAbsoluteTime() + ((long) Integer.parseInt(listSplit.get(i2)));
                i2 = 0;
            }
            long j2 = j + ((long) Integer.parseInt(listSplit.get(i2)));
            CommonTimeValuePoint commonTimeValuePoint2 = new CommonTimeValuePoint(jTryReviseTime, Float.parseFloat(listSplit.get(1)));
            float fSpeed2Pace = speed2Pace(commonTimeValuePoint2.getValue());
            float value = commonTimeValuePoint2.getValue();
            float value2 = i3 > 0 ? commonTimeValuePoint.getValue() : -1.0f;
            if (i3 < bulkStrAsList.size() - 1) {
                List<String> listSplit2 = new Regex(",").split(bulkStrAsList.get(i4), 0);
                if (listSplit2.size() == 1 && (!bulkStrAsList2.isEmpty())) {
                    list = bulkStrAsList2;
                    i = 1;
                    listSplit2 = CollectionsKt__CollectionsKt.mutableListOf(list.get(i4), listSplit2.get(0));
                } else {
                    list = bulkStrAsList2;
                    i = 1;
                }
                f = Float.parseFloat(listSplit2.get(i));
            } else {
                bulkStrAsList = bulkStrAsList;
                list = bulkStrAsList2;
                f = -1.0f;
            }
            fillSpeedListAndPeak(commonTimeValuePoint2.getAbsoluteTime(), commonTimeValuePoint2.getValue());
            if (value2 >= 0.0f && f >= 0.0f && checkIsSpecialPoint(ChartDataType.SPEED_CHART_TYPE, value2, value, f)) {
                arrayList2.add(new CommonTimeValuePoint(commonTimeValuePoint2.getAbsoluteTime(), value));
            }
            if (SportDataVerificationKt.isValidPace(fSpeed2Pace, getSportType().intValue())) {
                if (value == 0.0f) {
                    fillPaceListNoPeak(commonTimeValuePoint2.getAbsoluteTime(), fSpeed2Pace);
                } else {
                    fillPaceListAndPeak(commonTimeValuePoint2.getAbsoluteTime(), fSpeed2Pace);
                }
                float fSpeed2Pace2 = speed2Pace(value2);
                float fSpeed2Pace3 = speed2Pace(f);
                if (SportDataVerificationKt.isValidPace(fSpeed2Pace2, getSportType().intValue()) && SportDataVerificationKt.isValidPace(fSpeed2Pace3, getSportType().intValue()) && checkIsSpecialPoint(ChartDataType.SPEED_CHART_TYPE, value2, value, f)) {
                    arrayList.add(new CommonTimeValuePoint(commonTimeValuePoint2.getAbsoluteTime(), fSpeed2Pace));
                }
            }
            commonTimeValuePoint = commonTimeValuePoint2;
            i3 = i4;
            bulkStrAsList2 = list;
            bulkStrAsList = bulkStrAsList;
            j = j2;
            i2 = 0;
        }
        if (getPaceAlignPointList().isEmpty()) {
            getPaceAlignPointList().addAll(getPaceList());
        }
        if (!arrayList.isEmpty()) {
            this.specialPoints.put(ChartDataType.PACE_CHART_TYPE, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            this.specialPoints.put(ChartDataType.SPEED_CHART_TYPE, arrayList2);
        }
    }

    public final void parseGolfSwingRtList(@Nullable String golfSwing) {
        LogKit.w2f("gaobq", String.valueOf(golfSwing));
        List<String> bulkStrAsList = formatBulkStrAsList(golfSwing);
        initGolfAngleList();
        initGolfBeatList();
        initGolfUpTimeList();
        initGolfDownTimeList();
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuffer stringBuffer2 = new StringBuffer("");
        StringBuffer stringBuffer3 = new StringBuffer("");
        StringBuffer stringBuffer4 = new StringBuffer("");
        int i = 0;
        for (Object obj : bulkStrAsList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) obj, new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 5) {
                stringBuffer.append((String) listSplit$default.get(0));
                stringBuffer.append(",");
                stringBuffer.append((String) listSplit$default.get(1));
                stringBuffer.append(";");
                stringBuffer2.append((String) listSplit$default.get(0));
                stringBuffer2.append(",");
                stringBuffer2.append((String) listSplit$default.get(2));
                stringBuffer2.append(";");
                stringBuffer3.append((String) listSplit$default.get(0));
                stringBuffer3.append(",");
                stringBuffer3.append((String) listSplit$default.get(3));
                stringBuffer3.append(";");
                stringBuffer4.append((String) listSplit$default.get(0));
                stringBuffer4.append(",");
                stringBuffer4.append((String) listSplit$default.get(4));
                stringBuffer4.append(";");
            }
            i = i2;
        }
        parseGolfAngleList(stringBuffer.toString());
        parseGolfBeatList(stringBuffer2.toString());
        parseGolfUpTimeList(stringBuffer3.toString());
        parseGolfDowntimeList(stringBuffer4.toString());
        LogKit.w2f("gaobq", " golf uptime :" + getGolfUpTimeList().size());
    }

    public final void parseHeartList(@Nullable String bulkHr) {
        setHeartPeak(new PeakIndexTimeValue(ChartDataType.HR_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setHeartList(new ArrayList());
        ArrayList arrayList = new ArrayList();
        List<String> bulkStrAsList = formatBulkStrAsList(bulkHr);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        parseDeltaTimeAndDeltaValue(getHeartList(), arrayList, getHeartPeak(), this.currentTrackId, bulkStrAsList);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    public final void parsePointLocationList(@Nullable String bulkGps) {
        setPointLocationList(new ArrayList());
        List<String> bulkStrAsList = formatBulkStrAsList(bulkGps);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        int i = 0;
        long j = 0;
        long j2 = 0;
        for (Object obj : bulkStrAsList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) obj, new String[]{","}, false, 0, 6, (Object) null);
            long jLongValue = getTimeList().size() > i ? getTimeList().get(i).longValue() : 0L;
            if (listSplit$default.isEmpty()) {
                getPointLocationList().add(new PointTrackLocation(jLongValue, 181.0d, 181.0d));
            } else if (((CharSequence) listSplit$default.get(0)).length() == 0) {
                getPointLocationList().add(new PointTrackLocation(jLongValue, 181.0d, 181.0d));
            } else if (((CharSequence) listSplit$default.get(1)).length() == 0) {
                getPointLocationList().add(new PointTrackLocation(jLongValue, 181.0d, 181.0d));
            } else {
                j += Long.parseLong((String) listSplit$default.get(0));
                j2 += Long.parseLong((String) listSplit$default.get(1));
                double d = 100000000;
                getPointLocationList().add(new PointTrackLocation(jLongValue, RunUtils.scaleDouble(j / d, 8), RunUtils.scaleDouble(j2 / d, 8)));
            }
            i = i2;
        }
    }

    public final void parsePowerMeterList(@Nullable String power) {
        setPowerMeterPeak(new PeakIndexTimeValue(ChartDataType.ROPE_SKIP_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setPowerMeterList(new ArrayList());
        parseCommonTimeDeltaAndValueList(power, getPowerMeterList(), getPowerMeterPeak());
    }

    public final void parsePressureList(@Nullable String bulkPressure) {
        setPressurePeak(new PeakIndexTimeValue(ChartDataType.PRESUURE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setPressureList(new ArrayList());
        List<String> bulkStrAsList = formatBulkStrAsList(bulkPressure);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        parseDeltaTimeAndDeltaValue(getPressureList(), new ArrayList(), getPressurePeak(), this.currentTrackId, bulkStrAsList);
        samplingPressureList();
    }

    public final void parseRopeSkipList(@Nullable String bulkRopeSkip) {
        setRopeSkipPeak(new PeakIndexTimeValue(ChartDataType.ROPE_SKIP_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setRopeSkipList(new ArrayList());
        parseCommonTimeDeltaAndValueList(bulkRopeSkip, getRopeSkipList(), getRopeSkipPeak());
    }

    public final void parseSpo2List(@Nullable String bulkSpo2) {
        setSpo2Peak(new PeakIndexTimeValue(ChartDataType.SPO2_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setSpo2List(new ArrayList());
        List<String> bulkStrAsList = formatBulkStrAsList(bulkSpo2);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        parseDeltaTimeAndDeltaValue(getSpo2List(), new ArrayList(), getSpo2Peak(), this.currentTrackId, bulkStrAsList);
    }

    public final void parseStepGaitList(@Nullable String bulkGait) {
        float f;
        float f2;
        ChartDataType chartDataType = ChartDataType.STEP_FREQ_CHART_TYPE;
        float f3 = Constants.PEAK_MINEST_VALUE;
        setStepFreqPeak(new PeakIndexTimeValue(chartDataType, -1L, Float.MAX_VALUE, -1L, f3));
        setStepStridePeak(new PeakIndexTimeValue(ChartDataType.STEP_STRIDE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, f3));
        setStepFreqList(new ArrayList());
        setStepStrideList(new ArrayList());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<String> bulkStrAsList = formatBulkStrAsList(bulkGait);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        CommonTimeValuePoint commonTimeValuePoint = new CommonTimeValuePoint(this.currentTrackId, 0.0f);
        long j = this.currentTrackId;
        Iterator it2 = bulkStrAsList.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i2++;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) next, new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.size() > 2) {
                long jTryReviseTime = tryReviseTime(Integer.parseInt((String) listSplit$default.get(i)), j);
                if (jTryReviseTime == -1) {
                    jTryReviseTime = commonTimeValuePoint.getAbsoluteTime() + ((long) Integer.parseInt((String) listSplit$default.get(i)));
                }
                long j2 = jTryReviseTime;
                int i3 = i2;
                long j3 = j + ((long) Integer.parseInt((String) listSplit$default.get(i)));
                commonTimeValuePoint = new CommonTimeValuePoint(j2, Float.parseFloat((String) listSplit$default.get(2)));
                getStepStrideList().add(commonTimeValuePoint);
                fillPeakValue(getStepStridePeak(), commonTimeValuePoint);
                float f4 = i3 > 0 ? Float.parseFloat((String) StringsKt__StringsKt.split$default((CharSequence) bulkStrAsList.get(i3 - 1), new String[]{","}, false, 0, 6, (Object) null).get(2)) : -1.0f;
                float f5 = i3 < bulkStrAsList.size() + (-1) ? Float.parseFloat((String) StringsKt__StringsKt.split$default((CharSequence) bulkStrAsList.get(i2), new String[]{","}, false, 0, 6, (Object) null).get(2)) : -1.0f;
                if (f4 > 0.0f && f5 > 0.0f && checkIsSpecialPoint(getStepStridePeak().getDataType(), f4, commonTimeValuePoint.getValue(), f5)) {
                    arrayList2.add(commonTimeValuePoint);
                }
                if (listSplit$default.size() == 4) {
                    CommonTimeValuePoint commonTimeValuePoint2 = new CommonTimeValuePoint(j2, Float.parseFloat((String) listSplit$default.get(3)));
                    getStepFreqList().add(commonTimeValuePoint2);
                    fillPeakValue(getStepFreqPeak(), commonTimeValuePoint2);
                    float f6 = i3 > 0 ? Float.parseFloat((String) StringsKt__StringsKt.split$default((CharSequence) bulkStrAsList.get(i3 - 1), new String[]{","}, false, 0, 6, (Object) null).get(3)) : -1.0f;
                    if (i3 < bulkStrAsList.size() - 1) {
                        f2 = Float.parseFloat((String) StringsKt__StringsKt.split$default((CharSequence) bulkStrAsList.get(i2), new String[]{","}, false, 0, 6, (Object) null).get(3));
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        f2 = -1.0f;
                    }
                    if (f6 > f && f2 > f && checkIsSpecialPoint(getStepFreqPeak().getDataType(), f6, commonTimeValuePoint2.getValue(), f2)) {
                        arrayList.add(commonTimeValuePoint2);
                    }
                }
                it2 = it2;
                j = j3;
                i = 0;
            }
        }
        if (!arrayList2.isEmpty()) {
            this.specialPoints.put(ChartDataType.STEP_STRIDE_CHART_TYPE, arrayList2);
        }
        if (!arrayList.isEmpty()) {
            this.specialPoints.put(ChartDataType.STEP_FREQ_CHART_TYPE, arrayList);
        }
    }

    public final void parseStrokeSpeedOrRateList(@Nullable String bulkStroke) {
        setStrokePeak(new PeakIndexTimeValue(ChartDataType.STROKE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setStrokeList(new ArrayList());
        parseCommonTimeDeltaAndValueList(bulkStroke, getStrokeList(), getStrokePeak());
    }

    public final void parseTemperatureList(@Nullable String bulkTemp) {
        setTemperaturePeak(new PeakIndexTimeValue(ChartDataType.TEMPERATURE_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setTemperatureList(new ArrayList());
        List<String> bulkStrAsList = formatBulkStrAsList(bulkTemp);
        if (bulkStrAsList.isEmpty()) {
            return;
        }
        parseDeltaTimeAndDeltaValue(getTemperatureList(), new ArrayList(), getTemperaturePeak(), this.currentTrackId, bulkStrAsList);
    }

    public final void parseTimeDeltaAltitudeList(@Nullable String bulkTimeDeltaAltitude) {
        setTimeDeltaAltiPeak(new PeakIndexTimeValue(ChartDataType.TIME_DELTA_ALTI_CHART_TYPE, -1L, Float.MAX_VALUE, -1L, Constants.PEAK_MINEST_VALUE));
        setTimeDeltaAltitudeList(new ArrayList());
        parseCommonTimeDeltaAndValueList(bulkTimeDeltaAltitude, getTimeDeltaAltitudeList(), getTimeDeltaAltiPeak());
        if (getTimeDeltaAltitudeList().size() > 0) {
            float value = 0.0f;
            Iterator<T> it2 = getTimeDeltaAltitudeList().iterator();
            while (it2.hasNext()) {
                value += ((CommonTimeValuePoint) it2.next()).getValue();
            }
            this.averageAltitude = (int) (value / getTimeDeltaAltitudeList().size());
        }
    }

    public final void processAllRawDatas() {
        genPauseList(this.sportDetailData.getBulkpause());
        parseFlagList(this.sportDetailData.getBulkflag());
        String bulkspeed = this.sportDetailData.getBulkspeed();
        parsePaceAndAltitudeAndTimeList(this.sportDetailData.getBulkpace(), this.sportDetailData.getBulkal(), this.sportDetailData.getBulktime(), bulkspeed == null || bulkspeed.length() == 0);
        parsePointLocationList(this.sportDetailData.getBulkll());
        parseExactSpeedAndPaceList(this.sportDetailData.getBulkspeed());
        parseStepGaitList(this.sportDetailData.getBulkgait());
        parseHeartList(this.sportDetailData.getBulkhr());
        parseSpo2List(this.sportDetailData.getBulkspo2());
        parseStrokeSpeedOrRateList(this.sportDetailData.getStrokeSpeed());
        parseCadenceList(this.sportDetailData.getCadence());
        parseRopeSkipList(this.sportDetailData.getBulkRopeSkippingFreq());
        parseTimeDeltaAltitudeList(this.sportDetailData.getTimeDeltaAltitude());
        parseKmAndMileMarkedList(this.sportDetailData.getKilomarked(), this.sportDetailData.getMilemarked());
        parseDailyPerformanceList(this.sportDetailData.getDailyPerformance(), RunnerData.getRunner().isMetric());
        Integer hrSettingType = this.trackRecord.getHrSettingType();
        parseHeartRateZoneList(hrSettingType == null ? -1 : hrSettingType.intValue(), this.trackRecord.getHrZone(), getHeartList());
        parseTemperatureList(this.sportDetailData.getBulkTemperature());
        parsePressureList(this.sportDetailData.getBulkPressure());
        parseGolfSwingRtList(this.sportDetailData.getGolfSwingRtData());
        parsePowerMeterList(this.sportDetailData.getPowerMeter());
        String kilomarked = this.sportDetailData.getKilomarked();
        if (kilomarked == null || kilomarked.length() == 0) {
            getKmOrMileMarkedByOtherRawData(this.sportDetailData.getBulkdistance(), 0);
        }
        String milemarked = this.sportDetailData.getMilemarked();
        if (milemarked == null || milemarked.length() == 0) {
            getKmOrMileMarkedByOtherRawData(this.sportDetailData.getBulkdistance(), 1);
        }
        alignAllDataByTime();
        String lap = this.sportDetailData.getLap();
        if (lap == null || lap.length() == 0) {
            return;
        }
        List<List<SportSegmentData>> listInitSegmentData = SportDetailSegmentParser.INSTANCE.initSegmentData(this.sportDetailData.getLap());
        this.autoSegmentDataList = listInitSegmentData.get(0);
        this.manualSegmentDataList = listInitSegmentData.get(1);
        this.intervalSegmentDataList = listInitSegmentData.get(2);
        this.skiingSegmentDataList = listInitSegmentData.get(3);
        this.ropeSkippingSegmentDataList = listInitSegmentData.get(4);
        this.fuseSegmentDataList = listInitSegmentData.get(5);
        this.trainSegmentDataList = listInitSegmentData.get(6);
    }

    public final void setAlignedAltiList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedAltiList = list;
    }

    public final void setAlignedCadenceList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedCadenceList = list;
    }

    public final void setAlignedHeartList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedHeartList = list;
    }

    public final void setAlignedPaceList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedPaceList = list;
    }

    public final void setAlignedPowerMeterList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedPowerMeterList = list;
    }

    public final void setAlignedPressureList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedPressureList = list;
    }

    public final void setAlignedRopeSkipList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedRopeSkipList = list;
    }

    public final void setAlignedSpeedList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedSpeedList = list;
    }

    public final void setAlignedStepFreqList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedStepFreqList = list;
    }

    public final void setAlignedStepStrideList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedStepStrideList = list;
    }

    public final void setAlignedStrokeList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedStrokeList = list;
    }

    public final void setAlignedTemperatureList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedTemperatureList = list;
    }

    public final void setAlignedTimeDeltaAltitudeList(@NotNull List<CommonTimeValuePoint> list) {
        this.alignedTimeDeltaAltitudeList = list;
    }

    public final void setAltiList(@NotNull List<CommonTimeValuePoint> list) {
        this.altiList = list;
    }

    public final void setAltiPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.altiPeak = peakIndexTimeValue;
    }

    public final void setAutoSegmentDataList(@Nullable List<SportSegmentData> list) {
        this.autoSegmentDataList = list;
    }

    public final void setAverageAltitude(int i) {
        this.averageAltitude = i;
    }

    public final void setCadenceList(@NotNull List<CommonTimeValuePoint> list) {
        this.cadenceList = list;
    }

    public final void setCadencePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.cadencePeak = peakIndexTimeValue;
    }

    public final void setCoachList(@NotNull List<CoachSegment> list) {
        this.coachList = list;
    }

    public final void setCoachSegmentList(@Nullable String coachSegment) {
        setCoachList(new ArrayList());
        int i = 0;
        if (coachSegment == null || coachSegment.length() == 0) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(coachSegment);
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                getCoachList().add(new CoachSegment(jSONObject.optString("name"), jSONObject.optInt("type"), jSONObject.optInt(CoachSegment.MAX_HR), jSONObject.optInt(CoachSegment.AVG_HR), jSONObject.optInt("sportType")));
                if (i2 >= length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (JSONException e) {
            LogKit.i(TAG, "parase coachSegment error:  " + e.getMessage());
        }
    }

    public final void setCurrentTrackId(long j) {
        this.currentTrackId = j;
    }

    public final void setDailyPerformanceList(@NotNull List<CommonTimeValuePoint> list) {
        this.dailyPerformanceList = list;
    }

    public final void setDetailVersion(int i) {
        this.detailVersion = i;
    }

    public final void setFlagList(@NotNull List<Integer> list) {
        this.flagList = list;
    }

    public final void setFuseSegmentDataList(@Nullable List<SportSegmentData> list) {
        this.fuseSegmentDataList = list;
    }

    public final void setGolfAngleList(@NotNull List<CommonTimeValuePoint> list) {
        this.golfAngleList = list;
    }

    public final void setGolfAnglePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.golfAnglePeak = peakIndexTimeValue;
    }

    public final void setGolfBeatList(@NotNull List<CommonTimeValuePoint> list) {
        this.golfBeatList = list;
    }

    public final void setGolfBeatPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.golfBeatPeak = peakIndexTimeValue;
    }

    public final void setGolfDownTimeList(@NotNull List<CommonTimeValuePoint> list) {
        this.golfDownTimeList = list;
    }

    public final void setGolfDownTimePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.golfDownTimePeak = peakIndexTimeValue;
    }

    public final void setGolfUpTimeList(@NotNull List<CommonTimeValuePoint> list) {
        this.golfUpTimeList = list;
    }

    public final void setGolfUpTimePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.golfUpTimePeak = peakIndexTimeValue;
    }

    public final void setHeartList(@NotNull List<CommonTimeValuePoint> list) {
        this.heartList = list;
    }

    public final void setHeartPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.heartPeak = peakIndexTimeValue;
    }

    public final void setHrZoneList(@NotNull List<HeartRateZone> list) {
        this.hrZoneList = list;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setIntervalSegmentDataList(@Nullable List<SportSegmentData> list) {
        this.intervalSegmentDataList = list;
    }

    public final void setKmMarkedList(@NotNull List<KilometreOrMileMarked> list) {
        this.kmMarkedList = list;
    }

    public final void setManualSegmentDataList(@Nullable List<SportSegmentData> list) {
        this.manualSegmentDataList = list;
    }

    public final void setMileMarkedList(@NotNull List<KilometreOrMileMarked> list) {
        this.mileMarkedList = list;
    }

    public final void setPaceAlignPointList(@NotNull List<CommonTimeValuePoint> list) {
        this.paceAlignPointList = list;
    }

    public final void setPaceList(@NotNull List<CommonTimeValuePoint> list) {
        this.paceList = list;
    }

    public final void setPacePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.pacePeak = peakIndexTimeValue;
    }

    public final void setPointLocationList(@NotNull List<PointTrackLocation> list) {
        this.pointLocationList = list;
    }

    public final void setPowerMeterList(@NotNull List<CommonTimeValuePoint> list) {
        this.powerMeterList = list;
    }

    public final void setPowerMeterPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.powerMeterPeak = peakIndexTimeValue;
    }

    public final void setPressureList(@NotNull List<CommonTimeValuePoint> list) {
        this.pressureList = list;
    }

    public final void setPressurePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.pressurePeak = peakIndexTimeValue;
    }

    public final void setRopeSkipList(@NotNull List<CommonTimeValuePoint> list) {
        this.ropeSkipList = list;
    }

    public final void setRopeSkipPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.ropeSkipPeak = peakIndexTimeValue;
    }

    public final void setRopeSkippingSegmentDataList(@Nullable List<SportSegmentData> list) {
        this.ropeSkippingSegmentDataList = list;
    }

    public final void setSamplingInterval(int i) {
        this.samplingInterval = i;
    }

    public final void setSegmentTag(int i) {
        this.segmentTag = i;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setSkiingSegmentDataList(@Nullable List<SportSegmentData> list) {
        this.skiingSegmentDataList = list;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setSpecialPoints(@NotNull Map<ChartDataType, List<CommonTimeValuePoint>> map) {
        this.specialPoints = map;
    }

    public final void setSpeedList(@NotNull List<CommonTimeValuePoint> list) {
        this.speedList = list;
    }

    public final void setSpeedPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.speedPeak = peakIndexTimeValue;
    }

    public final void setSpo2List(@NotNull List<CommonTimeValuePoint> list) {
        this.spo2List = list;
    }

    public final void setSpo2Peak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.spo2Peak = peakIndexTimeValue;
    }

    public final void setSportType(Integer num) {
        this.sportType = num;
    }

    public final void setStepFreqList(@NotNull List<CommonTimeValuePoint> list) {
        this.stepFreqList = list;
    }

    public final void setStepFreqPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.stepFreqPeak = peakIndexTimeValue;
    }

    public final void setStepStrideList(@NotNull List<CommonTimeValuePoint> list) {
        this.stepStrideList = list;
    }

    public final void setStepStridePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.stepStridePeak = peakIndexTimeValue;
    }

    public final void setStrokeList(@NotNull List<CommonTimeValuePoint> list) {
        this.strokeList = list;
    }

    public final void setStrokePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.strokePeak = peakIndexTimeValue;
    }

    public final void setTemperatureList(@NotNull List<CommonTimeValuePoint> list) {
        this.temperatureList = list;
    }

    public final void setTemperaturePeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.temperaturePeak = peakIndexTimeValue;
    }

    public final void setTimeDeltaAltiPeak(@NotNull PeakIndexTimeValue peakIndexTimeValue) {
        this.timeDeltaAltiPeak = peakIndexTimeValue;
    }

    public final void setTimeDeltaAltitudeList(@NotNull List<CommonTimeValuePoint> list) {
        this.timeDeltaAltitudeList = list;
    }

    public final void setTimeList(@NotNull List<Long> list) {
        this.timeList = list;
    }

    public final void setTrainSegmentDataList(@Nullable List<SportSegmentData> list) {
        this.trainSegmentDataList = list;
    }
}
