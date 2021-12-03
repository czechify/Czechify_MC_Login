package net.minecraft.data.worldgen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.MinecraftKey;
import net.minecraft.world.level.levelgen.feature.structures.WorldGenFeatureDefinedStructurePoolStructure;
import net.minecraft.world.level.levelgen.feature.structures.WorldGenFeatureDefinedStructurePoolTemplate;

public class WorldGenFeatureVillageSnowy {

    public static final WorldGenFeatureDefinedStructurePoolTemplate a = WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/town_centers"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/town_centers/snowy_meeting_point_1"), 100), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/town_centers/snowy_meeting_point_2"), 50), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/town_centers/snowy_meeting_point_3"), 150), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/town_centers/snowy_meeting_point_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/town_centers/snowy_meeting_point_2"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/town_centers/snowy_meeting_point_3"), 3)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));

    public static void a() {}

    static {
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/streets"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/corner_01", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/corner_02", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/corner_03", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/square_01", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/straight_01", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/straight_02", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/straight_03", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/straight_04", ProcessorLists.l), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/straight_06", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/straight_08", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/crossroad_02", ProcessorLists.l), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/crossroad_03", ProcessorLists.l), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/crossroad_04", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/crossroad_05", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/crossroad_06", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/streets/turn_01", ProcessorLists.l), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/streets"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/corner_01", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/corner_02", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/corner_03", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/square_01", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/straight_01", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/straight_02", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/straight_03", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/straight_04", ProcessorLists.l), 7), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/straight_06", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/straight_08", ProcessorLists.l), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/crossroad_02", ProcessorLists.l), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/crossroad_03", ProcessorLists.l), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/crossroad_04", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/crossroad_05", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/crossroad_06", ProcessorLists.l), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/streets/turn_01", ProcessorLists.l), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/houses"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_3"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_4"), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_5"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_6"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_7"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_small_house_8"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_medium_house_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_medium_house_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_medium_house_3"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_butchers_shop_1"), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_butchers_shop_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_tool_smith_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_fletcher_house_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_shepherds_house_1"), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_armorer_house_1"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_armorer_house_2"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_fisher_cottage"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_tannery_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_cartographer_house_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_library_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_masons_house_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_masons_house_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_weapon_smith_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_temple_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_farm_1", ProcessorLists.o), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_farm_2", ProcessorLists.o), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_animal_pen_1"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_animal_pen_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.g(), 6)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/houses"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_2", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_3", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_4", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_5", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_6", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_7", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_small_house_8", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_medium_house_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_medium_house_2", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/houses/snowy_medium_house_3", ProcessorLists.d), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_butchers_shop_1", ProcessorLists.d), 2), new Pair[]{Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_butchers_shop_2", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_tool_smith_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_fletcher_house_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_shepherds_house_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_armorer_house_1", ProcessorLists.d), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_armorer_house_2", ProcessorLists.d), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_fisher_cottage", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_tannery_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_cartographer_house_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_library_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_masons_house_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_masons_house_2", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_weapon_smith_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_temple_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_farm_1", ProcessorLists.d), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_farm_2", ProcessorLists.d), 3), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_animal_pen_1", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/houses/snowy_animal_pen_2", ProcessorLists.d), 2), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.g(), 6)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/terminators"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/plains/terminators/terminator_01", ProcessorLists.l), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/plains/terminators/terminator_02", ProcessorLists.l), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/plains/terminators/terminator_03", ProcessorLists.l), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/plains/terminators/terminator_04", ProcessorLists.l), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/trees"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a(BiomeDecoratorGroups.SPRUCE), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/decor"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/snowy_lamp_post_01"), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/snowy_lamp_post_02"), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/snowy_lamp_post_03"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a(BiomeDecoratorGroups.SPRUCE), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a(BiomeDecoratorGroups.PILE_SNOW), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a(BiomeDecoratorGroups.PILE_ICE), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.g(), 9)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/decor"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/snowy_lamp_post_01", ProcessorLists.d), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/snowy_lamp_post_02", ProcessorLists.d), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/snowy_lamp_post_03", ProcessorLists.d), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a(BiomeDecoratorGroups.SPRUCE), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a(BiomeDecoratorGroups.PILE_SNOW), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a(BiomeDecoratorGroups.PILE_ICE), 4), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.g(), 7)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/villagers"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/villagers/nitwit"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/villagers/baby"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeaturePieces.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/villagers"), new MinecraftKey("empty"), ImmutableList.of(Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/villagers/nitwit"), 1), Pair.of(WorldGenFeatureDefinedStructurePoolStructure.a("village/snowy/zombie/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
    }
}
