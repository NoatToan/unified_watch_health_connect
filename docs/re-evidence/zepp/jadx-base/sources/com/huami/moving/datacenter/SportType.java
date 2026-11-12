package com.huami.moving.datacenter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ç\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0003\bµ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:é\u0001\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001B#\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\u0082\u0001Ö\u0002¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001û\u0001ü\u0001ý\u0001þ\u0001ÿ\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002\u0098\u0002\u0099\u0002\u009a\u0002\u009b\u0002\u009c\u0002\u009d\u0002\u009e\u0002\u009f\u0002 \u0002¡\u0002¢\u0002£\u0002¤\u0002¥\u0002¦\u0002§\u0002¨\u0002©\u0002ª\u0002«\u0002¬\u0002\u00ad\u0002®\u0002¯\u0002°\u0002±\u0002²\u0002³\u0002´\u0002µ\u0002¶\u0002·\u0002¸\u0002¹\u0002º\u0002»\u0002¼\u0002½\u0002¾\u0002¿\u0002À\u0002Á\u0002Â\u0002Ã\u0002Ä\u0002Å\u0002Æ\u0002Ç\u0002È\u0002É\u0002Ê\u0002Ë\u0002Ì\u0002Í\u0002Î\u0002Ï\u0002Ð\u0002Ñ\u0002Ò\u0002Ó\u0002Ô\u0002Õ\u0002Ö\u0002×\u0002Ø\u0002Ù\u0002Ú\u0002Û\u0002Ü\u0002Ý\u0002Þ\u0002ß\u0002à\u0002á\u0002â\u0002ã\u0002ä\u0002å\u0002æ\u0002ç\u0002è\u0002¨\u0006é\u0002"}, d2 = {"Lcom/huami/moving/datacenter/SportType;", "", "", "a", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "", "b", LogUtil.I, "getId", "()I", "id", "c", "getType", "type", "<init>", "(Ljava/lang/String;II)V", "ATV", "Aerobics", "AlpineSkiing", "Archery", "BMX", "Badminton", "Ballet", "BallroomDance", "Baseball", "Basketball", "BattleRope", "BeachSoccer", "BeachVolleyball", "BellyDance", "Biathlon", "Billiards", "BoardGames", "Bouldering", "Bowling", "Boxing", "BreakDancing", "Breaking", "Bridge", "BungeeJumping", "Checkers", "Chess", "ClimbTheStairs", "ClimbingMachine", "CoreTraining", "Cricket", "CrossCountrySkiing", "CrossTraining", "Curling", "Dance", "Darts", "DirectionalCrossCountry", "Disco", "DodgeBall", "Downhill", "DragonBoat", "Drifting", "Driving", "ESports", "EllipticalMachine", "EquestrianSports", "Fencing", "FightingExercise", "FinSwimming", "Fishing", "FlexibilityTraining", "FloorBall", "FlyingAKite", "FolkDance", "FreeTraining", "Frisbee", "Fujiki", "GateBall", "Go", "Golf", "GolfSwing", "GroundThrow", "GroupGymnastics", "Gymnastics", "Handball", "HighIntensityIntervalTraining", "HipHop", "Hockey", "HorizontalBar", "HulaHoop", "Hunting", "IceHockey", "IndoorFitness", "IndoorFootball", "IndoorRide", "IndoorSkating", "IndoorSurfing", "IndoorWalking", "JaiLiBall", "JazzDance", "Judo", "Jujitsu", "Karate", "Kayak", "Kickboxing", "KickingShuttlecock", "KiteSurfing", "LatinDance", "MartialArts", "MixedAerobic", "ModernDance", "Motorboat", "MountainBiking", "Mountaineering", "MuayThai", "MultiSport", "NoGpsSoccer", "OffRoadMotorcycle", "OpenWaterSwimming", "Orienteering", "OutdoorCycling", "OutdoorHiking", "OutdoorRowing", "OutdoorRunning", "OutdoorSkating", "PaddleBoardSurfing", "ParallelBars", "Parasailing", "Parkour", "Pilates", "PoleDancing", "Polo", "RaceWalking", "RockClimbing", "RollerSkating", "RouteRun", "Rowing", "RowingMachine", "Rugby", "RunInPlayground", "Sailing", "SandbagBall", "Shoot", "Shuffleboard", "Shuttlecock", "Skateboard", "Skiing", "SkippingRope", "Skydiving", "Sleigh", "Snorkeling", "SnowboardingDouble", "SnowboardingSingle", "Snowmobile", "Snowmobiles", "SnowshoeHiking", "Soccer", "Softball", "SomatosensoryGame", "SpinningBike", "SquareDance", "Squash", "StepTraining", "StepperMachine", "StrengthTraining", "Stretch", "Surfing", "SwimmingPool", "Swing", "SwordsmanSkip", "SynchronizedSwimming", "TableFootball", "TableTennis", "Taekwondo", "TaiChi", "TapDance", "Tennis", "TrailRunning", "Trampoline", SportAnalytics.ParamValue.SportType.TREADMILL, "TreadmillNormal", "Triathlon", "TugOfWar", "Volleyball", "Walking", "WalkingMachine", "WallBall", "WaterPolo", "WaterSkiing", "Wrestling", "Yoga", "Zumba", "Lcom/huami/moving/datacenter/SportType$OutdoorRunning;", "Lcom/huami/moving/datacenter/SportType$Treadmill;", "Lcom/huami/moving/datacenter/SportType$Walking;", "Lcom/huami/moving/datacenter/SportType$OutdoorCycling;", "Lcom/huami/moving/datacenter/SportType$FreeTraining;", "Lcom/huami/moving/datacenter/SportType$SwimmingPool;", "Lcom/huami/moving/datacenter/SportType$OpenWaterSwimming;", "Lcom/huami/moving/datacenter/SportType$IndoorRide;", "Lcom/huami/moving/datacenter/SportType$EllipticalMachine;", "Lcom/huami/moving/datacenter/SportType$Mountaineering;", "Lcom/huami/moving/datacenter/SportType$TrailRunning;", "Lcom/huami/moving/datacenter/SportType$Skiing;", "Lcom/huami/moving/datacenter/SportType$OutdoorHiking;", "Lcom/huami/moving/datacenter/SportType$Tennis;", "Lcom/huami/moving/datacenter/SportType$Soccer;", "Lcom/huami/moving/datacenter/SportType$Triathlon;", "Lcom/huami/moving/datacenter/SportType$MultiSport;", "Lcom/huami/moving/datacenter/SportType$SkippingRope;", "Lcom/huami/moving/datacenter/SportType$RowingMachine;", "Lcom/huami/moving/datacenter/SportType$IndoorFitness;", "Lcom/huami/moving/datacenter/SportType$TreadmillNormal;", "Lcom/huami/moving/datacenter/SportType$RouteRun;", "Lcom/huami/moving/datacenter/SportType$IndoorWalking;", "Lcom/huami/moving/datacenter/SportType$Curling;", "Lcom/huami/moving/datacenter/SportType$SnowboardingSingle;", "Lcom/huami/moving/datacenter/SportType$AlpineSkiing;", "Lcom/huami/moving/datacenter/SportType$OutdoorSkating;", "Lcom/huami/moving/datacenter/SportType$IndoorSkating;", "Lcom/huami/moving/datacenter/SportType$CrossCountrySkiing;", "Lcom/huami/moving/datacenter/SportType$MountainBiking;", "Lcom/huami/moving/datacenter/SportType$BMX;", "Lcom/huami/moving/datacenter/SportType$HighIntensityIntervalTraining;", "Lcom/huami/moving/datacenter/SportType$CoreTraining;", "Lcom/huami/moving/datacenter/SportType$MixedAerobic;", "Lcom/huami/moving/datacenter/SportType$StrengthTraining;", "Lcom/huami/moving/datacenter/SportType$Stretch;", "Lcom/huami/moving/datacenter/SportType$ClimbingMachine;", "Lcom/huami/moving/datacenter/SportType$FlexibilityTraining;", "Lcom/huami/moving/datacenter/SportType$StepTraining;", "Lcom/huami/moving/datacenter/SportType$StepperMachine;", "Lcom/huami/moving/datacenter/SportType$Gymnastics;", "Lcom/huami/moving/datacenter/SportType$Yoga;", "Lcom/huami/moving/datacenter/SportType$Pilates;", "Lcom/huami/moving/datacenter/SportType$Surfing;", "Lcom/huami/moving/datacenter/SportType$Hunting;", "Lcom/huami/moving/datacenter/SportType$Fishing;", "Lcom/huami/moving/datacenter/SportType$Sailing;", "Lcom/huami/moving/datacenter/SportType$OutdoorRowing;", "Lcom/huami/moving/datacenter/SportType$Skateboard;", "Lcom/huami/moving/datacenter/SportType$PaddleBoardSurfing;", "Lcom/huami/moving/datacenter/SportType$RollerSkating;", "Lcom/huami/moving/datacenter/SportType$RockClimbing;", "Lcom/huami/moving/datacenter/SportType$Ballet;", "Lcom/huami/moving/datacenter/SportType$BellyDance;", "Lcom/huami/moving/datacenter/SportType$SquareDance;", "Lcom/huami/moving/datacenter/SportType$Breaking;", "Lcom/huami/moving/datacenter/SportType$BallroomDance;", "Lcom/huami/moving/datacenter/SportType$Dance;", "Lcom/huami/moving/datacenter/SportType$Zumba;", "Lcom/huami/moving/datacenter/SportType$Cricket;", "Lcom/huami/moving/datacenter/SportType$Baseball;", "Lcom/huami/moving/datacenter/SportType$Bowling;", "Lcom/huami/moving/datacenter/SportType$Squash;", "Lcom/huami/moving/datacenter/SportType$Rugby;", "Lcom/huami/moving/datacenter/SportType$Golf;", "Lcom/huami/moving/datacenter/SportType$GolfSwing;", "Lcom/huami/moving/datacenter/SportType$Basketball;", "Lcom/huami/moving/datacenter/SportType$Softball;", "Lcom/huami/moving/datacenter/SportType$GateBall;", "Lcom/huami/moving/datacenter/SportType$Volleyball;", "Lcom/huami/moving/datacenter/SportType$TableTennis;", "Lcom/huami/moving/datacenter/SportType$Hockey;", "Lcom/huami/moving/datacenter/SportType$Handball;", "Lcom/huami/moving/datacenter/SportType$Badminton;", "Lcom/huami/moving/datacenter/SportType$Archery;", "Lcom/huami/moving/datacenter/SportType$EquestrianSports;", "Lcom/huami/moving/datacenter/SportType$SwordsmanSkip;", "Lcom/huami/moving/datacenter/SportType$Karate;", "Lcom/huami/moving/datacenter/SportType$Boxing;", "Lcom/huami/moving/datacenter/SportType$Judo;", "Lcom/huami/moving/datacenter/SportType$Wrestling;", "Lcom/huami/moving/datacenter/SportType$TaiChi;", "Lcom/huami/moving/datacenter/SportType$MuayThai;", "Lcom/huami/moving/datacenter/SportType$Taekwondo;", "Lcom/huami/moving/datacenter/SportType$MartialArts;", "Lcom/huami/moving/datacenter/SportType$Kickboxing;", "Lcom/huami/moving/datacenter/SportType$SnowboardingDouble;", "Lcom/huami/moving/datacenter/SportType$KiteSurfing;", "Lcom/huami/moving/datacenter/SportType$ClimbTheStairs;", "Lcom/huami/moving/datacenter/SportType$Aerobics;", "Lcom/huami/moving/datacenter/SportType$DirectionalCrossCountry;", "Lcom/huami/moving/datacenter/SportType$GroupGymnastics;", "Lcom/huami/moving/datacenter/SportType$LatinDance;", "Lcom/huami/moving/datacenter/SportType$JazzDance;", "Lcom/huami/moving/datacenter/SportType$FightingExercise;", "Lcom/huami/moving/datacenter/SportType$HulaHoop;", "Lcom/huami/moving/datacenter/SportType$Frisbee;", "Lcom/huami/moving/datacenter/SportType$Darts;", "Lcom/huami/moving/datacenter/SportType$FlyingAKite;", "Lcom/huami/moving/datacenter/SportType$TugOfWar;", "Lcom/huami/moving/datacenter/SportType$KickingShuttlecock;", "Lcom/huami/moving/datacenter/SportType$BeachSoccer;", "Lcom/huami/moving/datacenter/SportType$BeachVolleyball;", "Lcom/huami/moving/datacenter/SportType$Drifting;", "Lcom/huami/moving/datacenter/SportType$Motorboat;", "Lcom/huami/moving/datacenter/SportType$Snowmobiles;", "Lcom/huami/moving/datacenter/SportType$Sleigh;", "Lcom/huami/moving/datacenter/SportType$Orienteering;", "Lcom/huami/moving/datacenter/SportType$Biathlon;", "Lcom/huami/moving/datacenter/SportType$Parkour;", "Lcom/huami/moving/datacenter/SportType$CrossTraining;", "Lcom/huami/moving/datacenter/SportType$RaceWalking;", "Lcom/huami/moving/datacenter/SportType$Driving;", "Lcom/huami/moving/datacenter/SportType$Parasailing;", "Lcom/huami/moving/datacenter/SportType$Snowmobile;", "Lcom/huami/moving/datacenter/SportType$OffRoadMotorcycle;", "Lcom/huami/moving/datacenter/SportType$DragonBoat;", "Lcom/huami/moving/datacenter/SportType$WaterSkiing;", "Lcom/huami/moving/datacenter/SportType$Kayak;", "Lcom/huami/moving/datacenter/SportType$Rowing;", "Lcom/huami/moving/datacenter/SportType$Polo;", "Lcom/huami/moving/datacenter/SportType$SpinningBike;", "Lcom/huami/moving/datacenter/SportType$WalkingMachine;", "Lcom/huami/moving/datacenter/SportType$WallBall;", "Lcom/huami/moving/datacenter/SportType$FolkDance;", "Lcom/huami/moving/datacenter/SportType$Jujitsu;", "Lcom/huami/moving/datacenter/SportType$Fencing;", "Lcom/huami/moving/datacenter/SportType$HorizontalBar;", "Lcom/huami/moving/datacenter/SportType$ParallelBars;", "Lcom/huami/moving/datacenter/SportType$Billiards;", "Lcom/huami/moving/datacenter/SportType$Fujiki;", "Lcom/huami/moving/datacenter/SportType$DodgeBall;", "Lcom/huami/moving/datacenter/SportType$WaterPolo;", "Lcom/huami/moving/datacenter/SportType$FinSwimming;", "Lcom/huami/moving/datacenter/SportType$SynchronizedSwimming;", "Lcom/huami/moving/datacenter/SportType$Snorkeling;", "Lcom/huami/moving/datacenter/SportType$IceHockey;", "Lcom/huami/moving/datacenter/SportType$Swing;", "Lcom/huami/moving/datacenter/SportType$Shuffleboard;", "Lcom/huami/moving/datacenter/SportType$TableFootball;", "Lcom/huami/moving/datacenter/SportType$Shuttlecock;", "Lcom/huami/moving/datacenter/SportType$SomatosensoryGame;", "Lcom/huami/moving/datacenter/SportType$IndoorFootball;", "Lcom/huami/moving/datacenter/SportType$HipHop;", "Lcom/huami/moving/datacenter/SportType$PoleDancing;", "Lcom/huami/moving/datacenter/SportType$BattleRope;", "Lcom/huami/moving/datacenter/SportType$BreakDancing;", "Lcom/huami/moving/datacenter/SportType$SandbagBall;", "Lcom/huami/moving/datacenter/SportType$GroundThrow;", "Lcom/huami/moving/datacenter/SportType$JaiLiBall;", "Lcom/huami/moving/datacenter/SportType$IndoorSurfing;", "Lcom/huami/moving/datacenter/SportType$Chess;", "Lcom/huami/moving/datacenter/SportType$Checkers;", "Lcom/huami/moving/datacenter/SportType$Go;", "Lcom/huami/moving/datacenter/SportType$Bridge;", "Lcom/huami/moving/datacenter/SportType$BoardGames;", "Lcom/huami/moving/datacenter/SportType$SnowshoeHiking;", "Lcom/huami/moving/datacenter/SportType$Shoot;", "Lcom/huami/moving/datacenter/SportType$Skydiving;", "Lcom/huami/moving/datacenter/SportType$Downhill;", "Lcom/huami/moving/datacenter/SportType$BungeeJumping;", "Lcom/huami/moving/datacenter/SportType$Trampoline;", "Lcom/huami/moving/datacenter/SportType$Bouldering;", "Lcom/huami/moving/datacenter/SportType$ModernDance;", "Lcom/huami/moving/datacenter/SportType$Disco;", "Lcom/huami/moving/datacenter/SportType$TapDance;", "Lcom/huami/moving/datacenter/SportType$FloorBall;", "Lcom/huami/moving/datacenter/SportType$ESports;", "Lcom/huami/moving/datacenter/SportType$ATV;", "Lcom/huami/moving/datacenter/SportType$NoGpsSoccer;", "Lcom/huami/moving/datacenter/SportType$RunInPlayground;", "moving_release"}, k = 1, mv = {1, 5, 1})
public abstract class SportType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$ATV;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ATV extends SportType {

