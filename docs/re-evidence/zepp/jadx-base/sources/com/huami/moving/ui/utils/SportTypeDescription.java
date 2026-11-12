package com.huami.moving.ui.utils;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.R;
import com.huami.moving.datacenter.SportType;
import com.huami.moving.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ï\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0003\b¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001c2\u00020\u0001:ô\u0001\u001d\u001e\u001f !\"#$%&'()*+,-./012345678\u001c9:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001B7\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0019\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0014\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\u0082\u0001Ö\u0002È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001û\u0001ü\u0001ý\u0001þ\u0001ÿ\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002\u0098\u0002\u0099\u0002\u009a\u0002\u009b\u0002\u009c\u0002\u009d\u0002\u009e\u0002\u009f\u0002 \u0002¡\u0002¢\u0002£\u0002¤\u0002¥\u0002¦\u0002§\u0002¨\u0002©\u0002ª\u0002«\u0002¬\u0002\u00ad\u0002®\u0002¯\u0002°\u0002±\u0002²\u0002³\u0002´\u0002µ\u0002¶\u0002·\u0002¸\u0002¹\u0002º\u0002»\u0002¼\u0002½\u0002¾\u0002¿\u0002À\u0002Á\u0002Â\u0002Ã\u0002Ä\u0002Å\u0002Æ\u0002Ç\u0002È\u0002É\u0002Ê\u0002Ë\u0002Ì\u0002Í\u0002Î\u0002Ï\u0002Ð\u0002Ñ\u0002Ò\u0002Ó\u0002Ô\u0002Õ\u0002Ö\u0002×\u0002Ø\u0002Ù\u0002Ú\u0002Û\u0002Ü\u0002Ý\u0002Þ\u0002ß\u0002à\u0002á\u0002â\u0002ã\u0002ä\u0002å\u0002æ\u0002ç\u0002è\u0002é\u0002ê\u0002ë\u0002ì\u0002í\u0002î\u0002ï\u0002ð\u0002ñ\u0002ò\u0002¨\u0006ó\u0002"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription;", "", "Lcom/huami/moving/datacenter/SportType;", "a", "Lcom/huami/moving/datacenter/SportType;", "getSportType", "()Lcom/huami/moving/datacenter/SportType;", "sportType", "", "b", LogUtil.I, "getIconId", "()I", "iconId", "c", "getBgColorId", "bgColorId", "", GoogleApiAvailabilityLight.a, "Z", "isOutdoor", "()Z", "<set-?>", "e", "getNameId", "nameId", "<init>", "(Lcom/huami/moving/datacenter/SportType;IIIZ)V", "Companion", "ATV", "Aerobics", "AlpineSkiing", "Archery", "BMX", "Badminton", "Ballet", "BallroomDance", "Baseball", "Basketball", "BattleRope", "BeachSoccer", "BeachVolleyball", "BellyDance", "Biathlon", "Billiards", "BoardGames", "Bouldering", "Bowling", "Boxing", "BreakDancing", "Breaking", "Bridge", "BungeeJumping", "Checkers", "Chess", "ClimbTheStairs", "ClimbingMachine", "CoreTraining", "Cricket", "CrossCountrySkiing", "CrossTraining", "Curling", "Dance", "Darts", "DirectionalCrossCountry", "Disco", "DodgeBall", "Downhill", "DragonBoat", "Drifting", "Driving", "ESports", "EllipticalMachine", "EquestrianSports", "Fencing", "FightingExercise", "FinSwimming", "Fishing", "FlexibilityTraining", "FloorBall", "FlyingAKite", "FolkDance", "FreeTraining", "Frisbee", "Fujiki", "GateBall", "Go", "Golf", "GolfSwing", "GroundThrow", "GroupGymnastics", "Gymnastics", "Handball", "HighIntensityIntervalTraining", "HipHop", "Hockey", "HorizontalBar", "HulaHoop", "Hunting", "IceHockey", "IndoorFitness", "IndoorFootball", "IndoorRide", "IndoorSkating", "IndoorSurfing", "IndoorWalking", "JaiLiBall", "JazzDance", "Judo", "Jujitsu", "Karate", "Kayak", "Kickboxing", "KickingShuttlecock", "KiteSurfing", "LatinDance", "MartialArts", "MixedAerobic", "ModernDance", "Motorboat", "MountainBiking", "Mountaineering", "MuayThai", "MultiSport", "NoGpsSoccer", "OffRoadMotorcycle", "OpenWaterSwimming", "Orienteering", "OutdoorCycling", "OutdoorHiking", "OutdoorRowing", "OutdoorRunning", "OutdoorSkating", "PaddleBoardSurfing", "ParallelBars", "Parasailing", "Parkour", "Pilates", "PoleDancing", "Polo", "RaceWalking", "RockClimbing", "RollerSkating", "RouteRun", "Rowing", "RowingMachine", "Rugby", "RunInPlayground", "Sailing", "SandbagBall", "Shoot", "Shuffleboard", "Shuttlecock", "Skateboard", "Skiing", "SkippingRope", "Skydiving", "Sleigh", "Snorkeling", "SnowboardingDouble", "SnowboardingSingle", "Snowmobile", "Snowmobiles", "SnowshoeHiking", "Soccer", "Softball", "SomatosensoryGame", "SpinningBike", "SquareDance", "Squash", "StepTraining", "StepperMachine", "StrengthTraining", "Stretch", "Surfing", "SwimmingPool", "Swing", "SwordsmanSkip", "SynchronizedSwimming", "TableFootball", "TableTennis", "Taekwondo", "TaiChi", "TapDance", "Tennis", "TrailRunning", "Trampoline", SportAnalytics.ParamValue.SportType.TREADMILL, "TreadmillNormal", "Triathlon", "TugOfWar", "Volleyball", "Walking", "WalkingMachine", "WallBall", "WaterPolo", "WaterSkiing", "Wrestling", "Yoga", "Zumba", "Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorRunning;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Treadmill;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Walking;", "Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorCycling;", "Lcom/huami/moving/ui/utils/SportTypeDescription$FreeTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SwimmingPool;", "Lcom/huami/moving/ui/utils/SportTypeDescription$OpenWaterSwimming;", "Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorRide;", "Lcom/huami/moving/ui/utils/SportTypeDescription$EllipticalMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Mountaineering;", "Lcom/huami/moving/ui/utils/SportTypeDescription$TrailRunning;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Skiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorHiking;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Tennis;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Soccer;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Triathlon;", "Lcom/huami/moving/ui/utils/SportTypeDescription$MultiSport;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SkippingRope;", "Lcom/huami/moving/ui/utils/SportTypeDescription$RowingMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorFitness;", "Lcom/huami/moving/ui/utils/SportTypeDescription$TreadmillNormal;", "Lcom/huami/moving/ui/utils/SportTypeDescription$RouteRun;", "Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorWalking;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Curling;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SnowboardingSingle;", "Lcom/huami/moving/ui/utils/SportTypeDescription$AlpineSkiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorSkating;", "Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorSkating;", "Lcom/huami/moving/ui/utils/SportTypeDescription$CrossCountrySkiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$MountainBiking;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BMX;", "Lcom/huami/moving/ui/utils/SportTypeDescription$HighIntensityIntervalTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription$CoreTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription$MixedAerobic;", "Lcom/huami/moving/ui/utils/SportTypeDescription$StrengthTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Stretch;", "Lcom/huami/moving/ui/utils/SportTypeDescription$ClimbingMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription$FlexibilityTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription$StepTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription$StepperMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Gymnastics;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Yoga;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Pilates;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Surfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Hunting;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Fishing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Sailing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorRowing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Skateboard;", "Lcom/huami/moving/ui/utils/SportTypeDescription$PaddleBoardSurfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$RollerSkating;", "Lcom/huami/moving/ui/utils/SportTypeDescription$RockClimbing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Ballet;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BellyDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SquareDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Breaking;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BallroomDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Dance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Zumba;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Cricket;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Baseball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Bowling;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Squash;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Rugby;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Golf;", "Lcom/huami/moving/ui/utils/SportTypeDescription$GolfSwing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Basketball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Softball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$GateBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Volleyball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$TableTennis;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Hockey;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Handball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Badminton;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Archery;", "Lcom/huami/moving/ui/utils/SportTypeDescription$EquestrianSports;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SwordsmanSkip;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Karate;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Boxing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Judo;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Wrestling;", "Lcom/huami/moving/ui/utils/SportTypeDescription$TaiChi;", "Lcom/huami/moving/ui/utils/SportTypeDescription$MuayThai;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Taekwondo;", "Lcom/huami/moving/ui/utils/SportTypeDescription$MartialArts;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Kickboxing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SnowboardingDouble;", "Lcom/huami/moving/ui/utils/SportTypeDescription$KiteSurfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$ClimbTheStairs;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Aerobics;", "Lcom/huami/moving/ui/utils/SportTypeDescription$DirectionalCrossCountry;", "Lcom/huami/moving/ui/utils/SportTypeDescription$GroupGymnastics;", "Lcom/huami/moving/ui/utils/SportTypeDescription$LatinDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$JazzDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$FightingExercise;", "Lcom/huami/moving/ui/utils/SportTypeDescription$HulaHoop;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Frisbee;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Darts;", "Lcom/huami/moving/ui/utils/SportTypeDescription$FlyingAKite;", "Lcom/huami/moving/ui/utils/SportTypeDescription$TugOfWar;", "Lcom/huami/moving/ui/utils/SportTypeDescription$KickingShuttlecock;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BeachSoccer;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BeachVolleyball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Drifting;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Motorboat;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Snowmobiles;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Sleigh;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Orienteering;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Biathlon;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Parkour;", "Lcom/huami/moving/ui/utils/SportTypeDescription$CrossTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription$RaceWalking;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Driving;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Parasailing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$ESports;", "Lcom/huami/moving/ui/utils/SportTypeDescription$ATV;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Snowmobile;", "Lcom/huami/moving/ui/utils/SportTypeDescription$OffRoadMotorcycle;", "Lcom/huami/moving/ui/utils/SportTypeDescription$DragonBoat;", "Lcom/huami/moving/ui/utils/SportTypeDescription$WaterSkiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Kayak;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Rowing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Polo;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SpinningBike;", "Lcom/huami/moving/ui/utils/SportTypeDescription$WalkingMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription$WallBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription$FolkDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Jujitsu;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Fencing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$HorizontalBar;", "Lcom/huami/moving/ui/utils/SportTypeDescription$ParallelBars;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Billiards;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Fujiki;", "Lcom/huami/moving/ui/utils/SportTypeDescription$DodgeBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription$WaterPolo;", "Lcom/huami/moving/ui/utils/SportTypeDescription$FinSwimming;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SynchronizedSwimming;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Snorkeling;", "Lcom/huami/moving/ui/utils/SportTypeDescription$IceHockey;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Swing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Shuffleboard;", "Lcom/huami/moving/ui/utils/SportTypeDescription$TableFootball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Shuttlecock;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SomatosensoryGame;", "Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorFootball;", "Lcom/huami/moving/ui/utils/SportTypeDescription$HipHop;", "Lcom/huami/moving/ui/utils/SportTypeDescription$PoleDancing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BattleRope;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BreakDancing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SandbagBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription$GroundThrow;", "Lcom/huami/moving/ui/utils/SportTypeDescription$JaiLiBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorSurfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Chess;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Checkers;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Go;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Bridge;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BoardGames;", "Lcom/huami/moving/ui/utils/SportTypeDescription$SnowshoeHiking;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Shoot;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Skydiving;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Downhill;", "Lcom/huami/moving/ui/utils/SportTypeDescription$BungeeJumping;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Trampoline;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Bouldering;", "Lcom/huami/moving/ui/utils/SportTypeDescription$ModernDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$Disco;", "Lcom/huami/moving/ui/utils/SportTypeDescription$TapDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription$FloorBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription$NoGpsSoccer;", "Lcom/huami/moving/ui/utils/SportTypeDescription$RunInPlayground;", "moving_release"}, k = 1, mv = {1, 5, 1})
public abstract class SportTypeDescription {
    private static final int f = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SportType sportType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int iconId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int bgColorId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isOutdoor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int nameId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ArrayList<SportTypeDescription>> g = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$ATV;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ATV extends SportTypeDescription {

        @NotNull
        public static final ATV INSTANCE = new ATV();

        private ATV() {
            super(SportType.ATV.INSTANCE, R.string.sport_type_atv, R.drawable.ic_atv_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Aerobics;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Aerobics extends SportTypeDescription {

        @NotNull
        public static final Aerobics INSTANCE = new Aerobics();

        private Aerobics() {
            super(SportType.Aerobics.INSTANCE, R.string.sport_type_aerobics, R.drawable.ic_aerobics_30_s20, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$AlpineSkiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AlpineSkiing extends SportTypeDescription {

        @NotNull
        public static final AlpineSkiing INSTANCE = new AlpineSkiing();

        private AlpineSkiing() {
            super(SportType.AlpineSkiing.INSTANCE, R.string.sport_type_alpine_skiing, R.drawable.ic_alpine_ski_30, R.color.s15, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Archery;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Archery extends SportTypeDescription {

        @NotNull
        public static final Archery INSTANCE = new Archery();

        private Archery() {
            super(SportType.Archery.INSTANCE, R.string.sport_type_archery, R.drawable.ic_archery_30, R.color.s25, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BMX;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BMX extends SportTypeDescription {

        @NotNull
        public static final BMX INSTANCE = new BMX();

        private BMX() {
            super(SportType.BMX.INSTANCE, R.string.sport_type_bmx, R.drawable.ic_swb_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Badminton;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Badminton extends SportTypeDescription {

        @NotNull
        public static final Badminton INSTANCE = new Badminton();

        private Badminton() {
            super(SportType.Badminton.INSTANCE, R.string.sport_type_badminton, R.drawable.ic_badminton_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Ballet;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Ballet extends SportTypeDescription {

        @NotNull
        public static final Ballet INSTANCE = new Ballet();

        private Ballet() {
            super(SportType.Ballet.INSTANCE, R.string.sport_type_ballet_dance, R.drawable.ic_ballet_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BallroomDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BallroomDance extends SportTypeDescription {

        @NotNull
        public static final BallroomDance INSTANCE = new BallroomDance();

        private BallroomDance() {
            super(SportType.BallroomDance.INSTANCE, R.string.sport_type_social_dance, R.drawable.ic_ballroom_dancing_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Baseball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Baseball extends SportTypeDescription {

        @NotNull
        public static final Baseball INSTANCE = new Baseball();

        private Baseball() {
            super(SportType.Baseball.INSTANCE, R.string.sport_type_baseball, R.drawable.ic_baseball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Basketball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Basketball extends SportTypeDescription {

        @NotNull
        public static final Basketball INSTANCE = new Basketball();

        private Basketball() {
            super(SportType.Basketball.INSTANCE, R.string.sport_type_basketball, R.drawable.ic_basketball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BattleRope;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BattleRope extends SportTypeDescription {

        @NotNull
        public static final BattleRope INSTANCE = new BattleRope();

        private BattleRope() {
            super(SportType.BattleRope.INSTANCE, R.string.sport_type_battle_rope, R.drawable.ic_battling_ropes_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BeachSoccer;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BeachSoccer extends SportTypeDescription {

        @NotNull
        public static final BeachSoccer INSTANCE = new BeachSoccer();

        private BeachSoccer() {
            super(SportType.BeachSoccer.INSTANCE, R.string.sport_type_beach_soccer, R.drawable.ic_beach_football_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BeachVolleyball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BeachVolleyball extends SportTypeDescription {

        @NotNull
        public static final BeachVolleyball INSTANCE = new BeachVolleyball();

        private BeachVolleyball() {
            super(SportType.BeachVolleyball.INSTANCE, R.string.sport_type_beach_volleyball, R.drawable.ic_beva_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BellyDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BellyDance extends SportTypeDescription {

        @NotNull
        public static final BellyDance INSTANCE = new BellyDance();

        private BellyDance() {
            super(SportType.BellyDance.INSTANCE, R.string.sport_type_belly_dance, R.drawable.ic_belly_dance_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Biathlon;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Biathlon extends SportTypeDescription {

        @NotNull
        public static final Biathlon INSTANCE = new Biathlon();

        private Biathlon() {
            super(SportType.Biathlon.INSTANCE, R.string.sport_type_biathlon, R.drawable.ic_biathlon_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Billiards;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Billiards extends SportTypeDescription {

        @NotNull
        public static final Billiards INSTANCE = new Billiards();

        private Billiards() {
            super(SportType.Billiards.INSTANCE, R.string.sport_type_billiards, R.drawable.ic_billiards_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BoardGames;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BoardGames extends SportTypeDescription {

        @NotNull
        public static final BoardGames INSTANCE = new BoardGames();

        private BoardGames() {
            super(SportType.BoardGames.INSTANCE, R.string.sport_type_board_games, R.drawable.ic_bg_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Bouldering;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bouldering extends SportTypeDescription {

        @NotNull
        public static final Bouldering INSTANCE = new Bouldering();

        private Bouldering() {
            super(SportType.Bouldering.INSTANCE, R.string.sport_type_bouldering, R.drawable.ic_bouldering_30_s30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Bowling;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bowling extends SportTypeDescription {

        @NotNull
        public static final Bowling INSTANCE = new Bowling();

        private Bowling() {
            super(SportType.Bowling.INSTANCE, R.string.sport_type_bowling, R.drawable.ic_bowling_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Boxing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Boxing extends SportTypeDescription {

        @NotNull
        public static final Boxing INSTANCE = new Boxing();

        private Boxing() {
            super(SportType.Boxing.INSTANCE, R.string.sport_type_boxing, R.drawable.ic_boxing_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BreakDancing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BreakDancing extends SportTypeDescription {

        @NotNull
        public static final BreakDancing INSTANCE = new BreakDancing();

        private BreakDancing() {
            super(SportType.BreakDancing.INSTANCE, R.string.sport_type_break_dancing, R.drawable.ic_bd_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Breaking;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Breaking extends SportTypeDescription {

        @NotNull
        public static final Breaking INSTANCE = new Breaking();

        private Breaking() {
            super(SportType.Breaking.INSTANCE, R.string.sport_type_street_dance, R.drawable.ic_street_dance_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Bridge;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bridge extends SportTypeDescription {

        @NotNull
        public static final Bridge INSTANCE = new Bridge();

        private Bridge() {
            super(SportType.Bridge.INSTANCE, R.string.sport_type_bridge, R.drawable.ic_bridge_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$BungeeJumping;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BungeeJumping extends SportTypeDescription {

        @NotNull
        public static final BungeeJumping INSTANCE = new BungeeJumping();

        private BungeeJumping() {
            super(SportType.BungeeJumping.INSTANCE, R.string.sport_type_bungee_jumping, R.drawable.ic_bungee_jumping_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Checkers;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Checkers extends SportTypeDescription {

        @NotNull
        public static final Checkers INSTANCE = new Checkers();

        private Checkers() {
            super(SportType.Checkers.INSTANCE, R.string.sport_type_checkers, R.drawable.ic_draughts_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Chess;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Chess extends SportTypeDescription {

        @NotNull
        public static final Chess INSTANCE = new Chess();

        private Chess() {
            super(SportType.Chess.INSTANCE, R.string.sport_type_chess, R.drawable.ic_chess_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$ClimbTheStairs;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ClimbTheStairs extends SportTypeDescription {

        @NotNull
        public static final ClimbTheStairs INSTANCE = new ClimbTheStairs();

        private ClimbTheStairs() {
            super(SportType.ClimbTheStairs.INSTANCE, R.string.sport_type_climbing_stairs, R.drawable.ic_climb_stairs_30, R.color.s25, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$ClimbingMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ClimbingMachine extends SportTypeDescription {

        @NotNull
        public static final ClimbingMachine INSTANCE = new ClimbingMachine();

        private ClimbingMachine() {
            super(SportType.ClimbingMachine.INSTANCE, R.string.sport_type_climbing_training, R.drawable.ic_cm_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Companion;", "", "", "sportType", "source", "sportMode", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "findSportTypeDescription", "", "descriptionList$delegate", "Lkotlin/Lazy;", "a", "()Ljava/util/List;", "descriptionList", "INTERVAL_RUN_MODE", LogUtil.I, "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "descriptionList", "getDescriptionList()Ljava/util/List;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<SportTypeDescription> a() {
            return (List) SportTypeDescription.g.getValue();
        }

        @Nullable
        public final SportTypeDescription findSportTypeDescription(int sportType, int source, int sportMode) {
            SportTypeDescription next;
            int i;
            int i2;
            Iterator<SportTypeDescription> it2 = a().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (next.getSportType().getType() != sportType);
            if (next != null) {
                if (sportType == 1) {
                    if (sportMode == 1) {
                        i = R.string.sports_type_running_interval;
                    } else {
                        i = Utils.isMidong() ? R.string.running_sports_type_running : R.string.sport_type_running_outside_alias;
                    }
                    next.nameId = i;
                } else if (sportType == 8) {
                    next.nameId = SportDeviceUtils.isCategoryForHaydn(source) ? R.string.sports_type_indoor_running_auto : R.string.runnings_sport_type_treadmill;
                } else if (sportType == 16) {
                    if (SportDeviceUtils.isWorkoutSportSource(source)) {
                        i2 = R.string.sports_type_work_out;
                    } else {
                        i2 = Utils.isMidong() ? R.string.sports_type_free_training : R.string.sports_type_free_training_alias;
                    }
                    next.nameId = i2;
                }
            }
            return next;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$CoreTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class CoreTraining extends SportTypeDescription {

        @NotNull
        public static final CoreTraining INSTANCE = new CoreTraining();

        private CoreTraining() {
            super(SportType.CoreTraining.INSTANCE, R.string.sport_type_core_training, R.drawable.ic_core_trn_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Cricket;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Cricket extends SportTypeDescription {

        @NotNull
        public static final Cricket INSTANCE = new Cricket();

        private Cricket() {
            super(SportType.Cricket.INSTANCE, R.string.sport_type_cricket_ball, R.drawable.ic_cricket_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$CrossCountrySkiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class CrossCountrySkiing extends SportTypeDescription {

        @NotNull
        public static final CrossCountrySkiing INSTANCE = new CrossCountrySkiing();

        private CrossCountrySkiing() {
            super(SportType.CrossCountrySkiing.INSTANCE, R.string.sport_type_cross_country_skiing, R.drawable.ic_ccs_30, R.color.s15, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$CrossTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class CrossTraining extends SportTypeDescription {

        @NotNull
        public static final CrossTraining INSTANCE = new CrossTraining();

        private CrossTraining() {
            super(SportType.CrossTraining.INSTANCE, R.string.sport_type_cross_training, R.drawable.ic_cross_trn_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Curling;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Curling extends SportTypeDescription {

        @NotNull
        public static final Curling INSTANCE = new Curling();

        private Curling() {
            super(SportType.Curling.INSTANCE, R.string.sport_type_curling, R.drawable.ic_curling_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Dance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Dance extends SportTypeDescription {

        @NotNull
        public static final Dance INSTANCE = new Dance();

        private Dance() {
            super(SportType.Dance.INSTANCE, R.string.sport_type_dance, R.drawable.ic_dance_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Darts;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Darts extends SportTypeDescription {

        @NotNull
        public static final Darts INSTANCE = new Darts();

        private Darts() {
            super(SportType.Darts.INSTANCE, R.string.sport_type_darts, R.drawable.ic_darts_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$DirectionalCrossCountry;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DirectionalCrossCountry extends SportTypeDescription {

        @NotNull
        public static final DirectionalCrossCountry INSTANCE = new DirectionalCrossCountry();

        private DirectionalCrossCountry() {
            super(SportType.DirectionalCrossCountry.INSTANCE, R.string.sport_type_orienteering, R.drawable.ic_orienteering_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Disco;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Disco extends SportTypeDescription {

        @NotNull
        public static final Disco INSTANCE = new Disco();

        private Disco() {
            super(SportType.Disco.INSTANCE, R.string.sport_type_disco, R.drawable.ic_dance_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$DodgeBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DodgeBall extends SportTypeDescription {

        @NotNull
        public static final DodgeBall INSTANCE = new DodgeBall();

        private DodgeBall() {
            super(SportType.DodgeBall.INSTANCE, R.string.sport_type_dodge_ball, R.drawable.ic_dodge_ball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Downhill;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Downhill extends SportTypeDescription {

        @NotNull
        public static final Downhill INSTANCE = new Downhill();

        private Downhill() {
            super(SportType.Downhill.INSTANCE, R.string.sport_type_downhill, R.drawable.ic_downhill_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$DragonBoat;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DragonBoat extends SportTypeDescription {

        @NotNull
        public static final DragonBoat INSTANCE = new DragonBoat();

        private DragonBoat() {
            super(SportType.DragonBoat.INSTANCE, R.string.sport_type_dragon_boat, R.drawable.ic_dragon_boat_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Drifting;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Drifting extends SportTypeDescription {

        @NotNull
        public static final Drifting INSTANCE = new Drifting();

        private Drifting() {
            super(SportType.Drifting.INSTANCE, R.string.sport_type_drifting, R.drawable.ic_drifting_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Driving;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Driving extends SportTypeDescription {

        @NotNull
        public static final Driving INSTANCE = new Driving();

        private Driving() {
            super(SportType.Driving.INSTANCE, R.string.sport_type_drive, R.drawable.ic_drive_30, R.color.s25, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$ESports;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ESports extends SportTypeDescription {

        @NotNull
        public static final ESports INSTANCE = new ESports();

        private ESports() {
            super(SportType.ESports.INSTANCE, R.string.sport_type_e_sports, R.drawable.ic_esports_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$EllipticalMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class EllipticalMachine extends SportTypeDescription {

        @NotNull
        public static final EllipticalMachine INSTANCE = new EllipticalMachine();

        private EllipticalMachine() {
            super(SportType.EllipticalMachine.INSTANCE, R.string.sports_type_elliptical_trainer, R.drawable.ic_em_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$EquestrianSports;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class EquestrianSports extends SportTypeDescription {

        @NotNull
        public static final EquestrianSports INSTANCE = new EquestrianSports();

        private EquestrianSports() {
            super(SportType.EquestrianSports.INSTANCE, Utils.isMidong() ? R.string.sport_type_equestian : R.string.sport_type_equestian_alias, R.drawable.ic_equestrian_30, R.color.s25, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Fencing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fencing extends SportTypeDescription {

        @NotNull
        public static final Fencing INSTANCE = new Fencing();

        private Fencing() {
            super(SportType.Fencing.INSTANCE, R.string.sport_type_fencing_indoor, R.drawable.ic_fence_30_p3, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$FightingExercise;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FightingExercise extends SportTypeDescription {

        @NotNull
        public static final FightingExercise INSTANCE = new FightingExercise();

        private FightingExercise() {
            super(SportType.FightingExercise.INSTANCE, R.string.sport_type_kickboxing, R.drawable.ic_kickboxing_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$FinSwimming;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FinSwimming extends SportTypeDescription {

        @NotNull
        public static final FinSwimming INSTANCE = new FinSwimming();

        private FinSwimming() {
            super(SportType.FinSwimming.INSTANCE, R.string.sport_type_fin_swimming, R.drawable.ic_fin_swimming_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Fishing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fishing extends SportTypeDescription {

        @NotNull
        public static final Fishing INSTANCE = new Fishing();

        private Fishing() {
            super(SportType.Fishing.INSTANCE, R.string.sport_type_fishing, R.drawable.ic_fishing_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$FlexibilityTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FlexibilityTraining extends SportTypeDescription {

        @NotNull
        public static final FlexibilityTraining INSTANCE = new FlexibilityTraining();

        private FlexibilityTraining() {
            super(SportType.FlexibilityTraining.INSTANCE, R.string.sport_type_flexible_training, R.drawable.ic_flexible_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$FloorBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FloorBall extends SportTypeDescription {

        @NotNull
        public static final FloorBall INSTANCE = new FloorBall();

        private FloorBall() {
            super(SportType.FloorBall.INSTANCE, R.string.sport_type_floor_ball, R.drawable.ic_floorball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$FlyingAKite;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FlyingAKite extends SportTypeDescription {

        @NotNull
        public static final FlyingAKite INSTANCE = new FlyingAKite();

        private FlyingAKite() {
            super(SportType.FlyingAKite.INSTANCE, R.string.sport_type_fly_a_kite, R.drawable.ic_fak_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$FolkDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FolkDance extends SportTypeDescription {

        @NotNull
        public static final FolkDance INSTANCE = new FolkDance();

        private FolkDance() {
            super(SportType.FolkDance.INSTANCE, R.string.sport_type_folk_dance, R.drawable.ic_nd_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$FreeTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FreeTraining extends SportTypeDescription {

        @NotNull
        public static final FreeTraining INSTANCE = new FreeTraining();

        private FreeTraining() {
            super(SportType.FreeTraining.INSTANCE, Utils.isMidong() ? R.string.sports_type_free_training : R.string.sports_type_free_training_alias, R.drawable.ic_free_training_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Frisbee;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Frisbee extends SportTypeDescription {

        @NotNull
        public static final Frisbee INSTANCE = new Frisbee();

        private Frisbee() {
            super(SportType.Frisbee.INSTANCE, R.string.sport_type_frisbee, R.drawable.ic_frisbee_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Fujiki;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fujiki extends SportTypeDescription {

        @NotNull
        public static final Fujiki INSTANCE = new Fujiki();

        private Fujiki() {
            super(SportType.Fujiki.INSTANCE, R.string.sport_type_fujiki, R.drawable.ic_sepaktakraw_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$GateBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GateBall extends SportTypeDescription {

        @NotNull
        public static final GateBall INSTANCE = new GateBall();

        private GateBall() {
            super(SportType.GateBall.INSTANCE, R.string.sport_type_gateball, R.drawable.ic_croquet_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Go;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Go extends SportTypeDescription {

        @NotNull
        public static final Go INSTANCE = new Go();

        private Go() {
            super(SportType.Go.INSTANCE, R.string.sport_type_go, R.drawable.ic_go_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Golf;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Golf extends SportTypeDescription {

        @NotNull
        public static final Golf INSTANCE = new Golf();

        private Golf() {
            super(SportType.Golf.INSTANCE, R.string.sport_type_golf, R.drawable.ic_golf_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$GolfSwing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfSwing extends SportTypeDescription {

        @NotNull
        public static final GolfSwing INSTANCE = new GolfSwing();

        private GolfSwing() {
            super(SportType.GolfSwing.INSTANCE, R.string.sport_type_golf_swing, R.drawable.ic_golf_swing_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$GroundThrow;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GroundThrow extends SportTypeDescription {

        @NotNull
        public static final GroundThrow INSTANCE = new GroundThrow();

        private GroundThrow() {
            super(SportType.GroundThrow.INSTANCE, R.string.sport_type_ground_throw, R.drawable.ic_petanque_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$GroupGymnastics;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GroupGymnastics extends SportTypeDescription {

        @NotNull
        public static final GroupGymnastics INSTANCE = new GroupGymnastics();

        private GroupGymnastics() {
            super(SportType.GroupGymnastics.INSTANCE, R.string.sport_type_group_calisthenics, R.drawable.ic_gg_30_s20, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Gymnastics;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Gymnastics extends SportTypeDescription {

        @NotNull
        public static final Gymnastics INSTANCE = new Gymnastics();

        private Gymnastics() {
            super(SportType.Gymnastics.INSTANCE, R.string.sport_type_gymnastics, R.drawable.ic_gymnastics_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Handball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Handball extends SportTypeDescription {

        @NotNull
        public static final Handball INSTANCE = new Handball();

        private Handball() {
            super(SportType.Handball.INSTANCE, R.string.sport_type_handball, R.drawable.ic_handball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$HighIntensityIntervalTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HighIntensityIntervalTraining extends SportTypeDescription {

        @NotNull
        public static final HighIntensityIntervalTraining INSTANCE = new HighIntensityIntervalTraining();

        private HighIntensityIntervalTraining() {
            super(SportType.HighIntensityIntervalTraining.INSTANCE, R.string.sport_type_high_intensity_training, R.drawable.ic_interval_trn_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$HipHop;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HipHop extends SportTypeDescription {

        @NotNull
        public static final HipHop INSTANCE = new HipHop();

        private HipHop() {
            super(SportType.HipHop.INSTANCE, R.string.sport_type_hip_hop, R.drawable.ic_hiphop_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Hockey;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hockey extends SportTypeDescription {

        @NotNull
        public static final Hockey INSTANCE = new Hockey();

        private Hockey() {
            super(SportType.Hockey.INSTANCE, R.string.sport_type_hockey_ball, R.drawable.ic_hockey_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$HorizontalBar;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HorizontalBar extends SportTypeDescription {

        @NotNull
        public static final HorizontalBar INSTANCE = new HorizontalBar();

        private HorizontalBar() {
            super(SportType.HorizontalBar.INSTANCE, R.string.sport_type_horizontal_bar, R.drawable.ic_horizontal_bar_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$HulaHoop;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HulaHoop extends SportTypeDescription {

        @NotNull
        public static final HulaHoop INSTANCE = new HulaHoop();

        private HulaHoop() {
            super(SportType.HulaHoop.INSTANCE, R.string.sport_type_hu_la_hoop, R.drawable.ic_hula_hoop_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Hunting;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hunting extends SportTypeDescription {

        @NotNull
        public static final Hunting INSTANCE = new Hunting();

        private Hunting() {
            super(SportType.Hunting.INSTANCE, R.string.sport_type_hunting, R.drawable.ic_hunt_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$IceHockey;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IceHockey extends SportTypeDescription {

        @NotNull
        public static final IceHockey INSTANCE = new IceHockey();

        private IceHockey() {
            super(SportType.IceHockey.INSTANCE, R.string.sport_type_ice_hockey, R.drawable.ic_puck_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorFitness;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorFitness extends SportTypeDescription {

        @NotNull
        public static final IndoorFitness INSTANCE = new IndoorFitness();

        private IndoorFitness() {
            super(SportType.IndoorFitness.INSTANCE, R.string.sport_type_indoor_fitness, R.drawable.ic_idu_trn_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorFootball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorFootball extends SportTypeDescription {

        @NotNull
        public static final IndoorFootball INSTANCE = new IndoorFootball();

        private IndoorFootball() {
            super(SportType.IndoorFootball.INSTANCE, R.string.sport_type_indoor_football, R.drawable.ic_indoor_soccer_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorRide;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorRide extends SportTypeDescription {

        @NotNull
        public static final IndoorRide INSTANCE = new IndoorRide();

        private IndoorRide() {
            super(SportType.IndoorRide.INSTANCE, Utils.isMidong() ? R.string.sports_type_bike_indoor_ride : R.string.sport_type_aerodyne_bike_alias, R.drawable.ic_idu_cycling_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorSkating;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorSkating extends SportTypeDescription {

        @NotNull
        public static final IndoorSkating INSTANCE = new IndoorSkating();

        private IndoorSkating() {
            super(SportType.IndoorSkating.INSTANCE, R.string.sport_type_indoor_skating, R.drawable.ic_idu_skate_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorSurfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorSurfing extends SportTypeDescription {

        @NotNull
        public static final IndoorSurfing INSTANCE = new IndoorSurfing();

        private IndoorSurfing() {
            super(SportType.IndoorSurfing.INSTANCE, R.string.sport_type_indoor_surfing, R.drawable.ic_is_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$IndoorWalking;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorWalking extends SportTypeDescription {

        @NotNull
        public static final IndoorWalking INSTANCE = new IndoorWalking();

        private IndoorWalking() {
            super(SportType.IndoorWalking.INSTANCE, R.string.sport_type_indoor_walk, R.drawable.ic_idu_walk_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$JaiLiBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class JaiLiBall extends SportTypeDescription {

        @NotNull
        public static final JaiLiBall INSTANCE = new JaiLiBall();

        private JaiLiBall() {
            super(SportType.JaiLiBall.INSTANCE, R.string.sport_type_jai_li_ball, R.drawable.ic_pelota_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$JazzDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class JazzDance extends SportTypeDescription {

        @NotNull
        public static final JazzDance INSTANCE = new JazzDance();

        private JazzDance() {
            super(SportType.JazzDance.INSTANCE, R.string.sport_type_jazz, R.drawable.ic_jazz_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Judo;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Judo extends SportTypeDescription {

        @NotNull
        public static final Judo INSTANCE = new Judo();

        private Judo() {
            super(SportType.Judo.INSTANCE, R.string.sport_type_judo, R.drawable.ic_judo_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Jujitsu;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Jujitsu extends SportTypeDescription {

        @NotNull
        public static final Jujitsu INSTANCE = new Jujitsu();

        private Jujitsu() {
            super(SportType.Jujitsu.INSTANCE, R.string.sport_type_jujitsu, R.drawable.ic_jujitsu_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Karate;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Karate extends SportTypeDescription {

        @NotNull
        public static final Karate INSTANCE = new Karate();

        private Karate() {
            super(SportType.Karate.INSTANCE, R.string.sport_type_karate, R.drawable.ic_karate_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Kayak;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Kayak extends SportTypeDescription {

        @NotNull
        public static final Kayak INSTANCE = new Kayak();

        private Kayak() {
            super(SportType.Kayak.INSTANCE, R.string.sport_type_kayak, R.drawable.ic_kayaking_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Kickboxing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Kickboxing extends SportTypeDescription {

        @NotNull
        public static final Kickboxing INSTANCE = new Kickboxing();

        private Kickboxing() {
            super(SportType.Kickboxing.INSTANCE, R.string.sport_type_free_sparring, R.drawable.ic_fight_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$KickingShuttlecock;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class KickingShuttlecock extends SportTypeDescription {

        @NotNull
        public static final KickingShuttlecock INSTANCE = new KickingShuttlecock();

        private KickingShuttlecock() {
            super(SportType.KickingShuttlecock.INSTANCE, R.string.sport_type_kick_shuttlecock, R.drawable.ic_ktk_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$KiteSurfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class KiteSurfing extends SportTypeDescription {

        @NotNull
        public static final KiteSurfing INSTANCE = new KiteSurfing();

        private KiteSurfing() {
            super(SportType.KiteSurfing.INSTANCE, R.string.sport_type_kite_surfing, R.drawable.ic_kite_surfing_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$LatinDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class LatinDance extends SportTypeDescription {

        @NotNull
        public static final LatinDance INSTANCE = new LatinDance();

        private LatinDance() {
            super(SportType.LatinDance.INSTANCE, R.string.sport_type_latin_dance, R.drawable.ic_latin_dancing_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$MartialArts;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MartialArts extends SportTypeDescription {

        @NotNull
        public static final MartialArts INSTANCE = new MartialArts();

        private MartialArts() {
            super(SportType.MartialArts.INSTANCE, R.string.sport_type_martial_arts, R.drawable.ic_wushu_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$MixedAerobic;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MixedAerobic extends SportTypeDescription {

        @NotNull
        public static final MixedAerobic INSTANCE = new MixedAerobic();

        private MixedAerobic() {
            super(SportType.MixedAerobic.INSTANCE, R.string.sport_type_mixed_aerobic, R.drawable.ic_ac_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$ModernDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModernDance extends SportTypeDescription {

        @NotNull
        public static final ModernDance INSTANCE = new ModernDance();

        private ModernDance() {
            super(SportType.ModernDance.INSTANCE, R.string.sport_type_modern_dance, R.drawable.ic_dance_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Motorboat;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Motorboat extends SportTypeDescription {

        @NotNull
        public static final Motorboat INSTANCE = new Motorboat();

        private Motorboat() {
            super(SportType.Motorboat.INSTANCE, R.string.sport_type_motorboat, R.drawable.ic_motorboat_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$MountainBiking;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MountainBiking extends SportTypeDescription {

        @NotNull
        public static final MountainBiking INSTANCE = new MountainBiking();

        private MountainBiking() {
            super(SportType.MountainBiking.INSTANCE, R.string.sport_type_mountain_riding, R.drawable.ic_sdqx_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Mountaineering;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Mountaineering extends SportTypeDescription {

        @NotNull
        public static final Mountaineering INSTANCE = new Mountaineering();

        private Mountaineering() {
            super(SportType.Mountaineering.INSTANCE, R.string.sports_type_mountain_climb, R.drawable.ic_mountaineering_30, R.color.s30, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$MuayThai;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MuayThai extends SportTypeDescription {

        @NotNull
        public static final MuayThai INSTANCE = new MuayThai();

        private MuayThai() {
            super(SportType.MuayThai.INSTANCE, R.string.sport_type_muay_thai, R.drawable.ic_muay_thai_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$MultiSport;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MultiSport extends SportTypeDescription {

        @NotNull
        public static final MultiSport INSTANCE = new MultiSport();

        private MultiSport() {
            super(SportType.MultiSport.INSTANCE, R.string.sport_type_multi, R.drawable.ic_complex_30, R.color.s25, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$NoGpsSoccer;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoGpsSoccer extends SportTypeDescription {

        @NotNull
        public static final NoGpsSoccer INSTANCE = new NoGpsSoccer();

        private NoGpsSoccer() {
            super(SportType.NoGpsSoccer.INSTANCE, R.string.sport_type_football, R.drawable.ic_football_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$OffRoadMotorcycle;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OffRoadMotorcycle extends SportTypeDescription {

        @NotNull
        public static final OffRoadMotorcycle INSTANCE = new OffRoadMotorcycle();

        private OffRoadMotorcycle() {
            super(SportType.OffRoadMotorcycle.INSTANCE, R.string.sport_type_off_road_motorcycle, R.drawable.ic_motorcycle_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$OpenWaterSwimming;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OpenWaterSwimming extends SportTypeDescription {

        @NotNull
        public static final OpenWaterSwimming INSTANCE = new OpenWaterSwimming();

        private OpenWaterSwimming() {
            super(SportType.OpenWaterSwimming.INSTANCE, R.string.sports_type_swim_outdoor, R.drawable.ic_swim_30, R.color.s15, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Orienteering;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Orienteering extends SportTypeDescription {

        @NotNull
        public static final Orienteering INSTANCE = new Orienteering();

        private Orienteering() {
            super(SportType.Orienteering.INSTANCE, R.string.sport_type_orienteering_skiing, R.drawable.ic_so_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorCycling;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorCycling extends SportTypeDescription {

        @NotNull
        public static final OutdoorCycling INSTANCE = new OutdoorCycling();

        private OutdoorCycling() {
            super(SportType.OutdoorCycling.INSTANCE, R.string.sports_type_bike_ride, R.drawable.ic_cycling_30, R.color.s20, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorHiking;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorHiking extends SportTypeDescription {

        @NotNull
        public static final OutdoorHiking INSTANCE = new OutdoorHiking();

        private OutdoorHiking() {
            super(SportType.OutdoorHiking.INSTANCE, R.string.sports_type_hiking, R.drawable.ic_on_foot_30, R.color.s30, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorRowing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorRowing extends SportTypeDescription {

        @NotNull
        public static final OutdoorRowing INSTANCE = new OutdoorRowing();

        private OutdoorRowing() {
            super(SportType.OutdoorRowing.INSTANCE, Utils.isMidong() ? R.string.sport_type_outdoor_boating : R.string.sport_type_outdoor_boating_alias, R.drawable.ic_outdoor_rowing_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorRunning;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorRunning extends SportTypeDescription {

        @NotNull
        public static final OutdoorRunning INSTANCE = new OutdoorRunning();

        private OutdoorRunning() {
            super(SportType.OutdoorRunning.INSTANCE, Utils.isMidong() ? R.string.running_sports_type_running : R.string.sport_type_running_outside_alias, R.drawable.ic_run_30, R.color.p3, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$OutdoorSkating;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorSkating extends SportTypeDescription {

        @NotNull
        public static final OutdoorSkating INSTANCE = new OutdoorSkating();

        private OutdoorSkating() {
            super(SportType.OutdoorSkating.INSTANCE, R.string.sport_type_outdoor_skating, R.drawable.ic_outdoor_skating_30, R.color.s15, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$PaddleBoardSurfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class PaddleBoardSurfing extends SportTypeDescription {

        @NotNull
        public static final PaddleBoardSurfing INSTANCE = new PaddleBoardSurfing();

        private PaddleBoardSurfing() {
            super(SportType.PaddleBoardSurfing.INSTANCE, R.string.sport_type_paddle_surfing, R.drawable.ic_paddle_boarding_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$ParallelBars;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParallelBars extends SportTypeDescription {

        @NotNull
        public static final ParallelBars INSTANCE = new ParallelBars();

        private ParallelBars() {
            super(SportType.ParallelBars.INSTANCE, R.string.sport_type_parallel_bars, R.drawable.ic_parallel_bars_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Parasailing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Parasailing extends SportTypeDescription {

        @NotNull
        public static final Parasailing INSTANCE = new Parasailing();

        private Parasailing() {
            super(SportType.Parasailing.INSTANCE, R.string.sport_type_paragliding, R.drawable.ic_paraglider_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Parkour;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Parkour extends SportTypeDescription {

        @NotNull
        public static final Parkour INSTANCE = new Parkour();

        private Parkour() {
            super(SportType.Parkour.INSTANCE, R.string.sport_type_parkour, R.drawable.ic_parkour_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Pilates;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Pilates extends SportTypeDescription {

        @NotNull
        public static final Pilates INSTANCE = new Pilates();

        private Pilates() {
            super(SportType.Pilates.INSTANCE, R.string.sport_type_pilates, R.drawable.ic_pilates_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$PoleDancing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class PoleDancing extends SportTypeDescription {

        @NotNull
        public static final PoleDancing INSTANCE = new PoleDancing();

        private PoleDancing() {
            super(SportType.PoleDancing.INSTANCE, R.string.sport_type_pole_dancing, R.drawable.ic_pd_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Polo;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Polo extends SportTypeDescription {

        @NotNull
        public static final Polo INSTANCE = new Polo();

        private Polo() {
            super(SportType.Polo.INSTANCE, R.string.sport_type_polo, R.drawable.ic_polo_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$RaceWalking;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RaceWalking extends SportTypeDescription {

        @NotNull
        public static final RaceWalking INSTANCE = new RaceWalking();

        private RaceWalking() {
            super(SportType.RaceWalking.INSTANCE, R.string.sport_type_race_walking, R.drawable.ic_rw_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$RockClimbing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RockClimbing extends SportTypeDescription {

        @NotNull
        public static final RockClimbing INSTANCE = new RockClimbing();

        private RockClimbing() {
            super(SportType.RockClimbing.INSTANCE, R.string.sport_type_rock_climbing, R.drawable.ic_rock_climbing_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$RollerSkating;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RollerSkating extends SportTypeDescription {

        @NotNull
        public static final RollerSkating INSTANCE = new RollerSkating();

        private RollerSkating() {
            super(SportType.RollerSkating.INSTANCE, R.string.sport_type_roller_skating, R.drawable.ic_roller_skating_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$RouteRun;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RouteRun extends SportTypeDescription {

        @NotNull
        public static final RouteRun INSTANCE = new RouteRun();

        private RouteRun() {
            super(SportType.RouteRun.INSTANCE, R.string.runnings_sport_type_treadmill, R.drawable.ic_snp_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Rowing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Rowing extends SportTypeDescription {

        @NotNull
        public static final Rowing INSTANCE = new Rowing();

        private Rowing() {
            super(SportType.Rowing.INSTANCE, R.string.sport_type_rowing, R.drawable.ic_rowing_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$RowingMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RowingMachine extends SportTypeDescription {

        @NotNull
        public static final RowingMachine INSTANCE = new RowingMachine();

        private RowingMachine() {
            super(SportType.RowingMachine.INSTANCE, R.string.sport_type_rowing_machine, R.drawable.ic_hcj_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Rugby;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Rugby extends SportTypeDescription {

        @NotNull
        public static final Rugby INSTANCE = new Rugby();

        private Rugby() {
            super(SportType.Rugby.INSTANCE, R.string.sport_type_football, R.drawable.ic_rugby_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$RunInPlayground;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RunInPlayground extends SportTypeDescription {

        @NotNull
        public static final RunInPlayground INSTANCE = new RunInPlayground();

        private RunInPlayground() {
            super(SportType.RunInPlayground.INSTANCE, R.string.sports_type_run_in_playground, R.drawable.ic_lap_30, R.color.p3, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Sailing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sailing extends SportTypeDescription {

        @NotNull
        public static final Sailing INSTANCE = new Sailing();

        private Sailing() {
            super(SportType.Sailing.INSTANCE, Utils.isMidong() ? R.string.sport_type_sailing : R.string.sport_type_sailing_alias, R.drawable.ic_windsurfing_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SandbagBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SandbagBall extends SportTypeDescription {

        @NotNull
        public static final SandbagBall INSTANCE = new SandbagBall();

        private SandbagBall() {
            super(SportType.SandbagBall.INSTANCE, R.string.sport_type_sandbag_ball, R.drawable.ic_sandbag_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Shoot;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Shoot extends SportTypeDescription {

        @NotNull
        public static final Shoot INSTANCE = new Shoot();

        private Shoot() {
            super(SportType.Shoot.INSTANCE, R.string.sport_type_shoot, R.drawable.ic_shooting_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Shuffleboard;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Shuffleboard extends SportTypeDescription {

        @NotNull
        public static final Shuffleboard INSTANCE = new Shuffleboard();

        private Shuffleboard() {
            super(SportType.Shuffleboard.INSTANCE, R.string.sport_type_shuffleboard, R.drawable.ic_shuffleboard_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Shuttlecock;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Shuttlecock extends SportTypeDescription {

        @NotNull
        public static final Shuttlecock INSTANCE = new Shuttlecock();

        private Shuttlecock() {
            super(SportType.Shuttlecock.INSTANCE, R.string.sport_type_shuttlecock, R.drawable.ic_shuttlecock_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Skateboard;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Skateboard extends SportTypeDescription {

        @NotNull
        public static final Skateboard INSTANCE = new Skateboard();

        private Skateboard() {
            super(SportType.Skateboard.INSTANCE, R.string.sport_type_skateboarding, R.drawable.ic_skateboard_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Skiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Skiing extends SportTypeDescription {

        @NotNull
        public static final Skiing INSTANCE = new Skiing();

        private Skiing() {
            super(SportType.Skiing.INSTANCE, R.string.sports_type_ski, R.drawable.ic_ski_30, R.color.s15, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SkippingRope;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SkippingRope extends SportTypeDescription {

        @NotNull
        public static final SkippingRope INSTANCE = new SkippingRope();

        private SkippingRope() {
            super(SportType.SkippingRope.INSTANCE, R.string.sport_type_rope_skipping, R.drawable.ic_rope_skipping_30, R.color.s25, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Skydiving;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Skydiving extends SportTypeDescription {

        @NotNull
        public static final Skydiving INSTANCE = new Skydiving();

        private Skydiving() {
            super(SportType.Skydiving.INSTANCE, R.string.sport_type_skydiving, R.drawable.ic_parachute_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Sleigh;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sleigh extends SportTypeDescription {

        @NotNull
        public static final Sleigh INSTANCE = new Sleigh();

        private Sleigh() {
            super(SportType.Sleigh.INSTANCE, R.string.sport_type_sled, R.drawable.ic_sled_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Snorkeling;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Snorkeling extends SportTypeDescription {

        @NotNull
        public static final Snorkeling INSTANCE = new Snorkeling();

        private Snorkeling() {
            super(SportType.Snorkeling.INSTANCE, R.string.sport_type_snorkeling, R.drawable.ic_snorkeling_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SnowboardingDouble;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SnowboardingDouble extends SportTypeDescription {

        @NotNull
        public static final SnowboardingDouble INSTANCE = new SnowboardingDouble();

        private SnowboardingDouble() {
            super(SportType.SnowboardingDouble.INSTANCE, R.string.sport_type_cross_double_skiing, R.drawable.ic_ski2_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SnowboardingSingle;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SnowboardingSingle extends SportTypeDescription {

        @NotNull
        public static final SnowboardingSingle INSTANCE = new SnowboardingSingle();

        private SnowboardingSingle() {
            super(SportType.SnowboardingSingle.INSTANCE, R.string.sport_type_board_skiing, R.drawable.ic_snowboarding_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Snowmobile;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Snowmobile extends SportTypeDescription {

        @NotNull
        public static final Snowmobile INSTANCE = new Snowmobile();

        private Snowmobile() {
            super(SportType.Snowmobile.INSTANCE, R.string.sport_type_snow_mobile, R.drawable.ic_snowmobile_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Snowmobiles;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Snowmobiles extends SportTypeDescription {

        @NotNull
        public static final Snowmobiles INSTANCE = new Snowmobiles();

        private Snowmobiles() {
            super(SportType.Snowmobiles.INSTANCE, R.string.sport_type_snowmobile, R.drawable.ic_skibob_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SnowshoeHiking;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SnowshoeHiking extends SportTypeDescription {

        @NotNull
        public static final SnowshoeHiking INSTANCE = new SnowshoeHiking();

        private SnowshoeHiking() {
            super(SportType.SnowshoeHiking.INSTANCE, R.string.sport_type_snowshoe_hiking, R.drawable.ic_snowshoeing_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Soccer;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Soccer extends SportTypeDescription {

        @NotNull
        public static final Soccer INSTANCE = new Soccer();

        private Soccer() {
            super(SportType.Soccer.INSTANCE, R.string.sport_type_football, R.drawable.ic_football_30, R.color.s20, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Softball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Softball extends SportTypeDescription {

        @NotNull
        public static final Softball INSTANCE = new Softball();

        private Softball() {
            super(SportType.Softball.INSTANCE, R.string.sport_type_softball, R.drawable.ic_softball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SomatosensoryGame;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SomatosensoryGame extends SportTypeDescription {

        @NotNull
        public static final SomatosensoryGame INSTANCE = new SomatosensoryGame();

        private SomatosensoryGame() {
            super(SportType.SomatosensoryGame.INSTANCE, R.string.sport_type_somatosensory_game, R.drawable.ic_sg_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SpinningBike;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SpinningBike extends SportTypeDescription {

        @NotNull
        public static final SpinningBike INSTANCE = new SpinningBike();

        private SpinningBike() {
            super(SportType.SpinningBike.INSTANCE, R.string.sport_type_spinning_bike, R.drawable.ic_spinning_bike_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SquareDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SquareDance extends SportTypeDescription {

        @NotNull
        public static final SquareDance INSTANCE = new SquareDance();

        private SquareDance() {
            super(SportType.SquareDance.INSTANCE, R.string.sport_type_square_dance, R.drawable.ic_gc_dance_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Squash;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Squash extends SportTypeDescription {

        @NotNull
        public static final Squash INSTANCE = new Squash();

        private Squash() {
            super(SportType.Squash.INSTANCE, R.string.sport_type_squash_ball, R.drawable.ic_squash_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$StepTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class StepTraining extends SportTypeDescription {

        @NotNull
        public static final StepTraining INSTANCE = new StepTraining();

        private StepTraining() {
            super(SportType.StepTraining.INSTANCE, R.string.sport_type_step_training, R.drawable.ic_stepping_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$StepperMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class StepperMachine extends SportTypeDescription {

        @NotNull
        public static final StepperMachine INSTANCE = new StepperMachine();

        private StepperMachine() {
            super(SportType.StepperMachine.INSTANCE, R.string.sport_type_stepper, R.drawable.ic_stepper_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$StrengthTraining;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class StrengthTraining extends SportTypeDescription {

        @NotNull
        public static final StrengthTraining INSTANCE = new StrengthTraining();

        private StrengthTraining() {
            super(SportType.StrengthTraining.INSTANCE, R.string.sport_type_strength_training, R.drawable.ic_prst_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Stretch;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Stretch extends SportTypeDescription {

        @NotNull
        public static final Stretch INSTANCE = new Stretch();

        private Stretch() {
            super(SportType.Stretch.INSTANCE, R.string.sport_type_stretch_training, R.drawable.ic_stretch_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Surfing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Surfing extends SportTypeDescription {

        @NotNull
        public static final Surfing INSTANCE = new Surfing();

        private Surfing() {
            super(SportType.Surfing.INSTANCE, R.string.sport_type_surfing, R.drawable.ic_surf_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SwimmingPool;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SwimmingPool extends SportTypeDescription {

        @NotNull
        public static final SwimmingPool INSTANCE = new SwimmingPool();

        private SwimmingPool() {
            super(SportType.SwimmingPool.INSTANCE, R.string.sports_type_swim_indoor, R.drawable.ic_swimming_pool_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Swing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Swing extends SportTypeDescription {

        @NotNull
        public static final Swing INSTANCE = new Swing();

        private Swing() {
            super(SportType.Swing.INSTANCE, R.string.sport_type_swing, R.drawable.ic_swing_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SwordsmanSkip;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SwordsmanSkip extends SportTypeDescription {

        @NotNull
        public static final SwordsmanSkip INSTANCE = new SwordsmanSkip();

        private SwordsmanSkip() {
            super(SportType.SwordsmanSkip.INSTANCE, R.string.sport_type_fencing, R.drawable.ic_fencing_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$SynchronizedSwimming;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SynchronizedSwimming extends SportTypeDescription {

        @NotNull
        public static final SynchronizedSwimming INSTANCE = new SynchronizedSwimming();

        private SynchronizedSwimming() {
            super(SportType.SynchronizedSwimming.INSTANCE, R.string.sport_type_synchronized_swimming, R.drawable.ic_ss_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$TableFootball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TableFootball extends SportTypeDescription {

        @NotNull
        public static final TableFootball INSTANCE = new TableFootball();

        private TableFootball() {
            super(SportType.TableFootball.INSTANCE, R.string.sport_type_table_football, R.drawable.ic_table_soccer_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$TableTennis;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TableTennis extends SportTypeDescription {

        @NotNull
        public static final TableTennis INSTANCE = new TableTennis();

        private TableTennis() {
            super(SportType.TableTennis.INSTANCE, R.string.sport_type_pingpong, R.drawable.ic_pingpong_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Taekwondo;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Taekwondo extends SportTypeDescription {

        @NotNull
        public static final Taekwondo INSTANCE = new Taekwondo();

        private Taekwondo() {
            super(SportType.Taekwondo.INSTANCE, R.string.sport_type_taekwondo, R.drawable.ic_taekwondo_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$TaiChi;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TaiChi extends SportTypeDescription {

        @NotNull
        public static final TaiChi INSTANCE = new TaiChi();

        private TaiChi() {
            super(SportType.TaiChi.INSTANCE, R.string.sport_type_taichi, R.drawable.ic_taichi_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$TapDance;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TapDance extends SportTypeDescription {

        @NotNull
        public static final TapDance INSTANCE = new TapDance();

        private TapDance() {
            super(SportType.TapDance.INSTANCE, R.string.sport_type_tap_dance, R.drawable.ic_dance_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Tennis;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Tennis extends SportTypeDescription {

        @NotNull
        public static final Tennis INSTANCE = new Tennis();

        private Tennis() {
            super(SportType.Tennis.INSTANCE, R.string.sport_type_tennis, R.drawable.ic_tennis_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$TrailRunning;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TrailRunning extends SportTypeDescription {

        @NotNull
        public static final TrailRunning INSTANCE = new TrailRunning();

        private TrailRunning() {
            super(SportType.TrailRunning.INSTANCE, R.string.running_sports_type_crosscountry, R.drawable.ic_trail_running_30, R.color.p3, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Trampoline;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Trampoline extends SportTypeDescription {

        @NotNull
        public static final Trampoline INSTANCE = new Trampoline();

        private Trampoline() {
            super(SportType.Trampoline.INSTANCE, R.string.sport_type_trampoline, R.drawable.ic_trampoline_30_s20, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Treadmill;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Treadmill extends SportTypeDescription {

        @NotNull
        public static final Treadmill INSTANCE = new Treadmill();

        private Treadmill() {
            super(SportType.Treadmill.INSTANCE, R.string.runnings_sport_type_treadmill, R.drawable.ic_snp_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$TreadmillNormal;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TreadmillNormal extends SportTypeDescription {

        @NotNull
        public static final TreadmillNormal INSTANCE = new TreadmillNormal();

        private TreadmillNormal() {
            super(SportType.TreadmillNormal.INSTANCE, R.string.runnings_sport_type_treadmill, R.drawable.ic_snp_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Triathlon;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Triathlon extends SportTypeDescription {

        @NotNull
        public static final Triathlon INSTANCE = new Triathlon();

        private Triathlon() {
            super(SportType.Triathlon.INSTANCE, R.string.sport_mix_type_triathlon, R.drawable.ic_triathlon_30, R.color.s25, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$TugOfWar;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TugOfWar extends SportTypeDescription {

        @NotNull
        public static final TugOfWar INSTANCE = new TugOfWar();

        private TugOfWar() {
            super(SportType.TugOfWar.INSTANCE, R.string.sport_type_tug_of_war, R.drawable.ic_tow_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Volleyball;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Volleyball extends SportTypeDescription {

        @NotNull
        public static final Volleyball INSTANCE = new Volleyball();

        private Volleyball() {
            super(SportType.Volleyball.INSTANCE, R.string.sport_type_volleyball, R.drawable.ic_volleyball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Walking;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Walking extends SportTypeDescription {

        @NotNull
        public static final Walking INSTANCE = new Walking();

        private Walking() {
            super(SportType.Walking.INSTANCE, R.string.running_sports_type_walking, R.drawable.ic_walk_30, R.color.p3, true, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$WalkingMachine;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WalkingMachine extends SportTypeDescription {

        @NotNull
        public static final WalkingMachine INSTANCE = new WalkingMachine();

        private WalkingMachine() {
            super(SportType.WalkingMachine.INSTANCE, R.string.sport_type_walking_machine, R.drawable.ic_walker_30, R.color.s30, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$WallBall;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WallBall extends SportTypeDescription {

        @NotNull
        public static final WallBall INSTANCE = new WallBall();

        private WallBall() {
            super(SportType.WallBall.INSTANCE, R.string.sport_type_wall_ball, R.drawable.ic_wall_ball_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$WaterPolo;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WaterPolo extends SportTypeDescription {

        @NotNull
        public static final WaterPolo INSTANCE = new WaterPolo();

        private WaterPolo() {
            super(SportType.WaterPolo.INSTANCE, R.string.sport_type_water_polo, R.drawable.ic_water_polo_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$WaterSkiing;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WaterSkiing extends SportTypeDescription {

        @NotNull
        public static final WaterSkiing INSTANCE = new WaterSkiing();

        private WaterSkiing() {
            super(SportType.WaterSkiing.INSTANCE, R.string.sport_type_water_skiing, R.drawable.ic_water_skiing_30, R.color.s15, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Wrestling;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Wrestling extends SportTypeDescription {

        @NotNull
        public static final Wrestling INSTANCE = new Wrestling();

        private Wrestling() {
            super(SportType.Wrestling.INSTANCE, R.string.sport_type_wrestling, R.drawable.ic_wrestling_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Yoga;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Yoga extends SportTypeDescription {

        @NotNull
        public static final Yoga INSTANCE = new Yoga();

        private Yoga() {
            super(SportType.Yoga.INSTANCE, R.string.sport_type_yoga, R.drawable.ic_yoga_30, R.color.s20, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeDescription$Zumba;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Zumba extends SportTypeDescription {

        @NotNull
        public static final Zumba INSTANCE = new Zumba();

        private Zumba() {
            super(SportType.Zumba.INSTANCE, R.string.sport_type_zumba_dance, R.drawable.ic_zumba_30, R.color.p3, false, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "Lcom/huami/moving/ui/utils/SportTypeDescription;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ArrayList<SportTypeDescription>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<SportTypeDescription> invoke() {
            return CollectionsKt__CollectionsKt.arrayListOf(OutdoorRunning.INSTANCE, Treadmill.INSTANCE, Walking.INSTANCE, OutdoorCycling.INSTANCE, FreeTraining.INSTANCE, SwimmingPool.INSTANCE, OpenWaterSwimming.INSTANCE, IndoorRide.INSTANCE, EllipticalMachine.INSTANCE, Mountaineering.INSTANCE, TrailRunning.INSTANCE, Skiing.INSTANCE, OutdoorHiking.INSTANCE, Tennis.INSTANCE, Soccer.INSTANCE, Triathlon.INSTANCE, MultiSport.INSTANCE, SkippingRope.INSTANCE, RowingMachine.INSTANCE, IndoorFitness.INSTANCE, TreadmillNormal.INSTANCE, RouteRun.INSTANCE, IndoorWalking.INSTANCE, Curling.INSTANCE, SnowboardingSingle.INSTANCE, AlpineSkiing.INSTANCE, OutdoorSkating.INSTANCE, IndoorSkating.INSTANCE, CrossCountrySkiing.INSTANCE, MountainBiking.INSTANCE, BMX.INSTANCE, HighIntensityIntervalTraining.INSTANCE, CoreTraining.INSTANCE, MixedAerobic.INSTANCE, StrengthTraining.INSTANCE, Stretch.INSTANCE, ClimbingMachine.INSTANCE, FlexibilityTraining.INSTANCE, StepTraining.INSTANCE, StepperMachine.INSTANCE, Gymnastics.INSTANCE, Yoga.INSTANCE, Pilates.INSTANCE, Surfing.INSTANCE, Hunting.INSTANCE, Fishing.INSTANCE, Sailing.INSTANCE, OutdoorRowing.INSTANCE, Skateboard.INSTANCE, PaddleBoardSurfing.INSTANCE, RollerSkating.INSTANCE, RockClimbing.INSTANCE, Ballet.INSTANCE, BellyDance.INSTANCE, SquareDance.INSTANCE, Breaking.INSTANCE, BallroomDance.INSTANCE, Dance.INSTANCE, Zumba.INSTANCE, Cricket.INSTANCE, Baseball.INSTANCE, Bowling.INSTANCE, Squash.INSTANCE, Rugby.INSTANCE, Golf.INSTANCE, GolfSwing.INSTANCE, Basketball.INSTANCE, Softball.INSTANCE, GateBall.INSTANCE, Volleyball.INSTANCE, TableTennis.INSTANCE, Hockey.INSTANCE, Handball.INSTANCE, Badminton.INSTANCE, Archery.INSTANCE, EquestrianSports.INSTANCE, SwordsmanSkip.INSTANCE, Karate.INSTANCE, Boxing.INSTANCE, Judo.INSTANCE, Wrestling.INSTANCE, TaiChi.INSTANCE, MuayThai.INSTANCE, Taekwondo.INSTANCE, MartialArts.INSTANCE, Kickboxing.INSTANCE, SnowboardingDouble.INSTANCE, KiteSurfing.INSTANCE, ClimbTheStairs.INSTANCE, Aerobics.INSTANCE, DirectionalCrossCountry.INSTANCE, GroupGymnastics.INSTANCE, LatinDance.INSTANCE, JazzDance.INSTANCE, FightingExercise.INSTANCE, HulaHoop.INSTANCE, Frisbee.INSTANCE, Darts.INSTANCE, FlyingAKite.INSTANCE, TugOfWar.INSTANCE, KickingShuttlecock.INSTANCE, BeachSoccer.INSTANCE, BeachVolleyball.INSTANCE, Drifting.INSTANCE, Motorboat.INSTANCE, Snowmobiles.INSTANCE, Sleigh.INSTANCE, Orienteering.INSTANCE, Biathlon.INSTANCE, Parkour.INSTANCE, CrossTraining.INSTANCE, RaceWalking.INSTANCE, Driving.INSTANCE, Parasailing.INSTANCE, ESports.INSTANCE, ATV.INSTANCE, Snowmobile.INSTANCE, OffRoadMotorcycle.INSTANCE, DragonBoat.INSTANCE, WaterSkiing.INSTANCE, Kayak.INSTANCE, Rowing.INSTANCE, Polo.INSTANCE, SpinningBike.INSTANCE, WalkingMachine.INSTANCE, WallBall.INSTANCE, FolkDance.INSTANCE, Jujitsu.INSTANCE, Fencing.INSTANCE, HorizontalBar.INSTANCE, ParallelBars.INSTANCE, Billiards.INSTANCE, Fujiki.INSTANCE, DodgeBall.INSTANCE, WaterPolo.INSTANCE, FinSwimming.INSTANCE, SynchronizedSwimming.INSTANCE, Snorkeling.INSTANCE, IceHockey.INSTANCE, Swing.INSTANCE, Shuffleboard.INSTANCE, TableFootball.INSTANCE, Shuttlecock.INSTANCE, SomatosensoryGame.INSTANCE, IndoorFootball.INSTANCE, HipHop.INSTANCE, PoleDancing.INSTANCE, BattleRope.INSTANCE, BreakDancing.INSTANCE, SandbagBall.INSTANCE, GroundThrow.INSTANCE, JaiLiBall.INSTANCE, IndoorSurfing.INSTANCE, Chess.INSTANCE, Checkers.INSTANCE, Go.INSTANCE, Bridge.INSTANCE, BoardGames.INSTANCE, SnowshoeHiking.INSTANCE, Shoot.INSTANCE, Skydiving.INSTANCE, Downhill.INSTANCE, BungeeJumping.INSTANCE, Trampoline.INSTANCE, Bouldering.INSTANCE, ModernDance.INSTANCE, Disco.INSTANCE, TapDance.INSTANCE, FloorBall.INSTANCE, NoGpsSoccer.INSTANCE, RunInPlayground.INSTANCE);
        }
    }

    private SportTypeDescription(SportType sportType, @StringRes int i, @DrawableRes int i2, @ColorRes int i3, boolean z) {
        this.sportType = sportType;
        this.iconId = i2;
        this.bgColorId = i3;
        this.isOutdoor = z;
        this.nameId = i;
    }

    public /* synthetic */ SportTypeDescription(SportType sportType, int i, int i2, int i3, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(sportType, i, i2, i3, z);
    }

    public final int getBgColorId() {
        return this.bgColorId;
    }

    public final int getIconId() {
        return this.iconId;
    }

    public final int getNameId() {
        return this.nameId;
    }

    @NotNull
    public final SportType getSportType() {
        return this.sportType;
    }

    /* JADX INFO: renamed from: isOutdoor, reason: from getter */
    public final boolean getIsOutdoor() {
        return this.isOutdoor;
    }
}
