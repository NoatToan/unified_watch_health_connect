package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0003\b\u0080\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010#\u0012\b\u0010'\u001a\u0004\u0018\u00010#\u0012\b\u0010(\u001a\u0004\u0018\u00010#\u0012\b\u0010)\u001a\u0004\u0018\u00010#\u0012\b\u0010*\u001a\u0004\u0018\u00010#\u0012\b\u0010+\u001a\u0004\u0018\u00010#\u0012\b\u0010,\u001a\u0004\u0018\u00010#\u0012\b\u0010-\u001a\u0004\u0018\u00010#\u0012\b\u0010.\u001a\u0004\u0018\u00010#\u0012\b\u0010/\u001a\u0004\u0018\u00010#\u0012\b\u00100\u001a\u0004\u0018\u00010#\u0012\b\u00101\u001a\u0004\u0018\u00010#\u0012\b\u00102\u001a\u0004\u0018\u00010#\u0012\b\u00103\u001a\u0004\u0018\u00010#\u0012\b\u00104\u001a\u0004\u0018\u00010\u0004\u0012\b\u00105\u001a\u0004\u0018\u00010\u0004\u0012\b\u00106\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0013\u0012\b\u00108\u001a\u0004\u0018\u00010#\u0012\b\u00109\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010:\u001a\u0004\u0018\u00010#\u0012\b\u0010;\u001a\u0004\u0018\u00010#\u0012\b\u0010<\u001a\u0004\u0018\u00010#\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010@\u001a\u0004\u0018\u00010?\u0012\b\u0010A\u001a\u0004\u0018\u00010#\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bD\u0010ER\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010MR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010K\u001a\u0004\bS\u0010M\"\u0004\bT\u0010UR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bV\u0010MR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010W\u001a\u0004\bX\u0010YR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\bZ\u0010MR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010MR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\b]\u0010MR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\b^\u0010MR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010G\u001a\u0004\b`\u0010IR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010K\u001a\u0004\bb\u0010MR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010K\u001a\u0004\bd\u0010MR$\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\ba\u0010kR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010j\u001a\u0004\bP\u0010kR$\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010f\u001a\u0004\bn\u0010hR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010K\u001a\u0004\bp\u0010MR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010j\u001a\u0004\br\u0010kR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010j\u001a\u0004\bl\u0010kR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010K\u001a\u0004\bu\u0010MR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010K\u001a\u0004\bw\u0010MR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010K\u001a\u0004\by\u0010MR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010K\u001a\u0004\b{\u0010MR\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010K\u001a\u0004\b}\u0010MR\u001c\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010K\u001a\u0004\b\u007f\u0010MR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010K\u001a\u0005\b\u0081\u0001\u0010MR \u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010%\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0083\u0001\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001R \u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0083\u0001\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001R \u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0083\u0001\u001a\u0006\b\u008b\u0001\u0010\u0085\u0001R \u0010(\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0083\u0001\u001a\u0006\b\u008d\u0001\u0010\u0085\u0001R \u0010)\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u0083\u0001\u001a\u0006\b\u008f\u0001\u0010\u0085\u0001R \u0010*\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0083\u0001\u001a\u0006\b\u0091\u0001\u0010\u0085\u0001R \u0010+\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0083\u0001\u001a\u0006\b\u0093\u0001\u0010\u0085\u0001R \u0010,\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0083\u0001\u001a\u0006\b\u0095\u0001\u0010\u0085\u0001R \u0010-\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0083\u0001\u001a\u0006\b\u0097\u0001\u0010\u0085\u0001R \u0010.\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0083\u0001\u001a\u0006\b\u0099\u0001\u0010\u0085\u0001R\u001f\u0010/\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u0083\u0001\u001a\u0005\be\u0010\u0085\u0001R \u00100\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0083\u0001\u001a\u0006\b\u009c\u0001\u0010\u0085\u0001R \u00101\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0083\u0001\u001a\u0006\b\u009e\u0001\u0010\u0085\u0001R \u00102\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u0083\u0001\u001a\u0006\b \u0001\u0010\u0085\u0001R \u00103\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0083\u0001\u001a\u0006\b¢\u0001\u0010\u0085\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0001\u0010K\u001a\u0005\b¤\u0001\u0010MR\u001e\u00105\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0001\u0010K\u001a\u0005\b¦\u0001\u0010MR\u001e\u00106\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010K\u001a\u0005\b¨\u0001\u0010MR%\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\r\n\u0005\b©\u0001\u0010f\u001a\u0004\bv\u0010hR\u001f\u00108\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bª\u0001\u0010\u0083\u0001\u001a\u0005\b[\u0010\u0085\u0001R\u001e\u00109\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0001\u0010K\u001a\u0005\b¬\u0001\u0010MR \u0010:\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0083\u0001\u001a\u0006\b®\u0001\u0010\u0085\u0001R \u0010;\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0083\u0001\u001a\u0006\b°\u0001\u0010\u0085\u0001R \u0010<\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0083\u0001\u001a\u0006\b²\u0001\u0010\u0085\u0001R\u001d\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b³\u0001\u0010G\u001a\u0004\bm\u0010IR\u001d\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b´\u0001\u0010G\u001a\u0004\bo\u0010IR \u0010@\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R \u0010A\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0083\u0001\u001a\u0006\bº\u0001\u0010\u0085\u0001R\u001e\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0001\u0010G\u001a\u0005\b¼\u0001\u0010IR\u001e\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0001\u0010G\u001a\u0005\b¾\u0001\u0010I¨\u0006¿\u0001"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "garminGUID", "profileId", "displayName", "fullName", "userName", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "profileImageUrls", FirebaseAnalytics.Param.LOCATION, "facebookUrl", "twitterUrl", "personalWebsite", "motivation", "bio", "primaryActivity", "", "favoriteActivityTypes", "", "runningTrainingSpeed", "cyclingTrainingSpeed", "favoriteCyclingActivityTypes", "cyclingClassification", "cyclingMaxAvgPower", "swimmingTrainingSpeed", "profileVisibility", "activityStartVisibility", "activityMapVisibility", "courseVisibility", "activityHeartRateVisibility", "activityPowerVisibility", "badgeVisibility", "", "showAge", "showWeight", "showHeight", "showWeightClass", "showAgeRange", "showGender", "showActivityClass", "showVO2Max", "showPersonalRecords", "showLast12Months", "showLifetimeTotals", "showUpcomingEvents", "showRecentFavorites", "showRecentDevice", "showRecentGear", "showBadges", "otherActivity", "otherPrimaryActivity", "otherMotivation", "userRoles", "nameApproved", "userProfileFullName", "makeGolfScorecardsPrivate", "allowGolfLiveScoring", "allowGolfScoringByConnections", "userLevel", "userPoint", "Lorg/joda/time/DateTime;", "levelUpdateDate", "levelIsViewed", "levelPointThreshold", "userPointOffset", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/userprofile/model/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "a", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "c", "j", "d", "getDisplayName", JWKParameterNames.RSA_EXPONENT, "f", "setFullName", "(Ljava/lang/String;)V", "s", "Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", JWKParameterNames.OCT_KEY_VALUE, "()Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "h", IntegerTokenConverter.CONVERTER_KEY, "getFacebookUrl", "getTwitterUrl", "getPersonalWebsite", "l", "getMotivation", "m", "getBio", JWKParameterNames.RSA_MODULUS, "getPrimaryActivity", "o", "Ljava/util/List;", "getFavoriteActivityTypes", "()Ljava/util/List;", "p", "Ljava/lang/Double;", "()Ljava/lang/Double;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getFavoriteCyclingActivityTypes", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getCyclingClassification", "v", "getCyclingMaxAvgPower", "w", "x", "getProfileVisibility", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getActivityStartVisibility", "z", "getActivityMapVisibility", "A", "getCourseVisibility", "B", "getActivityHeartRateVisibility", "C", "getActivityPowerVisibility", "D", "getBadgeVisibility", "E", "Ljava/lang/Boolean;", "getShowAge", "()Ljava/lang/Boolean;", "F", "getShowWeight", "I", "getShowHeight", "P", "getShowWeightClass", "T", "getShowAgeRange", "X", "getShowGender", "Y", "getShowActivityClass", "Z", "getShowVO2Max", "k0", "getShowPersonalRecords", "H0", "getShowLast12Months", "I0", "getShowLifetimeTotals", "J0", "K0", "getShowRecentFavorites", "L0", "getShowRecentDevice", "M0", "getShowRecentGear", "N0", "getShowBadges", "O0", "getOtherActivity", "P0", "getOtherPrimaryActivity", "Q0", "getOtherMotivation", "R0", "S0", "T0", "u", "U0", "getMakeGolfScorecardsPrivate", "V0", "getAllowGolfLiveScoring", "W0", "getAllowGolfScoringByConnections", "X0", "Y0", "Z0", "Lorg/joda/time/DateTime;", "getLevelUpdateDate", "()Lorg/joda/time/DateTime;", "a1", "getLevelIsViewed", "b1", "getLevelPointThreshold", "c1", "getUserPointOffset", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("courseVisibility")
    private final String courseVisibility;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("activityHeartRateVisibility")
    private final String activityHeartRateVisibility;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("activityPowerVisibility")
    private final String activityPowerVisibility;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("badgeVisibility")
    private final String badgeVisibility;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("showAge")
    private final Boolean showAge;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("showWeight")
    private final Boolean showWeight;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("showLast12Months")
    private final Boolean showLast12Months;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("showHeight")
    private final Boolean showHeight;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("showLifetimeTotals")
    private final Boolean showLifetimeTotals;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("showUpcomingEvents")
    private final Boolean showUpcomingEvents;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("showRecentFavorites")
    private final Boolean showRecentFavorites;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("showRecentDevice")
    private final Boolean showRecentDevice;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("showRecentGear")
    private final Boolean showRecentGear;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("showBadges")
    private final Boolean showBadges;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("otherActivity")
    private final String otherActivity;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("showWeightClass")
    private final Boolean showWeightClass;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("otherPrimaryActivity")
    private final String otherPrimaryActivity;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("otherMotivation")
    private final String otherMotivation;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("userRoles")
    private final List<String> userRoles;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("nameApproved")
    private final Boolean nameApproved;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("showAgeRange")
    private final Boolean showAgeRange;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("userProfileFullName")
    private final String userProfileFullName;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("makeGolfScorecardsPrivate")
    private final Boolean makeGolfScorecardsPrivate;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @SerializedName("allowGolfLiveScoring")
    private final Boolean allowGolfLiveScoring;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @SerializedName("allowGolfScoringByConnections")
    private final Boolean allowGolfScoringByConnections;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("showGender")
    private final Boolean showGender;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @SerializedName("userLevel")
    private final Long userLevel;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("showActivityClass")
    private final Boolean showActivityClass;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @SerializedName("userPoint")
    private final Long userPoint;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("showVO2Max")
    private final Boolean showVO2Max;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @SerializedName("levelUpdateDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime levelUpdateDate;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Long id;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelIsViewed")
    private final Boolean levelIsViewed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminGUID")
    private final String garminGUID;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelPointThreshold")
    private final Long levelPointThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileId")
    private final Long profileId;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userPointOffset")
    private final Long userPointOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private String fullName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userName")
    private final String userName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileImageUrls")
    private final j profileImageUrls;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("facebookUrl")
    private final String facebookUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("twitterUrl")
    private final String twitterUrl;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("personalWebsite")
    private final String personalWebsite;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showPersonalRecords")
    private final Boolean showPersonalRecords;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("motivation")
    private final Long motivation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bio")
    private final String bio;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryActivity")
    private final String primaryActivity;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favoriteActivityTypes")
    private final List<String> favoriteActivityTypes;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("runningTrainingSpeed")
    private final Double runningTrainingSpeed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cyclingTrainingSpeed")
    private final Double cyclingTrainingSpeed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favoriteCyclingActivityTypes")
    private final List<String> favoriteCyclingActivityTypes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cyclingClassification")
    private final String cyclingClassification;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cyclingMaxAvgPower")
    private final Double cyclingMaxAvgPower;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("swimmingTrainingSpeed")
    private final Double swimmingTrainingSpeed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileVisibility")
    private final String profileVisibility;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityStartVisibility")
    private final String activityStartVisibility;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityMapVisibility")
    private final String activityMapVisibility;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            Object objValueOf;
            Object objValueOf2;
            Object objValueOf3;
            Object objValueOf4;
            Object objValueOf5;
            Object objValueOf6;
            Object objValueOf7;
            Object objValueOf8;
            Object objValueOf9;
            Object objValueOf10;
            Object objValueOf11;
            Object objValueOf12;
            Object objValueOf13;
            Object objValueOf14;
            Object objValueOf15;
            Object objValueOf16;
            Object obj;
            Object objValueOf17;
            Object objValueOf18;
            Object objValueOf19;
            Object objValueOf20;
            Object objValueOf21;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            String string = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            Long l15 = l14;
            Long l16 = lValueOf2;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            j jVar = (j) parcel.readParcelable(m.class.getClassLoader());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong());
            String string9 = parcel.readString();
            Long l17 = lValueOf3;
            String string10 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Object objValueOf22 = parcel.readInt() == 0 ? l15 : Double.valueOf(parcel.readDouble());
            Object objValueOf23 = parcel.readInt() == 0 ? l15 : Double.valueOf(parcel.readDouble());
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            Double d14 = objValueOf22;
            Double d15 = objValueOf23;
            String string11 = parcel.readString();
            Object objValueOf24 = parcel.readInt() == 0 ? l15 : Double.valueOf(parcel.readDouble());
            Object objValueOf25 = parcel.readInt() == 0 ? l15 : Double.valueOf(parcel.readDouble());
            String string12 = parcel.readString();
            Double d16 = objValueOf24;
            Double d17 = objValueOf25;
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = l15;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf2 = l15;
            } else {
                objValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf3 = l15;
            } else {
                objValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf4 = l15;
            } else {
                objValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf5 = l15;
            } else {
                objValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf6 = l15;
            } else {
                objValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf7 = l15;
            } else {
                objValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf8 = l15;
            } else {
                objValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf9 = l15;
            } else {
                objValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf10 = l15;
            } else {
                objValueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf11 = l15;
            } else {
                objValueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf12 = l15;
            } else {
                objValueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf13 = l15;
            } else {
                objValueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf14 = l15;
            } else {
                objValueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf15 = l15;
            } else {
                objValueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf16 = l15;
                obj = objValueOf16;
            } else {
                objValueOf16 = Boolean.valueOf(parcel.readInt() != 0);
                obj = l15;
            }
            Boolean bool = objValueOf;
            Boolean bool2 = objValueOf2;
            Boolean bool3 = objValueOf5;
            Boolean bool4 = objValueOf8;
            Boolean bool5 = objValueOf11;
            Boolean bool6 = objValueOf14;
            String string19 = parcel.readString();
            boolean z14 = false;
            Boolean bool7 = objValueOf3;
            Boolean bool8 = objValueOf6;
            Boolean bool9 = objValueOf9;
            Boolean bool10 = objValueOf12;
            Boolean bool11 = objValueOf15;
            String string20 = parcel.readString();
            Boolean bool12 = objValueOf4;
            Boolean bool13 = objValueOf7;
            Boolean bool14 = objValueOf10;
            Boolean bool15 = objValueOf13;
            Boolean bool16 = objValueOf16;
            String string21 = parcel.readString();
            Object objValueOf26 = obj;
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                objValueOf17 = objValueOf26;
            } else {
                objValueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string22 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf18 = objValueOf26;
            } else {
                objValueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf19 = objValueOf26;
            } else {
                objValueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                objValueOf20 = objValueOf26;
            } else {
                objValueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Object objValueOf27 = parcel.readInt() == 0 ? objValueOf26 : Long.valueOf(parcel.readLong());
            Object objValueOf28 = parcel.readInt() == 0 ? objValueOf26 : Long.valueOf(parcel.readLong());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                objValueOf21 = objValueOf26;
            } else {
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                objValueOf21 = Boolean.valueOf(z14);
            }
            Object objValueOf29 = parcel.readInt() == 0 ? objValueOf26 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                objValueOf26 = Long.valueOf(parcel.readLong());
            }
            return new m(lValueOf, string, l16, string2, string3, string4, jVar, string5, string6, string7, string8, l17, string9, string10, arrayListCreateStringArrayList, d14, d15, arrayListCreateStringArrayList2, string11, d16, d17, string12, string13, string14, string15, string16, string17, string18, bool, bool2, bool7, bool12, bool3, bool8, bool13, bool4, bool9, bool14, bool5, bool10, bool15, bool6, bool11, bool16, string19, string20, string21, arrayListCreateStringArrayList3, objValueOf17, string22, objValueOf18, objValueOf19, objValueOf20, objValueOf27, objValueOf28, dateTime, objValueOf21, objValueOf29, objValueOf26);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(Long l14, String str, Long l15, String str2, String str3, String str4, j jVar, String str5, String str6, String str7, String str8, Long l16, String str9, String str10, List<String> list, Double d14, Double d15, List<String> list2, String str11, Double d16, Double d17, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, String str19, String str20, String str21, List<String> list3, Boolean bool17, String str22, Boolean bool18, Boolean bool19, Boolean bool20, Long l17, Long l18, DateTime dateTime, Boolean bool21, Long l19, Long l24) {
        this.id = l14;
        this.garminGUID = str;
        this.profileId = l15;
        this.displayName = str2;
        this.fullName = str3;
        this.userName = str4;
        this.profileImageUrls = jVar;
        this.location = str5;
        this.facebookUrl = str6;
        this.twitterUrl = str7;
        this.personalWebsite = str8;
        this.motivation = l16;
        this.bio = str9;
        this.primaryActivity = str10;
        this.favoriteActivityTypes = list;
        this.runningTrainingSpeed = d14;
        this.cyclingTrainingSpeed = d15;
        this.favoriteCyclingActivityTypes = list2;
        this.cyclingClassification = str11;
        this.cyclingMaxAvgPower = d16;
        this.swimmingTrainingSpeed = d17;
        this.profileVisibility = str12;
        this.activityStartVisibility = str13;
        this.activityMapVisibility = str14;
        this.courseVisibility = str15;
        this.activityHeartRateVisibility = str16;
        this.activityPowerVisibility = str17;
        this.badgeVisibility = str18;
        this.showAge = bool;
        this.showWeight = bool2;
        this.showHeight = bool3;
        this.showWeightClass = bool4;
        this.showAgeRange = bool5;
        this.showGender = bool6;
        this.showActivityClass = bool7;
        this.showVO2Max = bool8;
        this.showPersonalRecords = bool9;
        this.showLast12Months = bool10;
        this.showLifetimeTotals = bool11;
        this.showUpcomingEvents = bool12;
        this.showRecentFavorites = bool13;
        this.showRecentDevice = bool14;
        this.showRecentGear = bool15;
        this.showBadges = bool16;
        this.otherActivity = str19;
        this.otherPrimaryActivity = str20;
        this.otherMotivation = str21;
        this.userRoles = list3;
        this.nameApproved = bool17;
        this.userProfileFullName = str22;
        this.makeGolfScorecardsPrivate = bool18;
        this.allowGolfLiveScoring = bool19;
        this.allowGolfScoringByConnections = bool20;
        this.userLevel = l17;
        this.userPoint = l18;
        this.levelUpdateDate = dateTime;
        this.levelIsViewed = bool21;
        this.levelPointThreshold = l19;
        this.userPointOffset = l24;
    }

    public static m b(m mVar, String str) {
        Boolean bool = Boolean.TRUE;
        Long l14 = mVar.id;
        String str2 = mVar.garminGUID;
        Long l15 = mVar.profileId;
        String str3 = mVar.displayName;
        String str4 = mVar.userName;
        j jVar = mVar.profileImageUrls;
        String str5 = mVar.location;
        String str6 = mVar.facebookUrl;
        String str7 = mVar.twitterUrl;
        String str8 = mVar.personalWebsite;
        Long l16 = mVar.motivation;
        String str9 = mVar.bio;
        String str10 = mVar.primaryActivity;
        List<String> list = mVar.favoriteActivityTypes;
        Double d14 = mVar.runningTrainingSpeed;
        Double d15 = mVar.cyclingTrainingSpeed;
        List<String> list2 = mVar.favoriteCyclingActivityTypes;
        String str11 = mVar.cyclingClassification;
        Double d16 = mVar.cyclingMaxAvgPower;
        Double d17 = mVar.swimmingTrainingSpeed;
        String str12 = mVar.profileVisibility;
        String str13 = mVar.activityStartVisibility;
        String str14 = mVar.activityMapVisibility;
        String str15 = mVar.courseVisibility;
        String str16 = mVar.activityHeartRateVisibility;
        String str17 = mVar.activityPowerVisibility;
        String str18 = mVar.badgeVisibility;
        Boolean bool2 = mVar.showAge;
        Boolean bool3 = mVar.showWeight;
        Boolean bool4 = mVar.showHeight;
        Boolean bool5 = mVar.showWeightClass;
        Boolean bool6 = mVar.showAgeRange;
        Boolean bool7 = mVar.showGender;
        Boolean bool8 = mVar.showActivityClass;
        Boolean bool9 = mVar.showVO2Max;
        Boolean bool10 = mVar.showPersonalRecords;
        Boolean bool11 = mVar.showLast12Months;
        Boolean bool12 = mVar.showLifetimeTotals;
        Boolean bool13 = mVar.showUpcomingEvents;
        Boolean bool14 = mVar.showRecentFavorites;
        Boolean bool15 = mVar.showRecentDevice;
        Boolean bool16 = mVar.showRecentGear;
        Boolean bool17 = mVar.showBadges;
        String str19 = mVar.otherActivity;
        String str20 = mVar.otherPrimaryActivity;
        String str21 = mVar.otherMotivation;
        List<String> list3 = mVar.userRoles;
        String str22 = mVar.userProfileFullName;
        Boolean bool18 = mVar.makeGolfScorecardsPrivate;
        Boolean bool19 = mVar.allowGolfLiveScoring;
        Boolean bool20 = mVar.allowGolfScoringByConnections;
        Long l17 = mVar.userLevel;
        Long l18 = mVar.userPoint;
        DateTime dateTime = mVar.levelUpdateDate;
        Boolean bool21 = mVar.levelIsViewed;
        Long l19 = mVar.levelPointThreshold;
        Long l24 = mVar.userPointOffset;
        mVar.getClass();
        return new m(l14, str2, l15, str3, str, str4, jVar, str5, str6, str7, str8, l16, str9, str10, list, d14, d15, list2, str11, d16, d17, str12, str13, str14, str15, str16, str17, str18, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, str19, str20, str21, list3, bool, str22, bool18, bool19, bool20, l17, l18, dateTime, bool21, l19, l24);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getCyclingTrainingSpeed() {
        return this.cyclingTrainingSpeed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.id, mVar.id) && s.g(this.garminGUID, mVar.garminGUID) && s.g(this.profileId, mVar.profileId) && s.g(this.displayName, mVar.displayName) && s.g(this.fullName, mVar.fullName) && s.g(this.userName, mVar.userName) && s.g(this.profileImageUrls, mVar.profileImageUrls) && s.g(this.location, mVar.location) && s.g(this.facebookUrl, mVar.facebookUrl) && s.g(this.twitterUrl, mVar.twitterUrl) && s.g(this.personalWebsite, mVar.personalWebsite) && s.g(this.motivation, mVar.motivation) && s.g(this.bio, mVar.bio) && s.g(this.primaryActivity, mVar.primaryActivity) && s.g(this.favoriteActivityTypes, mVar.favoriteActivityTypes) && s.g(this.runningTrainingSpeed, mVar.runningTrainingSpeed) && s.g(this.cyclingTrainingSpeed, mVar.cyclingTrainingSpeed) && s.g(this.favoriteCyclingActivityTypes, mVar.favoriteCyclingActivityTypes) && s.g(this.cyclingClassification, mVar.cyclingClassification) && s.g(this.cyclingMaxAvgPower, mVar.cyclingMaxAvgPower) && s.g(this.swimmingTrainingSpeed, mVar.swimmingTrainingSpeed) && s.g(this.profileVisibility, mVar.profileVisibility) && s.g(this.activityStartVisibility, mVar.activityStartVisibility) && s.g(this.activityMapVisibility, mVar.activityMapVisibility) && s.g(this.courseVisibility, mVar.courseVisibility) && s.g(this.activityHeartRateVisibility, mVar.activityHeartRateVisibility) && s.g(this.activityPowerVisibility, mVar.activityPowerVisibility) && s.g(this.badgeVisibility, mVar.badgeVisibility) && s.g(this.showAge, mVar.showAge) && s.g(this.showWeight, mVar.showWeight) && s.g(this.showHeight, mVar.showHeight) && s.g(this.showWeightClass, mVar.showWeightClass) && s.g(this.showAgeRange, mVar.showAgeRange) && s.g(this.showGender, mVar.showGender) && s.g(this.showActivityClass, mVar.showActivityClass) && s.g(this.showVO2Max, mVar.showVO2Max) && s.g(this.showPersonalRecords, mVar.showPersonalRecords) && s.g(this.showLast12Months, mVar.showLast12Months) && s.g(this.showLifetimeTotals, mVar.showLifetimeTotals) && s.g(this.showUpcomingEvents, mVar.showUpcomingEvents) && s.g(this.showRecentFavorites, mVar.showRecentFavorites) && s.g(this.showRecentDevice, mVar.showRecentDevice) && s.g(this.showRecentGear, mVar.showRecentGear) && s.g(this.showBadges, mVar.showBadges) && s.g(this.otherActivity, mVar.otherActivity) && s.g(this.otherPrimaryActivity, mVar.otherPrimaryActivity) && s.g(this.otherMotivation, mVar.otherMotivation) && s.g(this.userRoles, mVar.userRoles) && s.g(this.nameApproved, mVar.nameApproved) && s.g(this.userProfileFullName, mVar.userProfileFullName) && s.g(this.makeGolfScorecardsPrivate, mVar.makeGolfScorecardsPrivate) && s.g(this.allowGolfLiveScoring, mVar.allowGolfLiveScoring) && s.g(this.allowGolfScoringByConnections, mVar.allowGolfScoringByConnections) && s.g(this.userLevel, mVar.userLevel) && s.g(this.userPoint, mVar.userPoint) && s.g(this.levelUpdateDate, mVar.levelUpdateDate) && s.g(this.levelIsViewed, mVar.levelIsViewed) && s.g(this.levelPointThreshold, mVar.levelPointThreshold) && s.g(this.userPointOffset, mVar.userPointOffset);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getGarminGUID() {
        return this.garminGUID;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.garminGUID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.profileId;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        j jVar = this.profileImageUrls;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str5 = this.location;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.facebookUrl;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.twitterUrl;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.personalWebsite;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l16 = this.motivation;
        int iHashCode12 = (iHashCode11 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str9 = this.bio;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.primaryActivity;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.favoriteActivityTypes;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        Double d14 = this.runningTrainingSpeed;
        int iHashCode16 = (iHashCode15 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.cyclingTrainingSpeed;
        int iHashCode17 = (iHashCode16 + (d15 == null ? 0 : d15.hashCode())) * 31;
        List<String> list2 = this.favoriteCyclingActivityTypes;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str11 = this.cyclingClassification;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Double d16 = this.cyclingMaxAvgPower;
        int iHashCode20 = (iHashCode19 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.swimmingTrainingSpeed;
        int iHashCode21 = (iHashCode20 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str12 = this.profileVisibility;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.activityStartVisibility;
        int iHashCode23 = (iHashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.activityMapVisibility;
        int iHashCode24 = (iHashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.courseVisibility;
        int iHashCode25 = (iHashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.activityHeartRateVisibility;
        int iHashCode26 = (iHashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.activityPowerVisibility;
        int iHashCode27 = (iHashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.badgeVisibility;
        int iHashCode28 = (iHashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool = this.showAge;
        int iHashCode29 = (iHashCode28 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showWeight;
        int iHashCode30 = (iHashCode29 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showHeight;
        int iHashCode31 = (iHashCode30 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.showWeightClass;
        int iHashCode32 = (iHashCode31 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.showAgeRange;
        int iHashCode33 = (iHashCode32 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.showGender;
        int iHashCode34 = (iHashCode33 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.showActivityClass;
        int iHashCode35 = (iHashCode34 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.showVO2Max;
        int iHashCode36 = (iHashCode35 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.showPersonalRecords;
        int iHashCode37 = (iHashCode36 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.showLast12Months;
        int iHashCode38 = (iHashCode37 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.showLifetimeTotals;
        int iHashCode39 = (iHashCode38 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.showUpcomingEvents;
        int iHashCode40 = (iHashCode39 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.showRecentFavorites;
        int iHashCode41 = (iHashCode40 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.showRecentDevice;
        int iHashCode42 = (iHashCode41 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.showRecentGear;
        int iHashCode43 = (iHashCode42 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.showBadges;
        int iHashCode44 = (iHashCode43 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        String str19 = this.otherActivity;
        int iHashCode45 = (iHashCode44 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.otherPrimaryActivity;
        int iHashCode46 = (iHashCode45 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.otherMotivation;
        int iHashCode47 = (iHashCode46 + (str21 == null ? 0 : str21.hashCode())) * 31;
        List<String> list3 = this.userRoles;
        int iHashCode48 = (iHashCode47 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool17 = this.nameApproved;
        int iHashCode49 = (iHashCode48 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        String str22 = this.userProfileFullName;
        int iHashCode50 = (iHashCode49 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Boolean bool18 = this.makeGolfScorecardsPrivate;
        int iHashCode51 = (iHashCode50 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.allowGolfLiveScoring;
        int iHashCode52 = (iHashCode51 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.allowGolfScoringByConnections;
        int iHashCode53 = (iHashCode52 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Long l17 = this.userLevel;
        int iHashCode54 = (iHashCode53 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.userPoint;
        int iHashCode55 = (iHashCode54 + (l18 == null ? 0 : l18.hashCode())) * 31;
        DateTime dateTime = this.levelUpdateDate;
        int iHashCode56 = (iHashCode55 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool21 = this.levelIsViewed;
        int iHashCode57 = (iHashCode56 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Long l19 = this.levelPointThreshold;
        int iHashCode58 = (iHashCode57 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l24 = this.userPointOffset;
        return iHashCode58 + (l24 != null ? l24.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getNameApproved() {
        return this.nameApproved;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getProfileId() {
        return this.profileId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final j getProfileImageUrls() {
        return this.profileImageUrls;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getRunningTrainingSpeed() {
        return this.runningTrainingSpeed;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getShowUpcomingEvents() {
        return this.showUpcomingEvents;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getSwimmingTrainingSpeed() {
        return this.swimmingTrainingSpeed;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getUserPoint() {
        return this.userPoint;
    }

    public final String toString() {
        Long l14 = this.id;
        String str = this.garminGUID;
        Long l15 = this.profileId;
        String str2 = this.displayName;
        String str3 = this.fullName;
        String str4 = this.userName;
        j jVar = this.profileImageUrls;
        String str5 = this.location;
        String str6 = this.facebookUrl;
        String str7 = this.twitterUrl;
        String str8 = this.personalWebsite;
        Long l16 = this.motivation;
        String str9 = this.bio;
        String str10 = this.primaryActivity;
        List<String> list = this.favoriteActivityTypes;
        Double d14 = this.runningTrainingSpeed;
        Double d15 = this.cyclingTrainingSpeed;
        List<String> list2 = this.favoriteCyclingActivityTypes;
        String str11 = this.cyclingClassification;
        Double d16 = this.cyclingMaxAvgPower;
        Double d17 = this.swimmingTrainingSpeed;
        String str12 = this.profileVisibility;
        String str13 = this.activityStartVisibility;
        String str14 = this.activityMapVisibility;
        String str15 = this.courseVisibility;
        String str16 = this.activityHeartRateVisibility;
        String str17 = this.activityPowerVisibility;
        String str18 = this.badgeVisibility;
        Boolean bool = this.showAge;
        Boolean bool2 = this.showWeight;
        Boolean bool3 = this.showHeight;
        Boolean bool4 = this.showWeightClass;
        Boolean bool5 = this.showAgeRange;
        Boolean bool6 = this.showGender;
        Boolean bool7 = this.showActivityClass;
        Boolean bool8 = this.showVO2Max;
        Boolean bool9 = this.showPersonalRecords;
        Boolean bool10 = this.showLast12Months;
        Boolean bool11 = this.showLifetimeTotals;
        Boolean bool12 = this.showUpcomingEvents;
        Boolean bool13 = this.showRecentFavorites;
        Boolean bool14 = this.showRecentDevice;
        Boolean bool15 = this.showRecentGear;
        Boolean bool16 = this.showBadges;
        String str19 = this.otherActivity;
        String str20 = this.otherPrimaryActivity;
        String str21 = this.otherMotivation;
        List<String> list3 = this.userRoles;
        Boolean bool17 = this.nameApproved;
        String str22 = this.userProfileFullName;
        Boolean bool18 = this.makeGolfScorecardsPrivate;
        Boolean bool19 = this.allowGolfLiveScoring;
        Boolean bool20 = this.allowGolfScoringByConnections;
        Long l17 = this.userLevel;
        Long l18 = this.userPoint;
        DateTime dateTime = this.levelUpdateDate;
        Boolean bool21 = this.levelIsViewed;
        Long l19 = this.levelPointThreshold;
        Long l24 = this.userPointOffset;
        StringBuilder sbJ = b71.i.j("SocialProfileDTO(id=", ", garminGUID=", str, l14, ", profileId=");
        b71.i.q(l15, ", displayName=", str2, ", fullName=", sbJ);
        sn.a.t(sbJ, str3, ", userName=", str4, ", profileImageUrls=");
        sbJ.append(jVar);
        sbJ.append(", location=");
        sbJ.append(str5);
        sbJ.append(", facebookUrl=");
        sn.a.t(sbJ, str6, ", twitterUrl=", str7, ", personalWebsite=");
        n23.j.q(l16, str8, ", motivation=", ", bio=", sbJ);
        sn.a.t(sbJ, str9, ", primaryActivity=", str10, ", favoriteActivityTypes=");
        sbJ.append(list);
        sbJ.append(", runningTrainingSpeed=");
        sbJ.append(d14);
        sbJ.append(", cyclingTrainingSpeed=");
        sbJ.append(d15);
        sbJ.append(", favoriteCyclingActivityTypes=");
        sbJ.append(list2);
        sbJ.append(", cyclingClassification=");
        b71.i.x(sbJ, str11, ", cyclingMaxAvgPower=", d16, ", swimmingTrainingSpeed=");
        b71.i.u(sbJ, d17, ", profileVisibility=", str12, ", activityStartVisibility=");
        sn.a.t(sbJ, str13, ", activityMapVisibility=", str14, ", courseVisibility=");
        sn.a.t(sbJ, str15, ", activityHeartRateVisibility=", str16, ", activityPowerVisibility=");
        sn.a.t(sbJ, str17, ", badgeVisibility=", str18, ", showAge=");
        b71.i.o(bool, bool2, ", showWeight=", ", showHeight=", sbJ);
        b71.i.o(bool3, bool4, ", showWeightClass=", ", showAgeRange=", sbJ);
        b71.i.o(bool5, bool6, ", showGender=", ", showActivityClass=", sbJ);
        b71.i.o(bool7, bool8, ", showVO2Max=", ", showPersonalRecords=", sbJ);
        b71.i.o(bool9, bool10, ", showLast12Months=", ", showLifetimeTotals=", sbJ);
        b71.i.o(bool11, bool12, ", showUpcomingEvents=", ", showRecentFavorites=", sbJ);
        b71.i.o(bool13, bool14, ", showRecentDevice=", ", showRecentGear=", sbJ);
        b71.i.o(bool15, bool16, ", showBadges=", ", otherActivity=", sbJ);
        sn.a.t(sbJ, str19, ", otherPrimaryActivity=", str20, ", otherMotivation=");
        e0.o(str21, ", userRoles=", ", nameApproved=", sbJ, list3);
        b71.i.s(sbJ, bool17, ", userProfileFullName=", str22, ", makeGolfScorecardsPrivate=");
        b71.i.o(bool18, bool19, ", allowGolfLiveScoring=", ", allowGolfScoringByConnections=", sbJ);
        sbJ.append(bool20);
        sbJ.append(", userLevel=");
        sbJ.append(l17);
        sbJ.append(", userPoint=");
        sbJ.append(l18);
        sbJ.append(", levelUpdateDate=");
        sbJ.append(dateTime);
        sbJ.append(", levelIsViewed=");
        sbJ.append(bool21);
        sbJ.append(", levelPointThreshold=");
        sbJ.append(l19);
        sbJ.append(", userPointOffset=");
        return p6.b.g(sbJ, l24, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getUserProfileFullName() {
        return this.userProfileFullName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.id;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.garminGUID);
        Long l15 = this.profileId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.userName);
        parcel.writeParcelable(this.profileImageUrls, i14);
        parcel.writeString(this.location);
        parcel.writeString(this.facebookUrl);
        parcel.writeString(this.twitterUrl);
        parcel.writeString(this.personalWebsite);
        Long l16 = this.motivation;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.bio);
        parcel.writeString(this.primaryActivity);
        parcel.writeStringList(this.favoriteActivityTypes);
        Double d14 = this.runningTrainingSpeed;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.cyclingTrainingSpeed;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeStringList(this.favoriteCyclingActivityTypes);
        parcel.writeString(this.cyclingClassification);
        Double d16 = this.cyclingMaxAvgPower;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.swimmingTrainingSpeed;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        parcel.writeString(this.profileVisibility);
        parcel.writeString(this.activityStartVisibility);
        parcel.writeString(this.activityMapVisibility);
        parcel.writeString(this.courseVisibility);
        parcel.writeString(this.activityHeartRateVisibility);
        parcel.writeString(this.activityPowerVisibility);
        parcel.writeString(this.badgeVisibility);
        Boolean bool = this.showAge;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.showWeight;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.showHeight;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.showWeightClass;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.showAgeRange;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Boolean bool6 = this.showGender;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        Boolean bool7 = this.showActivityClass;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
        Boolean bool8 = this.showVO2Max;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool8);
        }
        Boolean bool9 = this.showPersonalRecords;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool9);
        }
        Boolean bool10 = this.showLast12Months;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool10);
        }
        Boolean bool11 = this.showLifetimeTotals;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool11);
        }
        Boolean bool12 = this.showUpcomingEvents;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool12);
        }
        Boolean bool13 = this.showRecentFavorites;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool13);
        }
        Boolean bool14 = this.showRecentDevice;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool14);
        }
        Boolean bool15 = this.showRecentGear;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool15);
        }
        Boolean bool16 = this.showBadges;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool16);
        }
        parcel.writeString(this.otherActivity);
        parcel.writeString(this.otherPrimaryActivity);
        parcel.writeString(this.otherMotivation);
        parcel.writeStringList(this.userRoles);
        Boolean bool17 = this.nameApproved;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool17);
        }
        parcel.writeString(this.userProfileFullName);
        Boolean bool18 = this.makeGolfScorecardsPrivate;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool18);
        }
        Boolean bool19 = this.allowGolfLiveScoring;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool19);
        }
        Boolean bool20 = this.allowGolfScoringByConnections;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool20);
        }
        Long l17 = this.userLevel;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        Long l18 = this.userPoint;
        if (l18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l18);
        }
        parcel.writeSerializable(this.levelUpdateDate);
        Boolean bool21 = this.levelIsViewed;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool21);
        }
        Long l19 = this.levelPointThreshold;
        if (l19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l19);
        }
        Long l24 = this.userPointOffset;
        if (l24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l24);
        }
    }

    public final List<String> y() {
        return this.userRoles;
    }
}