        @NotNull
        public static final ATV INSTANCE = new ATV();

        private ATV() {
            super("沙滩车", 190, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Aerobics;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Aerobics extends SportType {

        @NotNull
        public static final Aerobics INSTANCE = new Aerobics();

        private Aerobics() {
            super("健身操", 109, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$AlpineSkiing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AlpineSkiing extends SportType {

        @NotNull
        public static final AlpineSkiing INSTANCE = new AlpineSkiing();

        private AlpineSkiing() {
            super("高山滑雪", 43, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Archery;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Archery extends SportType {

        @NotNull
        public static final Archery INSTANCE = new Archery();

        private Archery() {
            super("射箭", 93, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BMX;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BMX extends SportType {

        @NotNull
        public static final BMX INSTANCE = new BMX();

        private BMX() {
            super("小轮车", 48, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Badminton;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Badminton extends SportType {

        @NotNull
        public static final Badminton INSTANCE = new Badminton();

        private Badminton() {
            super("羽毛球", 92, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Ballet;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Ballet extends SportType {

        @NotNull
        public static final Ballet INSTANCE = new Ballet();

        private Ballet() {
            super("芭蕾舞", 71, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BallroomDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BallroomDance extends SportType {

        @NotNull
        public static final BallroomDance INSTANCE = new BallroomDance();

        private BallroomDance() {
            super("交际舞", 75, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Baseball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Baseball extends SportType {

        @NotNull
        public static final Baseball INSTANCE = new Baseball();

        private Baseball() {
            super("棒球", 79, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Basketball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Basketball extends SportType {

        @NotNull
        public static final Basketball INSTANCE = new Basketball();

        private Basketball() {
            super("篮球", 85, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BattleRope;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BattleRope extends SportType {

        @NotNull
        public static final BattleRope INSTANCE = new BattleRope();

        private BattleRope() {
            super("战绳", 167, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BeachSoccer;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BeachSoccer extends SportType {

        @NotNull
        public static final BeachSoccer INSTANCE = new BeachSoccer();

        private BeachSoccer() {
            super("沙滩足球", 121, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BeachVolleyball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BeachVolleyball extends SportType {

        @NotNull
        public static final BeachVolleyball INSTANCE = new BeachVolleyball();

        private BeachVolleyball() {
            super("沙滩排球", 122, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BellyDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BellyDance extends SportType {

        @NotNull
        public static final BellyDance INSTANCE = new BellyDance();

        private BellyDance() {
            super("肚皮舞", 72, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Biathlon;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Biathlon extends SportType {

        @NotNull
        public static final Biathlon INSTANCE = new Biathlon();

        private Biathlon() {
            super("冬季两项", 128, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Billiards;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Billiards extends SportType {

        @NotNull
        public static final Billiards INSTANCE = new Billiards();

        private Billiards() {
            super("台球", 151, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BoardGames;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BoardGames extends SportType {

        @NotNull
        public static final BoardGames INSTANCE = new BoardGames();

        private BoardGames() {
            super("桌球", 177, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Bouldering;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bouldering extends SportType {

        @NotNull
        public static final Bouldering INSTANCE = new Bouldering();

        private Bouldering() {
            super("抱石", DataTypeSource.SPORT_TYPE_BOULDERING, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Bowling;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bowling extends SportType {

        @NotNull
        public static final Bowling INSTANCE = new Bowling();

        private Bowling() {
            super("保龄球", 80, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Boxing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Boxing extends SportType {

        @NotNull
        public static final Boxing INSTANCE = new Boxing();

        private Boxing() {
            super("拳击", 97, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BreakDancing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BreakDancing extends SportType {

        @NotNull
        public static final BreakDancing INSTANCE = new BreakDancing();

        private BreakDancing() {
            super("霹雳舞", 168, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Breaking;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Breaking extends SportType {

        @NotNull
        public static final Breaking INSTANCE = new Breaking();

        private Breaking() {
            super("街舞", 74, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Bridge;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bridge extends SportType {

        @NotNull
        public static final Bridge INSTANCE = new Bridge();

        private Bridge() {
            super("桥牌", DataTypeSource.SPORT_TYPE_BRIDGE, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$BungeeJumping;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BungeeJumping extends SportType {

        @NotNull
        public static final BungeeJumping INSTANCE = new BungeeJumping();

        private BungeeJumping() {
            super("蹦极", DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Checkers;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Checkers extends SportType {

        @NotNull
        public static final Checkers INSTANCE = new Checkers();

        private Checkers() {
            super("国际跳棋", DataTypeSource.SPORT_TYPE_CHECKERS, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Chess;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Chess extends SportType {

        @NotNull
        public static final Chess INSTANCE = new Chess();

        private Chess() {
            super("国际象棋", DataTypeSource.SPORT_TYPE_CHESS, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$ClimbTheStairs;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ClimbTheStairs extends SportType {

        @NotNull
        public static final ClimbTheStairs INSTANCE = new ClimbTheStairs();

        private ClimbTheStairs() {
            super("爬楼", 108, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$ClimbingMachine;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ClimbingMachine extends SportType {

        @NotNull
        public static final ClimbingMachine INSTANCE = new ClimbingMachine();

        private ClimbingMachine() {
            super("爬楼机", 54, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$CoreTraining;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class CoreTraining extends SportType {

        @NotNull
        public static final CoreTraining INSTANCE = new CoreTraining();

        private CoreTraining() {
            super("核心训练", 50, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Cricket;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Cricket extends SportType {

        @NotNull
        public static final Cricket INSTANCE = new Cricket();

        private Cricket() {
            super("板球", 78, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$CrossCountrySkiing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class CrossCountrySkiing extends SportType {

        @NotNull
        public static final CrossCountrySkiing INSTANCE = new CrossCountrySkiing();

        private CrossCountrySkiing() {
            super("越野滑雪", 46, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$CrossTraining;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class CrossTraining extends SportType {

        @NotNull
        public static final CrossTraining INSTANCE = new CrossTraining();

        private CrossTraining() {
            super("交叉训练", 130, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Curling;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Curling extends SportType {

        @NotNull
        public static final Curling INSTANCE = new Curling();

        private Curling() {
            super("冰壶", 41, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Dance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Dance extends SportType {

        @NotNull
        public static final Dance INSTANCE = new Dance();

        private Dance() {
            super("舞蹈", 76, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Darts;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Darts extends SportType {

        @NotNull
        public static final Darts INSTANCE = new Darts();

        private Darts() {
            super("飞镖", 117, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$DirectionalCrossCountry;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DirectionalCrossCountry extends SportType {

        @NotNull
        public static final DirectionalCrossCountry INSTANCE = new DirectionalCrossCountry();

        private DirectionalCrossCountry() {
            super("定向越野", 110, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Disco;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Disco extends SportType {

        @NotNull
        public static final Disco INSTANCE = new Disco();

        private Disco() {
            super("迪斯科", DataTypeSource.SPORT_TYPE_DISCO, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$DodgeBall;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DodgeBall extends SportType {

        @NotNull
        public static final DodgeBall INSTANCE = new DodgeBall();

        private DodgeBall() {
            super("躲避球", 153, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Downhill;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Downhill extends SportType {

        @NotNull
        public static final Downhill INSTANCE = new Downhill();

        private Downhill() {
            super("速降", DataTypeSource.SPORT_TYPE_DOWNHILL, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$DragonBoat;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DragonBoat extends SportType {

        @NotNull
        public static final DragonBoat INSTANCE = new DragonBoat();

        private DragonBoat() {
            super("龙舟", 138, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Drifting;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Drifting extends SportType {

        @NotNull
        public static final Drifting INSTANCE = new Drifting();

        private Drifting() {
            super("漂流", 123, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Driving;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Driving extends SportType {

        @NotNull
        public static final Driving INSTANCE = new Driving();

        private Driving() {
            super("驾车", 132, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$ESports;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ESports extends SportType {

        @NotNull
        public static final ESports INSTANCE = new ESports();

        private ESports() {
            super("电子竞技", 189, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$EllipticalMachine;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class EllipticalMachine extends SportType {

        @NotNull
        public static final EllipticalMachine INSTANCE = new EllipticalMachine();

        private EllipticalMachine() {
            super("椭圆机", 9, 12, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$EquestrianSports;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class EquestrianSports extends SportType {

        @NotNull
        public static final EquestrianSports INSTANCE = new EquestrianSports();

        private EquestrianSports() {
            super("马术运动", 94, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Fencing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fencing extends SportType {

        @NotNull
        public static final Fencing INSTANCE = new Fencing();

        private Fencing() {
            super("击剑", 148, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$FightingExercise;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FightingExercise extends SportType {

        @NotNull
        public static final FightingExercise INSTANCE = new FightingExercise();

        private FightingExercise() {
            super("搏击操", 114, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$FinSwimming;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FinSwimming extends SportType {

        @NotNull
        public static final FinSwimming INSTANCE = new FinSwimming();

        private FinSwimming() {
            super("蹼泳", 155, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Fishing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fishing extends SportType {

        @NotNull
        public static final Fishing INSTANCE = new Fishing();

        private Fishing() {
            super("钓鱼", 64, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$FlexibilityTraining;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FlexibilityTraining extends SportType {

        @NotNull
        public static final FlexibilityTraining INSTANCE = new FlexibilityTraining();

        private FlexibilityTraining() {
            super("柔韧训练", 55, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$FloorBall;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FloorBall extends SportType {

        @NotNull
        public static final FloorBall INSTANCE = new FloorBall();

        private FloorBall() {
            super("地板球", 188, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$FlyingAKite;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FlyingAKite extends SportType {

        @NotNull
        public static final FlyingAKite INSTANCE = new FlyingAKite();

        private FlyingAKite() {
            super("放风筝", 118, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$FolkDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FolkDance extends SportType {

        @NotNull
        public static final FolkDance INSTANCE = new FolkDance();

        private FolkDance() {
            super("民族舞", 146, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$FreeTraining;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class FreeTraining extends SportType {

        @NotNull
        public static final FreeTraining INSTANCE = new FreeTraining();

        private FreeTraining() {
            super("自由训练", 5, 16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Frisbee;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Frisbee extends SportType {

        @NotNull
        public static final Frisbee INSTANCE = new Frisbee();

        private Frisbee() {
            super("飞盘", 116, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Fujiki;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fujiki extends SportType {

        @NotNull
        public static final Fujiki INSTANCE = new Fujiki();

        private Fujiki() {
            super("藤球", 152, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$GateBall;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GateBall extends SportType {

        @NotNull
        public static final GateBall INSTANCE = new GateBall();

        private GateBall() {
            super("门球", 87, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Go;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Go extends SportType {

        @NotNull
        public static final Go INSTANCE = new Go();

        private Go() {
            super("围棋", 175, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Golf;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Golf extends SportType {

        @NotNull
        public static final Golf INSTANCE = new Golf();

        private Golf() {
            super("高尔夫", 83, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$GolfSwing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfSwing extends SportType {

        @NotNull
        public static final GolfSwing INSTANCE = new GolfSwing();

        private GolfSwing() {
            super("高尔夫挥杆", 84, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$GroundThrow;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GroundThrow extends SportType {

        @NotNull
        public static final GroundThrow INSTANCE = new GroundThrow();

        private GroundThrow() {
            super("地抛球", 170, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$GroupGymnastics;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GroupGymnastics extends SportType {

        @NotNull
        public static final GroupGymnastics INSTANCE = new GroupGymnastics();

        private GroupGymnastics() {
            super("团体操", 111, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Gymnastics;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Gymnastics extends SportType {

        @NotNull
        public static final Gymnastics INSTANCE = new Gymnastics();

        private Gymnastics() {
            super("体操", 59, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Handball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Handball extends SportType {

        @NotNull
        public static final Handball INSTANCE = new Handball();

        private Handball() {
            super("手球", 91, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$HighIntensityIntervalTraining;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HighIntensityIntervalTraining extends SportType {

        @NotNull
        public static final HighIntensityIntervalTraining INSTANCE = new HighIntensityIntervalTraining();

        private HighIntensityIntervalTraining() {
            super("高强度间歇训练", 49, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$HipHop;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HipHop extends SportType {

        @NotNull
        public static final HipHop INSTANCE = new HipHop();

        private HipHop() {
            super("嘻哈舞", 165, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Hockey;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hockey extends SportType {

        @NotNull
        public static final Hockey INSTANCE = new Hockey();

        private Hockey() {
            super("曲棍球", 90, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$HorizontalBar;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HorizontalBar extends SportType {

        @NotNull
        public static final HorizontalBar INSTANCE = new HorizontalBar();

        private HorizontalBar() {
            super("单杠", 149, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$HulaHoop;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HulaHoop extends SportType {

        @NotNull
        public static final HulaHoop INSTANCE = new HulaHoop();

        private HulaHoop() {
            super("呼啦圈", 115, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Hunting;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hunting extends SportType {

        @NotNull
        public static final Hunting INSTANCE = new Hunting();

        private Hunting() {
            super("打猎", 63, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$IceHockey;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IceHockey extends SportType {

        @NotNull
        public static final IceHockey INSTANCE = new IceHockey();

        private IceHockey() {
            super("冰球", 158, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$IndoorFitness;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorFitness extends SportType {

        @NotNull
        public static final IndoorFitness INSTANCE = new IndoorFitness();

        private IndoorFitness() {
            super("室内健身", 24, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$IndoorFootball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorFootball extends SportType {

        @NotNull
        public static final IndoorFootball INSTANCE = new IndoorFootball();

        private IndoorFootball() {
            super("室内足球", 164, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$IndoorRide;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorRide extends SportType {

        @NotNull
        public static final IndoorRide INSTANCE = new IndoorRide();

        private IndoorRide() {
            super("室内骑行", 8, 10, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$IndoorSkating;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorSkating extends SportType {

        @NotNull
        public static final IndoorSkating INSTANCE = new IndoorSkating();

        private IndoorSkating() {
            super("室内滑冰", 45, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$IndoorSurfing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorSurfing extends SportType {

        @NotNull
        public static final IndoorSurfing INSTANCE = new IndoorSurfing();

        private IndoorSurfing() {
            super("室内冲浪", 172, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$IndoorWalking;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndoorWalking extends SportType {

        @NotNull
        public static final IndoorWalking INSTANCE = new IndoorWalking();

        private IndoorWalking() {
            super("室内步行", 40, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$JaiLiBall;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class JaiLiBall extends SportType {

        @NotNull
        public static final JaiLiBall INSTANCE = new JaiLiBall();

        private JaiLiBall() {
            super("回力球", 171, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$JazzDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class JazzDance extends SportType {

        @NotNull
        public static final JazzDance INSTANCE = new JazzDance();

        private JazzDance() {
            super("爵士舞", 113, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Judo;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Judo extends SportType {

        @NotNull
        public static final Judo INSTANCE = new Judo();

        private Judo() {
            super("柔道", 98, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Jujitsu;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Jujitsu extends SportType {

        @NotNull
        public static final Jujitsu INSTANCE = new Jujitsu();

        private Jujitsu() {
            super("柔术", 147, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Karate;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Karate extends SportType {

        @NotNull
        public static final Karate INSTANCE = new Karate();

        private Karate() {
            super("空手道", 96, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Kayak;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Kayak extends SportType {

        @NotNull
        public static final Kayak INSTANCE = new Kayak();

        private Kayak() {
            super("皮划艇", 140, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Kickboxing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Kickboxing extends SportType {

        @NotNull
        public static final Kickboxing INSTANCE = new Kickboxing();

        private Kickboxing() {
            super("自由搏击", 104, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$KickingShuttlecock;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class KickingShuttlecock extends SportType {

        @NotNull
        public static final KickingShuttlecock INSTANCE = new KickingShuttlecock();

        private KickingShuttlecock() {
            super("踢毽子", 120, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$KiteSurfing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class KiteSurfing extends SportType {

        @NotNull
        public static final KiteSurfing INSTANCE = new KiteSurfing();

        private KiteSurfing() {
            super("风筝冲浪", 106, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$LatinDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class LatinDance extends SportType {

        @NotNull
        public static final LatinDance INSTANCE = new LatinDance();

        private LatinDance() {
            super("拉丁舞", 112, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$MartialArts;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MartialArts extends SportType {

        @NotNull
        public static final MartialArts INSTANCE = new MartialArts();

        private MartialArts() {
            super("武术", 103, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$MixedAerobic;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MixedAerobic extends SportType {

        @NotNull
        public static final MixedAerobic INSTANCE = new MixedAerobic();

        private MixedAerobic() {
            super("混合有氧", 51, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$ModernDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModernDance extends SportType {

        @NotNull
        public static final ModernDance INSTANCE = new ModernDance();

        private ModernDance() {
            super("现代舞", DataTypeSource.SPORT_TYPE_MODERN_DANCE, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Motorboat;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Motorboat extends SportType {

        @NotNull
        public static final Motorboat INSTANCE = new Motorboat();

        private Motorboat() {
            super("摩托艇", 124, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$MountainBiking;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MountainBiking extends SportType {

        @NotNull
        public static final MountainBiking INSTANCE = new MountainBiking();

        private MountainBiking() {
            super("山地骑行", 47, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Mountaineering;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Mountaineering extends SportType {

        @NotNull
        public static final Mountaineering INSTANCE = new Mountaineering();

        private Mountaineering() {
            super("登山", 10, 13, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$MuayThai;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MuayThai extends SportType {

        @NotNull
        public static final MuayThai INSTANCE = new MuayThai();

        private MuayThai() {
            super("泰拳", 101, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$MultiSport;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MultiSport extends SportType {

        @NotNull
        public static final MultiSport INSTANCE = new MultiSport();

        private MultiSport() {
            super("复合运动", 20, 2002, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$NoGpsSoccer;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoGpsSoccer extends SportType {

        @NotNull
        public static final NoGpsSoccer INSTANCE = new NoGpsSoccer();

        private NoGpsSoccer() {
            super("无GPS的足球", DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$OffRoadMotorcycle;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OffRoadMotorcycle extends SportType {

        @NotNull
        public static final OffRoadMotorcycle INSTANCE = new OffRoadMotorcycle();

        private OffRoadMotorcycle() {
            super("越野摩托", 137, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$OpenWaterSwimming;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OpenWaterSwimming extends SportType {

        @NotNull
        public static final OpenWaterSwimming INSTANCE = new OpenWaterSwimming();

        private OpenWaterSwimming() {
            super("公开水域游泳", 7, 15, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Orienteering;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Orienteering extends SportType {

        @NotNull
        public static final Orienteering INSTANCE = new Orienteering();

        private Orienteering() {
            super("定向滑雪", 127, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$OutdoorCycling;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorCycling extends SportType {

        @NotNull
        public static final OutdoorCycling INSTANCE = new OutdoorCycling();

        private OutdoorCycling() {
            super("户外骑行", 4, 9, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$OutdoorHiking;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorHiking extends SportType {

        @NotNull
        public static final OutdoorHiking INSTANCE = new OutdoorHiking();

        private OutdoorHiking() {
            super("户外徒步", 15, 22, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$OutdoorRowing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorRowing extends SportType {

        @NotNull
        public static final OutdoorRowing INSTANCE = new OutdoorRowing();

        private OutdoorRowing() {
            super("户外划船", 66, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$OutdoorRunning;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorRunning extends SportType {

        @NotNull
        public static final OutdoorRunning INSTANCE = new OutdoorRunning();

        private OutdoorRunning() {
            super("户外跑", 1, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$OutdoorSkating;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class OutdoorSkating extends SportType {

        @NotNull
        public static final OutdoorSkating INSTANCE = new OutdoorSkating();

        private OutdoorSkating() {
            super("户外滑冰", 44, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$PaddleBoardSurfing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class PaddleBoardSurfing extends SportType {

        @NotNull
        public static final PaddleBoardSurfing INSTANCE = new PaddleBoardSurfing();

        private PaddleBoardSurfing() {
            super("桨板冲浪", 68, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$ParallelBars;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParallelBars extends SportType {

        @NotNull
        public static final ParallelBars INSTANCE = new ParallelBars();

        private ParallelBars() {
            super("双杠", 150, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Parasailing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Parasailing extends SportType {

        @NotNull
        public static final Parasailing INSTANCE = new Parasailing();

        private Parasailing() {
            super("滑翔伞", 133, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Parkour;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Parkour extends SportType {

        @NotNull
        public static final Parkour INSTANCE = new Parkour();

        private Parkour() {
            super("跑酷", 129, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Pilates;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Pilates extends SportType {

        @NotNull
        public static final Pilates INSTANCE = new Pilates();

        private Pilates() {
            super("普拉提", 61, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$PoleDancing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class PoleDancing extends SportType {

        @NotNull
        public static final PoleDancing INSTANCE = new PoleDancing();

        private PoleDancing() {
            super("钢管舞", 166, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Polo;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Polo extends SportType {

        @NotNull
        public static final Polo INSTANCE = new Polo();

        private Polo() {
            super("马球", 142, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$RaceWalking;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RaceWalking extends SportType {

        @NotNull
        public static final RaceWalking INSTANCE = new RaceWalking();

        private RaceWalking() {
            super("竞走", 131, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$RockClimbing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RockClimbing extends SportType {

        @NotNull
        public static final RockClimbing INSTANCE = new RockClimbing();

        private RockClimbing() {
            super("攀岩", 70, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$RollerSkating;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RollerSkating extends SportType {

        @NotNull
        public static final RollerSkating INSTANCE = new RollerSkating();

        private RollerSkating() {
            super("轮滑", 69, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$RouteRun;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RouteRun extends SportType {

        @NotNull
        public static final RouteRun INSTANCE = new RouteRun();

        private RouteRun() {
            super("路线跑", 26, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Rowing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Rowing extends SportType {

        @NotNull
        public static final Rowing INSTANCE = new Rowing();

        private Rowing() {
            super("赛艇", 141, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$RowingMachine;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RowingMachine extends SportType {

        @NotNull
        public static final RowingMachine INSTANCE = new RowingMachine();

        private RowingMachine() {
            super("划船机", 23, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Rugby;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Rugby extends SportType {

        @NotNull
        public static final Rugby INSTANCE = new Rugby();

        private Rugby() {
            super("橄榄球", 82, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$RunInPlayground;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RunInPlayground extends SportType {

        @NotNull
        public static final RunInPlayground INSTANCE = new RunInPlayground();

        private RunInPlayground() {
            super("操场跑步", 192, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Sailing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sailing extends SportType {

        @NotNull
        public static final Sailing INSTANCE = new Sailing();

        private Sailing() {
            super("帆船运动", 65, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SandbagBall;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SandbagBall extends SportType {

        @NotNull
        public static final SandbagBall INSTANCE = new SandbagBall();

        private SandbagBall() {
            super("沙包球", 169, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Shoot;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Shoot extends SportType {

        @NotNull
        public static final Shoot INSTANCE = new Shoot();

        private Shoot() {
            super("射击", DataTypeSource.SPORT_TYPE_SHOOT, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Shuffleboard;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Shuffleboard extends SportType {

        @NotNull
        public static final Shuffleboard INSTANCE = new Shuffleboard();

        private Shuffleboard() {
            super("沙狐球", 160, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Shuttlecock;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Shuttlecock extends SportType {

        @NotNull
        public static final Shuttlecock INSTANCE = new Shuttlecock();

        private Shuttlecock() {
            super("毽球", 162, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Skateboard;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Skateboard extends SportType {

        @NotNull
        public static final Skateboard INSTANCE = new Skateboard();

        private Skateboard() {
            super("滑板", 67, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Skiing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Skiing extends SportType {

        @NotNull
        public static final Skiing INSTANCE = new Skiing();

        private Skiing() {
            super("滑雪", 12, 11, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SkippingRope;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SkippingRope extends SportType {

        @NotNull
        public static final SkippingRope INSTANCE = new SkippingRope();

        private SkippingRope() {
            super("跳绳", 21, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Skydiving;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Skydiving extends SportType {

        @NotNull
        public static final Skydiving INSTANCE = new Skydiving();

        private Skydiving() {
            super("跳伞", 180, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Sleigh;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sleigh extends SportType {

        @NotNull
        public static final Sleigh INSTANCE = new Sleigh();

        private Sleigh() {
            super("雪橇", 126, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Snorkeling;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Snorkeling extends SportType {

        @NotNull
        public static final Snorkeling INSTANCE = new Snorkeling();

        private Snorkeling() {
            super("浮潜", 157, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SnowboardingDouble;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SnowboardingDouble extends SportType {

        @NotNull
        public static final SnowboardingDouble INSTANCE = new SnowboardingDouble();

        private SnowboardingDouble() {
            super("双板滑雪", 105, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SnowboardingSingle;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SnowboardingSingle extends SportType {

        @NotNull
        public static final SnowboardingSingle INSTANCE = new SnowboardingSingle();

        private SnowboardingSingle() {
            super("单板滑雪", 42, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Snowmobile;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Snowmobile extends SportType {

        @NotNull
        public static final Snowmobile INSTANCE = new Snowmobile();

        private Snowmobile() {
            super("雪地摩托", 136, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Snowmobiles;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Snowmobiles extends SportType {

        @NotNull
        public static final Snowmobiles INSTANCE = new Snowmobiles();

        private Snowmobiles() {
            super("雪车", 125, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SnowshoeHiking;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SnowshoeHiking extends SportType {

        @NotNull
        public static final SnowshoeHiking INSTANCE = new SnowshoeHiking();

        private SnowshoeHiking() {
            super("雪鞋健行", DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Soccer;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Soccer extends SportType {

        @NotNull
        public static final Soccer INSTANCE = new Soccer();

        private Soccer() {
            super("足球", 18, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Softball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Softball extends SportType {

        @NotNull
        public static final Softball INSTANCE = new Softball();

        private Softball() {
            super("垒球", 86, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SomatosensoryGame;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SomatosensoryGame extends SportType {

        @NotNull
        public static final SomatosensoryGame INSTANCE = new SomatosensoryGame();

        private SomatosensoryGame() {
            super("体感游戏", 163, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SpinningBike;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SpinningBike extends SportType {

        @NotNull
        public static final SpinningBike INSTANCE = new SpinningBike();

        private SpinningBike() {
            super("动感单车", 143, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SquareDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SquareDance extends SportType {

        @NotNull
        public static final SquareDance INSTANCE = new SquareDance();

        private SquareDance() {
            super("广场舞", 73, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Squash;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Squash extends SportType {

        @NotNull
        public static final Squash INSTANCE = new Squash();

        private Squash() {
            super("壁球", 81, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$StepTraining;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class StepTraining extends SportType {

        @NotNull
        public static final StepTraining INSTANCE = new StepTraining();

        private StepTraining() {
            super("踏步训练", 57, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$StepperMachine;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class StepperMachine extends SportType {

        @NotNull
        public static final StepperMachine INSTANCE = new StepperMachine();

        private StepperMachine() {
            super("踏步机", 58, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$StrengthTraining;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class StrengthTraining extends SportType {

        @NotNull
        public static final StrengthTraining INSTANCE = new StrengthTraining();

        private StrengthTraining() {
            super("力量训练", 52, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Stretch;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Stretch extends SportType {

        @NotNull
        public static final Stretch INSTANCE = new Stretch();

        private Stretch() {
            super("拉伸", 53, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Surfing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Surfing extends SportType {

        @NotNull
        public static final Surfing INSTANCE = new Surfing();

        private Surfing() {
            super("冲浪", 62, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SwimmingPool;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SwimmingPool extends SportType {

        @NotNull
        public static final SwimmingPool INSTANCE = new SwimmingPool();

        private SwimmingPool() {
            super("泳池游泳", 6, 14, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Swing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Swing extends SportType {

        @NotNull
        public static final Swing INSTANCE = new Swing();

        private Swing() {
            super("秋千", 159, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SwordsmanSkip;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SwordsmanSkip extends SportType {

        @NotNull
        public static final SwordsmanSkip INSTANCE = new SwordsmanSkip();

        private SwordsmanSkip() {
            super("剑术", 95, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$SynchronizedSwimming;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SynchronizedSwimming extends SportType {

        @NotNull
        public static final SynchronizedSwimming INSTANCE = new SynchronizedSwimming();

        private SynchronizedSwimming() {
            super("花样游泳", 156, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$TableFootball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TableFootball extends SportType {

        @NotNull
        public static final TableFootball INSTANCE = new TableFootball();

        private TableFootball() {
            super("桌上足球", 161, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$TableTennis;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TableTennis extends SportType {

        @NotNull
        public static final TableTennis INSTANCE = new TableTennis();

        private TableTennis() {
            super("兵乓球", 89, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Taekwondo;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Taekwondo extends SportType {

        @NotNull
        public static final Taekwondo INSTANCE = new Taekwondo();

        private Taekwondo() {
            super("跆拳道", 102, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$TaiChi;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TaiChi extends SportType {

        @NotNull
        public static final TaiChi INSTANCE = new TaiChi();

        private TaiChi() {
            super("太极", 100, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$TapDance;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TapDance extends SportType {

        @NotNull
        public static final TapDance INSTANCE = new TapDance();

        private TapDance() {
            super("踢踏舞", DataTypeSource.SPORT_TYPE_TAP_DANCE, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Tennis;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Tennis extends SportType {

        @NotNull
        public static final Tennis INSTANCE = new Tennis();

        private Tennis() {
            super("网球", 17, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$TrailRunning;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TrailRunning extends SportType {

        @NotNull
        public static final TrailRunning INSTANCE = new TrailRunning();

        private TrailRunning() {
            super("越野跑", 11, 7, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Trampoline;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Trampoline extends SportType {

        @NotNull
        public static final Trampoline INSTANCE = new Trampoline();

        private Trampoline() {
            super("蹦床", 183, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Treadmill;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Treadmill extends SportType {

        @NotNull
        public static final Treadmill INSTANCE = new Treadmill();

        private Treadmill() {
            super("跑步机（原室内跑）", 2, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$TreadmillNormal;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TreadmillNormal extends SportType {

        @NotNull
        public static final TreadmillNormal INSTANCE = new TreadmillNormal();

        private TreadmillNormal() {
            super("跑步机的常规跑步", 25, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Triathlon;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Triathlon extends SportType {

        @NotNull
        public static final Triathlon INSTANCE = new Triathlon();

        private Triathlon() {
            super("铁人三项", 19, 2001, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$TugOfWar;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TugOfWar extends SportType {

        @NotNull
        public static final TugOfWar INSTANCE = new TugOfWar();

        private TugOfWar() {
            super("拔河", 119, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Volleyball;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Volleyball extends SportType {

        @NotNull
        public static final Volleyball INSTANCE = new Volleyball();

        private Volleyball() {
            super("排球", 88, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Walking;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Walking extends SportType {

        @NotNull
        public static final Walking INSTANCE = new Walking();

        private Walking() {
            super("健走", 3, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$WalkingMachine;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WalkingMachine extends SportType {

        @NotNull
        public static final WalkingMachine INSTANCE = new WalkingMachine();

        private WalkingMachine() {
            super("漫步机", 144, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$WallBall;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WallBall extends SportType {

        @NotNull
        public static final WallBall INSTANCE = new WallBall();

        private WallBall() {
            super("墙球", 145, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$WaterPolo;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WaterPolo extends SportType {

        @NotNull
        public static final WaterPolo INSTANCE = new WaterPolo();

        private WaterPolo() {
            super("水球", 154, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$WaterSkiing;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WaterSkiing extends SportType {

        @NotNull
        public static final WaterSkiing INSTANCE = new WaterSkiing();

        private WaterSkiing() {
            super("滑水", 139, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Wrestling;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Wrestling extends SportType {

        @NotNull
        public static final Wrestling INSTANCE = new Wrestling();

        private Wrestling() {
            super("摔跤", 99, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Yoga;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Yoga extends SportType {

        @NotNull
        public static final Yoga INSTANCE = new Yoga();

        private Yoga() {
            super("瑜伽", 60, 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/datacenter/SportType$Zumba;", "Lcom/huami/moving/datacenter/SportType;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Zumba extends SportType {

        @NotNull
        public static final Zumba INSTANCE = new Zumba();

        private Zumba() {
            super("尊巴", 77, 0, 4, null);
        }
    }

    private SportType(String str, int i, int i2) {
        this.desc = str;
        this.id = i;
        this.type = i2;
    }

    public /* synthetic */ SportType(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ SportType(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 4) != 0 ? i : i2, null);
    }
}
