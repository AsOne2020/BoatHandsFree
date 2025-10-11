/*
 * This file is part of the BoatHandsFree project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2025  As_One and contributors
 *
 * BoatHandsFree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BoatHandsFree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with BoatHandsFree.  If not, see <https://www.gnu.org/licenses/>.
 */


package me.asone.boathandsfree;

//#if FABRIC
import net.fabricmc.api.ModInitializer;
//#elseif FORGE
//$$ import net.minecraftforge.fml.common.Mod;
//#elseif NEOFORGE
//$$ import net.neoforged.fml.common.Mod;
//#endif

//#if FORGE_LIKE
//$$ @Mod(BoatHandsFree.MOD_ID)
//#endif
public class BoatHandsFree
		//#if FABRIC
		implements ModInitializer
		//#endif
{
	public static final String MOD_ID = "boathandsfree";

	//#if FABRIC
	@Override
	public void onInitialize() {
	}
	//#elseif FORGE_LIKE
	//$$ public BoatHandsFree() {
	//$$ }
	//#endif
}
